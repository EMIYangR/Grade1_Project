package jw3.c1.controller;

import jw3.c1.model.*;
import jw3.c1.utils.*;

import java.util.*;

public class AdministratorController {
    static QueryByClass<Administrator> qc = new QueryByClass<Administrator>();
    public static int administratorLogin(String administratorId,String administratorPwd){
        //检查用户名和密码是否正确
        int i;
        String sql="select a_number,a_pwd from administrator";
        List<Administrator> administratorsList = qc.select(Administrator.class,sql);
        if (administratorId.length()>0 && administratorPwd.length()>0){
            for (i = 0; i < administratorsList.size(); i++)
                if (administratorId.equals(administratorsList.get(i).getA_number()) && administratorPwd.equals(administratorsList.get(i).getA_pwd())) break;
            if (i >=administratorsList.size()) return 1;
            else return 2;
        }else return 3;
    }
    public static String user(String a){
        QueryByClass<Administrator> qc=new QueryByClass<Administrator>();
        String sql="select a_name from administrator where a_number=?";
        List<Administrator> u = qc.select(Administrator.class,sql,a);
        Administrator administrator = new Administrator();
        return administrator.getA_name();
    }
}
