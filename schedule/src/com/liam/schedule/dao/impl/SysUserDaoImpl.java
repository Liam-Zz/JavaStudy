package com.liam.schedule.dao.impl;

import com.liam.schedule.dao.BaseDao;
import com.liam.schedule.dao.SysUserDao;
import com.liam.schedule.pojo.SysUser;

public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public int addSysUser(SysUser sysUser) {
        String sql = "insert into sys_user Values(DEFAULT,?,?)";
        return baseUpdate(sql,sysUser.getUsername(),sysUser.getUserPwd());
    }
}
