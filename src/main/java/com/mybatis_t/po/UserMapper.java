package com.mybatis_t.po;

public interface UserMapper {
    public User Select(int id);
    //需求 增加用户
    public boolean InsertUser(User user);

}
