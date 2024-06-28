package com.liam.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//注解方式和xml方式二选一
//loadOnStartup 的值，在一些组件中已经被占用（建议从6开始）；
@WebServlet(value = "/url1",loadOnStartup = -1)
//@WebServlet(urlPatterns ={"/url1","/url2"} )
//@WebServlet(name = "UrlPattern",value = "/url1")
/*
    default-servlet: 默认提供的servlet
    请求资源（静态资源等）跟servlet没有匹配上就会跟default链接
    SpringMVC中会失效，需要调试配置
 */
public class UrlPattern extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Urlpatter执行了...");
    }
}
