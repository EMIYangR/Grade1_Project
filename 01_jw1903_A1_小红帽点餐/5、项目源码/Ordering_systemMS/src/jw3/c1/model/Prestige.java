package jw3.c1.model;

public class Prestige {

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getP_score() {
        return p_score;
    }

    public void setP_score(int p_score) {
        this.p_score = p_score;
    }

    public String getP_blacklist() {
        return p_blacklist;
    }

    public void setP_blacklist(String p_blacklist) {
        this.p_blacklist = p_blacklist;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    private int p_id;
    private int p_score;
    private String p_blacklist;
    private int u_id;
    private int a_id;
}
