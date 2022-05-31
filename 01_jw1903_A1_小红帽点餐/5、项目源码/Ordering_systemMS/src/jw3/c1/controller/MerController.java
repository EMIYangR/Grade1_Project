package jw3.c1.controller;

import jw3.c1.model.Evaluate1;
import jw3.c1.model.Mer;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class MerController {
    static QueryByClass<Mer> qc=new QueryByClass<Mer>();
    public static List<Mer> sel(){
        String sql="select * from mer";
        List<Mer> list=qc.select(Mer.class,sql);
        List<Mer> list1=new ArrayList<Mer>();
        Random rdm=new Random();
        int a= rdm.nextInt(7);
        int b= rdm.nextInt(7)+7;
        int c= rdm.nextInt(6)+14;
        list1.add(list.get(a));
        list1.add(list.get(b));
        list1.add(list.get(c));
        return list1;
    }
    public static Mer dpcx(int id){//根据商品id查询店铺
        String sql="select * from mer where m_id="+id;
        List<Mer> m= qc.select(Mer.class,sql);
       Mer m1=m.get(0);
        return m1;
    }
    public static int spdp(int id){//根据商品id查找店铺id
        String sql="select a.m_id from mer a JOIN goods b on a.m_id=b.m_id where b.g_id="+id;
        List<Mer> m=qc.select(Mer.class,sql);
        return m.get(0).getM_id();
    }
    public static Vector<Vector<Object>> getAll(String name){//查找店铺
        String sql;
        if (name.equals("")){//全查
            sql="select a.m_id,a.m_name,a.m_des,b.mt_name,a.m_address,a.m_phone,a.m_isorder \n" +
                    "from mer a join mertype b on a.mt_id=b.mt_id";
        }else {//模糊查
            sql="select a.m_id,a.m_name,a.m_des,b.mt_name,a.m_address,a.m_phone,a.m_isorder \n" +
                    "from mer a join mertype b on a.mt_id=b.mt_id where a.m_name like ?";
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
                    ui.add(rs.getInt("m_id"));
                    ui.add(rs.getString("m_name"));
                    ui.add(rs.getString("m_des"));
                    ui.add(rs.getString("mt_name"));
                    ui.add(rs.getString("m_address"));
                    ui.add(rs.getString("m_phone"));
                    if (rs.getString("m_isorder").equals("1")){
                        ui.add("是");
                    }else {
                        ui.add("否");
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
    public static void dptj(String a,String b,int c,String d,String e,String f,int g){
        Random r=new Random();
        List<Evaluate1> e1=Evaluate1Controller.cx();
        List<Userinfo> u1=UserinfoController.cx();
        String sql="INSERT into mer VALUES(0,?,?,?,?,?,?,?,?,?)";
        DBConnection.zsg(sql,a,b,c,d,e,f,g,r.nextInt(e1.size()),r.nextInt(u1.size()));
    }
    public static List<Mer> sel1(){
        String sql="select * from mer";
        List<Mer> merList=qc.select(Mer.class,sql);
        return merList;
    }
}
