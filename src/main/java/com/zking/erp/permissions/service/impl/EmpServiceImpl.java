package com.zking.erp.permissions.service.impl;

import com.zking.erp.permissions.mapper.EmpMapper;
import com.zking.erp.permissions.model.Emp;
import com.zking.erp.permissions.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public int deleteByPrimaryKey(Integer eid) {
        return 0;
    }

    @Override
    public int insert(Emp record) {
        return 0;
    }

    @Override
    public int insertSelective(Emp record) {
        return 0;
    }

    @Override
    public Emp selectByPrimaryKey(Integer eid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Emp record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Emp record) {
        return 0;
    }

    @Override
    public Emp queryEmp(Emp emp) {
        return empMapper.queryEmp(emp);


    }
}
