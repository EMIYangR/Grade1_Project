package jw3.c1.model;

import java.math.BigDecimal;

public class Goods {


    private int g_id;
    private String g_name;

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public BigDecimal getG_price() {
        return g_price;
    }

    public void setG_price(BigDecimal g_price) {
        this.g_price = g_price;
    }

    public String getG_time() {
        return g_time;
    }

    public void setG_time(String g_time) {
        this.g_time = g_time;
    }

    public BigDecimal getG_dprice() {
        return g_dprice;
    }

    public void setG_dprice(BigDecimal g_dprice) {
        this.g_dprice = g_dprice;
    }

    public String getG_url() {
        return g_url;
    }

    public void setG_url(String g_url) {
        this.g_url = g_url;
    }

    public String getG_coupon() {
        return g_coupon;
    }

    public void setG_coupon(String g_coupon) {
        this.g_coupon = g_coupon;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    private BigDecimal g_price;
    private String g_time;



    private BigDecimal g_dprice;
    private String g_url;
    private String g_coupon;
    private int m_id;
}
