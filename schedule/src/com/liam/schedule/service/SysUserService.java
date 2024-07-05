package com.liam.schedule.service;

import com.liam.schedule.pojo.SysUser;

/*
该接口定义了以 sys_user 表格为核心的业务
 */
public interface SysUserService {
    /**
     * 注册用户的方法
     * @param sysUser 要注册的用户古和明文密码以 SysUser 对象的形式接收
     * @return 注册成功返回 1 注册失败返回 0
     */
    int regist(SysUser sysUser);

    /**
     * 根据用户名获取用户完整信息的方法
     * @param username 当前要查询的用户名
     * @return 如果找到了返回SysUser的信息；
     */
    SysUser findByUsername(String username);
}
