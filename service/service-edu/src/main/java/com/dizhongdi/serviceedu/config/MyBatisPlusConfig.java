package com.dizhongdi.serviceedu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:MyBatisPlusConfig
 * Package:com.dizhongdi.serviceedu.config
 * Description:
 *
 * @Date: 2022/5/8 19:43
 * @Author:dizhongdi
 */
@Configuration
@MapperScan("com.dizhongdi.serviceedu.mapper")
public class MyBatisPlusConfig {


}
