package jw3.c1.utils;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueryByClass<T> {
    public List<T> select(Class<T> clazz, String sql , Object ...args){
        List<T> list = new ArrayList<T>();//集合接收最终返回的表数据
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);//sql语句参数化输入
            }
            rs = ps.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();//获取字段数量

            while(rs.next()){
                T t = clazz.newInstance();//创建一个运行时类对象
                for (int i = 0; i < columnCount; i++) {
                    Object columnValue = rs.getObject(i + 1);//列名
                    String columnLabel = metaData.getColumnLabel(i + 1);//字段值
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, columnValue);//一个对象中放入一行数据
                }
                list.add(t);//添加到集合
            }
			DBConnection.close(rs,ps,conn);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public int selectcount(String sql){
        //获取总行数
        try {
            Connection conn=DBConnection.getConnection();
            Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stat.executeQuery(sql);
            rs.last();
            int rowCount = rs.getRow(); //获得ResultSet的总行数
            DBConnection.close(rs,stat,conn);
            return rowCount;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}
