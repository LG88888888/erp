package com.zking.erp.Share.service.impl;

import com.zking.erp.Share.mapper.GoodstypeMapper;
import com.zking.erp.Share.model.Goodstype;
import com.zking.erp.Share.service.IGoodstypeService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodstypeServiceImpl implements IGoodstypeService {
    @Autowired
    private GoodstypeMapper goodstypeMapper;
    @Override
    public int deleteByPrimaryKey(Integer gtid) {
        return goodstypeMapper.deleteByPrimaryKey(gtid);
    }

    @Override
    public int insert(Goodstype record) {
        return goodstypeMapper.insert(record);
    }

    @Override
    public int insertSelective(Goodstype record) {
        return 0;
    }

    @Override
    public Goodstype selectByPrimaryKey(Integer gtid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Goodstype record) {
        return goodstypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goodstype record) {
        return 0;
    }

    @Override
    public List<Goodstype> queryGoodstypePager(String gtype,PageBean pageBean) {
        return goodstypeMapper.queryGoodstypePager(gtype);
    }


}
