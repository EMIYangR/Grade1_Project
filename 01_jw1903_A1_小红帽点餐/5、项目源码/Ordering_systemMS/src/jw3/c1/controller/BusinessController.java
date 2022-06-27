package jw3.c1.controller;

import jw3.c1.model.Business;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;
import jw3.c1.view.Main_interface.Index;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

public class BusinessController {
    static QueryByClass<Business> qc=new QueryByClass<Business>();
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
        List<Business> yhList= qc.select(Business.class,sql);
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
    public static boolean iscx(){
        String sql="select * from business where b_userid=?";
        List<Business> b=qc.select(Business.class,sql, Index.zh);
        if (b.size()>0){
            return false;
        }else {
            return true;
        }
    }
    public static void xxtj(String a,String b,String c){
        String sql="INSERT into business VALUES(0,?,?,?)";
        DBConnection.zsg(sql,a,b,c);
    }
    public static List<Business> cx(String a){
        String sql="select * from business where b_userid=?";
        List<Business> busdinessList= qc.select(Business.class,sql,a);
        return busdinessList;
    }
    //增：注册
    public static boolean register(Business business){
        String sql="insert business values(?,?,?,?)";
        return DBConnection.zsg(sql,0,business.getB_name(),business.getB_userid(),business.getB_pwd());
    }
    //删:注销
    public static boolean logOut(int id){
        String sql="delete from business where b_id=?";
        return DBConnection.zsg(sql,id);
    }
    //改: 修改
    public static boolean update(Business ui){
        String sql="update business set b_name = ?,b_userid = ?,b_pwd = ? where b_id=?";
        return DBConnection.zsg(sql,ui.getB_name(),ui.getB_userid(),ui.getB_pwd(),ui.getB_id());
    }
    //1、全查：展示   2、模糊查
    public static Vector<Vector<Object>> getAll(String user){
        String sql;
        if (user.equals("")){//全查
            sql="select * from business";
        }else {//模糊查
            sql="select * from business where b_name like ?";
        }

        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            if (!user.equals("")){ //参数化sql语句只在模糊查时进行
                ps.setString(1,"%"+user+"%");
            }

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                //创造对象，每次放一条数据
                Vector<Object> ui = new Vector<Object>();
                //将每个字段放入对象
                ui.add(rs.getInt("b_id"));
                ui.add(rs.getString("b_name"));
                ui.add(rs.getString("b_userid"));
                ui.add(rs.getString("b_pwd"));
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
    public static int cxbid(){
        String sql="SELECT b_id from business ORDER BY b_id DESC LIMIT 1";
        return qc.select(Business.class,sql).get(0).getB_id();
    }
    public static Vector<Vector<Object>> getAll1(String name){
        String sql="SELECT b.b_id 商家编号, m.m_name 店铺编号, b.b_name 商家名称, COUNT(g.g_dprice) 收益 FROM business b JOIN mer m ON b.b_id =  m.b_id JOIN orderlist o ON m.m_id = o.m_id JOIN userinfo u ON u.u_id = o.u_id JOIN goods g ON m.b_id = b.b_id WHERE b.b_name LIKE ? GROUP BY m.m_id";
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(1,"%"+name+"%");

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                //创造对象，每次放一条数据
                Vector<Object> b = new Vector<Object>();
                //将每个字段放入对象
                b.add(rs.getInt("商家编号"));
                b.add(rs.getString("店铺编号"));
                b.add(rs.getString("商家名称"));
                b.add(rs.getString("收益"));
                //每次将一条数据加入到集合
                data.add(b);
            }
            DBConnection.close(rs,ps,conn);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

