/*
 * Created by JFormDesigner on Tue May 31 20:37:41 CST 2022
 */

package jw3.c1.view.SeverOrder;

import java.awt.event.*;
import javax.swing.border.*;

import jdk.nashorn.internal.scripts.JO;
import jw3.c1.controller.Srcontroller;
import jw3.c1.model.Goods;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.Imagesinks;
import jw3.c1.utils.scwj;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author Brainrain
 */
public class Goods_info extends JPanel {
    public Goods_info() {
        initComponents();
    }
//      搜索
    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        if (textField1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"请输入值");
        }else {
            showdata(textField1.getText());
            textField1.setText("");
        }
    }
//          删除
    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();//获取选择第一行的所索引
        if (index!=-1){//是否选中了一行
            if (JOptionPane.showConfirmDialog(null,
                    "您是否确认删除此数据?")==0)//是否点击了确定
            {
                //取id   data、index  data是二维集合，第一个get获取了行、第二个get获取了列
                int id=(int)data.get(index).get(0);
                //判断完成删除
                String sql="delete from goods where g_id=?";
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
//      添加
    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        alldp(panel1);
        dialog1.setSize(500,600);
        dialog1.setModal(true); //模态框
        dialog1.setVisible(true);//显示出来
    }

    //      添加按钮
    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        Goods goods=new Goods();
        boolean pd;
//        赋值
        goods.setG_name(textField2.getText());
        try {
            pd = !(src.isNumberString(textField3.getText()));
            if (textField3.getText().equals("")){
                goods.setG_price(new BigDecimal(0));
            }else {
                goods.setG_price(new BigDecimal(textField3.getText()));
            }
            goods.setG_dprice(goods.getG_price().multiply(new BigDecimal(0.95)));
        }catch (Exception e2){
            goods.setG_price(new BigDecimal(1));
            pd=true;
        }

        goods.setG_coupon(String.valueOf((int) (Math.random()*2)));
        String z3;
        z3= comboBox1.getSelectedItem()+"-"+comboBox2.getSelectedItem();

        goods.setG_url((comboBox10.getSelectedIndex()+1)+".png");
//        判断
        boolean xy=true;
        for (int i = 0; i < selecmn().size(); i++) {
            if (listdp.get(i).isSelected()){
                xy=false;
                break;
            }else {
                xy=true;
            }
        }
        if ( !(goods.getG_name().equals("") || goods.getG_price().compareTo(BigDecimal.ZERO)==0)){
            if (pd){
                JOptionPane.showMessageDialog(null,"价格格式不对");
                return;
            }
                if (xy){
                    JOptionPane.showMessageDialog(null,"未选择店铺");
                    return;
                }
            //        取选择了的id
            for (int i = 0; i < selecmn().size(); i++) {
                if (listdp.get(i).isSelected()){
                    listdpid.add(selecmid(listdp.get(i).getText()));
                }
            }

            for (int i = 0; i < listdpid.size(); i++) {
                if (selectc(listdpid.get(i),goods.getG_name())){
                    JOptionPane.showMessageDialog(null,"商品重复");
//                    listdp.get(i).getText()+
                    alldp(panel1);
                    return;
                }
            }


                String sql="INSERT goods VALUES(?,?,?,?,?,?,?,?)";
//                if (comboBox10.getSelectedIndex()==0){
//                    if (JOptionPane.showConfirmDialog(null,
//                            "如果不选择图片，我们会采用默认图片","温馨提示",0)==0){
//                        goods.setG_url("9.png");
//                        boolean z= DBConnection.zsg(sql,src.selectcount("select * from goods",false)+1,goods.getG_name()
//                                ,goods.getG_price(),z3,goods.getG_dprice(),goods.getG_url(),goods.getG_coupon(),goods.getM_id());
//                        if (z){
//                            JOptionPane.showMessageDialog(null,"添加成功");
//                            showdata("");
//                            textField2.setText("");
//                            textField3.setText("");
//                            comboBox1.setSelectedIndex(0);
//                            comboBox2.setSelectedIndex(0);
//                            dialog1.dispose();
//                        }else {
//                            JOptionPane.showMessageDialog(null,"添加失败");
//                        }
//                    }
//                }else {}

                    boolean z= src.zsgdp(sql,listdpid,0,goods.getG_name()
                            ,goods.getG_price(),z3,goods.getG_dprice(),goods.getG_url(),goods.getG_coupon());
                    if (z){
                        JOptionPane.showMessageDialog(null,"添加成功");
                        showdata("");
                        textField2.setText("");
                        textField3.setText("");
                        comboBox1.setSelectedIndex(0);
                        comboBox2.setSelectedIndex(0);
                        dialog1.dispose();
                    }else {
                        JOptionPane.showMessageDialog(null,"添加失败");
                    }
        }else {
            JOptionPane.showMessageDialog(null,"不能为空");
        }


    }

