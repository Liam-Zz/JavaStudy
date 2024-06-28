package com.liam.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
@WebServlet(
        urlPatterns = "/config2",
        initParams = {@WebInitParam(name="key3",value = "value3"),@WebInitParam(name="key4",value = "value4")}
)
public class ServletConfigServlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("config 获取参数-----------------------------------------------");
        //获取servletconfig信息
        ServletConfig servletConfig = this.getServletConfig();
        //获取初始配置信息（根据参数名获取参数值）
        String keya = servletConfig.getInitParameter("keya");
        //System.out.println(keya);
        //如果不知道参数值，获取所有的参数名
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();

        while (initParameterNames.hasMoreElements()){
            String kname = initParameterNames.nextElement();
            System.out.println(kname+"="+getInitParameter(kname));
        }
        System.out.println("config 获取参数-----------------------------------------------");
        //获取context对象
        ServletContext servletContext = getServletContext();
        ServletContext servletContext1 = servletConfig.getServletContext();
        ServletContext servletContext2 = req.getServletContext();
        System.out.println(servletContext == servletContext1);
        System.out.println(servletContext1 == servletContext2);

        String encoding = servletContext.getInitParameter("encoding");
        System.out.println("encoding: "+encoding);

        Enumeration<String> initParameterNames1 = servletContext.getInitParameterNames();
        while (initParameterNames1.hasMoreElements()){
            String pname = initParameterNames1.nextElement();
            System.out.println(pname+"="+servletContext+getInitParameter(pname));
        }
        //从 域对象中读取数据
        String ka = (String)servletContext.getAttribute("ka");
        System.out.println("域名对象：" + ka);
    }
}
