package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Erproleright;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ErprolerightMapper {
    int deleteByPrimaryKey(Long rfid);

    int insert(Erproleright record);

    int insertSelective(Erproleright record);

    Erproleright selectByPrimaryKey(Long rfid);

    int updateByPrimaryKeySelective(Erproleright record);

    int updateByPrimaryKey(Erproleright record);

    int addRoleRight(@Param("rolerights")List<Erproleright> roleright);
}