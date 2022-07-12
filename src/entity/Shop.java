package entity;

import java.io.Serializable;

/**
 * (Shop)实体类
 *
 * @author makejava
 * @since 2022-07-12 16:26:41
 */
public class Shop implements Serializable {
    private static final long serialVersionUID = -24934776271213676L;
    
    private Integer shopId;
    
    private Integer shopNum;
    
    private String shopImg;
    
    private Integer shopTypeNum;
    
    private String shopName;


    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getShopNum() {
        return shopNum;
    }

    public void setShopNum(Integer shopNum) {
        this.shopNum = shopNum;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public Integer getShopTypeNum() {
        return shopTypeNum;
    }

    public void setShopTypeNum(Integer shopTypeNum) {
        this.shopTypeNum = shopTypeNum;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

}

