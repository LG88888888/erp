package com.zking.erp.Share.service.impl;

import com.zking.erp.Share.mapper.StoreMapper;
import com.zking.erp.Share.model.Store;
import com.zking.erp.Share.service.IStoreService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StoreServiceImpl implements IStoreService {
    @Autowired
    private StoreMapper storeMapper;
    @Override
    public int deleteByPrimaryKey(Integer storeid) {
        return storeMapper.deleteByPrimaryKey(storeid);
    }

    @Override
    public int insert(Store record) {
        return storeMapper.insert(record);
    }

    @Override
    public int insertSelective(Store record) {
        return 0;
    }

    @Override
    public Store selectByPrimaryKey(Integer storeid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Store record) {
        return storeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Store record) {
        return 0;
    }

    @Override
    public List<Map<String,Object>> queryStorePager(Store store, PageBean pageBean) {
        return storeMapper.queryStorePager(store);
    }
}
