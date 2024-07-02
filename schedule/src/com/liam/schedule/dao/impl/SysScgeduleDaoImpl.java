package com.liam.schedule.dao.impl;

import com.liam.schedule.dao.BaseDao;
import com.liam.schedule.dao.SysScgeduleDao;
import com.liam.schedule.pojo.SysScgedule;

import java.util.List;

public class SysScgeduleDaoImpl extends BaseDao implements SysScgeduleDao {
    @Override
    public int addSchedule(SysScgedule scgedule) {
        String sql= "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseUpdate(sql, scgedule.getUid(), scgedule.getTitle(), scgedule.getCompleted());
        return rows;
    }

    @Override
    public List<SysScgedule> findAll() {
        String sql = "select sid,uid,title,completed from sys_schedule";
        List<SysScgedule> SysScgeduleList = baseQuery(SysScgedule.class, sql);
        return SysScgeduleList;
    }
}
