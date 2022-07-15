package pojo;

import java.io.Serializable;
import java.util.List;

/**
 * (ShopType)实体类
 *
 * @author makejava
 * @since 2022-07-12 16:26:46
 */
public class ShopType implements Serializable {
    private static final long serialVersionUID = 391441399117533251L;
    /**
     * 编号
     */
    private Integer typeId;

    private Integer typeNum;
    
    private String typeName;

    private List<Shop> shops;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(Integer typeNum) {
        this.typeNum = typeNum;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}

