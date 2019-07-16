package com.mybatis_t.po;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
@Data

public class User {
    private int id;
    private String username;
    private String sex;
    private Date birthday;
    private String address;
}