//      刷新
    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        showdata("");
    }
//      修改
    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog2.setSize(500,500);
        int index=table1.getSelectedRow();//选中行的索引
        for (int i = 0; i < listdp.size(); i++) {

        }
        if (index!=-1){//是否选中了一行
            //获取值 data、index
            //先传值
            comboBox8.removeAllItems();
            list2=selecmn();
            for (int i = 0; i < list2.size(); i++) {
                comboBox8.addItem(list2.get(i));
            }
            comboBox8.setSelectedItem(data.get(index).get(8));
            textField4.setText(String.valueOf(data.get(index).get(1)));
            textField5.setText(data.get(index).get(2).toString());
            String x=String.valueOf(data.get(index).get(3)),z1,z2;
            String d=String.valueOf(data.get(index).get(5));
            int dl= Integer.parseInt(d.substring(0,d.length()-4));
            comboBox9.setSelectedIndex(dl-1);
            if (x.indexOf("-")==4){
                z1=x.substring(0,4);
                z2=x.substring(5);
            }else {
                z1=x.substring(0,5);
                z2=x.substring(6);
            }
            comboBox3.setSelectedItem(z1);
            comboBox4.setSelectedItem(z2);
            dpid=comboBox8.getSelectedIndex();
            nt=false;
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
        int index=table1.getSelectedRow();
        Goods goods=new Goods();
        //1、获取数据
        int id=(int)data.get(index).get(0);
        int mid=(int)data.get(index).get(7);
        boolean pd=false;
        try {
            pd = !(src.isNumberString(textField5.getText()));
            if (textField5.getText().equals("")){
                goods.setG_price(new BigDecimal(0));
            }else {
                goods.setG_price(new BigDecimal(textField5.getText()));
            }
            goods.setG_dprice(goods.getG_price().multiply(new BigDecimal(0.95)));
        }catch (Exception e2){
            goods.setG_price(new BigDecimal(1));
            pd=true;
        }
        goods.setM_id(selecmid(String.valueOf(comboBox8.getSelectedItem())));
        goods.setG_id(id);
        goods.setG_name(textField4.getText());
        goods.setG_time(comboBox3.getSelectedItem()
                +"-"+comboBox4.getSelectedItem());
            goods.setG_url((comboBox9.getSelectedIndex()+1)+".png");
        //2、简单判断

        if ( !(goods.getG_name().equals("") || goods.getG_price().compareTo(BigDecimal.ZERO)==0)){
            if (pd){
                JOptionPane.showMessageDialog(null,"价格格式不对");
                return;
            }
                if (selectc2(goods.getG_id(),goods.getG_name(),goods.getG_price(),goods.getG_time()
                        ,goods.getG_url(),String.valueOf(comboBox8.getSelectedItem()))){
                    JOptionPane.showMessageDialog(null,"商品未修改");
                    return;
                }
//            if (!(textField4.getText().equals(data.get(index).get(1)))){
//                for (Vector<Object> item:data) {
//                    if (item.contains(goods.getG_name()) && item.contains(selecmid(String.valueOf(comboBox8.getSelectedItem())))){
//                        JOptionPane.showMessageDialog(null,
//                                "记录重复");
//                        return;
//                    }
//                }
//            }
            if (nt){
                if (selectc(selecmid(String.valueOf(comboBox8.getSelectedItem())),goods.getG_name())){
                    JOptionPane.showMessageDialog(null,"商品重复");
                    return;
                }
            }else if (selectc(mid,goods.getG_name())){
                JOptionPane.showMessageDialog(null,"商品重复");
                return;
            }
                String sql="UPDATE goods SET g_name=?,g_price=?,g_dprice=?,g_time=?,g_url=?,m_id=? WHERE g_id=?";
                boolean z= DBConnection.zsg(sql,goods.getG_name(),goods.getG_price(),goods.getG_dprice()
                        ,goods.getG_time(),goods.getG_url(),goods.getM_id(),goods.getG_id());
                if (z){
                    JOptionPane.showMessageDialog(null,"修改成功");
                    showdata("");
                    dialog2.setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"修改失败");
                }

        }else {
            JOptionPane.showMessageDialog(null,"不能为空");
        }
    }

    private void textField1FocusGained(FocusEvent e) {
        // TODO add your code here
        label8.setVisible(true);
    }

    private void textField1FocusLost(FocusEvent e) {
        // TODO add your code here
        label8.setVisible(false);
    }

    private void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void comboBox8(ActionEvent e) {
        // TODO add your code here
        if (comboBox8.getSelectedIndex()!=dpid){
            nt=true;
        }else {
            nt=false;
        }
    }

    private void comboBox8MouseClicked(MouseEvent e) {
        // TODO add your code here
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        textField1 = new JTextField();
        button3 = new JButton();
        label11 = new JLabel();
        button1 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button2 = new JButton();
        label8 = new JLabel();
        dialog1 = new JDialog();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label6 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button6 = new JButton();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        label7 = new JLabel();
        label10 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        comboBox10 = new JComboBox();
        panel1 = new JPanel();
        label15 = new JLabel();
        dialog2 = new JDialog();
        label4 = new JLabel();
        label5 = new JLabel();
        label14 = new JLabel();
        textField4 = new JTextField();
        textField5 = new JTextField();
        button7 = new JButton();
        comboBox3 = new JComboBox<>();
        comboBox4 = new JComboBox<>();
        label16 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label9 = new JLabel();
        comboBox8 = new JComboBox();
        comboBox9 = new JComboBox();
        label17 = new JLabel();

        //======== this ========
        setBorder(null);
        setOpaque(false);
        setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(5, 95, 1145, 445);

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
        textField1.setBounds(655, 30, 375, 30);

        //---- button3 ----
        button3.setText("\u641c\u7d22");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button3);
        button3.setBounds(1060, 30, 90, 30);

        //---- label11 ----
        label11.setText("\u9910\u54c1\u4fe1\u606f\uff1a");
        add(label11);
        label11.setBounds(20, 35, 105, 30);

        //---- button1 ----
        button1.setText("\u5220\u9664");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        add(button1);
        button1.setBounds(1165, 240, 60, 30);

        //---- button4 ----
        button4.setText("\u6dfb\u52a0");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        add(button4);
        button4.setBounds(1165, 395, 65, 30);

        //---- button5 ----
        button5.setText("\u5237\u65b0");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5MouseClicked(e);
            }
        });
        add(button5);
        button5.setBounds(1165, 155, 60, 30);

        //---- button2 ----
        button2.setText("\u4fee\u6539");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        add(button2);
        button2.setBounds(1165, 320, 65, 30);

        //---- label8 ----
        label8.setText("\u8bf7\u8f93\u5165\u9910\u54c1\u540d\uff1a");
        label8.setForeground(new Color(255, 51, 51));
        add(label8);
        label8.setBounds(540, 30, 130, 30);

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

            //---- label1 ----
            label1.setText("\u9910\u54c1\u540d");
            dialog1ContentPane.add(label1);
            label1.setBounds(60, 45, 105, 40);

            //---- label2 ----
            label2.setText("\u4ef7\u683c");
            dialog1ContentPane.add(label2);
            label2.setBounds(60, 100, 105, 40);

            //---- label3 ----
            label3.setText("\u51fa\u9910\u65f6\u95f4");
            dialog1ContentPane.add(label3);
            label3.setBounds(60, 155, 105, 40);

            //---- label6 ----
            label6.setText("\u5e97\u94fa");
            dialog1ContentPane.add(label6);
            label6.setBounds(60, 240, 105, 40);
            dialog1ContentPane.add(textField2);
            textField2.setBounds(165, 50, 160, textField2.getPreferredSize().height);
            dialog1ContentPane.add(textField3);
            textField3.setBounds(165, 105, 160, 30);

            //---- button6 ----
            button6.setText("\u786e\u5b9a");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button6);
            button6.setBounds(new Rectangle(new Point(165, 440), button6.getPreferredSize()));

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "1:00",
                "2:00",
                "3:00",
                "4:00",
                "5:00",
                "6:00",
                "7:00",
                "8:00",
                "9:00",
                "10:00",
                "11:00",
                "12:00",
                "13:00",
                "14:00",
                "15:00",
                "16:00",
                "17:00",
                "18:00",
                "19:00",
                "20:00",
                "21:00",
                "22:00",
                "23:00",
                "24:00"
            }));
            dialog1ContentPane.add(comboBox1);
            comboBox1.setBounds(new Rectangle(new Point(165, 165), comboBox1.getPreferredSize()));

            //---- comboBox2 ----
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "1:00",
                "2:00",
                "3:00",
                "4:00",
                "5:00",
                "6:00",
                "7:00",
                "8:00",
                "9:00",
                "10:00",
                "11:00",
                "12:00",
                "13:00",
                "14:00",
                "15:00",
                "16:00",
                "17:00",
                "18:00",
                "19:00",
                "20:00",
                "21:00",
                "22:00",
                "23:00",
                "24:00"
            }));
            dialog1ContentPane.add(comboBox2);
            comboBox2.setBounds(new Rectangle(new Point(275, 165), comboBox2.getPreferredSize()));

            //---- label7 ----
            label7.setText("\u56fe\u7247");
            dialog1ContentPane.add(label7);
            label7.setBounds(75, 350, 105, 40);

            //---- label10 ----
            label10.setText("\u6b21\u4e3a\u5fc5\u586b\u9879");
            label10.setForeground(new Color(255, 51, 51));
            dialog1ContentPane.add(label10);
            label10.setBounds(345, 35, 85, 25);

            //---- label12 ----
            label12.setText("\u6b21\u4e3a\u5fc5\u586b\u9879");
            label12.setForeground(new Color(255, 51, 51));
            dialog1ContentPane.add(label12);
            label12.setBounds(345, 110, 85, 25);

            //---- label13 ----
            label13.setText("\u6b21\u4e3a\u5fc5\u586b\u9879");
            label13.setForeground(new Color(255, 51, 51));
            dialog1ContentPane.add(label13);
            label13.setBounds(360, 195, 85, 25);
            dialog1ContentPane.add(comboBox10);
            comboBox10.setBounds(160, 315, 200, 100);

            //======== panel1 ========
            {
                panel1.setBorder(null);
                panel1.setLayout(new GridLayout());
            }
            dialog1ContentPane.add(panel1);
            panel1.setBounds(165, 220, 195, 80);

            //---- label15 ----
            label15.setText("\u4e0d\u53ef\u91cd\u590d");
            label15.setForeground(new Color(255, 51, 51));
            dialog1ContentPane.add(label15);
            label15.setBounds(345, 60, 85, 25);

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

            //---- label4 ----
            label4.setText("\u9910\u54c1\u540d");
            dialog2ContentPane.add(label4);
            label4.setBounds(60, 45, 105, 40);

            //---- label5 ----
            label5.setText("\u4ef7\u683c");
            dialog2ContentPane.add(label5);
            label5.setBounds(60, 100, 105, 40);

            //---- label14 ----
            label14.setText("\u51fa\u9910\u65f6\u95f4");
            dialog2ContentPane.add(label14);
            label14.setBounds(60, 155, 105, 40);
            dialog2ContentPane.add(textField4);
            textField4.setBounds(135, 50, 180, textField4.getPreferredSize().height);
            dialog2ContentPane.add(textField5);
            textField5.setBounds(135, 105, 180, 30);

            //---- button7 ----
            button7.setText("\u786e\u5b9a");
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button7);
            button7.setBounds(new Rectangle(new Point(185, 400), button7.getPreferredSize()));

            //---- comboBox3 ----
            comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                "1:00",
                "2:00",
                "3:00",
                "4:00",
                "5:00",
                "6:00",
                "7:00",
                "8:00",
                "9:00",
                "10:00",
                "11:00",
                "12:00",
                "13:00",
                "14:00",
                "15:00",
                "16:00",
                "17:00",
                "18:00",
                "19:00",
                "20:00",
                "21:00",
                "22:00",
                "23:00",
                "24:00"
            }));
            dialog2ContentPane.add(comboBox3);
            comboBox3.setBounds(135, 165, 80, comboBox3.getPreferredSize().height);

            //---- comboBox4 ----
            comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                "1:00",
                "2:00",
                "3:00",
                "4:00",
                "5:00",
                "6:00",
                "7:00",
                "8:00",
                "9:00",
                "10:00",
                "11:00",
                "12:00",
                "13:00",
                "14:00",
                "15:00",
                "16:00",
                "17:00",
                "18:00",
                "19:00",
                "20:00",
                "21:00",
                "22:00",
                "23:00",
                "24:00"
            }));
            dialog2ContentPane.add(comboBox4);
            comboBox4.setBounds(245, 165, 80, comboBox4.getPreferredSize().height);

            //---- label16 ----
            label16.setText("\u56fe\u7247");
            dialog2ContentPane.add(label16);
            label16.setBounds(60, 295, 105, 40);

            //---- label18 ----
            label18.setText("\u6b21\u4e3a\u5fc5\u586b\u9879");
            label18.setForeground(new Color(255, 51, 51));
            dialog2ContentPane.add(label18);
            label18.setBounds(340, 35, 85, 25);

            //---- label19 ----
            label19.setText("\u6b21\u4e3a\u5fc5\u586b\u9879");
            label19.setForeground(new Color(255, 51, 51));
            dialog2ContentPane.add(label19);
            label19.setBounds(340, 110, 85, 25);

            //---- label9 ----
            label9.setText("\u5e97\u94fa");
            dialog2ContentPane.add(label9);
            label9.setBounds(60, 215, 105, 40);

            //---- comboBox8 ----
            comboBox8.addActionListener(e -> comboBox8(e));
            dialog2ContentPane.add(comboBox8);
            comboBox8.setBounds(135, 220, 180, 30);
            dialog2ContentPane.add(comboBox9);
            comboBox9.setBounds(135, 265, 200, 100);

            //---- label17 ----
            label17.setText("\u4e0d\u53ef\u91cd\u590d");
            label17.setForeground(new Color(255, 51, 51));
            dialog2ContentPane.add(label17);
            label17.setBounds(340, 65, 85, 25);

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
        label8.setVisible(false);
        for (int i = 1; i <=20 ; i++) {
            comboBox9.addItem(Imagesinks.png(icon+i+".png",200,100));
        }
        for (int i = 1; i <=20 ; i++) {
            comboBox10.addItem(Imagesinks.png(icon+i+".png",200,100));
        }
