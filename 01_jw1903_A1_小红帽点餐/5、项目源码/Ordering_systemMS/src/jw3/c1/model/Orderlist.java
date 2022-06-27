package jw3.c1.model;

import java.sql.Timestamp;

public class Orderlist {

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public String getO_phone() {
        return o_phone;
    }

    public void setO_phone(String o_phone) {
        this.o_phone = o_phone;
    }

    public String getO_address() {
        return o_address;
    }

    public void setO_address(String o_address) {
        this.o_address = o_address;
    }

    public String getO_statue() {
        return o_statue;
    }

    public void setO_statue(String o_statue) {
        this.o_statue = o_statue;
    }

    public String getO_isuse() {
        return o_isuse;
    }

    public void setO_isuse(String o_isuse) {
        this.o_isuse = o_isuse;
    }

    public String getD_couponnum() {
        return d_couponnum;
    }

    public void setD_couponnum(String d_couponnum) {
        this.d_couponnum = d_couponnum;
    }

    public String getO_method() {
        return o_method;
    }

    public void setO_method(String o_method) {
        this.o_method = o_method;
    }

    public String getO_paustatue() {
        return o_paustatue;
    }

    public void setO_paustatue(String o_paustatue) {
        this.o_paustatue = o_paustatue;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    private int o_id;

    public String getO_number() {
        return o_number;
    }

    public void setO_number(String o_number) {
        this.o_number = o_number;
    }

    private String o_number;
    private String o_phone;
    private String o_address;
    private String o_statue;
    private String o_isuse;
    private String d_couponnum;
    private String o_method;
    private String o_paustatue;
    private int m_id;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    private int u_id;

    public Timestamp getO_begintime() {
        return o_begintime;
    }

    public void setO_begintime(Timestamp o_begintime) {
        this.o_begintime = o_begintime;
    }

    public Timestamp getO_estimate() {
        return o_estimate;
    }

    public void setO_estimate(Timestamp o_estimate) {
        this.o_estimate = o_estimate;
    }

    public Timestamp getO_endtime() {
        return o_endtime;
    }

    public void setO_endtime(Timestamp o_endtime) {
        this.o_endtime = o_endtime;
    }

    private Timestamp o_begintime;
    private Timestamp o_estimate;
    private Timestamp o_endtime;
}
