package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Store;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreMapper {
    int deleteByPrimaryKey(Integer storeid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer storeid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);

    List<Map<String,Object>>queryStorePager(@Param("store") Store store);
}