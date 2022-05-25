package jw3.c1.controller;

import jw3.c1.model.*;
import jw3.c1.utils.*;
import java.sql.*;
import java.util.List;


public class UserinfoController {
    static QueryByClass<Userinfo> qc=new QueryByClass<Userinfo>();
    static Connection c;
    static {
        try {
            c=DBConnection.getConnection();
        } catch (Exception e1) {
            e1.printStackTrace();
        }DBConnection.close(null,null,c);
    }
    public static int dlupd(String u,String p){
        int i;
        String sql="select u_account,u_pwd from userinfo";
        List<Userinfo> yhList= qc.select(Userinfo.class,sql);
        if (u.length()>0&&p.length()>0){
            for (i = 0; i < yhList.size(); i++) {
                if (u.equals(yhList.get(i).getU_account())&&p.equals(yhList.get(i).getU_pwd())){
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
    public static int ncpd(String a){
        int j;
        String sql1="select u_nickname from userinfo";
        List<Userinfo> yhList1= qc.select(Userinfo.class,sql1);
        if(a.length()>0){
            for (j = 0; j < yhList1.size(); j++) {
                if (a.equals(yhList1.get(j).getU_nickname())){
                    break;
                }
            }
            if (j>=yhList1.size()){
                return 1;
            }else {
                return 2;
            }
        }else {
            return 3;
        }
    }
    public static int sjhpd(String a){
        int k;
        String sql2="select u_phone from userinfo";
        List<Userinfo> yhList2=qc.select(Userinfo.class,sql2);
        if(a.length()>0){
            for (k = 0; k < yhList2.size(); k++) {
                if (yhList2.get(k).getU_phone().equals(a)){
                    break;
                }
            }
            if (k>=yhList2.size()){
                return 1;
            }else {
                return 2;
            }
        }else {
            return 3;
        }
    }
    public static int yxpd(String a){
        int k;
        String sql3="select u_email from userinfo";
        List<Userinfo> yhList3=qc.select(Userinfo.class,sql3);
        if(a.length()>0){
            for (k = 0; k < yhList3.size(); k++) {
                if (yhList3.get(k).getU_email().equals(a)){
                    break;
                }
            }
            if (k>=yhList3.size()){
                return 1;
            }else {
                return 2;
            }
        }else {
            return 3;
        }
    }
    public static int zhpd(String a){
        int k;
        String sql4="select u_account from userinfo";
        List<Userinfo> yhList4=qc.select(Userinfo.class,sql4);
        if(a.length()>0){
            for (k = 0; k < yhList4.size(); k++) {
                if (a.equals(yhList4.get(k).getU_account())){
                    break;
                }
            }
            if (k>=yhList4.size()){
                return 1;
            }else {
                return 2;
            }
        }else {
            return 3;
        }
    }
    public static void mmxg(String a,String b,String c){
        String sql="UPDATE userinfo set u_pwd=? where u_account=? and u_email=?";
        DBConnection.zsg(sql,a,b,c);
    }
    public static int mmcx(String a,String b){
        int k;
        String sql="select u_pwd,u_account from userinfo";
        List<Userinfo> userinfoList=qc.select(Userinfo.class,sql);
        if(a.length()>0){
            for (k = 0; k <userinfoList.size() ; k++) {
                if(a.equals(userinfoList.get(k).getU_account())&&b.equals(userinfoList.get(k).getU_pwd())){
                    break;
                }
            }
            if (k>=userinfoList.size()){
                return 1;
            }else{
                return 2;
                }
        }else {
            return 3;
        }
    }
//    public static String nccx(String a){
//        int i;
//        String sql5="select u_nickname,u_account from userinfo where u_account=?";
//        List<Userinfo> yhList5=qc.select(Userinfo.class,sql5,a);
//                if (yhList5.size()>0){
//                    Index.nc=yhList5.get(0).getU_nickname();
//                } else {
//                    System.out.println("cuowu");
//                }
//        return null;
//    }
    public static int mmcx1(String a,String b){
        int k;
        String sql="select * from userinfo where u_pwd=? and u_account=?";
        List<Userinfo> userinfoList=qc.select(Userinfo.class,sql,b,a);
        if(a.length()>0){
//            for (k = 0; k <userinfoList.size() ; k++) {
//                if(a.equals(userinfoList.get(k).getU_account())&&b.equals(userinfoList.get(k).getU_pwd())){
//                    break;
//                }
//            }
//            if (k>=userinfoList.size()){
//                return 1;
//            }else{
//                return 2;
//            }
            if (userinfoList.size()>0){
                return 2;
            }else {
                return 1;
            }
        }else {
            return 3;
        }
    }
//    public static String nccx(String a){
//        int i;
//        String sql5="select u_nickname,u_account from userinfo where u_account=?";
//        List<Userinfo> yhList5=qc.select(Userinfo.class,sql5,a);
//                if (yhList5.size()>0){
//                    Index.nc=yhList5.get(0).getU_nickname();
//                } else {
//                    System.out.println("cuowu");
//                }
//        return null;
//}
    public static Userinfo user(String a){
        String sql="select * from userinfo where u_account="+a;
        List<Userinfo> u=qc.select(Userinfo.class,sql);
        Userinfo u1=u.get(0);
        return u1;
    }
}
