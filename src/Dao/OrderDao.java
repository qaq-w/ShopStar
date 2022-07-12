package Dao;

import java.util.List;

public interface OrderDao {
    //新增
    int insertOrder();
//修改
    int updateOrder();
    //查询
    List<Object>all();
}
