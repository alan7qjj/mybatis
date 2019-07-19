package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication{
    public static void main(String[] args){

        SpringApplication.run(DemoApplication.class,args);
        System.out.println("i love java " );
            /*
            * idea 中使用@test 无法使用Scanner在控制台中输入内容，只能在main（）中使用
            * */
            System.out.println("请输入起始id：");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println("请输入末尾id：");
            int b = s.nextInt();
            System.out.println("start:"+a+"   end:"+b);



    }
}
