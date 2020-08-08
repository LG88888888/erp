package com.zking.erp.permissions.controller;

import com.zking.erp.Share.model.Emp;
import com.zking.erp.Share.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpController {
    @Autowired
    private IEmpService empService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(Emp emp){
        String smg="";
        try {
            empService.queryEmp(emp);
            smg="成功";
        }catch (Exception e){
            e.printStackTrace();
            smg="失败";
        }

        return smg;
    }
}
