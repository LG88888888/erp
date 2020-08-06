package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Erpright;

public interface ErprightMapper {
    int deleteByPrimaryKey(String rcode);

    int insert(Erpright record);

    int insertSelective(Erpright record);

    Erpright selectByPrimaryKey(String rcode);

    int updateByPrimaryKeySelective(Erpright record);

    int updateByPrimaryKey(Erpright record);
}