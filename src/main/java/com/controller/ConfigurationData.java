package com.controller;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author Cheng Yufei
 * @create 2019-07-13 23:26
 **/
@Component
@MapperScan(basePackages = {"com.mybatis_t.po"})
public class ConfigurationData {

    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    @Bean
    public DataSource dataSource() {
        return new HikariDataSource();
    }
}
