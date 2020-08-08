package com.zking.erp.orders.service.impl;

import com.zking.erp.orders.mapper.OrderDetailMapper;
import com.zking.erp.orders.model.OrderDetail;
import com.zking.erp.orders.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderDetailServiceImpl implements IOrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderdetailid) {
        return orderDetailMapper.deleteByPrimaryKey(orderdetailid);
    }

    @Override
    public int insert(OrderDetail record) {
        return orderDetailMapper.insert(record);
    }

    @Override
    public OrderDetail selectByPrimaryKey(Integer orderdetailid) {
        return orderDetailMapper.selectByPrimaryKey(orderdetailid);
    }

    @Override
    public int updateByPrimaryKey(OrderDetail record) {
        return orderDetailMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<OrderDetail> queryOrdersPager(OrderDetail orderDetail) {
        return orderDetailMapper.queryOrdersPager(orderDetail);
    }


}
