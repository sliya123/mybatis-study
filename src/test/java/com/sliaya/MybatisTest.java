package com.sliaya;

import com.sliaya.mapper.UserMapper;
import com.sliaya.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)//指定测试框架
@ContextConfiguration("classpath:spring-context.xml")
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test02(){
        User user = userMapper.getUserById(1);
        System.out.println("user = " + user);
        System.out.println("user = " + user);
    }
}
