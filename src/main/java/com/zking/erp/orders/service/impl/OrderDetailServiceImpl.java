package com.zking.erp.orders.service.impl;

import com.zking.erp.orders.mapper.OrderDetailMapper;
import com.zking.erp.orders.model.OrderDetail;
import com.zking.erp.orders.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
        record.setOendtime(new Date());
        return orderDetailMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderDetail record) {
        record.setOendtime(new Date());
        return orderDetailMapper.insertSelective(record);
    }

    @Override
    public OrderDetail selectByPrimaryKey(Integer orderdetailid) {
        return orderDetailMapper.selectByPrimaryKey(orderdetailid);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderDetail record) {
        record.setOendtime(new Date());
        return orderDetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderDetail record) {
        record.setOendtime(new Date());
        return orderDetailMapper.updateByPrimaryKey(record);
    }
}
