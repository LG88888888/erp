package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Erpright;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ErprightMapper {
    int deleteByPrimaryKey(String rcode);

    int insert(Erpright record);

    int insertSelective(Erpright record);

    Erpright selectByPrimaryKey(String rcode);

    int updateByPrimaryKeySelective(Erpright record);

    int updateByPrimaryKey(Erpright record);

    List<Erpright>queryCode(@Param("pid") Integer pid);

    List<Erpright> queryRootNode(@Param("rid") Integer rid);
    List<Erpright> queryErprightByPid(@Param("pid") String pid ,@Param("rid") Integer rid);

    List<Erpright> queryRoleRight(@Param("rid") Integer rid);


}