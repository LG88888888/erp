package com.zking.erp.Share.service;

import com.zking.erp.Share.model.Goods;
import com.zking.erp.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IGoodsService {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Map<String,Object>>queryGoodsPager(Goods goods, PageBean pageBean);

}