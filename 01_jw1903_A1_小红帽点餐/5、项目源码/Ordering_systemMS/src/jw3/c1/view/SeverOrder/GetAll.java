package jw3.c1.view.SeverOrder;

import jw3.c1.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class GetAll {
//    店铺全查，模糊查询
    public static Vector<Vector<Object>> DpgetAll(String user){
        String sql;
        if (user.equals("")){//全查
            sql="select * from mer";
        }else {//模糊查
            sql="select * from mer where m_name like ?";
        }
//        sql="select * from mer where m_name like ?";
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            if (!user.equals("")){ //参数化sql语句只在模糊查时进行
                ps.setString(1,"%"+user+"%");
            }
//            ps.setString(1,"%加%");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                //创造对象，每次放一条数据
//                UserInfo ui=new UserInfo();
                Vector<Object> ui=new Vector<Object>();

                //将每个字段放入对象
                ui.add(rs.getInt("m_id"));
                ui.add(rs.getString("m_name"));
                ui.add(rs.getString("m_des"));
                ui.add(rs.getInt("mt_id"));
                ui.add(rs.getString("m_address"));
                ui.add(rs.getString("m_phone"));
                ui.add(rs.getString("m_url"));
                ui.add(rs.getString("m_isorder"));
                ui.add(rs.getInt("e_recordid"));
                ui.add(rs.getInt("b_id"));
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

    //    订单全查，模糊查询
    public static Vector<Vector<Object>> OrgetAll(String user) {
        String sql;
        int x = 0;
        if (user.equals("")) {//全查
            sql = "select * from orderlist";
        } else {//模糊查
            x=Integer.parseInt(user);
//            Integer x=new Integer(user);
            sql = "select * from orderlist where o_id = ?";
        }
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            if (!user.equals("")) { //参数化sql语句只在模糊查时进行
                ps.setInt(1,x);
            }
//            ps.setString(1,"%加%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //创造对象，每次放一条数据
//                UserInfo ui=new UserInfo();
                Vector<Object> ui = new Vector<Object>();

                //将每个字段放入对象
                ui.add(rs.getInt("o_id"));
                ui.add(rs.getString("o_number"));
                ui.add(rs.getString("o_phone"));
                ui.add(rs.getString("o_address"));
                ui.add(rs.getString("o_statue"));
                ui.add(rs.getString("o_isuse"));
                ui.add(rs.getString("d_couponnum"));
                ui.add(rs.getString("o_method"));
                ui.add(rs.getString("o_paustatue"));
                ui.add(rs.getInt("m_id"));
                ui.add(rs.getInt("u_id"));
                ui.add(rs.getDate("o_begintime"));
                ui.add(rs.getDate("o_estimate"));
                ui.add(rs.getDate("o_endtime"));
                //每次将一条数据加入到集合
                data.add(ui);
            }
            DBConnection.close(rs, ps, conn);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //    优惠券全查，模糊查询
    public static Vector<Vector<Object>> DigetAll(String user) {
        String sql;
        int x = 0;
        if (user.equals("")) {//全查
            sql = "select * from discount";
        } else {//模糊查
            x=Integer.parseInt(user);
//            Integer x=new Integer(user);
            sql = "select * from discount where d_couponid=?";
        }
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            if (!user.equals("")) { //参数化sql语句只在模糊查时进行
                ps.setInt(1,x);
            }
//            ps.setString(1,"%加%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //创造对象，每次放一条数据
//                UserInfo ui=new UserInfo();
                Vector<Object> ui = new Vector<Object>();

                //将每个字段放入对象
                ui.add(rs.getInt("d_couponid"));
                ui.add(rs.getString("d_couponnum"));
                ui.add(rs.getInt("u_id"));
                ui.add(rs.getString("d_name"));
                ui.add(rs.getString("d_details"));
                ui.add(rs.getString("d_overlying"));
                ui.add(rs.getInt("d_concessionalrate"));
                ui.add(rs.getInt("d_value"));
                //每次将一条数据加入到集合
                data.add(ui);
            }
            DBConnection.close(rs, ps, conn);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
