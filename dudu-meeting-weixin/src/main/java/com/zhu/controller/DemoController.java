package com.zhu.controller;

import com.zhu.entity.po.Demo;
import com.zhu.service.DemoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping("/weixin/{id}")
    @ResponseBody
    public Demo getOne(@PathVariable(value = "id")Integer id){
          return   demoService.selectOne(id);
    }

}
