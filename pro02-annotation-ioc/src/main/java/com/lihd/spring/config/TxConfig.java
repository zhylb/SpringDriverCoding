package com.lihd.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/26 14:58
 */
@EnableTransactionManagement
@PropertySource("classpath:/druid.properties")
@ComponentScan(basePackages = "com.lihd.spring")
@Configuration
public class TxConfig {

    @Value("${druid.username}")
    private String username;
    @Value("${druid.password}")
    private String password;
    @Value("${druid.driverClassName}")
    private String driver;
    @Value("${druid.jdbcUrl}")
    private String jdbcUrl;

    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setUrl(jdbcUrl + "test");
        druidDataSource.setDriverClassName(driver);
        return druidDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        //这里不会产生多余的dataSource() 是因为Spring会对配置文件进行特殊处理 会把参数注入 但是不会新建对象
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public TransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

}
