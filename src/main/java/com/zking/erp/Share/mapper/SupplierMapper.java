package com.zking.erp.Share.mapper;

import com.zking.erp.Share.model.Supplier;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface SupplierMapper {
    int deleteByPrimaryKey(Integer supplierid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer supplierid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);

    List<Map<String,Object>>querySupplierPager(@Param("supplier") Supplier supplier);
    List<Map<String,Object>>queryCustomerPager(@Param("supplier") Supplier supplier);

    Supplier  querySige(@Param("name")String name);

}