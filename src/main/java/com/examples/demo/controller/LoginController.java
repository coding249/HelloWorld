package com.examples.demo.controller;


import com.examples.demo.entity.CheckCode;
import com.examples.demo.entity.RandomValidateCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/ewifi/system/console")
public class LoginController {

    @RequestMapping("/business")
    public String getCheckCode(){
        //int intCode = (int)(Math.random()*900000)+100000;
        //String checkCode = Integer.toString(intCode);
        String checkCode = "";
        String charCode = "01234567890123456789012345678901234567890123456789ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int i=1;i<=6;i++){
            int num = (int)(Math.random()*charCode.length());
            checkCode = checkCode.concat(Character.toString(charCode.charAt(num)));
        }
        System.out.println(checkCode);
        return checkCode;
    }



    @RequestMapping(value = "/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
