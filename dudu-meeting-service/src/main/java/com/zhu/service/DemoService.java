package com.zhu.service;

import com.zhu.entity.po.Demo;
import org.springframework.stereotype.Service;


public interface DemoService {
    Demo selectOne(Integer id);
}
