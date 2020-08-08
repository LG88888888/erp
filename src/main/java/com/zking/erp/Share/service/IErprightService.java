package com.zking.erp.Share.service;

import com.zking.erp.Share.model.Erpright;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IErprightService {
    int deleteByPrimaryKey(String rcode);

    int insert(Erpright record);

    int insertSelective(Erpright record);

    Erpright selectByPrimaryKey(String rcode);

    int updateByPrimaryKeySelective(Erpright record);

    int updateByPrimaryKey(Erpright record);

    List<Erpright>queryCode(Integer pid);

    List<Erpright> queryRootNode(@Param("rid") Integer rid);

}