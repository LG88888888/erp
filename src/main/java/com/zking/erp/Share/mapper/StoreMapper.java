package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Store;

public interface StoreMapper {
    int deleteByPrimaryKey(Integer storeid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer storeid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}