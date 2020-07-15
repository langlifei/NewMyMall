package model;

import java.math.BigDecimal;
import java.util.Date;

public class PmsSeckillProduct {
    private Long id;

    private Long product_id;

    private BigDecimal seckill_price;

    private Integer seckill_stock;

    private Date start_date;

    private Date end_date;

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

    public BigDecimal getSeckill_price() {
        return seckill_price;
    }

    public void setSeckill_price(BigDecimal seckill_price) {
        this.seckill_price = seckill_price;
    }

    public Integer getSeckill_stock() {
        return seckill_stock;
    }

    public void setSeckill_stock(Integer seckill_stock) {
        this.seckill_stock = seckill_stock;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}