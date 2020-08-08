package com.zking.erp.orders.service.impl;

import com.zking.erp.orders.mapper.OrdersMapper;
import com.zking.erp.orders.model.Orders;
import com.zking.erp.orders.service.IOrdersService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int deleteByPrimaryKey(Integer oid) {
        return ordersMapper.deleteByPrimaryKey(oid);
    }

    @Override
    public int insert(Orders record) {
        record.setOcreatetime(new Date());
        return ordersMapper.insert(record);
    }


    @Override
    public Orders selectByPrimaryKey(Integer oid) {
        return ordersMapper.selectByPrimaryKey(oid);
    }

    @Override
    public int updateByPrimaryKeySelective(Orders record) {
        if(record.getOchecktime()==null){
            record.setOchecktime(new Date());
            System.out.println(1);
        }else if(record.getOstartime()==null){
            record.setOstartime(new Date());
            System.out.println(2);
        }else if(record.getOendtime()==null){
            record.setOendtime(new Date());
            System.out.println(3);
        }
        return ordersMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public int updateByPrimaryKey(Orders record ) {
        return ordersMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Orders> queryOrdersPager(Orders orders, PageBean pageBean) {
        return ordersMapper.queryOrdersPager(orders);
    }





}


