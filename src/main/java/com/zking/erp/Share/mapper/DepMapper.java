package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Dep;

public interface DepMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);
}