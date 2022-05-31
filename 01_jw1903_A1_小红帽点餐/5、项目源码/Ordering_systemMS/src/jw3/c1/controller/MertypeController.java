package jw3.c1.controller;

import jw3.c1.model.Mer;
import jw3.c1.model.Mertype;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MertypeController {
    static QueryByClass<Mertype> qc=new QueryByClass<Mertype>();
    public static void tj(String a){
        String sql="INSERT into mertype VALUES(0,?)";
        DBConnection.zsg(sql,a);
    }
    public static int cx(String a){
        String sql="select * from mertype where mt_name=?";
        List<Mertype> mt1=cx2();
        for (int i = 0; i < mt1.size() ; i++) {
            if (a.equals(mt1.get(i).getMt_name())){
                return mt1.get(i).getMt_id();
            }else {
                List<Mertype> mt=qc.select(Mertype.class,sql,a);
                return mt.get(0).getMt_id();
            }
        }
        return 0;
    }
    public static int cx1(String a){
        String sql="select mt_id from mertype where mt_name=?";
        List<Mertype> mt=qc.select(Mertype.class,sql,a);
        int mt1=mt.get(0).getMt_id();
        return mt1;
    }
    public static List cx2(){
        String sql="select mt_name from mertype";
        List<Mertype> mt=qc.select(Mertype.class,sql);
        return mt;
    }
    public static boolean cx3(String a){
        String sql="select mt_name from mertype where mt_name=?";
        List<Mertype> mt=qc.select(Mertype.class,sql,a);
        if (mt.size()>0){
            return false;
        }else {
            return true;
        }
    }
    public static void dele(int a){
        String sql="delect * from mertype where mt_id=?";
        DBConnection.zsg(sql,a);
    }

}
