package com.lihd.spring.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import com.lihd.spring.bean.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/25 14:38
 */
//@Profile("test")
@PropertySource("classpath:/druid.properties")
@Configuration
public class ProfileConfig implements EmbeddedValueResolverAware {

    private StringValueResolver resolver;

    @Value("${druid.username}")
    private String username;

    private String driverClassName;

    @Bean
    public Book book() {
        return new Book();
    }

    @Profile("dev")
    @Bean
    public DataSource devDataSource(@Value("${druid.password}")String password) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("username",username);
        properties.setProperty("password",password);
        properties.setProperty("driverClassName",driverClassName);

        String jdbcUrl = resolver.resolveStringValue("${druid.jdbcUrl}");
        String dataBaseName = "jpa";
        properties.setProperty("jdbcUrl",jdbcUrl + dataBaseName);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        return dataSource;
    }

    @Profile("test")
    @Bean
    public DataSource testDataSource(@Value("${druid.password}")String password) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("username",username);
        properties.setProperty("password",password);
        properties.setProperty("driverClassName",driverClassName);

        String jdbcUrl = resolver.resolveStringValue("${druid.jdbcUrl}");
        String dataBaseName = "test";
        properties.setProperty("jdbcUrl",jdbcUrl + dataBaseName);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        return dataSource;
    }

    @Profile("pro")
    @Bean
    public DataSource proDataSource(@Value("${druid.password}")String password) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("username",username);
        properties.setProperty("password",password);
        properties.setProperty("driverClassName",driverClassName);

        String jdbcUrl = resolver.resolveStringValue("${druid.jdbcUrl}");
        String dataBaseName = "dbtest13";
        properties.setProperty("jdbcUrl",jdbcUrl + dataBaseName);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.resolver = resolver;
        this.driverClassName = resolver.resolveStringValue("${druid.driverClassName}");
    }
}
