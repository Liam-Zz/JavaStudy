package com.liam.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/A")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建cookie
        Cookie cookieA = new Cookie("keyA","valueA");

        //cookie时效性设置（单位默认为：S）
        cookieA.setMaxAge(60*5);

        //设置cookie提交路径
        cookieA.setPath("/B");
        Cookie cookieB = new Cookie("keyB","valueB");
        //将cookie放入response对象
        resp.addCookie(cookieA);
        resp.addCookie(cookieB);
    }
}
