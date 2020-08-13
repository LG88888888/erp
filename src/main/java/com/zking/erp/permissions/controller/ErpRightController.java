package com.zking.erp.permissions.controller;

import com.zking.erp.Share.model.Emp;
import com.zking.erp.Share.model.Erpright;
import com.zking.erp.Share.model.Erprole;
import com.zking.erp.Share.model.Erproleright;
import com.zking.erp.Share.service.IEmpService;
import com.zking.erp.Share.service.IErprightService;
import com.zking.erp.Share.service.IErproleService;
import com.zking.erp.Share.service.IErprolerightService;
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
public class ErpRightController {
    @Autowired
    private IErprightService erprightService;

    @Autowired
    private IErprolerightService erprolerightService;

    @Autowired
    private IErproleService erproleService;

    @Autowired
    private IEmpService empService;

//树形菜单
    @RequestMapping("/queryCode")
    public List<Erpright>queryCode(){

        return erprightService.queryCode(-1);
    }
//根据角色id查询树形菜单
    @RequestMapping("/queryRootNode")
    public List<Erpright>queryRootNode(Integer rid){

        return erprightService.queryRootNode(rid);
    }

    //增加角色权限
    @RequestMapping("/addroleright")
    public JsonResponseBody  addroleright(Erproleright roleright){

        int i = erprolerightService.addRoleRight(roleright);
        if(i<0){
            return new JsonResponseBody(ResponseStatus.STATUS_201);
        }
        return new JsonResponseBody(ResponseStatus.STATUS_212);
    }

    //查询角色信息
    @RequestMapping("/queryRole")
    public Map<String,Object>queryRolePager(HttpServletRequest request){
        PageBean pb=new PageBean();
        pb.setRequest(request);
        List<Erprole> list = erproleService.queryRolePager(pb);
        Map<String,Object>map=new HashMap<>();
        map.put("rows",list);
        map.put("total",pb.getTotal());

        return map;
    }

    //修改角色
    @RequestMapping("/editRole")
    public JsonResponseBody editRole(Erprole erprole){

        int i = erproleService.updateByPrimaryKey(erprole);
        if(i<0){
            return new JsonResponseBody(ResponseStatus.STATUS_255);
        }
        return new JsonResponseBody(ResponseStatus.STATUS_210);

    }
//删除角色
    @RequestMapping("/delRole")
    public JsonResponseBody delRole(Long rid){

        int i = erproleService.deleteByPrimaryKey(rid);
        if(i<0){
            return new JsonResponseBody(ResponseStatus.STATUS_203);
        }
        return new JsonResponseBody(ResponseStatus.STATUS_211);

    }

    @RequestMapping("/addRole")
    public JsonResponseBody addRole(Erprole erprole){

        int i = erproleService.insert(erprole);
        if(i<0){
            return new JsonResponseBody(ResponseStatus.STATUS_201);
        }
        return new JsonResponseBody(ResponseStatus.STATUS_212);

    }

    //查询树形菜单
    @RequestMapping("/queryRoleRight")
    public List<Erpright>queryRoleRight(Integer rid){

        return erprightService.queryRoleRight(rid);
    }

    //用户对应的角色部门信息
    @RequestMapping("/queryEmpRolePager")
    public Map<String,Object>queryEmpRolePager(HttpServletRequest request,String username){
        PageBean pb=new PageBean();
        pb.setRequest(request);
        List<Map<String, Object>> query = empService.queryEmpPager(username,pb);
        Map<String,Object>map=new HashMap<>();
        map.put("rows",query);
        map.put("total",pb.getTotal());

        return map;
    }

    //用户登录
    @RequestMapping("/login")
    public Emp login(Emp emp){

        return empService.queryEmp(emp);
    }

    //重置密码
    @RequestMapping("/editpwd")
    public JsonResponseBody editpwd(Emp emp){

        int i = empService.updateByPrimaryKeySelective(emp);
        if(i<0){
            return new JsonResponseBody(ResponseStatus.STATUS_255);
        }
        return new JsonResponseBody(ResponseStatus.STATUS_210);
    }
}
