package Dao;

import java.util.List;

public interface ShopDao {
    //新增
    int insertShop();
    //修改
    int updateShop();
    //查询
    List<Object> all();
}
