package com.liam.schedule.test;

import com.liam.schedule.dao.BaseDao;
import com.liam.schedule.pojo.SysUser;
import jdk.nashorn.internal.ir.CallNode;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @Classname: JavaStudy
 * @Date: 2024/7/1 19:10
 * @Author: Liam
 * @Description:
 */

public class TestBaseDao {

    private static BaseDao baseDao;

    @BeforeClass
    public  static void initBadeDao(){
        baseDao = new BaseDao();
    }
    @Test
    public void testbaseQueryObject(){
        //查询用户数量
        String sql =  "select count(1) from sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }
    @Test
    public void testBaseQuery(){
        String sql = "select uid,username,user_pwd userPwd from sys_user";
        List<Object> sysUserList = baseDao.baseQuery(SysUser.class,sql);
        sysUserList.forEach(System.out::println);
    }
    @Test
    public void testBaseUpdate(){
        String sql= "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseDao.baseUpdate(sql, 1, "学习 java", 0);
        System.out.println(rows);
    }
}
