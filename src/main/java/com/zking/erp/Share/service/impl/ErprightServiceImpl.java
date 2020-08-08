package com.zking.erp.Share.service.impl;

import com.zking.erp.Share.mapper.ErprightMapper;
import com.zking.erp.Share.model.Erpright;
import com.zking.erp.Share.service.IErprightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ErprightServiceImpl implements IErprightService {
    @Autowired
    private ErprightMapper erprightMapper;
    @Override
    public int deleteByPrimaryKey(String rcode) {
        return 0;
    }

    @Override
    public int insert(Erpright record) {
        return 0;
    }

    @Override
    public int insertSelective(Erpright record) {
        return 0;
    }

    @Override
    public Erpright selectByPrimaryKey(String rcode) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Erpright record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Erpright record) {
        return 0;
    }

    @Override
    public List<Erpright> queryCode(Integer pid) {

        return erprightMapper.queryCode(pid);
    }

    @Override
    public List<Erpright> queryRootNode(Integer rid) {
        List<Erpright> erprights = erprightMapper.queryRootNode(rid);
        for (Erpright erpright : erprights) {
            List<Erpright> list = erprightMapper.queryErprightByPid(erpright.getRcode(), rid);
            erpright.setErprights(list);
        }

        return erprights;
    }
}
