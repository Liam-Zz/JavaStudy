package com.liam.schedule.dao.impl;

import com.liam.schedule.dao.BaseDao;
import com.liam.schedule.dao.SysUserDao;
import com.liam.schedule.pojo.SysUser;

import java.util.List;

public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public int addSysUser(SysUser sysUser) {
        String sql = "insert into sys_user Values(DEFAULT,?,?)";
        return baseUpdate(sql,sysUser.getUsername(),sysUser.getUserPwd());
    }

    @Override
    public SysUser findByUsername(String username) {
        String sql = "select uid,username,user_pwd userPwd from sys_user where username = ?";
         List<SysUser> sysUserList = baseQuery(SysUser.class, sql, username);
         return sysUserList != null && sysUserList.size()>0? sysUserList.get(0):null;
    }
}
