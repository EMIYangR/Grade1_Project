package jw3.c1.controller;

import jw3.c1.model.Discount;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;
import jw3.c1.view.Main_interface.Index;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class DiscountController {
    static QueryByClass<Discount> qc=new QueryByClass<Discount>();
    public static List<Discount> cx(int a) {
        String sql="SELECT b.d_name,b.d_details from userinfo a join discount b ON a.u_id=b.u_id WHERE a.u_id=99 GROUP BY b.d_name";
        List<Discount> discountList=qc.select(Discount.class,sql);
        return discountList;
    }

    public static int[] cx3(String id){
        int i=0;
            try {
                String sql="SELECT b.d_name,b.d_details,COUNT(b.d_name) as sl from userinfo a join discount b ON a.u_id=b.u_id WHERE a.u_id=? GROUP BY b.d_name";
                Connection conn= DBConnection.getConnection();
                Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                PreparedStatement PS=conn.prepareStatement(sql);
                PS.setString(1,id);
                ResultSet rs = PS.executeQuery();
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
    public static int cx4(String aa){
        int i=0;
        try {
            String sql="SELECT b.d_name,b.d_details,COUNT(b.d_name) as sl from userinfo a join discount b ON a.u_id=b.u_id WHERE a.u_id=? GROUP BY b.d_name";
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            Userinfo u=UserinfoController.user(aa);
            ps.setString(1, String.valueOf(u.getU_id()));
            ResultSet rs = ps.executeQuery();
            String[] s=new String[50];
            int a=0;
            while (rs.next())
            {
                s[i++]=rs.getString("d_name");
            }
            int count=0;
            for (int j = 0; j < s.length&&s[j]!=null; j++) {
                count++;
            }
            DBConnection.close(rs,ps,conn);
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static Vector<Vector<Object>> getAll(String user){
        String sql;
        if (user.equals("")){//全查
            sql="select * from discount";
        }else {//模糊查
            sql="select * from discount where d_name like ?";
        }
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            if (!user.equals("")){ //参数化sql语句只在模糊查时进行
                ps.setString(1,"%"+user+"%");
            }

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Vector<Object> ui = new Vector<Object>();
                ui.add(rs.getInt("d_couponid"));
                ui.add(rs.getString("d_couponnum"));
                ui.add(rs.getInt("u_id"));
                ui.add(rs.getString("d_name"));
                ui.add(rs.getString("d_details"));
                ui.add(rs.getString("d_overlying"));
                ui.add(rs.getString("d_concessionalrate"));
                ui.add(rs.getString("d_value"));
                data.add(ui);
            }
            DBConnection.close(rs,ps,conn);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static boolean add(Discount discount){
        String sql="insert discount values(?,?,?,?,?,?,?,?)";
        return DBConnection.zsg(sql,0,discount.getD_couponnum(),
                discount.getU_id(),discount.getD_name(),
                discount.getD_details(),discount.getD_overlying(),
                discount.getD_concessionalrate(),discount.getD_value());
    }
    public static boolean delete(int discount){
        String sql="delete from discount where d_couponid=?";
        return DBConnection.zsg(sql,discount);
    }
    public  static boolean update (Discount discount){
        String sql="update discount set d_couponnum=?,u_id=?,d_name=?," +
                "d_details=?,d_overlying=?,d_concessionalrate=?,d_value=? " +
                "where d_couponid=?";
        return DBConnection.zsg(sql,discount.getD_couponnum(),discount.getU_id(),discount.getD_name(),
                discount.getD_details(),discount.getD_overlying(),discount.getD_concessionalrate(),
                discount.getD_value(), discount.getD_couponid());
    }
    public static List<Discount> yhjg(String num){
        String sql="select * from discount where d_couponnum=?";
        List<Discount> d=qc.select(Discount.class,sql,num);
        return d;
    }
    public static List<Discount> yhall(int id){
        String sql="select * from discount where u_id=?";
        List<Discount> d=qc.select(Discount.class,sql,id);
        return d;
    }
    public static List<Discount> yhall1(int id){
        String sql="select * from discount where u_id=? and d_overlying=1";
        List<Discount> d=qc.select(Discount.class,sql,id);
        return d;
    }
    public static int yhjg1(String num){
        String sql="select * from discount where d_name=?";
        List<Discount> d=qc.select(Discount.class,sql,num);
        return d.get(0).getD_concessionalrate();
    }
    public static String yhjg2(String name){
        if (name.equals("")){
            return null;
        }else {
            String sql="select * from discount where d_name=? and u_id=?";
            List<Discount> d=qc.select(Discount.class,sql,name,UserinfoController.user(Index.zh).getU_id());
            return d.get(0).getD_couponnum();
        }
    }
    public static List<Discount> cxall(){
        String sql="select * from discount";
        List<Discount> d=qc.select(Discount.class,sql);
        return d;
    }
    public static Boolean sc(int id,String num){
        String sql="UPDATE discount set d_value=d_value-1 where u_id=? and d_couponnum=?";
        return DBConnection.zsg(sql,id,num);
    }
    public static Boolean SC(){
        String sql="DELETE  from discount where d_value=0";
        return DBConnection.zsg(sql);
    }
    public static boolean tj(Object...a){

        String sql="INSERT discount VALUES(?,?,?,?,?,1,?,1)";
        try {
            Connection conne=DBConnection.getConnection();
            PreparedStatement ps=conne.prepareStatement(sql);
            for (int i = 0; i < a.length; i++) {
                ps.setObject(i+1,a[i]);
            }
            if (ps.executeUpdate()>0){
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static Discount cxid(int id){
        String sql="SELECT * from discount where d_couponid=?";
        List<Discount> list=qc.select(Discount.class,sql,id);
        return list.get(0);
    }

}
