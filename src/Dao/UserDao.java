package Dao;

import pojo.User;

import java.util.List;

public interface UserDao {
    //新增
    int insertUser();
    //修改
    int updateUser();
    //查询
    User all(User u);
}
