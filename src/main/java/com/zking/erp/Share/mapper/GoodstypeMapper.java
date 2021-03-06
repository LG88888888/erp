package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Goodstype;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GoodstypeMapper {
    int deleteByPrimaryKey(Integer gtid);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer gtid);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);

    List<Goodstype> queryGoodstypePager(@Param("gtype") String gtype);
}