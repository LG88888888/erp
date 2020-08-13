package com.zking.erp.analysis.controller;

import com.zking.erp.Share.model.Goods;
import com.zking.erp.Share.service.IGoodsService;
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
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    //分页查询商品
    @RequestMapping("/queryGoodsPager")
    public Map<String,Object>queryGoodsPager(HttpServletRequest request,Goods goods){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Map<String, Object>> list = goodsService.queryGoodsPager(goods, pageBean);
        Map<String,Object>map=new HashMap<>();
        map.put("rows",list);
        map.put("total",pageBean.getTotal());
        return map;
    }


    //增加商品
    @RequestMapping("/addGoods")
    public JsonResponseBody  addGoods(Goods goods){
        int i = goodsService.insert(goods);
        if (i<0){
            return  new JsonResponseBody(ResponseStatus.STATUS_201);
        }
        else{
            return  new JsonResponseBody(ResponseStatus.STATUS_212);
        }
    }

    //修改商品
    @RequestMapping("/eidtGoods")
    public  JsonResponseBody eidtGoods(Goods goods){
        int i = goodsService.updateByPrimaryKeySelective(goods);
        if(i<0){
            return  new JsonResponseBody(ResponseStatus.STATUS_255);
        }
        else{
            return  new JsonResponseBody(ResponseStatus.STATUS_210);
        }

    }

    @RequestMapping("/delGoods")
    public JsonResponseBody delGoods(Integer gid){
        int i = goodsService.deleteByPrimaryKey(gid);
        if(i<0){
            return  new JsonResponseBody(ResponseStatus.STATUS_203);
        }
        else{
            return  new JsonResponseBody(ResponseStatus.STATUS_211);
        }

    }

}
