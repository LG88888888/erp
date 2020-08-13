package com.zking.erp.Share.service.impl;

import com.zking.erp.Share.mapper.ErproleMapper;
import com.zking.erp.Share.model.Erprole;
import com.zking.erp.Share.service.IErproleService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ErproleServiceImpl implements IErproleService {
    @Autowired
    private ErproleMapper erproleMapper;
    @Override
    public int deleteByPrimaryKey(Long rid) {
        return erproleMapper.deleteByPrimaryKey(rid);
    }

    @Override
    public int insert(Erprole record) {
        return erproleMapper.insert(record);
    }

    @Override
    public int insertSelective(Erprole record) {
        return 0;
    }

    @Override
    public Erprole selectByPrimaryKey(Long rid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Erprole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Erprole record) {
        return erproleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Erprole> queryRolePager(PageBean pageBean) {
        return erproleMapper.queryRolePager(pageBean);
    }
}
