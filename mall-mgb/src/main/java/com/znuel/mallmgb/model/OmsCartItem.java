package com.znuel.mallmgb.model;

import java.math.BigDecimal;
import java.util.Date;

public class OmsCartItem {
    private Long id;

    private Long product_id;

    private Long product_sku_id;

    private Long member_id;

    private Integer quantity;

    private BigDecimal price;

    private String product_pic;

    private String product_name;

    private String product_sub_title;

    private String product_sku_code;

    private String member_nickname;

    private Date create_date;

    private Date modify_date;

    private Integer delete_status;

    private Long product_category_id;

    private String product_brand;

    private String product_sn;

    private String product_attr;

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

    public Long getProduct_sku_id() {
        return product_sku_id;
    }

    public void setProduct_sku_id(Long product_sku_id) {
        this.product_sku_id = product_sku_id;
    }

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public String getProduct_sub_title() {
        return product_sub_title;
    }

    public void setProduct_sub_title(String product_sub_title) {
        this.product_sub_title = product_sub_title == null ? null : product_sub_title.trim();
    }

    public String getProduct_sku_code() {
        return product_sku_code;
    }

    public void setProduct_sku_code(String product_sku_code) {
        this.product_sku_code = product_sku_code == null ? null : product_sku_code.trim();
    }

    public String getMember_nickname() {
        return member_nickname;
    }

    public void setMember_nickname(String member_nickname) {
        this.member_nickname = member_nickname == null ? null : member_nickname.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public Integer getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(Integer delete_status) {
        this.delete_status = delete_status;
    }

    public Long getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(Long product_category_id) {
        this.product_category_id = product_category_id;
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

    public String getProduct_attr() {
        return product_attr;
    }

    public void setProduct_attr(String product_attr) {
        this.product_attr = product_attr == null ? null : product_attr.trim();
    }
}