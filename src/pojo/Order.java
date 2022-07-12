package pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2022-07-12 16:26:32
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 407140995760580920L;
    
    private Integer orderId;
    
    private Integer orderUserId;
    
    private Integer orderShopId;
    
    private Date prderTime;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Integer getOrderShopId() {
        return orderShopId;
    }

    public void setOrderShopId(Integer orderShopId) {
        this.orderShopId = orderShopId;
    }

    public Date getPrderTime() {
        return prderTime;
    }

    public void setPrderTime(Date prderTime) {
        this.prderTime = prderTime;
    }

}

