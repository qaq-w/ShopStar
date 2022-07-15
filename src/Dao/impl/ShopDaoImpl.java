package Dao.impl;

import Dao.BaseDao;
import Dao.ShopDao;
import pojo.Shop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShopDaoImpl extends BaseDao implements ShopDao {

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
     * 查询商品图片
     * @return
     */
    @Override
    public List<Shop> select() {
        Connection con=getConnection();
        PreparedStatement pre =null;
        ResultSet res =null;
        String sq1= "select * from shop INNER JOIN shop_type ON shop.shop_id = shop_type.type_id ";
        List<Shop> sho =new ArrayList();
        try{
            pre =con.prepareStatement(sq1);
            res=pre.executeQuery();
            while(res.next()){
                Shop shop =new Shop();
                shop.setShopId(res.getInt("shop_Id"));
                shop.setShopNum(res.getInt("shop_Num"));
                shop.setShopImg(res.getString("shop_Img"));
                shop.setShopTypeNum(res.getInt("shop_Type_Num"));
                shop.setShopName(res.getString("shop_Name"));
                sho.add(shop);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeALL(null,pre,res);
        }
        return sho;
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
            String sql ="select * from shop INNER JOIN shop_type ON shop.shop_id = shop_type.type_id WHERE type_num =? ";
            List<Shop> sho1 =new ArrayList();
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
                    sho1.add(shop);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                closeALL(null,pre,res);
            }

        return sho1;
    }

    /**
     * 查询女士商品图片地址
     * @return
     */
    @Override
    public List<Shop> Ms() {
        Connection con =getConnection();
        PreparedStatement pre =null;
        ResultSet res =null;
        String sql ="select * from shop INNER JOIN shop_type ON shop.shop_id = shop_type.type_id WHERE type_num =? ";
        List<Shop> sho2 =new ArrayList();
        try{
            pre =con.prepareStatement(sql);
            res =pre.executeQuery();
            while (res.next()){
                Shop shop =new Shop();
                shop.setShopId(res.getInt("shop_Id"));
                shop.setShopNum(res.getInt("shop_Num"));
                shop.setShopImg(res.getNString("shop_Img"));
                shop.setShopTypeNum(res.getInt("shop_Type-Num"));
                shop.setShopName(res.getString("shop-Name"));
                sho2.add(shop);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeALL(null,pre,res);
        }

        return sho2;
    }
}
