package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Erprolefunction;

public interface ErprolefunctionMapper {
    int deleteByPrimaryKey(Long rfid);

    int insert(Erprolefunction record);

    int insertSelective(Erprolefunction record);

    Erprolefunction selectByPrimaryKey(Long rfid);

    int updateByPrimaryKeySelective(Erprolefunction record);

    int updateByPrimaryKey(Erprolefunction record);
}