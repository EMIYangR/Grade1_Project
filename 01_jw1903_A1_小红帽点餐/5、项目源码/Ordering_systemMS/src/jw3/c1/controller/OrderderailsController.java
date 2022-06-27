package jw3.c1.controller;

import jw3.c1.model.Orderdetails;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;
import jw3.c1.view.Main_interface.Index;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class OrderderailsController {
    static QueryByClass<Orderdetails> qc=new QueryByClass<>();
    public static boolean add1(Object...args){
        String sql="insert orderdetails values(?,?,?,?)";
        Connection conn=null;
        try {
            conn= DBConnection.getConnection();
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
    public static int cx(){
        String sql="select * from orderdetails";
        try {
            Connection conn=DBConnection.getConnection();
            List<Orderdetails> list= qc.select(Orderdetails.class,sql);
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int cxjf(){
        String sql="SELECT SUM(b.g_price) jf,d.u_name " +
                "from orderdetails a join goods b on a.g_id=b.g_id " +
                "join orderlist c on a.o_id=c.o_id " +
                "join userinfo d on c.u_id=d.u_id " +
                "WHERE d.u_id=? " +
                "GROUP BY d.u_name";
        try {
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,UserinfoController.user(Index.zh).getU_id());
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                return rs.getInt("jf");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
