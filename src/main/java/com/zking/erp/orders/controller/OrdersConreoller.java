package com.zking.erp.orders.controller;

import com.zking.erp.orders.model.Orders;
import com.zking.erp.orders.service.IOrdersService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrdersConreoller {

    @Autowired
    private IOrdersService ordersService;

    @RequestMapping("/addOrders")
    public Map<String,Object> addOrders(Orders orders) throws Exception{
        Map<String,Object> map=new HashMap<>();
        int i = ordersService.insert(orders);
        if(i!=0){
            map.put("success",true);
            map.put("msg","增加成功!");
            return map;
        }else{
            map.put("msg","增加失败!");
            return map;
        }
    }

    @RequestMapping("/editOrders")
    public Map<String,Object> editOrders(Orders orders) throws Exception{
        Map<String,Object> map=new HashMap<>();
        int i = ordersService.updateByPrimaryKey(orders);
        if(i!=0){
            map.put("success",true);
            map.put("msg","修改成功!");
            return map;
        }else{
            map.put("msg","修改成功!");
            return map;
        }
    }

    @RequestMapping("/delOrders")
    public Map<String,Object> delOrders(Integer oid) throws Exception{
        Map<String,Object> map=new HashMap<>();
        int i = ordersService.deleteByPrimaryKey(oid);
        if(i!=0){
            map.put("success",true);
            map.put("msg","删除成功!");
            return map;
        }else{
            map.put("msg","删除成功!");
            return map;
        }
    }

    @RequestMapping("/queryOrdersPager")
    public Map<String,Object> queryOrdersPager(HttpServletRequest req,Orders orders){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        List<Orders> rows = ordersService.queryOrdersPager(orders, pageBean);
        Map<String,Object> map=new HashMap<>();
        map.put("rows",rows);
        map.put("pageBean",pageBean);
        return map;
    }





}
