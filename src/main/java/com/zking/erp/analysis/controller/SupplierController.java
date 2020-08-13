package com.zking.erp.analysis.controller;

import com.zking.erp.Share.model.Supplier;
import com.zking.erp.Share.service.ISupplierService;
import com.zking.erp.util.JsonResponseBody;
import com.zking.erp.util.PageBean;
import com.zking.erp.util.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
public class SupplierController {
    @Autowired
    private ISupplierService supplierService;




    //分页查询供应商
    @RequestMapping("/queryCustomerPager")
    public Map<String,Object>queryCustomerPager(HttpServletRequest request, Supplier supplier){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Map<String, Object>> maps = supplierService.queryCustomerPager(supplier,pageBean);
        Map<String,Object>map=new HashMap<>();
        map.put("rows",maps);
        map.put("total",pageBean.getTotal());
        return  map;
    }

    //分页查询供应商
    @RequestMapping("/querySupplierPager")
    public Map<String,Object>querySupplierPager(HttpServletRequest request, Supplier supplier){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Map<String, Object>> maps = supplierService.querySupplierPager(supplier, pageBean);
        Map<String,Object>map=new HashMap<>();
        map.put("rows",maps);
        map.put("total",pageBean.getTotal());
        return  map;
    }
    //增加供应商
    @RequestMapping("/addSupplier")
    public JsonResponseBody addSupplier(Supplier supplier){
        int i = supplierService.insert(supplier);
        if(i<0){
            return  new JsonResponseBody(ResponseStatus.STATUS_201);
        }
        else{
            return  new JsonResponseBody(ResponseStatus.STATUS_212);
        }
    }
    //删除供应商
    @RequestMapping("/delSupplier")
    public JsonResponseBody delSupplier(Integer supplierid){
        int i = supplierService.deleteByPrimaryKey(supplierid);
        if(i<=0){
            return  new JsonResponseBody(ResponseStatus.STATUS_203);
        }
        else{
            return  new JsonResponseBody(ResponseStatus.STATUS_211);
        }
    }
    //修改供应商
    @RequestMapping("/eidtSupplier")
    public JsonResponseBody eidtSupplier(Supplier supplier){
        int i = supplierService.updateByPrimaryKeySelective(supplier);
        if(i<0){
            return  new JsonResponseBody(ResponseStatus.STATUS_255);
        }
        else{
            return  new JsonResponseBody(ResponseStatus.STATUS_210);
        }
    }

    //查询客户名称是否重复
    @RequestMapping("/querySige")
    public Supplier querySige(String name){


      return supplierService.querySige(name);
    }

}
