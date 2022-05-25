package jw3.c1.utils;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBConnection {
    //1、定义使用的常量
    //驱动类名称
    private static String DriverName;
    //url
    private static String URL;
    //账号、密码
    private static String User,PassWord;

    //2、加载驱动
    static{
        try{
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
            Properties pros = new Properties();
            pros.load(is);
            DriverName=pros.getProperty("driverClass");
            URL=pros.getProperty("url");
            User=pros.getProperty("user");
            PassWord= pros.getProperty("pwd");
            Class.forName(DriverName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //3、获取数据库连接
    public static Connection getConnection() throws Exception{
        try {
            return DriverManager.getConnection(URL,User,PassWord);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception();
        }
    }
    //4、关闭连接
    public static void close(ResultSet rs, Statement stat,Connection conn){
        try {
            if (rs!=null){
                rs.close();//结果集关闭
            }
            if (stat!=null){
                stat.cancel();
            }
            if (conn!=null){
                conn.close();//连接对象关闭
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //增删改
    public static boolean zsg(String sql,Object...args){
        try {
            Connection conn=DBConnection.getConnection();
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
}
