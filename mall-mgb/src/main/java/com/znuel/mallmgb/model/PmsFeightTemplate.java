package com.znuel.mallmgb.model;

import java.math.BigDecimal;

public class PmsFeightTemplate {
    private Long id;

    private String name;

    private Integer charge_type;

    private BigDecimal first_weight;

    private BigDecimal first_fee;

    private BigDecimal continue_weight;

    private BigDecimal continme_fee;

    private String dest;

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

    public Integer getCharge_type() {
        return charge_type;
    }

    public void setCharge_type(Integer charge_type) {
        this.charge_type = charge_type;
    }

    public BigDecimal getFirst_weight() {
        return first_weight;
    }

    public void setFirst_weight(BigDecimal first_weight) {
        this.first_weight = first_weight;
    }

    public BigDecimal getFirst_fee() {
        return first_fee;
    }

    public void setFirst_fee(BigDecimal first_fee) {
        this.first_fee = first_fee;
    }

    public BigDecimal getContinue_weight() {
        return continue_weight;
    }

    public void setContinue_weight(BigDecimal continue_weight) {
        this.continue_weight = continue_weight;
    }

    public BigDecimal getContinme_fee() {
        return continme_fee;
    }

    public void setContinme_fee(BigDecimal continme_fee) {
        this.continme_fee = continme_fee;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest == null ? null : dest.trim();
    }
}