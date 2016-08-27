/*     */ package com.action;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.servlet.ServletOutputStream;
/*     */ import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*     */ 
		  @Controller
/*     */ public class CodeAction
/*     */ {
/*  19 */   private static int WIDTH = 80;
/*  20 */   private static int HEIGHT = 30;
/*     */ 
			@RequestMapping(value="code")
/*  22 */   public String code(HttpServletResponse response,HttpSession session) throws IOException {
/*  24 */     
				response.setContentType("image/jpeg");
/*  25 */     ServletOutputStream sos = response.getOutputStream();
/*     */ 
/*  27 */     response.setHeader("Pragma", "No-cache");
/*  28 */     response.setHeader("Cache-Control", "no-cache");
/*  29 */     response.setDateHeader("Expires", 0L);
/*     */ 
/*  33 */     BufferedImage image = 
/*  34 */       new BufferedImage(WIDTH, HEIGHT, 1);

/*  35 */     Graphics g = image.getGraphics();
/*     */ 
/*  39 */     char[] rands = generateCheckCode();
/*     */ 
/*  43 */     drawBackground(g);
/*  44 */     drawRands(g, rands);
/*     */ 
/*  48 */     g.dispose();
/*     */ 
/*  52 */     ByteArrayOutputStream bos = new ByteArrayOutputStream();
/*  53 */     ImageIO.write(image, "JPEG", bos);
/*  54 */     byte[] buf = bos.toByteArray();
/*  55 */     response.setContentLength(buf.length);
/*     */ 		
			  image.flush();
/*  58 */     sos.write(buf);
			  bos.flush();
/*  59 */     bos.close();
		      sos.flush();
/*  60 */     sos.close();
/*     */ 
/*  65 */     session.setAttribute("check_code", new String(rands));
			
/*  66 */     return null;
/*     */   }
/*     */ 
/*     */   private char[] generateCheckCode()
/*     */   {
/*  73 */     String chars = "0123456789abcdefghijklmnopqrstuvwxyz";
/*  74 */     char[] rands = new char[4];
/*  75 */     for (int i = 0; i < 4; i++)
/*     */     {
/*  77 */       int rand = (int)(Math.random() * 36.0D);
/*  78 */       rands[i] = chars.charAt(rand);
/*     */     }
/*  80 */     return rands;
/*     */   }
/*     */ 
/*     */   private void drawRands(Graphics g, char[] rands)
/*     */   {
/*  87 */     g.setColor(Color.BLACK);
/*  88 */     g.setFont(new Font(null, 3, 20));
/*     */ 
/*  90 */     g.drawString(rands[0]+"", 5, 24);
/*  91 */     g.drawString(rands[1]+"", 24, 19);
/*  92 */     g.drawString(rands[2]+"", 40, 22);
/*  93 */     g.drawString(rands[3]+"", 60, 18);
/*     */   }
/*     */ 
/*     */   private void drawBackground(Graphics g)
/*     */   {
/* 101 */     g.setColor(new Color(14474460));
/* 102 */     g.fillRect(0, 0, WIDTH, HEIGHT);
/*     */ 
/* 104 */     for (int i = 0; i < 120; i++)
/*     */     {
/* 106 */       int x = (int)(Math.random() * WIDTH);
/* 107 */       int y = (int)(Math.random() * HEIGHT);
/* 108 */       int red = (int)(Math.random() * 255.0D);
/* 109 */       int green = (int)(Math.random() * 255.0D);
/* 110 */       int blue = (int)(Math.random() * 255.0D);
/* 111 */       g.setColor(new Color(red, green, blue));
/* 112 */       g.drawOval(x, y, 1, 0);
/*     */     }
/*     */   }
/*     */ }
