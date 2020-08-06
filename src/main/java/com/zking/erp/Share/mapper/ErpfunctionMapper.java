package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Erpfunction;

public interface ErpfunctionMapper {
    int deleteByPrimaryKey(Long fid);

    int insert(Erpfunction record);

    int insertSelective(Erpfunction record);

    Erpfunction selectByPrimaryKey(Long fid);

    int updateByPrimaryKeySelective(Erpfunction record);

    int updateByPrimaryKey(Erpfunction record);
}