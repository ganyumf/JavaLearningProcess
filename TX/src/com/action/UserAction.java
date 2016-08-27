package com.action;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.UserDao;
import com.entity.User;

@Controller
public class UserAction {
	@Resource(name="userDao")
	UserDao ud;
	
	@RequestMapping("login")
	public String login(User user,HttpServletRequest request,HttpServletResponse response,HttpSession session){
		String path="";
		String easyPwd=user.getPwd();
		User uu=ud.login(user);
		String checkCode = (String)session.getAttribute("randomCode");
		String requestCode = request.getParameter("checkcode");
		if ((requestCode == null) || (checkCode == null) || (!checkCode.equals(requestCode))) {
		    path="index.jsp";
			request.setAttribute("message", "<script>alert('验证码不正确！');</script>");
		} else {
		    if(uu!=null){
		    	Cookie clogin=new Cookie("nn",user.getLogin());
		    	clogin.setMaxAge(60*60*24*7);
		    	Cookie cpwd=new Cookie("pp",easyPwd);
		    	cpwd.setMaxAge(60*60*24*7);
		    	response.addCookie(clogin);
		    	response.addCookie(cpwd);
		    	request.getSession().setAttribute("CurrentUser", uu);
		    	path="forward:main.jsp";
		    } else{
		    	//登陆失败
		    	path="index.jsp";
		    	request.setAttribute("message", "<script>alert('用户名或密码不正确！');</script>");
		    }
		}
		return path;
	}
	
	
	public UserDao getUd() {
		return ud;
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	
	
	
}
