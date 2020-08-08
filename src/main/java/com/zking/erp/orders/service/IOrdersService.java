package com.zking.erp.orders.service;

import com.zking.erp.orders.model.Orders;
import com.zking.erp.util.PageBean;

import java.util.List;
import java.util.Map;

public interface IOrdersService {
    int deleteByPrimaryKey(Integer oid);

    int insert(Orders record);


    Orders selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);


    List<Orders> queryOrdersPager(Orders orders, PageBean pageBean);

}