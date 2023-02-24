package com.sliaya;

import com.sliaya.xyq.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Object dataSource = applicationContext.getBean("user");

    }
}
