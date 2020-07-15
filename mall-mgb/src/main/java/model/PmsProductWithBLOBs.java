package model;

public class PmsProductWithBLOBs extends PmsProduct {
    private String description;

    private String detail_desc;

    private String detail_html;

    private String detail_mobile_html;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDetail_desc() {
        return detail_desc;
    }

    public void setDetail_desc(String detail_desc) {
        this.detail_desc = detail_desc == null ? null : detail_desc.trim();
    }

    public String getDetail_html() {
        return detail_html;
    }

    public void setDetail_html(String detail_html) {
        this.detail_html = detail_html == null ? null : detail_html.trim();
    }

    public String getDetail_mobile_html() {
        return detail_mobile_html;
    }

    public void setDetail_mobile_html(String detail_mobile_html) {
        this.detail_mobile_html = detail_mobile_html == null ? null : detail_mobile_html.trim();
    }
}