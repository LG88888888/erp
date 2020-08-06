package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Storedetail;

public interface StoredetailMapper {
    int deleteByPrimaryKey(Integer storedetailid);

    int insert(Storedetail record);

    int insertSelective(Storedetail record);

    Storedetail selectByPrimaryKey(Integer storedetailid);

    int updateByPrimaryKeySelective(Storedetail record);

    int updateByPrimaryKey(Storedetail record);
}