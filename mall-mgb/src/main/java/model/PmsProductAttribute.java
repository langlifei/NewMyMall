package model;

public class PmsProductAttribute {
    private Long id;

    private Long product_attribute_category_id;

    private String name;

    private Integer select_type;

    private Integer input_type;

    private String input_list;

    private Integer sort;

    private Integer filter_type;

    private Integer search_type;

    private Integer related_status;

    private Integer hand_add_status;

    private Integer type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getSelect_type() {
        return select_type;
    }

    public void setSelect_type(Integer select_type) {
        this.select_type = select_type;
    }

    public Integer getInput_type() {
        return input_type;
    }

    public void setInput_type(Integer input_type) {
        this.input_type = input_type;
    }

    public String getInput_list() {
        return input_list;
    }

    public void setInput_list(String input_list) {
        this.input_list = input_list == null ? null : input_list.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFilter_type() {
        return filter_type;
    }

    public void setFilter_type(Integer filter_type) {
        this.filter_type = filter_type;
    }

    public Integer getSearch_type() {
        return search_type;
    }

    public void setSearch_type(Integer search_type) {
        this.search_type = search_type;
    }

    public Integer getRelated_status() {
        return related_status;
    }

    public void setRelated_status(Integer related_status) {
        this.related_status = related_status;
    }

    public Integer getHand_add_status() {
        return hand_add_status;
    }

    public void setHand_add_status(Integer hand_add_status) {
        this.hand_add_status = hand_add_status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}