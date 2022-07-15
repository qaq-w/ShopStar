package service.impl;

import Dao.ShopDao;
import Dao.impl.ShopDao1Impl;
import Dao.impl.ShopDao1Impl;
import service.ShopService;
import pojo.Shop;

import java.util.List;

public class ShopServiceImpl implements ShopService {
    /**
     * 查询所有商品图片地址
     * @param
     * @return
     */
    @Override
    public List<Shop> select() {
        ShopDao sd =new ShopDao1Impl();
        List<Shop> select = sd.select();
        return select;
    }

    /**
     * 查询男士商品图片地址
     * @return
     */
    @Override
    public List<Shop> Man() {
        ShopDao sd1 =new ShopDao1Impl();
        List<Shop> Man =sd1.Man();
        return Man;
    }

    /**
     * 查询女士商品图片地址
     * @return
     */
    @Override
    public List<Shop> Ms() {
        ShopDao sd2 =new ShopDao1Impl();
        List<Shop> Ms =sd2.Ms();
        return Ms;
    }
}

