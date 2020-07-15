package model;

import java.math.BigDecimal;
import java.util.Date;

public class OmsOrderReturnApply {
    private Long id;

    private Long order_id;

    private Long company_address_id;

    private Long product_id;

    private String order_sn;

    private Date create_time;

    private String member_username;

    private BigDecimal return_amount;

    private String return_name;

    private String return_phone;

    private Integer status;

    private Date handle_time;

    private String product_pic;

    private String product_name;

    private String product_brand;

    private String product_attr;

    private Integer product_count;

    private BigDecimal product_price;

    private BigDecimal product_real_price;

    private String reason;

    private String description;

    private String proof_pics;

    private String handle_note;

    private String handle_man;

    private String receive_man;

    private Date receive_time;

    private String receive_note;

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

    public Long getCompany_address_id() {
        return company_address_id;
    }

    public void setCompany_address_id(Long company_address_id) {
        this.company_address_id = company_address_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
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

    public BigDecimal getReturn_amount() {
        return return_amount;
    }

    public void setReturn_amount(BigDecimal return_amount) {
        this.return_amount = return_amount;
    }

    public String getReturn_name() {
        return return_name;
    }

    public void setReturn_name(String return_name) {
        this.return_name = return_name == null ? null : return_name.trim();
    }

    public String getReturn_phone() {
        return return_phone;
    }

    public void setReturn_phone(String return_phone) {
        this.return_phone = return_phone == null ? null : return_phone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getHandle_time() {
        return handle_time;
    }

    public void setHandle_time(Date handle_time) {
        this.handle_time = handle_time;
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

    public String getProduct_attr() {
        return product_attr;
    }

    public void setProduct_attr(String product_attr) {
        this.product_attr = product_attr == null ? null : product_attr.trim();
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public BigDecimal getProduct_price() {
        return product_price;
    }

    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }

    public BigDecimal getProduct_real_price() {
        return product_real_price;
    }

    public void setProduct_real_price(BigDecimal product_real_price) {
        this.product_real_price = product_real_price;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProof_pics() {
        return proof_pics;
    }

    public void setProof_pics(String proof_pics) {
        this.proof_pics = proof_pics == null ? null : proof_pics.trim();
    }

    public String getHandle_note() {
        return handle_note;
    }

    public void setHandle_note(String handle_note) {
        this.handle_note = handle_note == null ? null : handle_note.trim();
    }

    public String getHandle_man() {
        return handle_man;
    }

    public void setHandle_man(String handle_man) {
        this.handle_man = handle_man == null ? null : handle_man.trim();
    }

    public String getReceive_man() {
        return receive_man;
    }

    public void setReceive_man(String receive_man) {
        this.receive_man = receive_man == null ? null : receive_man.trim();
    }

    public Date getReceive_time() {
        return receive_time;
    }

    public void setReceive_time(Date receive_time) {
        this.receive_time = receive_time;
    }

    public String getReceive_note() {
        return receive_note;
    }

    public void setReceive_note(String receive_note) {
        this.receive_note = receive_note == null ? null : receive_note.trim();
    }
}