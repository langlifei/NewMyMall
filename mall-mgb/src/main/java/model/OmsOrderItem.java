package model;

import java.math.BigDecimal;

public class OmsOrderItem {
    private Long id;

    private Long order_id;

    private String order_sn;

    private Long product_id;

    private String product_pic;

    private String product_name;

    private String product_brand;

    private String product_sn;

    private BigDecimal product_price;

    private Integer product_quantity;

    private Long product_sku_id;

    private String product_sku_code;

    private Long product_category_id;

    private String promotion_name;

    private BigDecimal promotion_amount;

    private BigDecimal coupon_amount;

    private BigDecimal integration_amount;

    private BigDecimal real_amount;

    private Integer gift_integration;

    private Integer gift_growth;

    private String product_attr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn == null ? null : order_sn.trim();
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_pic() {
        return product_pic;
    }

    public void setProduct_pic(String product_pic) {
        this.product_pic = product_pic == null ? null : product_pic.trim();
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name == null ? null : product_name.trim();
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand == null ? null : product_brand.trim();
    }

    public String getProduct_sn() {
        return product_sn;
    }

    public void setProduct_sn(String product_sn) {
        this.product_sn = product_sn == null ? null : product_sn.trim();
    }

    public BigDecimal getProduct_price() {
        return product_price;
    }

    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Integer product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Long getProduct_sku_id() {
        return product_sku_id;
    }

    public void setProduct_sku_id(Long product_sku_id) {
        this.product_sku_id = product_sku_id;
    }

    public String getProduct_sku_code() {
        return product_sku_code;
    }

    public void setProduct_sku_code(String product_sku_code) {
        this.product_sku_code = product_sku_code == null ? null : product_sku_code.trim();
    }

    public Long getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(Long product_category_id) {
        this.product_category_id = product_category_id;
    }

    public String getPromotion_name() {
        return promotion_name;
    }

    public void setPromotion_name(String promotion_name) {
        this.promotion_name = promotion_name == null ? null : promotion_name.trim();
    }

    public BigDecimal getPromotion_amount() {
        return promotion_amount;
    }

    public void setPromotion_amount(BigDecimal promotion_amount) {
        this.promotion_amount = promotion_amount;
    }

    public BigDecimal getCoupon_amount() {
        return coupon_amount;
    }

    public void setCoupon_amount(BigDecimal coupon_amount) {
        this.coupon_amount = coupon_amount;
    }

    public BigDecimal getIntegration_amount() {
        return integration_amount;
    }

    public void setIntegration_amount(BigDecimal integration_amount) {
        this.integration_amount = integration_amount;
    }

    public BigDecimal getReal_amount() {
        return real_amount;
    }

    public void setReal_amount(BigDecimal real_amount) {
        this.real_amount = real_amount;
    }

    public Integer getGift_integration() {
        return gift_integration;
    }

    public void setGift_integration(Integer gift_integration) {
        this.gift_integration = gift_integration;
    }

    public Integer getGift_growth() {
        return gift_growth;
    }

    public void setGift_growth(Integer gift_growth) {
        this.gift_growth = gift_growth;
    }

    public String getProduct_attr() {
        return product_attr;
    }

    public void setProduct_attr(String product_attr) {
        this.product_attr = product_attr == null ? null : product_attr.trim();
    }
}