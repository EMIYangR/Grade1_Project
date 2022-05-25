package jw3.c1.controller;

import jw3.c1.model.Busdiness;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import java.util.List;

public class BusdinessController {
    static QueryByClass<Busdiness> qc=new QueryByClass<Busdiness>();
    static {
        try {
            DBConnection.getConnection();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    public static int dlupd(String u,String p){
        int i;
        String sql="select b_userid,b_pwd from business";
        List<Busdiness> yhList= qc.select(Busdiness.class,sql);
        if (u.length()>0&&p.length()>0){
            for (i = 0; i < yhList.size(); i++) {
                if (u.equals(yhList.get(i).getB_userid())&&p.equals(yhList.get(i).getB_pwd())){
                    break;
                }
            }
            if (i >=yhList.size()) {
                return 1;
            }else {
                return 2;
            }
        }else {
            return 3;
        }
    }
}

