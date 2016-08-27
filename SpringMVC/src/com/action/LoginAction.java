package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAction {
	@RequestMapping(value="mylogin")
	public String myLogin(String uname){
		System.out.println("÷¥––¡À");
		System.out.println(uname);
		return "success";
	}
}
