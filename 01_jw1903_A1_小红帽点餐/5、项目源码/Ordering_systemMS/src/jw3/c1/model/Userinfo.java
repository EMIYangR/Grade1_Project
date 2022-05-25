package jw3.c1.model;
import java.util.Date;

import java.time.LocalDate;

public class Userinfo {
    private int u_id;
    private String u_name;
    private String u_address;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getU_account() {
        return u_account;
    }

    public void setU_account(String u_account) {
        this.u_account = u_account;
    }

//    public LocalDate getU_headimage() {
//        return u_headimage;
//    }

    public void setU_headimage(String u_headimage) {
        this.u_headimage = LocalDate.parse(u_headimage);
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public int getV_viprank() {
        return v_viprank;
    }

    public void setV_viprank(int v_viprank) {
        this.v_viprank = v_viprank;
    }

    public Date getU_registertime() {
        return u_registertime;
    }

    public void setU_registertime(Date u_registertime) {
        this.u_registertime = u_registertime;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_nickname() {
        return u_nickname;
    }

    public void setU_nickname(String u_nickname) {
        this.u_nickname = u_nickname;
    }

    public int getP_score() {
        return p_score;
    }

    public void setP_score(int p_score) {
        this.p_score = p_score;
    }
    private String u_phone;
    private String u_account;

    public LocalDate getU_headimage() {
        return u_headimage;
    }

    public void setU_headimage(LocalDate u_headimage) {
        this.u_headimage = u_headimage;
    }

    private LocalDate u_headimage;
    private String u_pwd;
    private int v_viprank;
    private Date u_registertime;
    private String u_email;
    private String u_nickname;
    private int p_score;
}
