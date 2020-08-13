package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Erprole;
import com.zking.erp.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ErproleMapper {
    int deleteByPrimaryKey(Long rid);

    int insert(Erprole record);

    int insertSelective(Erprole record);

    Erprole selectByPrimaryKey(Long rid);

    int updateByPrimaryKeySelective(Erprole record);

    int updateByPrimaryKey(Erprole record);

    List<Erprole>queryRolePager(PageBean pageBean);
}