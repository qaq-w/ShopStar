package Service;

import pojo.Shop;

import java.util.List;

public interface ShopService {
    /**
     * 查询所有商品地址
     * @return
     */
    List<Shop>select();

    /**
     * 查询男士商品图片地址
     * @return
     */
    List<Shop>Man();

    /**
     * 查询女士商品图片地址
     * @return
     */
    List<Shop>Ms();
}
