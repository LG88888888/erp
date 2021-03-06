package com.zking.erp.Share.service;

import com.zking.erp.Share.model.Emp;
import com.zking.erp.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IEmpService {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    Emp queryEmp(Emp emp);
    List<Map<String,Object>> queryEmpPager(String  username, PageBean pageBean);
}