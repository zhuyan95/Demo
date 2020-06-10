package com.zhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.zhu.dao"})
public class DuduMeetingWeixinApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuduMeetingWeixinApplication.class, args);
    }

}
