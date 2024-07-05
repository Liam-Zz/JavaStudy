package com.liam.schedule.controller;

import com.liam.schedule.pojo.SysUser;
import com.liam.schedule.service.SysUserService;
import com.liam.schedule.service.impl.SysUserServiceImpl;
import com.liam.schedule.util.MD5Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

/**
 * @Classname: JavaStudy
 * @Date: 2024/7/1 21:23
 * @Author: Liam
 * @Description:
 */
@WebServlet("/user/*")
//优化写法,提取一个新类继承 HttpServlet 就不用一个一个写了
public class SysUserController extends BaseContoller {

    private SysUserService userService = new SysUserServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("addUser");
    }

    /**
     * 接收用户注册请求的业务处理方法(接口 前后端对接的业务端口)
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("regist");
        /*
        1.接收客户端提交的参数
        2.调用服务层方法,完成注册功能
        3.根据注册结果(成功 失败)做页面跳转
         */
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");

        //调用服务层
        //将参数放入一个 SysUser 对象中,再调用 regist 方法时传入
        SysUser sysUser = new SysUser(null,username,userPwd);
         int rows = userService.regist(sysUser);
         //3.根据注册结果(成功 失败)做页面跳转
         if (rows > 0){
             System.out.println("增加成功");
             resp.sendRedirect("/registSuccess.html");
         }else {
            resp.sendRedirect("/registFail.html");
         }

    }

    /**
     * 接受用于登录的请求
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        1、接受用户名和密码
        2、调用服务层方法
        3、判断密码是否匹配
        5、跳转首页
         */
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        SysUser loginUser =  userService.findByUsername(username);
        if (null == loginUser){
            resp.sendRedirect("/loginUsernameError.html");
        }else if (! MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())){
            resp.sendRedirect("/loginUserPwdError.html");
        }else {
            resp.sendRedirect("/showSchedule.html");
        }

    }
}
