/*
 * Created by JFormDesigner on Thu May 26 21:03:19 CST 2022
 */

package jw3.c1.view.SeverOrder;


import jdk.nashorn.internal.scripts.JO;
import jw3.c1.controller.Srcontroller;
import jw3.c1.model.Discount;
import jw3.c1.model.Mer;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.List;

/**
 * @author Brainrain
 */
public  class Discount_info extends JPanel {
    public Discount_info() {
        setVisible(true);
        initComponents();
    }
//      查询
    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        if (textField1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"请输入值");
        }else {
            showdata(textField1.getText());
        }
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        showdata("");
        textField1.setText("");
    }
///  删除
    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();//获取选择第一行的所索引
        if (index!=-1){//是否选中了一行
            if (JOptionPane.showConfirmDialog(null,
                    "您是否确认删除此数据?")==0){//是否点击了确定
                //取id   data、index  data是二维集合，第一个get获取了行、第二个get获取了列
                int id=(int)data.get(index).get(0);
                //判断完成删除
                String sql="delete from discount where d_couponid=?";
                boolean x= DBConnection.zsg(sql,id);
                if (x){
                    showdata("");//自动刷新
                    JOptionPane.showMessageDialog(null,
                            "删除成功!");

                }else{
                    JOptionPane.showMessageDialog(null,
                            "删除失败!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,
                    "您未选中任意一行!");
        }
    }
//添加
    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.setSize(800,300);
        dialog1.setModal(true); //模态框
        dialog1.setVisible(true);//显示出来
    }
//  添加弹窗按钮
    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        QueryByClass qc=new QueryByClass();
        Srcontroller src=Srcontroller.src;
        Discount Di=new Discount();
        Di.setD_couponnum((src.selectcount("select * from discount",false)+1)+"EXCCES");
        Di.setU_id((int) (Math.random()*200+1));
        Di.setD_details("满"+textField8.getText()+"减"+textField9.getText());
        Di.setD_overlying(String.valueOf((int) (Math.random()*2+1)));

        boolean pd;
        try {
            pd =!(src.isNumberString(textField9.getText()) && src.isNumberString(textField8.getText()));
            if (textField9.getText().equals("")){
                Di.setD_concessionalrate(0);
            }else {
                Di.setD_concessionalrate(Integer.parseInt(textField9.getText()));
            }
            if (textField8.getText().equals("")){
                Di.setD_value(0);
            }else {
                Di.setD_value(Integer.parseInt(textField8.getText()));
            }
        }catch (Exception e2){
            Di.setD_concessionalrate(4);
            Di.setD_value(4);
            pd=true;
        }


        Class d=Discount.class;
        sql1="select d_name from discount where d_name LIKE '满减优惠券%';";
        sql2="select d_name from discount where d_name LIKE '节日特券%';";
        sql3="select d_details from discount where d_name LIKE '满减优惠券%' ";
        sql4="select d_details from discount where d_name LIKE '节日特券%'";
        list1=selectn(sql1,"d_name");
        list2=selectn(sql2,"d_name");
        list3=selectn(sql3,"d_details");
        list4=selectn(sql4,"d_details");
        List<String> listt1=list1;
        List<String> listt2=list2;
        Collections.sort(listt1);
        Collections.sort(listt2);
        int xy,yx;
        if (listt1.size()==1){
            xy=0;
        }else if (listt1.size()==2){
            xy=0;
        }else {
            xy=listt1.size()-2;
        }
        if (listt2.size()==1){
            yx=0;
        }else if (listt2.size()==2){
            yx=0;
        }else {
            yx=listt2.size()-2;
        }
        String tt1=listt1.get(xy).substring(5);
        String tt2=listt2.get(yx).substring(4);
        int max1=Integer.parseInt(listt1.get(listt1.size()-1).substring(5));
        int max2=Integer.parseInt(listt2.get(listt2.size()-1).substring(4));
        boolean tt=true;
        if (comboBox1.getSelectedIndex()==1){
            for (int i = 0; i < list3.size(); i++) {
                if (Di.getD_details().equals(list3.get(i))){
                    Di.setD_name(list1.get(i));
                    tt=false;
                    break;
                }
            }
             if (tt){
                 if (max1-Integer.valueOf(tt1)>1){
                     Di.setD_name("满减优惠券"+(Integer.valueOf(tt1)+1));
                 }else {
                     Di.setD_name("满减优惠券"+(max1+1));
                 }
            }

        }else {
            for (int i = 0; i < list4.size(); i++) {
                if (Di.getD_details().equals(list4.get(i))){
                    Di.setD_name(list2.get(i));
                    tt=false;
                    break;
                }
            }
                if (tt){
                    if (max2-Integer.valueOf(tt2)>1){
                        Di.setD_name("节日特券"+(Integer.valueOf(tt2)+1));
                    } else {
                        Di.setD_name("节日特券"+(max2+1));
                    }
                }
        }


