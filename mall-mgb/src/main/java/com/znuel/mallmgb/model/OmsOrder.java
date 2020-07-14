package com.znuel.mallmgb.model;

import java.math.BigDecimal;
import java.util.Date;

public class OmsOrder {
    private Long id;

    private Long member_id;

    private Long coupon_id;

    private String order_sn;

    private Date create_time;

    private String member_username;

    private BigDecimal total_amount;

    private BigDecimal pay_amount;

    private BigDecimal freight_amount;

    private BigDecimal promotion_amount;

    private BigDecimal integration_amount;

    private BigDecimal coupon_amount;

    private BigDecimal discount_amount;

    private Integer pay_type;

    private Integer source_type;

    private Integer status;

    private Integer order_type;

    private String delivery_company;

    private String delivery_sn;

    private Integer auto_confirm_day;

    private Integer integration;

    private Integer growth;

    private String promotion_info;

    private Integer bill_type;

    private String bill_header;

    private String bill_content;

    private String bill_receiver_phone;

    private String bill_receiver_email;

    private String receiver_name;

    private String receiver_phone;

    private String receiver_post_code;

    private String receiver_province;

    private String receiver_city;

    private String receiver_region;

    private String receiver_detail_address;

    private String note;

    private Integer confirm_status;

    private Integer delete_status;

    private Integer use_integration;

    private Date payment_time;

    private Date delivery_time;

    private Date receive_time;

    private Date comment_time;

    private Date modify_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public Long getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(Long coupon_id) {
        this.coupon_id = coupon_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn == null ? null : order_sn.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getMember_username() {
        return member_username;
    }

    public void setMember_username(String member_username) {
        this.member_username = member_username == null ? null : member_username.trim();
    }

    public BigDecimal getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
    }

    public BigDecimal getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(BigDecimal pay_amount) {
        this.pay_amount = pay_amount;
    }

    public BigDecimal getFreight_amount() {
        return freight_amount;
    }

    public void setFreight_amount(BigDecimal freight_amount) {
        this.freight_amount = freight_amount;
    }

    public BigDecimal getPromotion_amount() {
        return promotion_amount;
    }

    public void setPromotion_amount(BigDecimal promotion_amount) {
        this.promotion_amount = promotion_amount;
    }

    public BigDecimal getIntegration_amount() {
        return integration_amount;
    }

    public void setIntegration_amount(BigDecimal integration_amount) {
        this.integration_amount = integration_amount;
    }

    public BigDecimal getCoupon_amount() {
        return coupon_amount;
    }

    public void setCoupon_amount(BigDecimal coupon_amount) {
        this.coupon_amount = coupon_amount;
    }

    public BigDecimal getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(BigDecimal discount_amount) {
        this.discount_amount = discount_amount;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public Integer getSource_type() {
        return source_type;
    }

    public void setSource_type(Integer source_type) {
        this.source_type = source_type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public String getDelivery_company() {
        return delivery_company;
    }

    public void setDelivery_company(String delivery_company) {
        this.delivery_company = delivery_company == null ? null : delivery_company.trim();
    }

    public String getDelivery_sn() {
        return delivery_sn;
    }

    public void setDelivery_sn(String delivery_sn) {
        this.delivery_sn = delivery_sn == null ? null : delivery_sn.trim();
    }

    public Integer getAuto_confirm_day() {
        return auto_confirm_day;
    }

    public void setAuto_confirm_day(Integer auto_confirm_day) {
        this.auto_confirm_day = auto_confirm_day;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public String getPromotion_info() {
        return promotion_info;
    }

    public void setPromotion_info(String promotion_info) {
        this.promotion_info = promotion_info == null ? null : promotion_info.trim();
    }

    public Integer getBill_type() {
        return bill_type;
    }

    public void setBill_type(Integer bill_type) {
        this.bill_type = bill_type;
    }

    public String getBill_header() {
        return bill_header;
    }

    public void setBill_header(String bill_header) {
        this.bill_header = bill_header == null ? null : bill_header.trim();
    }

    public String getBill_content() {
        return bill_content;
    }

    public void setBill_content(String bill_content) {
        this.bill_content = bill_content == null ? null : bill_content.trim();
    }

    public String getBill_receiver_phone() {
        return bill_receiver_phone;
    }

    public void setBill_receiver_phone(String bill_receiver_phone) {
        this.bill_receiver_phone = bill_receiver_phone == null ? null : bill_receiver_phone.trim();
    }

    public String getBill_receiver_email() {
        return bill_receiver_email;
    }

    public void setBill_receiver_email(String bill_receiver_email) {
        this.bill_receiver_email = bill_receiver_email == null ? null : bill_receiver_email.trim();
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name == null ? null : receiver_name.trim();
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone == null ? null : receiver_phone.trim();
    }

    public String getReceiver_post_code() {
        return receiver_post_code;
    }

    public void setReceiver_post_code(String receiver_post_code) {
        this.receiver_post_code = receiver_post_code == null ? null : receiver_post_code.trim();
    }

    public String getReceiver_province() {
        return receiver_province;
    }

    public void setReceiver_province(String receiver_province) {
        this.receiver_province = receiver_province == null ? null : receiver_province.trim();
    }

    public String getReceiver_city() {
        return receiver_city;
    }

    public void setReceiver_city(String receiver_city) {
        this.receiver_city = receiver_city == null ? null : receiver_city.trim();
    }

    public String getReceiver_region() {
        return receiver_region;
    }

    public void setReceiver_region(String receiver_region) {
        this.receiver_region = receiver_region == null ? null : receiver_region.trim();
    }

    public String getReceiver_detail_address() {
        return receiver_detail_address;
    }

    public void setReceiver_detail_address(String receiver_detail_address) {
        this.receiver_detail_address = receiver_detail_address == null ? null : receiver_detail_address.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getConfirm_status() {
        return confirm_status;
    }

    public void setConfirm_status(Integer confirm_status) {
        this.confirm_status = confirm_status;
    }

    public Integer getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(Integer delete_status) {
        this.delete_status = delete_status;
    }

    public Integer getUse_integration() {
        return use_integration;
    }

    public void setUse_integration(Integer use_integration) {
        this.use_integration = use_integration;
    }

    public Date getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(Date payment_time) {
        this.payment_time = payment_time;
    }

    public Date getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(Date delivery_time) {
        this.delivery_time = delivery_time;
    }

    public Date getReceive_time() {
        return receive_time;
    }

    public void setReceive_time(Date receive_time) {
        this.receive_time = receive_time;
    }

    public Date getComment_time() {
        return comment_time;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }
}