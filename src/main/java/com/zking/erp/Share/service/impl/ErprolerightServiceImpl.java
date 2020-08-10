package com.zking.erp.Share.service.impl;

import com.zking.erp.Share.mapper.ErprolerightMapper;
import com.zking.erp.Share.model.Erpright;
import com.zking.erp.Share.model.Erproleright;
import com.zking.erp.Share.service.IErprolerightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ErprolerightServiceImpl implements IErprolerightService {
    @Autowired
    private ErprolerightMapper erprolerightMapper;
    @Override
    public int deleteByPrimaryKey(Long rfid) {
        return 0;
    }

    @Override
    public int insert(Erproleright record) {
        return 0;
    }

    @Override
    public int insertSelective(Erproleright record) {
        return 0;
    }

    @Override
    public Erproleright selectByPrimaryKey(Long rfid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Erproleright record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Erproleright record) {
        return 0;
    }

    @Override
    public int addRoleRight(Erproleright roleright) {


       erprolerightMapper.deleteRoleRight(roleright.getRid());

        return erprolerightMapper.addRoleRight(roleright);
    }
}
