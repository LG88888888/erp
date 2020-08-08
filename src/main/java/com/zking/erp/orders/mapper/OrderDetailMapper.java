package com.zking.erp.orders.mapper;

import com.zking.erp.orders.model.OrderDetail;
import com.zking.erp.orders.model.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orderdetailid);

    int insert(OrderDetail record);


    OrderDetail selectByPrimaryKey(Integer orderdetailid);


    int updateByPrimaryKey(OrderDetail record);

    List<OrderDetail> queryOrdersPager(OrderDetail orderDetail);
}