package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Storeoper;

public interface StoreoperMapper {
    int deleteByPrimaryKey(Integer storeoperid);

    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    Storeoper selectByPrimaryKey(Integer storeoperid);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);
}