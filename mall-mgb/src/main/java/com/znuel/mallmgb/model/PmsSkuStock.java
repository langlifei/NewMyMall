package com.znuel.mallmgb.model;

import java.math.BigDecimal;

public class PmsSkuStock {
    private Long id;

    private Long product_id;

    private String sku_code;

    private BigDecimal price;

    private Integer stock;

    private Integer low_stock;

    private String pic;

    private Integer sale;

    private BigDecimal promotion_price;

    private Integer lock_stock;

    private String sp_data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getSku_code() {
        return sku_code;
    }

    public void setSku_code(String sku_code) {
        this.sku_code = sku_code == null ? null : sku_code.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLow_stock() {
        return low_stock;
    }

    public void setLow_stock(Integer low_stock) {
        this.low_stock = low_stock;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPromotion_price() {
        return promotion_price;
    }

    public void setPromotion_price(BigDecimal promotion_price) {
        this.promotion_price = promotion_price;
    }

    public Integer getLock_stock() {
        return lock_stock;
    }

    public void setLock_stock(Integer lock_stock) {
        this.lock_stock = lock_stock;
    }

    public String getSp_data() {
        return sp_data;
    }

    public void setSp_data(String sp_data) {
        this.sp_data = sp_data == null ? null : sp_data.trim();
    }
}