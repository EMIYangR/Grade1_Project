package jw3.c1.model;

public class Business {
    private int b_id;

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_userid() {
        return b_userid;
    }

    public void setB_userid(String b_userid) {
        this.b_userid = b_userid;
    }

    public String getB_pwd() {
        return b_pwd;
    }

    public void setB_pwd(String b_pwd) {
        this.b_pwd = b_pwd;
    }

    private String b_name;
    private String b_userid;
    private String b_pwd;
}
