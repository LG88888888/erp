package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Erprole;

public interface ErproleMapper {
    int deleteByPrimaryKey(Long rid);

    int insert(Erprole record);

    int insertSelective(Erprole record);

    Erprole selectByPrimaryKey(Long rid);

    int updateByPrimaryKeySelective(Erprole record);

    int updateByPrimaryKey(Erprole record);
}