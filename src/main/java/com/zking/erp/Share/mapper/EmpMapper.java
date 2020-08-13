package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Emp;
import com.zking.erp.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface EmpMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    Emp queryEmp(@Param("emp") Emp emp);

    List<Map<String,Object>>queryEmpPager(@Param("username") String username);
}