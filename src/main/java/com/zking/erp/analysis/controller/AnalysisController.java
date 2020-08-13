package com.zking.erp.analysis.controller;

import com.zking.erp.Share.model.Goodstype;
import com.zking.erp.Share.service.IGoodstypeService;
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
public class AnalysisController{

    @Autowired
    private IGoodstypeService goodstypeService;

    //分页查询
    @RequestMapping("/queryGoodstypePager")
    public Map<String,Object>queryGoodstypePager(HttpServletRequest request,String gtype){
        PageBean pb=new PageBean();
        pb.setRequest(request);
        Map<String,Object>mp=new HashMap<>();
        List<Goodstype> list = goodstypeService.queryGoodstypePager(gtype, pb);
        mp.put("rows",list);
        mp.put("total",pb.getTotal());

    return  mp;
    }
    //增加商品类型
    @RequestMapping("/addGoodstype")
    public JsonResponseBody addGoodstype(Goodstype goodstype){
        int i = goodstypeService.insert(goodstype);
        if(i<0){
            return  new JsonResponseBody(ResponseStatus.STATUS_201);
        }
        else{
            return new JsonResponseBody(ResponseStatus.STATUS_212);
        }
    }

    //删除商品类型
    @RequestMapping("/delGoodstype")
    public JsonResponseBody delGoodstype(Integer gtid){
        int i = goodstypeService.deleteByPrimaryKey(gtid);
        if(i<0){
            return  new JsonResponseBody(ResponseStatus.STATUS_203);
        }
        else{
            return new JsonResponseBody(ResponseStatus.STATUS_211);
        }
    }

    //修改商品类型
    @RequestMapping("/eidtGoodstype")
    public JsonResponseBody eidtGoodstype(Goodstype goodstype){
        int i = goodstypeService.updateByPrimaryKeySelective(goodstype);
        if(i<0){
            return  new JsonResponseBody(ResponseStatus.STATUS_255);
        }
        else{
            return new JsonResponseBody(ResponseStatus.STATUS_210);
        }
    }
}
