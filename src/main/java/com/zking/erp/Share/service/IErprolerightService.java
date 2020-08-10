package com.zking.erp.Share.service;

import com.zking.erp.Share.model.Erproleright;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IErprolerightService {
    int deleteByPrimaryKey(Long rfid);

    int insert(Erproleright record);

    int insertSelective(Erproleright record);

    Erproleright selectByPrimaryKey(Long rfid);

    int updateByPrimaryKeySelective(Erproleright record);

    int updateByPrimaryKey(Erproleright record);

    int addRoleRight(Erproleright roleright);
}