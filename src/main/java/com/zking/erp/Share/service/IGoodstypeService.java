package com.zking.erp.Share.service;

import com.zking.erp.Share.model.Goodstype;
import com.zking.erp.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGoodstypeService {
    int deleteByPrimaryKey(Integer gtid);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer gtid);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);

    List<Goodstype> queryGoodstypePager(String gtype, PageBean pageBean);
}