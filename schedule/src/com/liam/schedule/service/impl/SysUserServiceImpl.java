package com.liam.schedule.service.impl;

import com.liam.schedule.dao.SysUserDao;
import com.liam.schedule.dao.impl.SysUserDaoImpl;
import com.liam.schedule.pojo.SysUser;
import com.liam.schedule.service.SysUserService;
import com.liam.schedule.util.MD5Util;

/**
 * @Classname: JavaStudy
 * @Date: 2024/7/1 20:27
 * @Author: Liam
 * @Description:
 */
//实现类看性情写注释
public class SysUserServiceImpl implements SysUserService {
    private SysUserDao userDao= new SysUserDaoImpl();
    @Override
    public int regist(SysUser sysUser) {

        //将用户的明文密码转换为秘文密码
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        //将 sysUser 信息存入数据库(调用 Dao 层方法)
        return userDao.addSysUser(sysUser);
    }
}
