package com.zking.erp.orders.mapper;

import com.zking.erp.orders.model.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(Orders record);


    Orders selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> queryOrdersPager(Orders record);

}