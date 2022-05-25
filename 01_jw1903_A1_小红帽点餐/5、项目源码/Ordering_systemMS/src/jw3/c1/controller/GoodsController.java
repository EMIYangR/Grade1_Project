package jw3.c1.controller;

import jw3.c1.model.Goods;
import jw3.c1.model.Mer;
import jw3.c1.utils.QueryByClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GoodsController {
    static QueryByClass<Goods> qc=new QueryByClass<Goods>();
    public static List<Goods> sel(int a){
        Random ra=new Random();
        String sql="SELECT g_name,g_url from goods where m_id=?";
        System.out.println(a);
        List<Goods> list=qc.select(Goods.class,sql,a);
        List<Goods> list1=new ArrayList<Goods>();
        list1.add(list.get(ra.nextInt(list.size())));
        System.out.println(list1.get(0).getG_url());
        return list1;
    }
}
