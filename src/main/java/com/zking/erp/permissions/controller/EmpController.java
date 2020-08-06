package com.zking.erp.permissions.controller;

import com.zking.erp.permissions.model.Emp;
import com.zking.erp.permissions.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmpController  {
    @Autowired
    private IEmpService empService;

    public Emp Login(Emp emp){
        try {
            empService.queryEmp(emp);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

}
