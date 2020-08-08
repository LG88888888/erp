package com.zking.erp.orders.controller;

import com.zking.erp.orders.model.OrderDetail;
import com.zking.erp.orders.model.Orders;
import com.zking.erp.orders.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orderDetail")
public class OrderDetailConreoller {

    @Autowired
    private IOrderDetailService orderDetailService;

    @RequestMapping("/addOrderDetail")
    public Map<String,Object> addOrderDetail(OrderDetail orderDetail) throws Exception{
        Map<String,Object> map=new HashMap<>();
        int i = orderDetailService.insert(orderDetail);
        if(i!=0){
            map.put("success",true);
            map.put("msg","增加成功!");
            return map;
        }else{
            map.put("msg","增加失败!");
            return map;
        }
    }

    @RequestMapping("/editOrderDetail")
    public Map<String,Object> editOrderDetail(OrderDetail orderDetail) throws Exception{
        Map<String,Object> map=new HashMap<>();
        int i = orderDetailService.updateByPrimaryKey(orderDetail);
        if(i!=0){
            map.put("success",true);
            map.put("msg","修改成功!");
            return map;
        }else{
            map.put("msg","修改失败!");
            return map;
        }
    }

    @RequestMapping("/delOrderDetail")
    public Map<String,Object> delOrderDetail(Integer orderdetailid) throws Exception{
        Map<String,Object> map=new HashMap<>();
        int i = orderDetailService.deleteByPrimaryKey(orderdetailid);
        if(i!=0){
            map.put("success",true);
            map.put("msg","删除成功!");
            return map;
        }else{
            map.put("msg","删除失败!");
            return map;
        }
    }

    @RequestMapping("/queryOrderDetail")
    public List<OrderDetail> queryOrderDetail(OrderDetail orderDetail){
        List<OrderDetail> rows = orderDetailService.queryOrdersPager(orderDetail);
        return rows;
    }


}
