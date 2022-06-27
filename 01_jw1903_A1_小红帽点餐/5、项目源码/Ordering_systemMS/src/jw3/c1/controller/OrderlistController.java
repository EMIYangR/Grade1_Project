package jw3.c1.controller;

import jw3.c1.model.Mer;
import jw3.c1.model.Orderlist;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class OrderlistController {
    static QueryByClass<Orderlist> qc=new QueryByClass<Orderlist>();
    public static Vector<Vector<Object>> getAll(int id){//根据用户id查询对应的订单
        String sql;
        sql="select a.o_number,a.o_phone,a.o_address,a.o_statue,a.o_isuse,\n" +
                "a.d_couponnum,a.o_method,a.o_paustatue,a.o_begintime,a.o_estimate,a.o_endtime\n" +
                "from orderlist a join mer b on a.m_id=b.m_id join userinfo c on a.u_id=c.u_id where c.u_id=?";
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
                ps.setInt(1,id);

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                //创造对象，每次放一条数据
//                UserInfo ui=new UserInfo();
                Vector<Object> ui=new Vector<Object>();

                //将每个字段放入对象
                ui.add(rs.getString("o_number"));
                ui.add(rs.getString("o_phone"));
                ui.add(rs.getString("o_address"));
                ui.add(rs.getString("o_statue"));
                if (rs.getString("o_isuse").equals("0")){
                    ui.add("否");
                }else{
                    ui.add("是");
                }
                ui.add(rs.getString("d_couponnum"));
                ui.add(rs.getString("o_method"));
                ui.add(rs.getString("o_paustatue"));
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
                String str=sdf.format(rs.getObject("o_begintime"));
                ui.add(str);
                if (rs.getString("o_paustatue").equals("未支付")){
                    ui.add("无");
                }else {
                    String str1=sdf.format(rs.getDate("o_endtime"));
                    ui.add(str1);
                }
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
    public static boolean add1(Object...args){
        String sql="insert orderlist values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn=null;
        try {
            conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);//sql语句参数化输入
            }
            int result=ps.executeUpdate();
            DBConnection.close(null,ps,conn);
            return result>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static Orderlist orde(){
        String sql="select * from orderlist ORDER BY o_id desc";
        QueryByClass<Orderlist> q1=new QueryByClass<>();
        return q1.select(Orderlist.class,sql).get(0);
    }
    public static int cxid(String num){
        String sql="SELECT o_id from orderlist where o_number=?";
        int a=qc.select(Orderlist.class,sql,num).get(0).getO_id();
        return a;
    }
    public static Boolean xgzt(){
        String sql="UPDATE orderlist set o_statue='已送达' WHERE o_endtime<NOW()";
        return DBConnection.zsg(sql);
    }
    public static Boolean xgzt1(){
        String sql="UPDATE orderlist set o_statue='已出货' WHERE o_endtime>NOW()";
        return DBConnection.zsg(sql);
    }
}
