package com.zking.erp.orders.service;

import com.zking.erp.orders.model.OrderDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IOrderDetailService {
    int deleteByPrimaryKey(Integer orderdetailid);

    int insert(OrderDetail record);


    OrderDetail selectByPrimaryKey(Integer orderdetailid);


    int updateByPrimaryKey(OrderDetail record);

    List<OrderDetail> queryOrdersPager(OrderDetail orderDetail);
}