package com.liam.schedule.test;

import com.liam.schedule.dao.impl.SysScgeduleDaoImpl;
import com.liam.schedule.pojo.SysScgedule;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @Classname: JavaStudy
 * @Date: 2024/7/1 20:18
 * @Author: Liam
 * @Description:
 */

public class TestSysScheduleDao {
   private static SysScgeduleDaoImpl sysScgeduleDao;
    @BeforeClass
    public static void initsysScgeduleDao(){
        sysScgeduleDao = new SysScgeduleDaoImpl();
    }
    @Test
    public void testAddSchedule(){
        int rows = sysScgeduleDao.addSchedule(new SysScgedule(null, 2, "学习数据库", 3));
        System.out.println(rows);
    }
    @Test
    public void testfindAll(){
        List<SysScgedule> scheduList = sysScgeduleDao.findAll();
        scheduList.forEach(System.out::println);
    }
}
