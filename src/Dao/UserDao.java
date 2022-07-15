package Dao;

import pojo.User;

import java.util.List;

public interface UserDao {
    //新增
    int insertUser(User user);
    //修改
    int updateUser();
    //查询
    User all(User u);
    User allByPhone(User uu);
}
