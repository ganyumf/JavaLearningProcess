package com.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CreateMD5 {  
	  
    //��̬������������Ϊ������  
    public static String getMd5(String plainText) {  
        try {  
            MessageDigest md = MessageDigest.getInstance("MD5");  
            md.update(plainText.getBytes());  
            byte b[] = md.digest();  
            System.out.println(b.length);
            int i;  
  
            StringBuffer buf = new StringBuffer("");  
            for (int offset = 0; offset < b.length; offset++) {  
                i = b[offset];  
                if (i < 0)  
                    i += 256;  
                if (i < 16)  
                    buf.append("0");  
                buf.append(Integer.toHexString(i));  
            }  
            //32λ����  
            //return buf.toString();  
            // 16λ�ļ���  
            return buf.toString().substring(8, 24)+buf.toString().substring(14,30);  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
            return null;  
        }  
  
    }  
}  