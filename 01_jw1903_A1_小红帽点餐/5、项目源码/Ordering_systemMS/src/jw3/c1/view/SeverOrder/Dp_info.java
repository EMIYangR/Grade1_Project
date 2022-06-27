/*
 * Created by JFormDesigner on Thu May 26 19:28:37 CST 2022
 */

package jw3.c1.view.SeverOrder;

import jw3.c1.controller.Srcontroller;
import jw3.c1.model.Mer;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.Imagesinks;
import jw3.c1.utils.QueryByClass;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * @author Brainrain
 */
public class Dp_info extends JPanel {

    public Dp_info() {
        this.setSize(785,345);
        this.setVisible(true);
        initComponents();
    }
//  查询按钮
    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        if (textField1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"请输入值");
        }else {
            showdata(textField1.getText());
            textField1.setText("");
        }
    }
//  刷新按钮
    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        showdata("");
        textField1.setText("");
    }
//  删除按钮
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
                String sql="delete from mer where m_id=?";
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
//  添加按钮
    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        checkBox2.setSelected(true);
        dialog1.setSize(440,600);
        dialog1.setModal(true); //模态框
        dialog1.setVisible(true);//显示出来
    }
//  添加弹窗按钮
    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        Mer mer=new Mer();
        int z=0;
            mer.setM_name(textField3.getText());
            mer.setM_des(textField4.getText());
            mer.setM_address(textField6.getText());
            mer.setM_phone(textField7.getText());
            String ul=String.valueOf(comboBox1.getSelectedItem());
            int mil=icong.length();
            mer.setM_url(ul.substring(mil));
            if (checkBox2.isSelected()){
                mer.setM_isorder("1");
            }else {
                mer.setM_isorder("0");
            }
            mer.setMt_id(selectmtid(String.valueOf(comboBox2.getSelectedItem())));
//            判断
            if (!( mer.getM_name().equals("") || mer.getM_phone().equals(""))){
                if ( ! src.isNumberString(mer.getM_phone()) || mer.getM_phone().length()!=11){
                        JOptionPane.showMessageDialog(null,"电话号码格式不对");
                        return;
                }
                if (comboBox2.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(null,"类型未选择");
                    return;
                }
                for (Vector<Object> item:data) {
                    if (item.contains(mer.getM_name())){
                        JOptionPane.showMessageDialog(null,
                                "记录重复");
                        return;
                    }
                }
                Srcontroller src=Srcontroller.src;
                String sql="insert mer values(?,?,?,?,?,?,?,?,?,?)";
                boolean x=DBConnection.zsg(sql,0, mer.getM_name(),mer.getM_des(),mer.getMt_id(),mer.getM_address(),
                        mer.getM_phone(),mer.getM_url(), mer.getM_isorder(),mer.getE_recordid(),src.getId());
                if (x){
                        showdata("");
                        JOptionPane.showMessageDialog(null,
                                "注册成功");
                        dialog1.dispose();
                        textField3.setText("");
                    textField4.setText("");
                    textField6.setText("");
                    textField7.setText("");
                    comboBox1.setSelectedIndex(0);
                    comboBox2.setSelectedIndex(0);
                    checkBox2.setSelected(false);
                }else {
                        JOptionPane.showMessageDialog(null,
                                "注册失败");
                }
            }else {
                JOptionPane.showMessageDialog(null,
                        "不能为空");
            }

    }
