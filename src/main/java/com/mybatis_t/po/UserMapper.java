package com.mybatis_t.po;

import java.util.List;

public interface UserMapper {
    //查询 单个查
    User Select(int id);
    //查询 查询所有
    List<User> Select_all();
    //查询  根据条件查
    List<User> Select_id_bySection(int start,int end);
    //需求 增加用户
    boolean InsertUser(User user);

}
