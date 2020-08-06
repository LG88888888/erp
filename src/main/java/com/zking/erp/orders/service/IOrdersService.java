package com.zking.erp.orders.service;

import com.zking.erp.orders.model.Orders;

import java.util.List;

public interface IOrdersService {
    int deleteByPrimaryKey(Integer oid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> queryOrdersPage();

}