package com.zking.erp.permissions.controller;

import com.zking.erp.Share.model.Erpright;
import com.zking.erp.Share.service.IErprightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class ErpRightController {
    @Autowired
    private IErprightService erprightService;


    @RequestMapping("/queryCode")
    public List<Erpright>queryCode(){

        return erprightService.queryCode(-1);
    }

    @RequestMapping("/queryRootNode")
    public List<Erpright>queryRootNode(Integer rid){

        return erprightService.queryRootNode(rid);
    }
}