//        File[] files=src.getwj(icon);
//        for (int i = 0; i < files.length; i++) {
//            System.out.println(files[i]);
//            comboBox10.addItem(Imagesinks.png(String.valueOf(files[i]),200,100));
//        }
    }
    private void showdata(String x) {

        Vector<Object> heads=new Vector<Object>();
        heads.add("g_id");
        heads.add("g_name");
        heads.add("g_price");
        heads.add("g_time");
        heads.add("g_dprice");
        heads.add("g_url");
        heads.add("g_coupon");
        heads.add("m_id");
        heads.add("m_name");

        data= Srcontroller.GsgetAll(x,src.getId());

////3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm=new DefaultTableModel(data,heads);
        table1.setModel(dtm);;
    }

    public void alldp(JPanel jPanel){

        listdp.clear();
        listdpid.clear();
        repaint();
        revalidate();
        jPanel.removeAll();
        jPanel.updateUI();
        selecmn();
        int z=selecmn().size();
        if (z%2==0){
            if (z==2){
                jPanel.setLayout(new GridLayout(1,2));
                jPanel.setSize(200,80);
            }else {
                jPanel.setLayout(new GridLayout(2,z/2));
                jPanel.setSize(z/2*150,80);
            }
        }else {
            if (z==1){
                jPanel.setLayout(new GridLayout(1,1));
                jPanel.setSize(150,40);
            }else {
                jPanel.setLayout(new GridLayout(2,z/2+1));
                jPanel.setSize((z/2+1)*150,80);
            }
        }
        for (int i = 0; i < z; i++) {
            JCheckBox jCheckBox=new JCheckBox(selecmn().get(i));
            listdp.add(jCheckBox);
            jPanel.add(jCheckBox);
        }
    }

