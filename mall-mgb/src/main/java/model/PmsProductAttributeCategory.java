package model;

public class PmsProductAttributeCategory {
    private Long id;

    private String name;

    private Integer attribute_count;

    private Integer param_count;

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

    public Integer getAttribute_count() {
        return attribute_count;
    }

    public void setAttribute_count(Integer attribute_count) {
        this.attribute_count = attribute_count;
    }

    public Integer getParam_count() {
        return param_count;
    }

    public void setParam_count(Integer param_count) {
        this.param_count = param_count;
    }
}