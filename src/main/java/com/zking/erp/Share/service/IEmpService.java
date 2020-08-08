package com.zking.erp.Share.service;

import com.zking.erp.Share.model.Emp;
import org.apache.ibatis.annotations.Param;

public interface IEmpService {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    Emp queryEmp(@Param("emp") Emp emp);
}