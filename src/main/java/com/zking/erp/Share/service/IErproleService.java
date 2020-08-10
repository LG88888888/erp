package com.zking.erp.Share.service;

import com.zking.erp.Share.model.Erprole;

import java.util.List;

public interface IErproleService {
    int deleteByPrimaryKey(Long rid);

    int insert(Erprole record);

    int insertSelective(Erprole record);

    Erprole selectByPrimaryKey(Long rid);

    int updateByPrimaryKeySelective(Erprole record);

    int updateByPrimaryKey(Erprole record);

    List<Erprole>queryRole();
}