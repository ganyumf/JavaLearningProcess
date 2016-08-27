package com.action;

import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
public class RandomCodeServlet extends HttpServlet {
   private final int width = 60;	//ͼƬ���
   private final int height = 20;	//ͼƬ�߶�
//����û��ͨ���ύ��ť���ʣ�Ӧʵ��service()����
   protected void service(HttpServletRequest req, 
         HttpServletResponse resp)
         throws ServletException, IOException{
      BufferedImage buffImg = new BufferedImage(width, height,
             BufferedImage.TYPE_INT_RGB);
      Graphics2D g = buffImg.createGraphics();
      g.setColor(Color.WHITE);	//������ɫ
      g.fillRect(0, 0, width, height);
      Font font = new Font("Times New Roman", Font.PLAIN, 18);
      g.setFont(font);		//�������壬�ֺ���ͼƬ�߶����
      g.setColor(Color.black);	//ͼƬ�߿�
      g.drawRect(0, 0, width - 1, height - 1);

      g.setColor(Color.gray);	//��������ɫ
      for (int i = 0; i < 16; i++) {	// �������16��������
          int x = (int)(Math.random()*width);
          int y = (int)(Math.random()*height);
          int x1 = (int)(Math.random()*12);
          int y1 = (int)(Math.random()*12);
          g.drawLine(x, y, x + x1, y + y1);
      }
      StringBuffer randomCode = new StringBuffer();
      for (int i = 0; i < 4; i++) {	// �������4λ���ֵ���֤��
          String strRand = String.valueOf((int)(Math.random()*10));
// �����������ɫ������������ɫֵ�����������ÿλ���ֵ���ɫ����һ��
          int red = (int)(Math.random()*255);
          int green = (int)(Math.random()*255);
          int blue = (int)(Math.random()*255);
          g.setColor(new Color(red, green, blue));
          g.drawString(strRand, 13 * i + 6, 16);
          randomCode.append(strRand); // ���������ĸ�������������
      }
// ����λ���ֱ��浽session��
      HttpSession session = req.getSession();
      session.setAttribute("randomCode", randomCode.toString());
// ��ֹͼ��Ļ���
      resp.setHeader("Cache-Control", "no-cache");    
      resp.setContentType("image/jpeg");
// ��ͼ�������servlet�������
     ServletOutputStream sos = resp.getOutputStream();
      javax.imageio.ImageIO.write(buffImg, "jpeg", sos);
      System.out.println(buffImg.hashCode());
      buffImg.flush();
      sos.flush();
      sos.close();
  }
}

