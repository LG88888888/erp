package com.zking.erp.analysis.controller;

import com.zking.erp.Share.model.Store;
import com.zking.erp.Share.service.IStoreService;
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
public class StoreController {
    @Autowired
    private IStoreService storeService;


    //增加仓库
    @RequestMapping("/addStore")
    public JsonResponseBody addStore(Store store) {
        int i = storeService.insert(store);
        if (i < 0) {
            return new JsonResponseBody(ResponseStatus.STATUS_201);
        } else {
            return new JsonResponseBody(ResponseStatus.STATUS_212);
        }
    }
        //删除仓库
        @RequestMapping("/delStore")
        public JsonResponseBody delStore(Integer storeid){
            int i = storeService.deleteByPrimaryKey(storeid);
            if(i<0){
                return  new JsonResponseBody(ResponseStatus.STATUS_203);
            }
            else {
                return  new JsonResponseBody(ResponseStatus.STATUS_211);
            }
    }

    //修改仓库
    @RequestMapping("/editStore")
    public JsonResponseBody editStore(Store store){
        int i = storeService.updateByPrimaryKeySelective(store);
        if(i<0){
            return  new JsonResponseBody(ResponseStatus.STATUS_255);
        }
        else {
            return  new JsonResponseBody(ResponseStatus.STATUS_210);
        }
    }
    //分页查询仓库
    @RequestMapping("/queryStorePager")
    public Map<String,Object>queryStorePager(HttpServletRequest request,Store store ){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Map<String,Object>> stores = storeService.queryStorePager(store, pageBean);
        Map<String,Object>map=new HashMap<>();
        map.put("rows",stores);
        map.put("total",pageBean.getTotal());
        return  map;
    }
}
