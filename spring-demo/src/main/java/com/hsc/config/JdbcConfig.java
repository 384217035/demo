package com.hsc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @ProjectName: demo
 * @ClassName: JdbcConfig
 * @Author: heshanchi
 * @CreateDate: 2021/7/13
 * @Description:
 */
@Configuration
public class JdbcConfig {

    @Value("${spring.datasource.jdbc-driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.jdbc-url}")
    private String url;

    @Value("${spring.datasource.jdbc-userName}")
    private String userName;

    @Value("${spring.datasource.jdbc-password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        // 使用 驱动管理数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

}
