package jw3.c1.model;

import java.math.BigDecimal;

public class Vip {


    public int getV_viprank() {
        return v_viprank;
    }

    public void setV_viprank(int v_viprank) {
        this.v_viprank = v_viprank;
    }

    public int getV_levelup() {
        return v_levelup;
    }

    public void setV_levelup(int v_levelup) {
        this.v_levelup = v_levelup;
    }

    public BigDecimal getV_discount() {
        return v_discount;
    }

    public void setV_discount(BigDecimal v_discount) {
        this.v_discount = v_discount;
    }

    private int v_viprank;
    private int v_levelup;
    private BigDecimal v_discount;
}
