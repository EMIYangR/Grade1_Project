package jw3.c1.model;

public class Discount {


    private int d_couponid;
    private String d_couponnum;
    private int u_id;
    private String d_name;

    public int getD_couponid() {
        return d_couponid;
    }

    public void setD_couponid(int d_couponid) {
        this.d_couponid = d_couponid;
    }

    public String getD_couponnum() {
        return d_couponnum;
    }

    public void setD_couponnum(String d_couponnum) {
        this.d_couponnum = d_couponnum;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_details() {
        return d_details;
    }

    public void setD_details(String d_details) {
        this.d_details = d_details;
    }

    public String getD_overlying() {
        return d_overlying;
    }

    public void setD_overlying(String d_overlying) {
        this.d_overlying = d_overlying;
    }

    public int getD_concessionalrate() {
        return d_concessionalrate;
    }

    public void setD_concessionalrate(int d_concessionalrate) {
        this.d_concessionalrate = d_concessionalrate;
    }

    public int getD_value() {
        return d_value;
    }

    public void setD_value(int d_value) {
        this.d_value = d_value;
    }

    private String d_details;
    private String d_overlying;
    private int d_concessionalrate;
    private int d_value;
}
