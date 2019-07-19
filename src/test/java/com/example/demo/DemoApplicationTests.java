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
import java.sql.SQLOutput;
import java.util.Scanner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
<<<<<<< Updated upstream
    public void contextLoads() {
        System.err.println(
                userMapper.Select(1));
    }
    @Test
    public void select_all(){
        System.out.println(userMapper.Select_all());
    }
    public static void main(){

    }
    @Test
    public void selectByIdSection(){
        System.err.println(userMapper.Select_id_bySection(1,20));


    }
   /* @Test
    public void add(){
=======
    public void select_1() {
        System.err.println(userMapper.Select(1));
    }
    @Test
    public void insert_1(){
>>>>>>> Stashed changes
        User user = new User();
        user.setUsername("小秦");
        user.setAddress("安徽");
        System.err.println(userMapper.InsertUser(user));
<<<<<<< Updated upstream
    }*/
=======
    }
    @Test
    public void Delete_1(){
        System.err.println(userMapper.Delete(101));
    }
>>>>>>> Stashed changes

}
