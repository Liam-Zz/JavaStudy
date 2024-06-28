package com.liam.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/*
    servlet开发流程
        1、创建javaWeb项目，同时将tomcat添加为当前项目的依赖
        2、重写service方法（ServletRequest req, ServletResponse res）
        3、service方法中，定义业务处理代码
        4、在web.xml中配置servlet对应请求映射路径
 */
public class HelloWorld extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //1、从request 对象中获取请求中的任何信息（username 参数）
        String username = req.getParameter("username");//根据参数名获取参数
        //2、处理业务代码
        String info = "<h1>YES</h1>";
        if("liam".equals(username)){
            info = "NO";
        }
        //3、将要响应的数据放入response
        //应该设置Content-Type响应头
        res.setContentType("text/html");
        //res.setHeader("ContentType","text/html")
        PrintWriter writer = res.getWriter();
        writer.write(info);
    }
}