//  修改按钮
    private void button2MouseClicked(MouseEvent e) {
        dialog2.setSize(500,500);
        // TODO add your code here
        int index=table1.getSelectedRow();//选中行的索引
        if (index!=-1){//是否选中了一行
            //获取值 data、index
            //先传值
            textField12.setText(data.get(index).get(1).toString());
            textField13.setText(data.get(index).get(2).toString());
            textField15.setText(data.get(index).get(4).toString());
            textField16.setText(data.get(index).get(3).toString());
            checkBox1.setSelected(data.get(index).get(6).equals("1"));
            for (int i = 0; i < mericon.length; i++) {
                if (mericon[i].equals(data.get(index).get(5))){
                    comboBox3.setSelectedIndex(i);
                    break;
                }
            }
            comboBox4.setSelectedItem(data.get(index).get(7));
            if (String.valueOf(data.get(index).get(6)).equals("1")){
                checkBox1.setSelected(true);
            }
            //后展示对话框
            dialog2.setModal(true);
            dialog2.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,
                    "您未选中任意一行!");
        }
    }
    //  修改弹窗按钮
    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();
        Mer mer=new Mer();
        //1、获取数据
        int id=(int)data.get(index).get(0);
        mer.setM_id(id);
        mer.setM_name(textField12.getText());
        mer.setM_des(textField13.getText());
        mer.setM_address(textField15.getText());
        mer.setM_phone(textField16.getText());
        String ul=String.valueOf(comboBox3.getSelectedItem());
        int mil=icong.length();
        mer.setM_url(ul.substring(mil));
        mer.setMt_id(selectmtid(String.valueOf(comboBox4.getSelectedItem())));
        String xy= String.valueOf(data.get(index).get(6));

        if (checkBox1.isSelected()){
            mer.setM_isorder("1");
        }else {
            mer.setM_isorder("0");
        }
        //2、简单判断
        if (!( mer.getM_name().equals("") || mer.getM_phone().equals(""))){
//                mer.setM_name(mer.getM_name());
//                mer.setM_phone(mer.getM_phone());

                boolean p=false;
                if (data.get(index).get(7).equals(comboBox4.getSelectedItem())){
                    p=true;
                }

            for (Vector<Object> item:data) {
                if (item.contains(mer.getM_name()) && item.contains(mer.getM_address()) && item.contains(mer.getM_phone())
                        && item.contains(mer.getM_des()) && item.contains(mer.getM_url()) && mer.getM_isorder().equals(xy)
                && p){
                    JOptionPane.showMessageDialog(null,
                            "记录未修改");
                    return;
                }
            }
            if (!(textField12.getText().equals(data.get(index).get(1)))){
                for (Vector<Object> item:data) {
                    if (item.contains(mer.getM_name()) ){
                        JOptionPane.showMessageDialog(null,
                                "记录重复");
                        return;
                    }
                }
            }

            if ( ! src.isNumberString(mer.getM_phone()) || mer.getM_phone().length()!=11){
                JOptionPane.showMessageDialog(null,"电话号码格式不对");
                return;
            }
            String sql="update mer set m_name=?,m_des=?,m_address=?,m_phone=?,m_url=?,mt_id=?,m_isorder=? where m_id=?";
            boolean x=DBConnection.zsg(sql,mer.getM_name(),mer.getM_des(),
                    mer.getM_address(),mer.getM_phone(),mer.getM_url(),mer.getMt_id(),mer.getM_isorder(),mer.getM_id());
            if (x){
                showdata("");
                JOptionPane.showMessageDialog(null,
                        "修改成功");

                dialog2.dispose();
            }else {
                JOptionPane.showMessageDialog(null,
                        "修改失败");
            }
        }else {
            JOptionPane.showMessageDialog(null,
                    "不能为空");
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
        label2 = new JLabel();
        textField3 = new JTextField();
        button6 = new JButton();
        label3 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        label5 = new JLabel();
        label7 = new JLabel();
        textField6 = new JTextField();
        textField7 = new JTextField();
        label1 = new JLabel();
        label15 = new JLabel();
        label4 = new JLabel();
        label10 = new JLabel();
        comboBox1 = new JComboBox();
        comboBox2 = new JComboBox<>();
        label9 = new JLabel();
        label20 = new JLabel();
        checkBox2 = new JCheckBox();
        label23 = new JLabel();
        dialog2 = new JDialog();
        label12 = new JLabel();
        textField12 = new JTextField();
        label13 = new JLabel();
        textField13 = new JTextField();
        label14 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        textField15 = new JTextField();
        textField16 = new JTextField();
        button7 = new JButton();
        label18 = new JLabel();
        label19 = new JLabel();
        comboBox3 = new JComboBox();
        label21 = new JLabel();
        comboBox4 = new JComboBox<>();
        label22 = new JLabel();
        checkBox1 = new JCheckBox();

        //======== this ========
        setBorder(null);
        setOpaque(false);
        setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(5, 95, 1150, 445);

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
        textField1.setBounds(660, 40, 375, 30);

        //---- button3 ----
        button3.setText("\u641c\u7d22");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button3);
        button3.setBounds(1065, 40, 90, 30);

        //---- label11 ----
        label11.setText("\u5e97\u94fa\u4fe1\u606f\uff1a");
        add(label11);
        label11.setBounds(20, 35, 110, 30);

        //---- button1 ----
        button1.setText("\u5220\u9664");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        add(button1);
        button1.setBounds(1165, 250, 60, 30);

        //---- button4 ----
        button4.setText("\u6dfb\u52a0");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        add(button4);
        button4.setBounds(1165, 405, 65, 30);

        //---- button5 ----
        button5.setText("\u5237\u65b0");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5MouseClicked(e);
            }
        });
        add(button5);
        button5.setBounds(1165, 165, 60, 30);

        //---- button2 ----
        button2.setText("\u4fee\u6539");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        add(button2);
        button2.setBounds(1165, 330, 65, 30);

        //---- label8 ----
        label8.setText("\u8bf7\u8f93\u5165\u5e97\u94fa\u540d\uff1a");
        label8.setForeground(new Color(255, 51, 51));
        add(label8);
        label8.setBounds(515, 40, 145, 30);

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

            //---- label2 ----
            label2.setText("\u5e97\u94fa\u540d\u79f0");
            dialog1ContentPane.add(label2);
            label2.setBounds(20, 70, 70, 25);
            dialog1ContentPane.add(textField3);
            textField3.setBounds(100, 70, 160, 30);

            //---- button6 ----
            button6.setText("\u786e\u5b9a");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button6);
            button6.setBounds(new Rectangle(new Point(145, 430), button6.getPreferredSize()));

            //---- label3 ----
            label3.setText("\u7b80\u4ecb");
            dialog1ContentPane.add(label3);
            label3.setBounds(20, 120, 80, 30);
            dialog1ContentPane.add(textField4);
            textField4.setBounds(100, 120, 160, 30);

            //---- label6 ----
            label6.setText("\u7535\u8bdd\u53f7\u7801");
            dialog1ContentPane.add(label6);
            label6.setBounds(20, 210, 80, 30);

            //---- label5 ----
            label5.setText("\u5730\u5740");
            dialog1ContentPane.add(label5);
            label5.setBounds(20, 160, 80, 30);

            //---- label7 ----
            label7.setText("\u56fe\u7247");
            dialog1ContentPane.add(label7);
            label7.setBounds(20, 320, 80, 30);
            dialog1ContentPane.add(textField6);
            textField6.setBounds(100, 160, 160, 30);
            dialog1ContentPane.add(textField7);
            textField7.setBounds(100, 210, 160, 30);

            //---- label1 ----
            label1.setText("\u6b21\u9879\u4e3a\u5fc5\u586b\u9879");
            label1.setForeground(new Color(255, 51, 51));
            dialog1ContentPane.add(label1);
            label1.setBounds(275, 65, 100, label1.getPreferredSize().height);

            //---- label15 ----
            label15.setText("\u6b21\u9879\u4e3a\u5fc5\u586b\u9879");
            label15.setForeground(new Color(255, 51, 51));
            dialog1ContentPane.add(label15);
            label15.setBounds(273, 220, 105, 17);

            //---- label4 ----
            label4.setText("\u5e97\u94faid");
            dialog1ContentPane.add(label4);
            label4.setBounds(20, 25, 55, 25);

            //---- label10 ----
            label10.setText("\u65e0\u9700\u8f93\u5165");
            dialog1ContentPane.add(label10);
            label10.setBounds(105, 25, 110, 30);
            dialog1ContentPane.add(comboBox1);
            comboBox1.setBounds(100, 295, 160, 80);

            //---- comboBox2 ----
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u8bf7\u9009\u62e9\u7c7b\u578b",
                "\u8336\u9910\u5385",
                "\u65e9\u70b9",
                "\u4e1c\u5317\u83dc",
                "\u8c46\u8150\u82b1",
                "\u5e72\u9505/\u9999\u9505",
                "\u6cb3\u5317\u83dc",
                "\u5bb6\u5e38\u83dc",
                "\u5feb\u9910\u7b80\u9910",
                "\u9762\u6761",
                "\u725b\u6392",
                "\u519c\u5bb6\u83dc",
                "\u5176\u4ed6\u7f8e\u98df",
                "\u5176\u4ed6\u4e2d\u9910",
                "\u79c1\u623f\u83dc",
                "\u7d20\u98df",
                "\u9178\u83dc\u9c7c/\u6c34\u716e\u9c7c",
                "\u6cf0\u56fd\u83dc",
                "\u7279\u8272\u83dc",
                "\u5929\u6d25\u83dc",
                "\u5c0f\u5403\u5feb\u9910",
                "\u65b0\u7586\u83dc",
                "\u610f\u5927\u5229\u83dc",
                "\u7ca4\u83dc",
                "\u7efc\u5408\u81ea\u52a9",
                "\u5ddd\u83dc",
                "\u996e\u6599",
                "\u5bb6\u4f1f\u79d8\u5236\u5bb6\u5e38\u83dc",
                "\u5976\u8336"
            }));
            dialog1ContentPane.add(comboBox2);
            comboBox2.setBounds(100, 385, 160, 30);

            //---- label9 ----
            label9.setText("\u7c7b\u578b");
            dialog1ContentPane.add(label9);
            label9.setBounds(20, 385, 80, 30);

            //---- label20 ----
            label20.setText("\u4e0d\u80fd\u91cd\u590d");
            label20.setForeground(new Color(255, 51, 51));
            dialog1ContentPane.add(label20);
            label20.setBounds(275, 85, 105, 17);

            //---- checkBox2 ----
            checkBox2.setText("\u652f\u6301\u70b9\u9910");
            dialog1ContentPane.add(checkBox2);
            checkBox2.setBounds(105, 255, 110, 30);

            //---- label23 ----
            label23.setText("\u662f\u5426\u80fd\u70b9\u9910");
            dialog1ContentPane.add(label23);
            label23.setBounds(20, 250, 80, 30);

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

            //---- label12 ----
            label12.setText("\u5e97\u94fa\u540d\u79f0");
            dialog2ContentPane.add(label12);
            label12.setBounds(80, 25, 75, 25);
            dialog2ContentPane.add(textField12);
            textField12.setBounds(165, 20, 110, 30);

            //---- label13 ----
            label13.setText("\u7b80\u4ecb");
            dialog2ContentPane.add(label13);
            label13.setBounds(85, 70, 80, 30);
            dialog2ContentPane.add(textField13);
            textField13.setBounds(165, 70, 110, 30);

            //---- label14 ----
            label14.setText("\u7535\u8bdd\u53f7\u7801");
            dialog2ContentPane.add(label14);
            label14.setBounds(85, 170, 80, 30);

            //---- label16 ----
            label16.setText("\u5730\u5740");
            dialog2ContentPane.add(label16);
            label16.setBounds(85, 120, 80, 30);

            //---- label17 ----
            label17.setText("\u56fe\u7247");
            dialog2ContentPane.add(label17);
            label17.setBounds(85, 290, 80, 30);
            dialog2ContentPane.add(textField15);
            textField15.setBounds(165, 125, 110, 30);
            dialog2ContentPane.add(textField16);
            textField16.setBounds(165, 175, 110, 30);

            //---- button7 ----
            button7.setText("\u786e\u5b9a");
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button7);
            button7.setBounds(new Rectangle(new Point(190, 415), button7.getPreferredSize()));

            //---- label18 ----
            label18.setText("\u6b21\u9879\u4e3a\u5fc5\u586b\u9879");
            label18.setForeground(new Color(255, 51, 51));
            dialog2ContentPane.add(label18);
            label18.setBounds(300, 180, 90, 17);

            //---- label19 ----
            label19.setText("\u6b21\u9879\u4e3a\u5fc5\u586b\u9879\uff0c\u4e0d\u80fd\u91cd\u590d");
            label19.setForeground(new Color(255, 51, 51));
            dialog2ContentPane.add(label19);
            label19.setBounds(295, 25, 170, 17);
            dialog2ContentPane.add(comboBox3);
            comboBox3.setBounds(165, 265, 160, 80);

            //---- label21 ----
            label21.setText("\u7c7b\u578b");
            dialog2ContentPane.add(label21);
            label21.setBounds(85, 360, 80, 30);

            //---- comboBox4 ----
            comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u8336\u9910\u5385",
                "\u65e9\u70b9",
                "\u4e1c\u5317\u83dc",
                "\u8c46\u8150\u82b1",
                "\u5e72\u9505/\u9999\u9505",
                "\u6cb3\u5317\u83dc",
                "\u5bb6\u5e38\u83dc",
                "\u5feb\u9910\u7b80\u9910",
                "\u9762\u6761",
                "\u725b\u6392",
                "\u519c\u5bb6\u83dc",
                "\u5176\u4ed6\u7f8e\u98df",
                "\u5176\u4ed6\u4e2d\u9910",
                "\u79c1\u623f\u83dc",
                "\u7d20\u98df",
                "\u9178\u83dc\u9c7c/\u6c34\u716e\u9c7c",
                "\u6cf0\u56fd\u83dc",
                "\u7279\u8272\u83dc",
                "\u5929\u6d25\u83dc",
                "\u5c0f\u5403\u5feb\u9910",
                "\u65b0\u7586\u83dc",
                "\u610f\u5927\u5229\u83dc",
                "\u7ca4\u83dc",
                "\u7efc\u5408\u81ea\u52a9",
                "\u5ddd\u83dc",
                "\u996e\u6599",
                "\u5bb6\u4f1f\u79d8\u5236\u5bb6\u5e38\u83dc",
                "\u5976\u8336"
            }));
            dialog2ContentPane.add(comboBox4);
            comboBox4.setBounds(165, 365, 160, 30);

            //---- label22 ----
            label22.setText("\u662f\u5426\u80fd\u70b9\u9910");
            dialog2ContentPane.add(label22);
            label22.setBounds(85, 215, 80, 30);

            //---- checkBox1 ----
            checkBox1.setText("\u652f\u6301\u70b9\u9910");
            dialog2ContentPane.add(checkBox1);
            checkBox1.setBounds(170, 220, 110, 30);

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
        int id;
        showdata("");
        label8.setVisible(false);
        for (int i = 0; i < mericon.length; i++) {
            comboBox1.addItem(Imagesinks.png(icong+mericon[i],160,80));
            comboBox3.addItem(Imagesinks.png(icong+mericon[i],160,80));
        }
    }
    Srcontroller src=Srcontroller.src;
        public void showdata(String x) {
        Vector<Object> heads=new Vector<Object>();
        heads.add("m_id");
        heads.add("m_name");
        heads.add("m_des");
        heads.add("m_phone");
        heads.add("m_address");
        heads.add("m_url");
        heads.add("m_isorder");
        heads.add("mt_name");
        data= Srcontroller.DpgetAll(x,src.getId());

////3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm=new DefaultTableModel(data,heads);
        table1.setModel(dtm);;
    }
    public int selectmtid(String x){
        try {
            String sql="SELECT mt_id FROM mertype WHERE mt_name=?";
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,x);
            ResultSet rs=ps.executeQuery();
            int y = 0;
            while (rs.next()){
                y=rs.getInt("mt_id");
            }
            return y;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public boolean selectc(int id,String gname){
        try {
            List<String> list=new ArrayList();
            String sql="SELECT m_name FROM mer WHERE b_id=?";
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                list.add(rs.getString("m_name"));
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
    private JLabel label2;
    private JTextField textField3;
    private JButton button6;
    private JLabel label3;
    private JTextField textField4;
    private JLabel label6;
    private JLabel label5;
    private JLabel label7;
    private JTextField textField6;
    private JTextField textField7;
    private JLabel label1;
    private JLabel label15;
    private JLabel label4;
    private JLabel label10;
    private JComboBox comboBox1;
    private JComboBox<String> comboBox2;
    private JLabel label9;
    private JLabel label20;
    private JCheckBox checkBox2;
    private JLabel label23;
    private JDialog dialog2;
    private JLabel label12;
    private JTextField textField12;
    private JLabel label13;
    private JTextField textField13;
    private JLabel label14;
    private JLabel label16;
    private JLabel label17;
    private JTextField textField15;
    private JTextField textField16;
    private JButton button7;
    private JLabel label18;
    private JLabel label19;
    private JComboBox comboBox3;
    private JLabel label21;
    private JComboBox<String> comboBox4;
    private JLabel label22;
    private JCheckBox checkBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
    int id;
    String[] mericon=new String[] {"佛洛力斯.jpg","加荷.jpg","奶茶4.png","家常.png","家常2.png","家常4.png","家常5.png","家常6.png",
            "家常7.png","家常8.png","家常9.png","家常10.png","布拉诺.jpg","抄手1.png","披萨.png","楼兰.jpg","沙拉.png","泰香米.jpg",
            "火锅.jpg","牛排.jpg","甜点.png","西餐.jpg","豆花1.png","金翠河.jpg"};
    String icong="images/mer/";
}
