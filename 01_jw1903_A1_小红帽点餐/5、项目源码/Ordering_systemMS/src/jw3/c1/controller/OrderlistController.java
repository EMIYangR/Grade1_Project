package jw3.c1.controller;

import jw3.c1.model.Mer;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class OrderlistController {
    static QueryByClass<Mer> qc=new QueryByClass<Mer>();
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
}
