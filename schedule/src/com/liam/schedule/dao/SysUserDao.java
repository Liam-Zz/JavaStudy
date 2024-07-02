package com.liam.schedule.dao;

import com.liam.schedule.pojo.SysUser;

/*
    数据访问对象：用于定义针对表格的CRUD的方法;

    Dao层一般需要定义接口和实现类

 */
public interface SysUserDao {
    /**
     * 向数据库中增加一条用户记录的方法;
     * @param sysUser 要增加记录的 username 和 user_pwd 字段以 SysUser 实体类的形式接收
     * @return 增加成功返回 1 增加失败返回 0
     */
    int addSysUser(SysUser sysUser);

}
