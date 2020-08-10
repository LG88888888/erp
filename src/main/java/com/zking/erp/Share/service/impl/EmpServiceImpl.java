package com.zking.erp.Share.service.impl;

import com.zking.erp.Share.mapper.EmpMapper;
import com.zking.erp.Share.model.Emp;
import com.zking.erp.Share.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<Map<String, Object>> query(String username) {
        return empMapper.query(username);
    }
}
