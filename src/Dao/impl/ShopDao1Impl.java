package Dao.impl;

import Dao.BaseDao1;
import Dao.ShopDao;
import pojo.Shop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShopDao1Impl extends BaseDao1 implements ShopDao {
    @Override
    public int insertShop() {
        return 0;
    }

    @Override
    public int updateShop() {
        return 0;
    }

    @Override
    public List<Object> all() {
        return null;
    }

    /**
     * 查询所有图片商品地址
     * @return
     */
    @Override
    public List<Shop> select() {
        Connection con =getConnection();
        PreparedStatement pre =null;
        ResultSet res =null;
        List<Shop> select =new ArrayList();
        String sql ="select * from shop  ";
        try{
            pre =con.prepareStatement(sql);
            res =pre.executeQuery();
            while (res.next()){
                Shop shop =new Shop();
                shop.setShopId(res.getInt("shop_Id"));
                shop.setShopNum(res.getInt("shop_Num"));
                shop.setShopImg(res.getNString("shop_Img"));
                shop.setShopTypeNum(res.getInt("shop_Type_Num"));
                shop.setShopName(res.getString("shop_Name"));
                select.add(shop);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeALL(null,pre,res);
        }
        return select;
    }

    /**
     * 查询男士商品图片地址
     * @return
     */
    @Override
    public List<Shop> Man() {
        Connection con =getConnection();
        PreparedStatement pre =null;
        ResultSet res =null;
        String sql ="select * from shop INNER JOIN shop_type ON shop.shop_id = shop_type.type_id WHERE type_num =1";
      try{
          pre =con.prepareStatement(sql);
          res =pre.executeQuery();
          while (res.next()){
              Shop shop1 =new Shop();
              shop1.setShopId(res.getInt("shop_Id"));

          }
      } catch (SQLException e) {
          e.printStackTrace();
      }
        return null;
    }

    @Override
    public List<Shop> Ms() {
        return null;
    }
}
