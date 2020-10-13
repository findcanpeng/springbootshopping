package edu.sicau.shopping.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan(value = {"edu.sicau.shopping.mapper"})
@Configuration
public class SystemConfig {

}
