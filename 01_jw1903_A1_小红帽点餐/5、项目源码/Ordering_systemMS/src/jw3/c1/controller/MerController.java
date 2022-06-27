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
    public static Mer dpcx(int id){//根据店铺id查询商品
        String sql="select * from mer where m_id=?";
        List<Mer> m= qc.select(Mer.class,sql,id);
       Mer m1=m.get(0);
        return m1;
    }
    public static List<Mer> dpcxo(int id){//根据店铺id查询商品
        String sql="select * from mer where m_id=?";
        List<Mer> m= qc.select(Mer.class,sql,id);
        return m;
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
        DBConnection.zsg(sql,a,b,c,d,e,f,g,r.nextInt(e1.size()),BusinessController.cxbid());
        //a店铺名字,b店铺介绍，c店铺类型，d店铺地址，e店铺电话，f店铺图片，g是否可以点餐，评论id随机生成，商家id
    }
//    public static double sel1(){
//        String sql="SELECT a.m_name,(sum(b.g_price)/COUNT(b.g_name)) as pj from mer a join goods b on a.m_id=b.m_id GROUP BY a.m_name;";
//        List<Mer> merList=qc.select(Mer.class,sql);
//        int[] jg=new int[merList.size()];
//        for (int i = 0; i < merList.size(); i++) {
//            jg[i]=merList.g
//        }
//        return merList;
//    }
    public static int[] sel2(){
        int i=0;
        try {
            String sql="SELECT a.m_name,(sum(b.g_price)/COUNT(b.g_name)) as pj from mer a join goods b on a.m_id=b.m_id GROUP BY a.m_name";
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int[] s=new int[20];
            int a=0;
            while (rs.next())
            {
                s[i++]=rs.getInt("pj");
            }
            DBConnection.close(rs,ps,conn);
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static int sel3(int a){
        int i=0;
        try {
            String sql="SELECT a.mt_id,a.m_name,(sum(b.g_price)/COUNT(b.g_name)) as pj from mer a join goods b on a.m_id=b.m_id where a.mt_id=? GROUP BY a.m_name";
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,a);
            ResultSet rs = ps.executeQuery();
            int s=0;
            while (rs.next())
            {
                s=rs.getInt("mt_id");
            }
            DBConnection.close(rs,ps,conn);
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static List<Mer> dpcx1(int id){//根据商品id查询店铺
        String sql="select  * " +
                "from Mer where mt_id="+id;
        List<Mer> m= qc.select(Mer.class,sql);
        return m;
    }
    public static int sel5(int aa){
        //查询每家店的平均售价
        int i=0;
        try {
            String sql="SELECT a.m_name,(sum(b.g_price)/COUNT(b.g_name)) as pj from mer a join goods b on a.m_id=b.m_id where a.mt_id=? GROUP BY a.m_name";
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int[] s=new int[20];
            int a=0;
            while (rs.next())
            {
                a=rs.getInt("pj");
            }
            DBConnection.close(rs,ps,conn);
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static List<Mer> sel4(String a){
        //模糊查
        String b="'%"+a+"%'";
            String sql="SELECT * from mer where m_name like"+b;
            List<Mer> l=qc.select(Mer.class,sql);

            return l;
    }

    public static List<Mer> sel1(){
        String sql="select * from mer";
        List<Mer> merList=qc.select(Mer.class,sql);
        return merList;
    }
    public static List<Mer> sel2(String name){//有参数查询所有店铺
        String sql;
        List<Mer> mer=new ArrayList<>();
        if (name.equals("")){
            sql="select * from mer";
        }else {
            sql="select * from mer where m_name like ?";
        }
        Connection conn= null;
        try {
            conn = DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            if (!name.equals("")){ //参数化sql语句只在模糊查时进行
                ps.setString(1,"%"+name+"%");
            }
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Mer m=new Mer();
                m.setM_id(rs.getInt("m_id"));
                m.setM_name(rs.getString("m_name"));
                m.setM_des(rs.getString("m_des"));
                m.setMt_id(rs.getInt("mt_id"));
                m.setM_address(rs.getString("m_address"));
                m.setM_phone(rs.getString("m_phone"));
                m.setM_url(rs.getString("m_url"));
                if (rs.getString("m_isorder").equals("1")){
                    m.setM_isorder("是");
                }else {
                    m.setM_isorder("否");
                }
                m.setE_recordid(rs.getInt("e_recordid"));
                m.setB_id(rs.getInt("b_id"));
                mer.add(m);
            }
            DBConnection.close(rs,ps,conn);
            return mer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Mer cx(int id){//店铺id查询店铺信息
        String sql="select * from mer where m_id=?";
        List<Mer> list= qc.select(Mer.class,sql,id);
        Mer m=list.get(0);
        return m;
    }
    public static Mer dd(String num){//根据订单编号查询店铺
        String sql="select b.m_id from orderlist a join mer b on a.m_id=b.m_id where a.o_number=?";
        int a=qc.select(Mer.class,sql,num).get(0).getM_id();
        String sql1="select * from mer where m_id=?";
        List<Mer> mer= qc.select(Mer.class,sql1,a);
        if (mer.size()>0){
            return mer.get(0);
        }
        return null;
    }

}