//        判断
        if (Di.getD_value()==0 || Di.getD_concessionalrate()==0 ) {
            JOptionPane.showMessageDialog(null,"不能为空");
            return;
        }
        if (comboBox1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"未选择类型");
            return;
        }
        if (Di.getD_value()<Di.getD_concessionalrate()){
            JOptionPane.showMessageDialog(null,"值不对应");
            return;
        }
        if (pd){
            JOptionPane.showMessageDialog(null,"格式不对");
            return;
        }

        String sql="insert discount values(?,?,?,?,?,?,?,?)";
                boolean z=DBConnection.zsg(sql,0,Di.getD_couponnum(),Di.getU_id(),Di.getD_name(),Di.getD_details(),
                        Di.getD_overlying(),Di.getD_concessionalrate(),Di.getD_value());
                if (z){
                    showdata("");//自动刷新
                    JOptionPane.showMessageDialog(null,
                            "注册成功!");
                    textField8.setText("");
                    textField9.setText("");
                    comboBox1.setSelectedIndex(0);
                    dialog1.dispose();//关闭对话框
                }else{
                    JOptionPane.showMessageDialog(null,
                            "添加失败!");
                }
    }
//      修改按钮
    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog2.setSize(800,300);
        int index=table1.getSelectedRow();//选中行的索引
        if (index!=-1){//是否选中了一行
            //获取值 data、index
            //先传值
           textField11.setText(String.valueOf(data.get(index).get(7)));
            textField10.setText(String.valueOf(data.get(index).get(6)));
            if (String.valueOf(data.get(index).get(3)).length()==6){
                comboBox2.setSelectedIndex(1);
            }else {
                comboBox2.setSelectedIndex(2);
            }
            //后展示对话框
            dialog2.setModal(true);
            dialog2.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,
                    "您未选中任意一行!");
        }
    }
//      修改弹窗按钮
    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
        Srcontroller src=Srcontroller.src;
        Discount Di=new Discount();
        int index=table1.getSelectedRow();
        Di.setD_couponid((int)data.get(index).get(0));
        boolean pd;
        try {
            pd =!(src.isNumberString(textField10.getText()) && src.isNumberString(textField11.getText()));
            if (textField10.getText().equals("")){
                Di.setD_concessionalrate(0);
            }else {
                Di.setD_concessionalrate(Integer.parseInt(textField10.getText()));
            }
            if (textField11.getText().equals("")){
                Di.setD_value(0);
            }else {
                Di.setD_value(Integer.parseInt(textField11.getText()));
            }
        }catch (Exception e2){
            Di.setD_concessionalrate(4);
            Di.setD_value(4);
            pd=true;
        }
        Di.setD_details("满"+textField11.getText()+"减"+textField10.getText());
        sql1="select d_name from discount where d_name LIKE '满减优惠券%';";
        sql2="select d_name from discount where d_name LIKE '节日特券%';";
        sql3="select d_details from discount where d_name LIKE '满减优惠券%' ";
        sql4="select d_details from discount where d_name LIKE '节日特券%'";
        list1=selectn(sql1,"d_name");
        list2=selectn(sql2,"d_name");
        list3=selectn(sql3,"d_details");
        list4=selectn(sql4,"d_details");
        List<String> listt1=list1;
        List<String> listt2=list2;
        Collections.sort(listt1);
        Collections.sort(listt2);
        int xy,yx;
        if (listt1.size()==1){
            xy=0;
        }else if (listt1.size()==2){
            xy=1;
        }else {
            xy=listt1.size()-2;
        }

        if (listt2.size()==1){
            yx=0;
        }else if (listt2.size()==2){
            yx=1;
        }else {
            yx=listt2.size()-2;
        }
        String tt1=listt1.get(xy).substring(5);
        String tt2=listt2.get(yx).substring(4);
        int max1=Integer.parseInt(listt1.get(listt1.size()-1).substring(5));
        int max2=Integer.parseInt(listt2.get(listt2.size()-1).substring(4));
        boolean tt=true;
        if (comboBox1.getSelectedIndex()==1){
            for (int i = 0; i < list3.size(); i++) {
                if (Di.getD_details().equals(list3.get(i))){
                    Di.setD_name(list1.get(i));
                    tt=false;
                    break;
                }
            }
            if (tt){
                if (max1-Integer.valueOf(tt1)>1){
                    Di.setD_name("满减优惠券"+(Integer.valueOf(tt1)+1));
                }else {
                    Di.setD_name("满减优惠券"+(max1+1));
                }
            }

        }else {
            for (int i = 0; i < list4.size(); i++) {
                if (Di.getD_details().equals(list4.get(i))){
                    Di.setD_name(list2.get(i));
                    tt=false;
                    break;
                }
            }
            if (tt){
                if (max2-Integer.valueOf(tt2)>1){
                    Di.setD_name("节日特券"+(Integer.valueOf(tt2)+1));
                } else {
                    Di.setD_name("节日特券"+(max2+1));
                }
            }
        }
