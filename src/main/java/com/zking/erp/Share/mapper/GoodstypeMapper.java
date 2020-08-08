package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Goodstype;

public interface GoodstypeMapper {
    int deleteByPrimaryKey(Integer gtid);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer gtid);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);
}