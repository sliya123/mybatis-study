package com.sliaya;

import com.sliaya.xyq.config.MyConfig;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        SqlSessionFactoryBean sqlSessionFactoryBean = (SqlSessionFactoryBean) applicationContext.getBean("SqlSessionFactoryBean");
        System.out.println("sqlSessionFactoryBean = " + sqlSessionFactoryBean);

    }
}