//        判断
        String com2=String.valueOf(data.get(index).get(3));
        if (com2.length()==6){
            com2="满减优惠券";
        }else {
            com2="节日特券";
        }
        if (Di.getD_concessionalrate()==(int)data.get(index).get(6) && Di.getD_value()==(int) data.get(index).get(7) &&
        com2.equals(comboBox2.getSelectedItem())){
            JOptionPane.showMessageDialog(null,"记录未修改");
            return;
        }
        if (Di.getD_value()==0 || Di.getD_concessionalrate()==0 ) {
            JOptionPane.showMessageDialog(null,"不能为空");
            return;
        }
        if (comboBox2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"未选择类型");
            return;
        }
        if (Di.getD_value()<Di.getD_concessionalrate()){
            JOptionPane.showMessageDialog(null,"输入有误");
            return;
        }
        if (pd){
            JOptionPane.showMessageDialog(null,"格式不对");
            return;
        }
        String sql="UPDATE discount SET d_name=?,d_details=?,d_concessionalrate=?,d_value=? where d_couponid=?";
                boolean z=DBConnection.zsg(sql,Di.getD_name(),Di.getD_details(),Di.getD_concessionalrate()
                        ,Di.getD_value(),Di.getD_couponid());
        if (z){
            showdata("");//自动刷新
            JOptionPane.showMessageDialog(null,
                    "修改成功!");
            dialog2.dispose();//关闭对话框
        }else{
            JOptionPane.showMessageDialog(null,
                    "修改失败!");
        }
    }

    private void textField1FocusGained(FocusEvent e) {
        // TODO add your code here
        label3.setVisible(true);
    }

    private void textField1FocusLost(FocusEvent e) {
        // TODO add your code here
        label3.setVisible(false);
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        textField1 = new JTextField();
        button3 = new JButton();
        label11 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label3 = new JLabel();
        dialog1 = new JDialog();
        label7 = new JLabel();
        label8 = new JLabel();
        textField9 = new JTextField();
        textField8 = new JTextField();
        button6 = new JButton();
        label1 = new JLabel();
        comboBox1 = new JComboBox<>();
        dialog2 = new JDialog();
        label9 = new JLabel();
        label10 = new JLabel();
        textField10 = new JTextField();
        textField11 = new JTextField();
        label2 = new JLabel();
        comboBox2 = new JComboBox<>();
        button7 = new JButton();

        //======== this ========
        setBorder(null);
        setOpaque(false);
        setLayout(null);

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setOpaque(false);
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(5, 95, 1160, 440);

        //---- textField1 ----
        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField1FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                textField1FocusLost(e);
            }
        });
        add(textField1);
        textField1.setBounds(670, 35, 375, 30);

        //---- button3 ----
        button3.setText("\u641c\u7d22");
        button3.setOpaque(false);
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button3);
        button3.setBounds(1075, 35, 90, 30);

        //---- label11 ----
        label11.setText("\u4f18\u60e0\u5238\u4fe1\u606f\uff1a");
        add(label11);
        label11.setBounds(20, 35, 120, 30);

        //---- button1 ----
        button1.setText("\u5220\u9664");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        add(button1);
        button1.setBounds(1175, 230, 60, 30);

        //---- button2 ----
        button2.setText("\u4fee\u6539");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        add(button2);
        button2.setBounds(1175, 305, 60, 30);

        //---- button4 ----
        button4.setText("\u6dfb\u52a0");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        add(button4);
        button4.setBounds(1175, 385, 60, 30);

        //---- button5 ----
        button5.setText("\u5237\u65b0");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5MouseClicked(e);
            }
        });
        add(button5);
        button5.setBounds(1175, 160, 60, 30);

        //---- label3 ----
        label3.setText("\u8bf7\u8f93\u5165id\uff1a");
        label3.setForeground(new Color(255, 51, 51));
        add(label3);
        label3.setBounds(560, 35, 100, 30);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }

        //======== dialog1 ========
        {
            Container dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(null);

            //---- label7 ----
            label7.setText("\u6ee1");
            dialog1ContentPane.add(label7);
            label7.setBounds(285, 75, 35, 25);

            //---- label8 ----
            label8.setText("\u51cf");
            dialog1ContentPane.add(label8);
            label8.setBounds(500, 75, 50, 25);
            dialog1ContentPane.add(textField9);
            textField9.setBounds(570, 75, 125, textField9.getPreferredSize().height);
            dialog1ContentPane.add(textField8);
            textField8.setBounds(335, 75, 125, textField8.getPreferredSize().height);

            //---- button6 ----
            button6.setText("\u786e\u5b9a");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button6);
            button6.setBounds(new Rectangle(new Point(330, 150), button6.getPreferredSize()));

            //---- label1 ----
            label1.setText("\u5238\u540d");
            dialog1ContentPane.add(label1);
            label1.setBounds(20, 75, 80, label1.getPreferredSize().height);

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u9009\u62e9\u7c7b\u578b",
                "\u6ee1\u51cf\u4f18\u60e0\u5238",
                "\u8282\u65e5\u4f18\u60e0\u5238"
            }));
            dialog1ContentPane.add(comboBox1);
            comboBox1.setBounds(new Rectangle(new Point(120, 70), comboBox1.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialog1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = dialog1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialog1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialog1ContentPane.setMinimumSize(preferredSize);
                dialog1ContentPane.setPreferredSize(preferredSize);
            }
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }

        //======== dialog2 ========
        {
            Container dialog2ContentPane = dialog2.getContentPane();
            dialog2ContentPane.setLayout(null);

            //---- label9 ----
            label9.setText("\u6ee1");
            dialog2ContentPane.add(label9);
            label9.setBounds(285, 75, 35, 25);

            //---- label10 ----
            label10.setText("\u51cf");
            dialog2ContentPane.add(label10);
            label10.setBounds(500, 75, 50, 25);
            dialog2ContentPane.add(textField10);
            textField10.setBounds(570, 75, 125, textField10.getPreferredSize().height);
            dialog2ContentPane.add(textField11);
            textField11.setBounds(335, 75, 125, textField11.getPreferredSize().height);

            //---- label2 ----
            label2.setText("\u5238\u540d");
            dialog2ContentPane.add(label2);
            label2.setBounds(20, 75, 80, label2.getPreferredSize().height);

            //---- comboBox2 ----
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u9009\u62e9\u7c7b\u578b",
                "\u6ee1\u51cf\u4f18\u60e0\u5238",
                "\u8282\u65e5\u4f18\u60e0\u5238"
            }));
            dialog2ContentPane.add(comboBox2);
            comboBox2.setBounds(new Rectangle(new Point(120, 70), comboBox2.getPreferredSize()));

            //---- button7 ----
            button7.setText("\u786e\u5b9a");
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button7);
            button7.setBounds(new Rectangle(new Point(325, 160), button7.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialog2ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = dialog2ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialog2ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialog2ContentPane.setMinimumSize(preferredSize);
                dialog2ContentPane.setPreferredSize(preferredSize);
            }
            dialog2.pack();
            dialog2.setLocationRelativeTo(dialog2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        showdata("");
        label3.setVisible(false);
    }
    private void showdata(String x) {
        Vector<Object> heads=new Vector<Object>();
        heads.add("d_couponid");
        heads.add("d_couponnum");
        heads.add("u_id");
        heads.add("d_name");
        heads.add("d_details");
        heads.add("d_overlying");
        heads.add("d_concessionalrate");
        heads.add("d_value");

        data= Srcontroller.DigetAll(x);

////3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm=new DefaultTableModel(data,heads);
        table1.setModel(dtm);
    }

    public boolean selectc3(int id,String name,int ce,int value){
        try {
            List<Object> list=new ArrayList();
            String sql="SELECT d_name,d_concessionalrate,d_value FROM discount WHERE d_couponid=?";
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                list.add(rs.getString("d_name"));
                list.add(rs.getInt("d_concessionalrate"));
                list.add(rs.getInt("d_value"));
            }
            String x;
            if (String.valueOf(list.get(0)).length()==6){
                x="满减优惠券";
            }else {
                x="节日特券";
            }
            if (x.equals(name) && (int)list.get(1)==value && (int)list.get(2)==ce){
                return true;
            }
            DBConnection.close(rs,ps,conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public  List<String> selectn(String sql,String x){
        try {
            List<String> list=new ArrayList();
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                list.add(rs.getString(x));
            }
            DBConnection.close(rs,ps,conn);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable table1;
    private JTextField textField1;
    private JButton button3;
    private JLabel label11;
    private JButton button1;
    private JButton button2;
    private JButton button4;
    private JButton button5;
    private JLabel label3;
    private JDialog dialog1;
    private JLabel label7;
    private JLabel label8;
    private JTextField textField9;
    private JTextField textField8;
    private JButton button6;
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JDialog dialog2;
    private JLabel label9;
    private JLabel label10;
    private JTextField textField10;
    private JTextField textField11;
    private JLabel label2;
    private JComboBox<String> comboBox2;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
    private static String dname;
    private static int count;
    private static int jrcount;
    private static int jrmax;
    String sql1;
    String sql2;
    String sql3;
    String sql4;
    List<String> list1;
    List<String> list2;
    List<String> list3;
    List<String> list4;
}
