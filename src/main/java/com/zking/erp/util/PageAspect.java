package com.zking.erp.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class PageAspect {

    //返回值不限 包名不限 以Service结尾的接口或者类 以Pager结尾的方法 参数不限
    @Around(value = "execution(* *..*Service.*Pager(..))")
    public Object invoke(ProceedingJoinPoint args) throws Throwable{

        //获取目标方法的执行参数个数
        Object[] params = args.getArgs();
        //定义PageBean对象
        PageBean pageBean=null;
        //遍历目标方法的参数数组
        for(Object obj : params){
            //判断参数的类型
            if(obj instanceof  PageBean){
                pageBean=(PageBean)obj;
                break;
            }
        }

        //设置目标方法的分页参数
        if(null!=pageBean&&pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }

        Object result = args.proceed(params);

        //获取分页信息
        if(null!=pageBean&&pageBean.isPagination()&&null!=result&&result instanceof List){
            List lst= (List) result;
            PageInfo pageInfo=new PageInfo(lst);
            //将总记录数保存到PageBean对象的total属性中
            pageBean.setTotal((int) pageInfo.getTotal());
        }
        return result;
    }

}
