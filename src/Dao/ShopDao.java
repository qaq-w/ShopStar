package Dao;

import pojo.Shop;

import java.util.List;

public interface ShopDao {
    //新增
    int insertShop();
    //修改
    int updateShop();
    //查询
    List<Object> all();
    //查询所有商品图片地址
    List<Shop> select();
    //查询男士商品图片地址
    List<Shop> Man();
    //查询女士商品图片地址
    List<Shop> Ms();


}
