package model;

import java.util.Date;

public class PmsComment {
    private Long id;

    private Long product_id;

    private String member_nick_name;

    private String product_name;

    private Integer star;

    private String member_ip;

    private Date create_time;

    private Integer show_status;

    private String product_attribute;

    private Integer collect_couont;

    private Integer read_count;

    private String pics;

    private String member_icon;

    private Integer replay_count;

    private String content;

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

    public String getMember_nick_name() {
        return member_nick_name;
    }

    public void setMember_nick_name(String member_nick_name) {
        this.member_nick_name = member_nick_name == null ? null : member_nick_name.trim();
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name == null ? null : product_name.trim();
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getMember_ip() {
        return member_ip;
    }

    public void setMember_ip(String member_ip) {
        this.member_ip = member_ip == null ? null : member_ip.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getShow_status() {
        return show_status;
    }

    public void setShow_status(Integer show_status) {
        this.show_status = show_status;
    }

    public String getProduct_attribute() {
        return product_attribute;
    }

    public void setProduct_attribute(String product_attribute) {
        this.product_attribute = product_attribute == null ? null : product_attribute.trim();
    }

    public Integer getCollect_couont() {
        return collect_couont;
    }

    public void setCollect_couont(Integer collect_couont) {
        this.collect_couont = collect_couont;
    }

    public Integer getRead_count() {
        return read_count;
    }

    public void setRead_count(Integer read_count) {
        this.read_count = read_count;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public String getMember_icon() {
        return member_icon;
    }

    public void setMember_icon(String member_icon) {
        this.member_icon = member_icon == null ? null : member_icon.trim();
    }

    public Integer getReplay_count() {
        return replay_count;
    }

    public void setReplay_count(Integer replay_count) {
        this.replay_count = replay_count;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}