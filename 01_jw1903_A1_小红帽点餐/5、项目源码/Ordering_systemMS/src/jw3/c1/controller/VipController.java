package jw3.c1.controller;

import jw3.c1.model.Vip;
import jw3.c1.utils.QueryByClass;

import java.util.List;

public class VipController {
    public static QueryByClass<Vip> qc=new QueryByClass<>();
    public static Vip vcx(int a){//根据用户id查询其vip等级及相关功能
        String sql="SELECT * from vip where v_viprank=?";
        List<Vip> v=qc.select(Vip.class,sql,a);
        return v.get(0);
    }
}
