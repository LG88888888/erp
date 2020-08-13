package com.zking.erp.Share.service;

import com.zking.erp.Share.model.Supplier;
import com.zking.erp.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ISupplierService {
    int deleteByPrimaryKey(Integer supplierid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer supplierid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);

    List<Map<String,Object>>querySupplierPager(Supplier supplier, PageBean pageBean);

    List<Map<String,Object>>queryCustomerPager( Supplier supplier,PageBean pageBean);

    Supplier querySige(String name);
}