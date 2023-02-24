package com.sliaya.xyq.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration(proxyBeanMethods = true)
@ComponentScan(basePackages = "com.sliaya")
public class MyConfig {

    @Bean("dataSource")
    public DataSource getDataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test01?serverTimeZone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean("SqlSessionFactoryBean")
    public SqlSessionFactoryBean getSqlSessionFactoryBean() throws SQLException, MalformedURLException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(getDataSource());
        FileUrlResource resources = new FileUrlResource("F:\\workspaces\\mybatis-study\\src\\main\\resources\\com\\sliaya\\mapper\\UserMapper.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.sliaya.model");
        return sqlSessionFactoryBean;
    }
}
