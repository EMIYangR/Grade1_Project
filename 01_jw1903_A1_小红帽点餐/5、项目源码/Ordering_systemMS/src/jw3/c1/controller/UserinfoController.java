package jw3.c1.controller;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;
import jw3.c1.view.主界面.Index;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Vector;


public class UserinfoController {
    static QueryByClass<Userinfo> qc=new QueryByClass<Userinfo>();
    static Connection c;
    static {
        try {
            c=DBConnection.getConnection();
        } catch (Exception e1) {
            e1.printStackTrace();
        }DBConnection.close(null,null,c);
    }
    public static int dlupd(String u,String p){
        int i;
        String sql="select u_account,u_pwd from userinfo";
        List<Userinfo> yhList= qc.select(Userinfo.class,sql);
        if (u.length()>0&&p.length()>0){
            for (i = 0; i < yhList.size(); i++) {
                if (u.equals(yhList.get(i).getU_account())&&p.equals(yhList.get(i).getU_pwd())){
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
    public static int ncpd(String a){
        int j;
        String sql1="select u_nickname from userinfo";
        List<Userinfo> yhList1= qc.select(Userinfo.class,sql1);
        if(a.length()>0){
            for (j = 0; j < yhList1.size(); j++) {
                if (a.equals(yhList1.get(j).getU_nickname())){
                    break;
                }
            }
            if (j>=yhList1.size()){
                return 1;
            }else {
                return 2;
            }
        }else {
            return 3;
        }
    }
    public static int sjhpd(String a){
        int k;
        String sql2="select u_phone from userinfo";
        List<Userinfo> yhList2=qc.select(Userinfo.class,sql2);
        if(a.length()>0){
            for (k = 0; k < yhList2.size(); k++) {
                if (yhList2.get(k).getU_phone().equals(a)){
                    break;
                }
            }
            if (k>=yhList2.size()){
                return 1;
            }else {
                return 2;
            }
        }else {
            return 3;
        }
    }
    public static int yxpd(String a){
        int k;
        String sql3="select u_email from userinfo";
        List<Userinfo> yhList3=qc.select(Userinfo.class,sql3);
        if(a.length()>0){
            for (k = 0; k < yhList3.size(); k++) {
                if (yhList3.get(k).getU_email().equals(a)){
                    break;
                }
            }
            if (k>=yhList3.size()){
                return 1;
            }else {
                return 2;
            }
        }else {
            return 3;
        }
    }
    public static int zhpd(String a){
        int k;
        String sql4="select u_account from userinfo";
        List<Userinfo> yhList4=qc.select(Userinfo.class,sql4);
        if(a.length()>0){
            for (k = 0; k < yhList4.size(); k++) {
                if (a.equals(yhList4.get(k).getU_account())){
                    break;
                }
            }
            if (k>=yhList4.size()){
                return 1;
            }else {
                return 2;
            }
        }else {
            return 3;
        }
    }
    public static void mmxg(String a,String b,String c){
        String sql="UPDATE userinfo set u_pwd=? where u_account=? and u_email=?";
        DBConnection.zsg(sql,a,b,c);
    }
    public static int mmcx(String a,String b){
        int k;
        String sql="select u_pwd,u_account from userinfo";
        List<Userinfo> userinfoList=qc.select(Userinfo.class,sql);
        if(a.length()>0){
            for (k = 0; k <userinfoList.size() ; k++) {
                if(a.equals(userinfoList.get(k).getU_account())&&b.equals(userinfoList.get(k).getU_pwd())){
                    break;
                }
            }
            System.out.println(k);
            if (k>userinfoList.size()){
                return 1;
            }else{
                return 2;
                }
        }else {
            return 3;
        }
    }
    public static int mmcx1(String a,String b){
        int k;
        String sql="select * from userinfo where u_pwd=? and u_account=?";
        List<Userinfo> userinfoList=qc.select(Userinfo.class,sql,b,a);
        if(a.length()>0){
            if (userinfoList.size()>0){
                return 2;
            }else {
                return 1;
            }
        }else {
            return 3;
        }
    }
    public static Userinfo user(String a){
        String sql="select * from userinfo where u_account=?";
        List<Userinfo> u=qc.select(Userinfo.class,sql,a);
        Userinfo u1=u.get(0);
        return u1;
    }
    public static List<Userinfo> xxcx(String a){
        String sql="select * from userinfo where u_account=?";
        List<Userinfo> u=qc.select(Userinfo.class,sql,a);
        return u;
    }
    public static List<Userinfo> xxcx1(){
        String sql="select * from userinfo where u_account group by u_headimage";
        List<Userinfo> u=qc.select(Userinfo.class,sql);
        return u;
    }
    public static void xxxg(String a,String b,String c,String d,String e,String f){
        String sql="update userinfo set u_name=?,u_nickname=?,u_address=?,u_phone=?,u_headimage=?,u_email=? where u_account=?";
        DBConnection.zsg(sql,a,b,c,d,e,f,Index.zh);
    }
    public static void xxxg1(String a,String b){
        String sql="update userinfo set u_account=?,u_pwd=? where u_account=?";
        DBConnection.zsg(sql,a,b,Index.zh);
    }
    public static List<Userinfo> cx(){
        String sql="select * from userinfo";
        List<Userinfo> u1=qc.select(Userinfo.class,sql);
        return u1;
    }
    //查询用户信息（Administrator）
    public static Vector<Vector<Object>> getAll(String user){
        String sql;
        if (user.equals("")){//全查
            sql="select * from userinfo";
        }else {//模糊查
            sql="select * from userinfo where u_account like ?";
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
                ui.add(rs.getInt("u_id"));
                ui.add(rs.getString("u_name"));
                ui.add(rs.getString("u_address"));
                ui.add(rs.getString("u_phone"));
                ui.add(rs.getString("u_headimage"));
                ui.add(rs.getString("u_account"));
                ui.add(rs.getString("u_pwd"));
                ui.add(rs.getInt("v_viprank"));
                ui.add(rs.getDate("u_registertime"));
                ui.add(rs.getString("u_email"));
                ui.add(rs.getString("u_nickname"));
                ui.add(rs.getInt("p_score"));
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
    //添加用户（Administrator）
    public static boolean AddUser(Userinfo ui){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String headimage="",sql="insert userinfo values(?,?,?,?,?,?,?,?,?,?,?,?)";
        if (ui.getU_headimage().equals("")) headimage = "tx.png";
        else headimage = ui.getU_headimage();
        return DBConnection.zsg(sql, null, ui.getU_name(), ui.getU_address(), ui.getU_phone(), headimage, ui.getU_phone(), ui.getU_pwd(), ui.getV_viprank(), dtf.format(localDate), ui.getU_email(), ui.getU_nickname(), 100);
    }
    //删除用户（Administrator）
    public static boolean delete(int id){
        String sql="delete from userinfo where u_id=?";
        return DBConnection.zsg(sql,id);
    }
    //更新用户信息（Administrator）
    public static boolean update(Userinfo ui){
        String sql="update userinfo set u_name=?,u_address=?,u_phone=?,u_account=?,u_pwd=?,v_viprank=?,u_email=?,u_nickname=? where u_id=?";
        return DBConnection.zsg(sql, ui.getU_name(), ui.getU_address(), ui.getU_phone(), ui.getU_account(), ui.getU_pwd(), ui.getV_viprank(), ui.getU_email(), ui.getU_nickname(), ui.getU_id());
    }
}
