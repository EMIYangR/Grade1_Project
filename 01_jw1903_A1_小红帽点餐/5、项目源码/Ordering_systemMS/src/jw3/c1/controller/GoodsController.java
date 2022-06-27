package jw3.c1.controller;

import jw3.c1.model.Goods;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GoodsController {
    static QueryByClass<Goods> qc=new QueryByClass<Goods>();
    public static Vector<Vector<Object>> getAll(String name){
        String sql;
        if (name.equals("")){//全查
            sql="select g_id,g_name,b.m_id,m_name,g_price,g_time,g_dprice from goods a JOIN mer b on a.m_id=b.m_id";
        }else {//模糊查
            sql="select  g_id,g_name,b.m_id,m_name,g_price,g_time,g_dprice from goods a JOIN\n" +
                    "mer b on a.m_id=b.m_id where a.g_name like ?";
        }

        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            if (!name.equals("")){ //参数化sql语句只在模糊查时进行
                ps.setString(1,"%"+name+"%");
            }

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                //创造对象，每次放一条数据
//                UserInfo ui=new UserInfo();
                Vector<Object> ui=new Vector<Object>();

                //将每个字段放入对象
                ui.add(rs.getInt("g_id"));
                ui.add(rs.getString("g_name"));
                ui.add(rs.getString("m_name"));
                ui.add(rs.getDouble("g_price"));
                ui.add(rs.getString("g_time"));
                ui.add(rs.getDouble("g_dprice"));
                //每次将一条数据加入到集合
                data.add(ui);
            }
            DBConnection.close(rs,ps,conn);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static List<Goods> sel(int a){//查图片和名字
        String sql="select g_url,g_name from goods where g_id=?";
        List<Goods> goodsList=qc.select(Goods.class,sql,a);
        return goodsList;
    }
    public static List<Goods> sel1(){
        String sql="select * from goods";
        List<Goods> goodsList=qc.select(Goods.class,sql);
        return goodsList;
    }
    public static Goods spcx(int id){//根据点击的栏目获取商品信息
        String sql="select * from goods where g_id=?";
        List<Goods> list= qc.select(Goods.class,sql,id);
        Goods g=list.get(0);
        return g;
    }
    public static List<Goods> sp(int a){
        String sql="SELECT * from goods a where m_id=?";
        List<Goods> list= qc.select(Goods.class,sql,a);
        return list;
    }
    public static List<Goods> sp1(int b,String a){
        String a1="'%"+a+"%'";
        String sql;
        if (!a.equals("")){
            sql="SELECT * from goods where m_id=? and g_Name like "+a1;
        }else {
            sql="SELECT * from goods where m_id=?";
        }
         List<Goods> list= qc.select(Goods.class,sql,b);
         return list;
    }
    public static List<Goods> zhj(int a){
        String sql="SELECT * from goods where g_price!=g_dprice and m_id=?";
        List<Goods> list= qc.select(Goods.class,sql,a);
        return list;
    }
    public static int[] gwccx3(){
        int i=0;
        try {
            String sql="SELECT COUNT(g_name) as sl,g_name from goods GROUP BY g_name";
            Connection conn= DBConnection.getConnection();
            Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stat.executeQuery(sql);
            int[] count=new int[50];
            while (rs.next())
            {
                count[i++]=rs.getInt("sl");
            }
            DBConnection.close(rs,stat,conn);
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static List<Goods> dd(String num){//根据订单编号获取对应的所有商品
        String sql="SELECT g_id from orderdetails where o_id=?";
        int id=OrderlistController.cxid(num);
        int a=qc.select(Goods.class,sql,id).size();
        List<Goods> g=new ArrayList<>();
        for (int i = 0; i <a ; i++) {
            Goods g1=spcx(qc.select(Goods.class,sql,id).get(i).getG_id());
            g.add(g1);
        }
        return g;
    }
    public static String[] jg(int id){
        String[] jg=new String[2];
        String sql="SELECT g_price,g_dprice from goods where g_id=?";
        List<Goods> list=qc.select(Goods.class,sql,id);
        jg[0]= String.valueOf(list.get(0).getG_price());
        jg[0]= String.valueOf(list.get(0).getG_price());
        return jg;
    }

    public static List<Goods> all(int id){
        String sql="select * from goods where m_id=?";
        return qc.select(Goods.class,sql,id);
    }
    public static int[] cxspid(int id){
        int i=0;
        String sql="SELECT a.g_id from goods a join mer b on a.m_id=b.m_id where a.m_id=?";
        try {
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            int[] id1=new int[40];
            while (rs.next()){
                id1[i++]=rs.getInt("g_id");
            }
            return id1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
