package model;

import java.math.BigDecimal;
import java.util.Date;

public class PmsProduct {
    private Long id;

    private Long brand_id;

    private Long product_category_id;

    private Long feight_template_id;

    private Long product_attribute_category_id;

    private String name;

    private String pic;

    private String product_sn;

    private Integer delete_status;

    private Integer publish_status;

    private Integer new_status;

    private Integer recommand_status;

    private Integer verify_status;

    private Integer sort;

    private Integer sale;

    private BigDecimal price;

    private BigDecimal promotion_price;

    private Integer gift_growth;

    private Integer gift_point;

    private Integer use_point_limit;

    private String sub_title;

    private BigDecimal original_price;

    private Integer stock;

    private Integer low_stock;

    private String unit;

    private BigDecimal weight;

    private Integer preview_status;

    private String service_ids;

    private String keywords;

    private String note;

    private String album_pics;

    private String detail_title;

    private Date promotion_start_time;

    private Date promotion_end_time;

    private Integer promotion_per_limit;

    private Integer promotion_type;

    private String brand_name;

    private String product_category_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public Long getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(Long product_category_id) {
        this.product_category_id = product_category_id;
    }

    public Long getFeight_template_id() {
        return feight_template_id;
    }

    public void setFeight_template_id(Long feight_template_id) {
        this.feight_template_id = feight_template_id;
    }

    public Long getProduct_attribute_category_id() {
        return product_attribute_category_id;
    }

    public void setProduct_attribute_category_id(Long product_attribute_category_id) {
        this.product_attribute_category_id = product_attribute_category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getProduct_sn() {
        return product_sn;
    }

    public void setProduct_sn(String product_sn) {
        this.product_sn = product_sn == null ? null : product_sn.trim();
    }

    public Integer getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(Integer delete_status) {
        this.delete_status = delete_status;
    }

    public Integer getPublish_status() {
        return publish_status;
    }

    public void setPublish_status(Integer publish_status) {
        this.publish_status = publish_status;
    }

    public Integer getNew_status() {
        return new_status;
    }

    public void setNew_status(Integer new_status) {
        this.new_status = new_status;
    }

    public Integer getRecommand_status() {
        return recommand_status;
    }

    public void setRecommand_status(Integer recommand_status) {
        this.recommand_status = recommand_status;
    }

    public Integer getVerify_status() {
        return verify_status;
    }

    public void setVerify_status(Integer verify_status) {
        this.verify_status = verify_status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPromotion_price() {
        return promotion_price;
    }

    public void setPromotion_price(BigDecimal promotion_price) {
        this.promotion_price = promotion_price;
    }

    public Integer getGift_growth() {
        return gift_growth;
    }

    public void setGift_growth(Integer gift_growth) {
        this.gift_growth = gift_growth;
    }

    public Integer getGift_point() {
        return gift_point;
    }

    public void setGift_point(Integer gift_point) {
        this.gift_point = gift_point;
    }

    public Integer getUse_point_limit() {
        return use_point_limit;
    }

    public void setUse_point_limit(Integer use_point_limit) {
        this.use_point_limit = use_point_limit;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title == null ? null : sub_title.trim();
    }

    public BigDecimal getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(BigDecimal original_price) {
        this.original_price = original_price;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getPreview_status() {
        return preview_status;
    }

    public void setPreview_status(Integer preview_status) {
        this.preview_status = preview_status;
    }

    public String getService_ids() {
        return service_ids;
    }

    public void setService_ids(String service_ids) {
        this.service_ids = service_ids == null ? null : service_ids.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getAlbum_pics() {
        return album_pics;
    }

    public void setAlbum_pics(String album_pics) {
        this.album_pics = album_pics == null ? null : album_pics.trim();
    }

    public String getDetail_title() {
        return detail_title;
    }

    public void setDetail_title(String detail_title) {
        this.detail_title = detail_title == null ? null : detail_title.trim();
    }

    public Date getPromotion_start_time() {
        return promotion_start_time;
    }

    public void setPromotion_start_time(Date promotion_start_time) {
        this.promotion_start_time = promotion_start_time;
    }

    public Date getPromotion_end_time() {
        return promotion_end_time;
    }

    public void setPromotion_end_time(Date promotion_end_time) {
        this.promotion_end_time = promotion_end_time;
    }

    public Integer getPromotion_per_limit() {
        return promotion_per_limit;
    }

    public void setPromotion_per_limit(Integer promotion_per_limit) {
        this.promotion_per_limit = promotion_per_limit;
    }

    public Integer getPromotion_type() {
        return promotion_type;
    }

    public void setPromotion_type(Integer promotion_type) {
        this.promotion_type = promotion_type;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name == null ? null : brand_name.trim();
    }

    public String getProduct_category_name() {
        return product_category_name;
    }

    public void setProduct_category_name(String product_category_name) {
        this.product_category_name = product_category_name == null ? null : product_category_name.trim();
    }
}