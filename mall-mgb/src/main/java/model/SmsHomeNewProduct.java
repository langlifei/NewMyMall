package model;

public class SmsHomeNewProduct {
    private Long id;

    private Long product_id;

    private String product_name;

    private Integer recommend_status;

    private Integer sort;

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

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name == null ? null : product_name.trim();
    }

    public Integer getRecommend_status() {
        return recommend_status;
    }

    public void setRecommend_status(Integer recommend_status) {
        this.recommend_status = recommend_status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}