package com.zking.erp.Share.service.impl;

import com.zking.erp.Share.mapper.SupplierMapper;
import com.zking.erp.Share.model.Supplier;
import com.zking.erp.Share.service.ISupplierService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class SupplierServiceImpl implements ISupplierService {
    @Autowired
    private SupplierMapper supplierMapper;
    @Override
    public int deleteByPrimaryKey(Integer supplierid) {
        return supplierMapper.deleteByPrimaryKey(supplierid);
    }

    @Override
    public int insert(Supplier record) {
        return supplierMapper.insert(record);
    }

    @Override
    public int insertSelective(Supplier record) {
        return 0;
    }

    @Override
    public Supplier selectByPrimaryKey(Integer supplierid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Supplier record) {
        return supplierMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Supplier record) {
        return 0;
    }

    @Override
    public List<Map<String, Object>> querySupplierPager(Supplier supplier, PageBean pageBean) {
        return supplierMapper.querySupplierPager(supplier);
    }

    @Override
    public List<Map<String, Object>> queryCustomerPager(Supplier supplier,PageBean pageBean) {
        return supplierMapper.queryCustomerPager(supplier);
    }

    @Override
    public Supplier querySige(String name) {
        return supplierMapper.querySige(name);
    }
}
