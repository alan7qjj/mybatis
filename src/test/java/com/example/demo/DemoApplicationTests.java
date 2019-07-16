package com.example.demo;

import com.mybatis_t.po.User;
import com.mybatis_t.po.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        System.err.println(userMapper.Select(1));
    }
    @Test
    public void add(){
        User user = new User();
        user.setUsername("小秦");
        user.setAddress("安徽");
        System.err.println(userMapper.InsertUser(user));
    }

}
