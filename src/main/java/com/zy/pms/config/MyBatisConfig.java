package com.zy.pms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zy
 * @date 2019/5/17 10:02
 */
@Configuration
@MapperScan("com.zy.pms.mbg.mapper")
public class MyBatisConfig {
}
