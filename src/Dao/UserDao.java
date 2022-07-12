package Dao;

import java.util.List;

public interface UserDao {
    //新增
    int insertUser();
    //修改
    int updateUser();
    //查询
    List<Object> all();
}
