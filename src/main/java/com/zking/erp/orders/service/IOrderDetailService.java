package com.zking.erp.orders.service;

import com.zking.erp.orders.model.OrderDetail;

public interface IOrderDetailService {
    int deleteByPrimaryKey(Integer orderdetailid);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orderdetailid);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}