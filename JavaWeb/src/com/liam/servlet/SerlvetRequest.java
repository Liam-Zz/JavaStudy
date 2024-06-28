package com.liam.servlet;

import jdk.nashorn.internal.ir.CallNode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/request")
public class SerlvetRequest extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //行相关 GET/POST url http/1.1
        String method = req.getMethod();
        String scheme = req.getScheme();
        String protocol = req.getProtocol();
        /*
        uri和url的区别
        uri：统一资源标识符-资源地址
        url：统一资源定位符-目标地址
         */
        String requestURI = req.getRequestURI();
        StringBuffer requestURL = req.getRequestURL();
        int localPort = req.getLocalPort();
        int remotePort = req.getRemotePort();
        int serverPort = req.getServerPort();

        //头相关 key:value
        //根据key 读取value
        String accept = req.getHeader("Accept");
        System.out.println(accept);

        //获取请求中所有的请求头名字
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String hname = headerNames.nextElement();
            System.out.println(hname+" : "+req.getHeader(hname));
        }
    }
}
