package com.liam.schedule.dao;

import com.liam.schedule.pojo.SysScgedule;
/*
    在接口中要写好文档规范
    作者：
    时间：
 */
public interface SysScgeduleDao {
/*    需要接口规范，统一操作；（如果不统一，那server层调用就会混乱）
    public int addSchedule(SysScgedule scgedule){
        return 1;
    }*/
    //抽象方法

    /**
     * 用于向数据中增加一条日程记录
     * @param schedule 日程记录以SysSchedule实体类对象形式入参
     * @return 增加成功返回影响数据库记录的行数，行数为0说明增加失败；
     */
    int addSchedule(SysScgedule schedule);
}
