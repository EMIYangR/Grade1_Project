package jw3.c1.controller;

import jw3.c1.model.Evaluate1;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

public class Evaluate1Controller {
    static QueryByClass<Evaluate1> qc=new QueryByClass<Evaluate1>();
    public static List<Evaluate1> cx(){
        String sql="select * from evaluate1";
        List<Evaluate1> evaluate1s=qc.select(Evaluate1.class,sql);
        return evaluate1s;
    }
    public static Vector<Vector<Object>> getAll(int id){
        String sql="select a.e_evaluate,d.u_nickname\n" +
                "from evaluate1 a join goods b on a.g_id=b.g_id \n" +
                "join mer c on b.m_id=c.m_id join userinfo d on a.u_id=d.u_id where c.m_id=?";
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            int a=1;
            while (rs.next()){
                //创造对象，每次放一条数据
//                UserInfo ui=new UserInfo();
                Vector<Object> ui=new Vector<Object>();
                //将每个字段放入对象
                ui.add("评价"+a++);
                ui.add(rs.getString("e_evaluate"));
                ui.add(rs.getString("d.u_nickname"));
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
    public static boolean add(String e,int userid,int goodsid){
        String sql="insert evaluate1 VALUES(?,?,?,?)";
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn=DBConnection.getConnection();
            ps=conn.prepareStatement(sql);
            ps.setInt(1,0);
            ps.setString(2,e);
            ps.setInt(3,userid);
            ps.setInt(4,goodsid);
            return ps.executeUpdate()>0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            DBConnection.close(null,ps,conn);
        }
        return false;
    }
}
