package jw3.c1.controller;

import jw3.c1.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

public class Srcontroller {
    public static Srcontroller src;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Srcontroller getsrc(){
        return this.src;
    }
    public void setsrc(Srcontroller src){
        this.src=src;
    }
    String name;
        int id;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    String count;
    public void getb(String user,String pwd,Srcontroller src){
        setsrc(src);
        String sql="SELECT b_id,b_name,b_userid FROM business WHERE b_userid=? AND b_pwd=?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,pwd);
            rs = ps.executeQuery();
//            String x = null;
//            int y = 0;
            while (rs.next()){
            src.name=rs.getString("b_name");
            src.id= rs.getInt("b_id");
            src.setCount(rs.getString("b_userid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }DBConnection.close(rs,ps,conn);
    }

    public static boolean zsgdp(String sql, List<Integer> listdpid, Object...args){
        try {
            boolean x=true;
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
//            System.out.println("id数量"+listdpid.size());
            for (int i = 0; i < listdpid.size(); i++) {
//                System.out.println("总数第"+i+"次");
                for (int j = 0;j < args.length; j++) {
                    ps.setObject(j+1, args[j]);//sql语句参数化输入
//                    System.out.println("argi"+j+args[j]);
                }
//                System.out.println("listdpid"+i+listdpid.get(i));
                ps.setInt(8,listdpid.get(i));
                int r=ps.executeUpdate();
                boolean xyz=r>0;
//                System.out.println("xyz"+xyz);
                if (!xyz){
                    x=false;
                }
                ps.clearParameters();
            }
            DBConnection.close(null,ps,conn);
            return x;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isNumberString(String str) {
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
        return pattern.matcher(str).matches();
    }
    public int selectcount(String sql,boolean t){
        //获取总行数
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            if (t){
                ps.setInt(1,src.getId());
            }
            ResultSet rs = ps.executeQuery();
            rs.last();
            int rowCount = rs.getRow(); //获得ResultSet的总行数
            DBConnection.close(rs,ps,conn);
            return rowCount;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

//         Getall
    public static Vector<Vector<Object>> PtgetAll(String user){
        String sql;
        if (user.equals("")){//全查
            sql="select A.p_id,A.p_score,B.u_name from prestige A JOIN userinfo B ON A.u_id=B.u_id WHERE A.p_score<60";
        }else {//模糊查
            sql="select A.p_id,A.p_score,B.u_name" +
                    " from prestige A JOIN userinfo B ON A.u_id=B.u_id WHERE B.p_score<60 && A.p_id= ?";
        }
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            if (!user.equals("")){ //参数化sql语句只在模糊查时进行
                ps.setInt(1, Integer.parseInt(user));
            }
//            ps.setString(1,"%加%");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                //创造对象，每次放一条数据
//                UserInfo ui=new UserInfo();
                Vector<Object> ui=new Vector<Object>();
                //将每个字段放入对象
                ui.add(rs.getInt("p_id"));
                ui.add(rs.getDouble("p_score"));
                ui.add(rs.getString("u_name"));
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
    //    店铺全查，模糊查询
    public static Vector<Vector<Object>> GsgetAll(String user,int id){
        String sql;
        if (user.equals("")){//全查
            sql="SELECT c.*,b.m_name FROM business a,mer b,goods c WHERE a.b_id=b.b_id and b.m_id=c.m_id AND b.b_id=?";
        }else {//模糊查
            sql="SELECT c.*,b.m_name FROM business a,mer b,goods c WHERE a.b_id=b.b_id and b.m_id=c.m_id AND b.b_id=? and g_name like ?";
        }
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            if (!user.equals("")){ //参数化sql语句只在模糊查时进行
                ps.setInt(1,id);
                ps.setString(2,"%"+user+"%");
            }else {
                ps.setInt(1,id);
            }
//            ps.setString(1,"%加%");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                //创造对象，每次放一条数据
//                UserInfo ui=new UserInfo();
                Vector<Object> ui=new Vector<Object>();
                //将每个字段放入对象
                ui.add(rs.getInt("g_id"));
                ui.add(rs.getString("g_name"));
                ui.add(rs.getString("g_price"));
                ui.add(rs.getString("g_time"));
                ui.add(rs.getString("g_dprice"));
                ui.add(rs.getString("g_url"));
                ui.add(rs.getString("g_coupon"));
                ui.add(rs.getInt("m_id"));
                ui.add(rs.getString("m_name"));
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
    public static Vector<Vector<Object>> UsergetAll(String user){
        String sql;
        if (user.equals("")){//全查
            sql="select * from userinfo";
        }else {//模糊查
            sql="select * from userinfo where u_name like ?";
        }
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
                ui.add(rs.getInt("u_id"));
                ui.add(rs.getString("u_name"));
                ui.add(rs.getString("u_address"));
                ui.add(rs.getString("u_phone"));
                ui.add(rs.getString("u_headimage"));
                ui.add(rs.getString("u_account"));
                ui.add(rs.getString("u_pwd"));
                ui.add(rs.getInt("v_viprank"));
                ui.add(rs.getString("u_registertime"));
                ui.add(rs.getString("u_email"));
                ui.add(rs.getString("u_nickname"));
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
    public static Vector<Vector<Object>> DpgetAll(String user,int id){
        String sql;
        if (user.equals("")){//全查
            sql="SELECT B.m_id,B.m_name,B.m_des,B.m_phone,B.m_address,B.m_url,B.m_isorder,C.mt_name" +
                    " FROM business A JOIN mer B ON A.b_id=B.b_id JOIN mertype C ON B.mt_id=C.mt_id WHERE A.b_id=?;";
        }else {//模糊查
            sql="SELECT B.m_id,B.m_name,B.m_des,B.m_phone,B.m_address,B.m_url,B.m_isorder,C.mt_name FROM " +
                    "business A JOIN mer B ON A.b_id=B.b_id JOIN mertype C ON B.mt_id=C.mt_id WHERE A.b_id=? AND B.m_name LIKE ?";
        }
//        sql="select * from mer where m_name like ?";
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            if (!user.equals("")){ //参数化sql语句只在模糊查时进行
                ps.setInt(1,id);
                ps.setString(2,"%"+user+"%");
            }else {
                ps.setInt(1,id);
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
                ui.add(rs.getString("m_phone"));
                ui.add(rs.getString("m_address"));
                ui.add(rs.getString("m_url"));
                ui.add(rs.getString("m_isorder"));
                ui.add(rs.getString("mt_name"));
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
    public static Vector<Vector<Object>> OrgetAll(String user,int id) {
        String sql;
        int x = 0;
        if (user.equals("")) {//全查
            sql = "SELECT a.* FROM orderlist a,mer b,business c WHERE a.m_id=b.m_id AND " +
                    "b.b_id=c.b_id and c.b_id=? order  by o_statue";
        } else {//模糊查
            x=Integer.parseInt(user);
//            Integer x=new Integer(user);
            sql = "SELECT a.* FROM orderlist a,mer b,business c WHERE a.m_id=b.m_id AND" +
                    " b.b_id=c.b_id and c.b_id=? and a.o_id=? order  by o_statue";
        }
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            if (!user.equals("")) { //参数化sql语句只在模糊查时进行
                ps.setInt(1,id);
                ps.setInt(2,x);
            }else {
                ps.setInt(1,id);
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
            sql = "select * from discount ";
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
    public static Vector<Vector<Double>> sumgetAll() {
        String sql;
        sql = "SELECT g_dprice FROM goods";
        //1、构造Vector类型用于赋值给表格
        Vector<Vector<Double>> data = new Vector<Vector<Double>>();
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //创造对象，每次放一条数据e
                Vector<Double> ui = new Vector<Double>();
                //将每个字段放入对象
                ui.add(rs.getDouble("g_dprice"));
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
