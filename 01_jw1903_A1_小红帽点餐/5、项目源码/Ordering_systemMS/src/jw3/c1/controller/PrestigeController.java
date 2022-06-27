package jw3.c1.controller;

import jw3.c1.utils.DBConnection;

public class PrestigeController {
    public static Boolean xyjf(int id){
        String sql="UPDATE userinfo a,prestige b set b.p_score=a.p_score where b.u_id=?";
        return DBConnection.zsg(sql,id);
    }
}
