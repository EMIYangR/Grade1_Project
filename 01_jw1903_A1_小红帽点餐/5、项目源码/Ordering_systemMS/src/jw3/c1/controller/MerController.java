package jw3.c1.controller;

import jw3.c1.model.Mer;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.QueryByClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MerController {
    static QueryByClass<Mer> qc=new QueryByClass<Mer>();
    public static List<Mer> sel(){
        String sql="select * from mer";
        List<Mer> list=qc.select(Mer.class,sql);
        List<Mer> list1=new ArrayList<Mer>();
        Random rdm=new Random();
        int a= rdm.nextInt(7);
        int b= rdm.nextInt(7)+7;
        int c= rdm.nextInt(6)+14;
        list1.add(list.get(a));
        list1.add(list.get(b));
        list1.add(list.get(c));
        return list1;
    }
}
