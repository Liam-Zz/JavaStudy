package com.liam.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/1")
public class servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受请求参数
        String username = req.getParameter("username");
        //获取session对象
        HttpSession session = req.getSession();
        //设置间隔时间(单独servlet)
        //session.setMaxInactiveInterval(120);
        /*
        判断请求中有没有一个特殊的 cookie jessionid
        1.有
            根据jssionid 去找对应的session对象
                找到了（返回之前的）
                未找到（创建新的，并返回）
        2.没有
            创建一个新的session返回，并且向response对象中存放这个jessionid 的cookie

        同会话，使用相同的session

         */
        System.out.println(session.getId());
        System.out.println(session.isNew());
        //username存入session
        session.setAttribute("username",username);
        //信息
        //resp.setContentType("text/html；charset=UTF-8");
        resp.getWriter().write("success");
    }
}
