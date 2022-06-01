package jw3.c1.controller;

import jw3.c1.model.Goods;
import jw3.c1.model.Mer;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public static List<Goods> sel(int a){
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
        String sql="select * from goods where g_id="+id;
        List<Goods> list= qc.select(Goods.class,sql);
        Goods g=list.get(0);
        return g;
    }

}
