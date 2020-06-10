package com.zhu.service.impl;

import com.zhu.dao.DemoDao;
import com.zhu.entity.po.Demo;
import com.zhu.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoDao demoDao;

    @Override
    public Demo selectOne(Integer id) {
        return demoDao.queryById(id);
    }
}
