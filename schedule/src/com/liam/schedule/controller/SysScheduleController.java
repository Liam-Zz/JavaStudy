package com.liam.schedule.controller;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @Classname: JavaStudy
 * @Date: 2024/7/1 21:23
 * @Author: Liam
 * @Description:
 */
/*
    增加日程的请求 schedule/add
    查询日程的请求 schedule/find
    删除日程的请求 schedule/update
    删除日程的请求 schedule/remove
 */
@WebServlet("/schedule/*")
public class SysScheduleController extends HttpServlet {
    //需要判断此次请求是 增删改查

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        String[] split = requestURI.split("/");
        String methodName = split[split.length-1];
        /*if(methodName.equals("add")){
            //增加处理
            add(req,resp);
        } else if (methodName.equals("find")) {
            //查询处理
            find(req, resp);
        }else if (methodName.equals("update")){
            //修改处理
            update(req, resp);
        }else if (methodName.equals("remove")){
            //删除处理
            remove(req, resp);
        }*/
        //通过反射,通过方法名,获取下面方法;
        Class aClass = this.getClass();
        //获取方法
        try {
            Method declaredMethod = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            //暴力破解方法的访问修饰符的限制
            declaredMethod.setAccessible(true);
            //执行方法
            declaredMethod.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("add");
    }
    protected void find(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("find");
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("update");
    }
    protected void remove(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("remove");
    }
}
