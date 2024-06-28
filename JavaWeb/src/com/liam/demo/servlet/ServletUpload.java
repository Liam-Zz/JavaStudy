package com.liam.demo.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
@WebServlet("/upload")
public class ServletUpload extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向upload目录写入一个文件
        //在文件上传处会使用
        //String path = "D:\\02_Liam\\Java\\JavaStudy\\out\\artifacts\\JavaWeb_war_exploded\\a.txt";
        ServletContext servletContext = getServletContext();
        //获得一个指向项目部署位置下的某个文件/目录的磁盘真是路径API
        String realPath = servletContext.getRealPath("upload");
        System.out.println(realPath);

        //获得项目部署的上下文路径，项目的访问路径
        //后续我们会学习在项目中使用相对路径和绝对路径找目标资源
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);

    }
}
