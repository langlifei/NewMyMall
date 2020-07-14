package com.znuel.mallmgb.model;

public class PmsBrand {
    private Long id;

    private String name;

    private String first_letter;

    private Integer sort;

    private Integer factory_status;

    private Integer show_status;

    private Integer product_count;

    private Integer product_comment_count;

    private String logo;

    private String big_pic;

    private String brand_story;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFirst_letter() {
        return first_letter;
    }

    public void setFirst_letter(String first_letter) {
        this.first_letter = first_letter == null ? null : first_letter.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactory_status() {
        return factory_status;
    }

    public void setFactory_status(Integer factory_status) {
        this.factory_status = factory_status;
    }

    public Integer getShow_status() {
        return show_status;
    }

    public void setShow_status(Integer show_status) {
        this.show_status = show_status;
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public Integer getProduct_comment_count() {
        return product_comment_count;
    }

    public void setProduct_comment_count(Integer product_comment_count) {
        this.product_comment_count = product_comment_count;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getBig_pic() {
        return big_pic;
    }

    public void setBig_pic(String big_pic) {
        this.big_pic = big_pic == null ? null : big_pic.trim();
    }

    public String getBrand_story() {
        return brand_story;
    }

    public void setBrand_story(String brand_story) {
        this.brand_story = brand_story == null ? null : brand_story.trim();
    }
}