//    查指定店铺名字的店铺id
    public  int selecmid(String y){
        int x=0;
        try {
            String sql="SELECT m_id FROM mer WHERE m_name=?";
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,y);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                x=rs.getInt("m_id");
            }
            DBConnection.close(rs,ps,conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

//    查当前商家的所有店铺id
    public  List<Integer> selecm(){
        try {
            List<Integer> list=new ArrayList();
            String sql="SELECT b.m_id FROM business a,mer b where a.b_id=b.b_id AND b.b_id=?";
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,src.getId());
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                list.add(rs.getInt("m_id"));
            }
            DBConnection.close(rs,ps,conn);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
//          查当前商家的所有店铺名字
    public  List<String> selecmn(){
        try {
            List<String> list=new ArrayList();
            String sql="SELECT b.m_name FROM business a,mer b where a.b_id=b.b_id AND b.b_id=?";
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,src.getId());
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                list.add(rs.getString("m_name"));
            }
            DBConnection.close(rs,ps,conn);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//         修改按钮查重
    public boolean selectc2(int id,String gname,BigDecimal gprice,String gtime,String gurl,String mname){
        try {
            List<String> list=new ArrayList();
            String sql="SELECT a.g_name,a.g_price,a.g_time,a.g_url,a.m_id,b.m_name FROM goods a" +
                    ",mer b WHERE a.m_id=b.m_id AND a.g_id=?";
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                list.add(rs.getString("g_name"));
                list.add(rs.getString("g_price"));
                list.add(rs.getString("g_time"));
                list.add(rs.getString("g_url"));
                list.add(rs.getString("m_name"));
            }

           if (list.get(0).equals(gname) && list.get(1).equals(String.valueOf(gprice)) && list.get(2).equals(gtime)
                   && list.get(3).equals(gurl) && list.get(4).equals(mname)){
               return true;
           }
            DBConnection.close(rs,ps,conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    //         添加按钮指定数据查重,某个店铺的商品名称
    public boolean selectc(int id,String gname){
        try {
            List<String> list=new ArrayList();
            String sql="SELECT g_name FROM goods WHERE m_id=?";
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                list.add(rs.getString("g_name"));
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(gname)){
                    return true;
                }
            }
            DBConnection.close(rs,ps,conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable table1;
    private JTextField textField1;
    private JButton button3;
    private JLabel label11;
    private JButton button1;
    private JButton button4;
    private JButton button5;
    private JButton button2;
    private JLabel label8;
    private JDialog dialog1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label6;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button6;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JLabel label7;
    private JLabel label10;
    private JLabel label12;
    private JLabel label13;
    private JComboBox comboBox10;
    private JPanel panel1;
    private JLabel label15;
    private JDialog dialog2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label14;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button7;
    private JComboBox<String> comboBox3;
    private JComboBox<String> comboBox4;
    private JLabel label16;
    private JLabel label18;
    private JLabel label19;
    private JLabel label9;
    private JComboBox comboBox8;
    private JComboBox comboBox9;
    private JLabel label17;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
    Srcontroller src=Srcontroller.src;
    private static List<JCheckBox> listdp=new ArrayList<>();
    private static List<String> list2;
    private static List<Integer> listdpid=new ArrayList<>();
    String icon="images/goods/";
    int dpid;
    boolean nt=false,nt2=false;
}
