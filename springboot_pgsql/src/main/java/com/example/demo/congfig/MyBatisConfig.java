package com.example.demo.congfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.demo.dao")
public class MyBatisConfig {
}
