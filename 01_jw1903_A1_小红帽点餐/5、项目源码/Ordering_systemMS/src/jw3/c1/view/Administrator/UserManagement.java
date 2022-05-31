/*
 * Created by JFormDesigner on Mon May 30 20:13:20 CST 2022
 */

package jw3.c1.view.Administrator;

import jw3.c1.controller.*;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.Imagesinks;
import jw3.c1.utils.QueryByClass;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Timer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author Brainrain
 */
public class UserManagement extends JFrame {
    public static void main(String[] args) {
        new UserManagement();
    }
    public UserManagement() {
        initComponents();
        showData("");
        this.setVisible(true);
        this.setSize(1080,720);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void showData(String user) {
        //1、表头
        Vector<Object> heads = new Vector<Object>();
        heads.add("用户编号");
        heads.add("用户姓名");
        heads.add("地址");
        heads.add("电话");
        heads.add("头像URL");
        heads.add("账号");
        heads.add("密码");
        heads.add("VIP等级");
        heads.add("注册时间");
        heads.add("邮箱");
        heads.add("昵称");
        heads.add("信誉积分");
        //2、表数据
        data = UserinfoController.getAll(user);
        //3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm = new DefaultTableModel(data, heads);
        table1.setModel(dtm);
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        showData(textField1.getText());
    }
    //添加
    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.setModal(true);
        dialog1.setSize(550,350);
        dialog1.setVisible(true);
    }
    //添加判断
    private void button10MouseClicked(MouseEvent e) {
        // TODO add your code here
        Userinfo userinfo = new Userinfo();
        userinfo.setU_name(textField2.getText());
        userinfo.setU_address(textField3.getText());
        userinfo.setU_phone(textField4.getText());
        userinfo.setU_headimage(textField5.getText());
        userinfo.setU_account(textField6.getText());
        userinfo.setU_pwd(textField7.getText());
        userinfo.setV_viprank(Integer.parseInt(textField8.getText()));
        //自动获取注册时间
        userinfo.setU_email(textField10.getText());
        userinfo.setU_nickname(textField11.getText());
        //信誉积分默认100
        if (!userinfo.getU_name().equals("") && !userinfo.getU_address().equals("") && !userinfo.getU_phone().equals("") && !userinfo.getU_account().equals("") && !userinfo.getU_pwd().equals("") && !userinfo.getU_email().equals("") && !userinfo.getU_nickname().equals("")) {
            for (Vector<Object> item:data)  {
                if (item.contains(userinfo.getU_account())) {
                    JOptionPane.showMessageDialog(null,"账号已存在!");
                    return;
                }
            }
            if(UserinfoController.AddUser(userinfo)){
                JOptionPane.showMessageDialog(null,"添加成功!");
                showData("");
                dialog1.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null,"添加失败!");
            }
        } else {
            JOptionPane.showMessageDialog(null,"请填写完整信息!");
        }
    }
    //关闭添加
    private void button11MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.dispose();
    }
    //删除
    private void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
        int row = table1.getSelectedRow();
        if(row != -1){
            if(JOptionPane.showConfirmDialog(null,"您是否确认删除此数据?")==0){
                int id = (int) data.get(row).get(0);
                if (UserinfoController.delete(id)) {
                    showData("");
                    JOptionPane.showMessageDialog(null,"删除成功");
                } else {
                    JOptionPane.showMessageDialog(null, "删除失败");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "您未选中任意一行");
        }
    }
    //修改
    private void button9MouseClicked(MouseEvent e) {
        // TODO add your code here
        int row = table1.getSelectedRow();
        if(row != -1) {
            Userinfo userinfo = new Userinfo();
            label28.setText(data.get(row).get(0).toString());
            textField13.setText(data.get(row).get(1).toString());
            textField14.setText(data.get(row).get(2).toString());
            textField15.setText(data.get(row).get(3).toString());
            label32.setText(data.get(row).get(4).toString());
            textField17.setText(data.get(row).get(5).toString());
            textField18.setText(data.get(row).get(6).toString());
            textField19.setText(data.get(row).get(7).toString());
            label30.setText(data.get(row).get(8).toString());
            textField21.setText(data.get(row).get(9).toString());
            textField22.setText(data.get(row).get(10).toString());
            label33.setText(data.get(row).get(11).toString());
            dialog2.setModal(true);
            dialog2.setSize(550,350);
            dialog2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"您未选中任意一行!");
        }
    }
    //修改判断
    private void button14MouseClicked(MouseEvent e) {
        // TODO add your code here
        Userinfo userinfo = new Userinfo();
        userinfo.setU_id(Integer.parseInt(label28.getText()));
        userinfo.setU_name(textField13.getText());
        userinfo.setU_address(textField14.getText());
        userinfo.setU_phone(textField15.getText());
        //头像用户自行修改
        userinfo.setU_account(textField17.getText());
        userinfo.setU_pwd(textField18.getText());
        userinfo.setV_viprank(Integer.parseInt(textField19.getText()));
        //注册时间不能修改
        userinfo.setU_email(textField21.getText());
        userinfo.setU_nickname(textField22.getText());
        //信誉积分通过加入黑名单实现
        if (!userinfo.getU_name().equals("")
                && !userinfo.getU_address().equals("")
                && !userinfo.getU_phone().equals("")
                && !userinfo.getU_account().equals("")
                && !userinfo.getU_pwd().equals("")
                && !userinfo.getU_email().equals("")
                && !userinfo.getU_nickname().equals("")
        ) {
            for (Vector<Object> item:data)  {
                if (item.contains(userinfo.getU_account())) {
                    JOptionPane.showMessageDialog(null,"账号已存在!");
                    return;
                }
            }
            if(UserinfoController.update(userinfo)) {
                JOptionPane.showMessageDialog(null,"修改成功!");
                showData(textField1.getText());
                dialog1.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null,"修改失败!");
            }
        } else {
            JOptionPane.showMessageDialog(null,"请填写完整信息!");
        }
    }
    //取消修改
    private void button15MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog2.dispose();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        new AdministratorIndex();
        this.setVisible(false);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        new MerchantManagement();
        this.setVisible(false);
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        new UserManagement();
        this.setVisible(false);
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        new CouponManagement();
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button9 = new JButton();
        button8 = new JButton();
        button7 = new JButton();
        button6 = new JButton();
        separator1 = new JPopupMenu.Separator();
        label5 = new JLabel();
        textField1 = new JTextField();
        button5 = new JButton();
        button4 = new JButton();
        button3 = new JButton();
        button2 = new JButton();
        button1 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label4 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        dialog1 = new JDialog();
        label3 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        textField10 = new JTextField();
        textField11 = new JTextField();
        button10 = new JButton();
        button11 = new JButton();
        label29 = new JLabel();
        label31 = new JLabel();
        dialog2 = new JDialog();
        button14 = new JButton();
        button15 = new JButton();
        label16 = new JLabel();
        textField13 = new JTextField();
        label17 = new JLabel();
        textField14 = new JTextField();
        textField15 = new JTextField();
        label18 = new JLabel();
        textField17 = new JTextField();
        textField18 = new JTextField();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        textField19 = new JTextField();
        textField21 = new JTextField();
        textField22 = new JTextField();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        label26 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        label30 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button9 ----
        button9.setText("\u4fee\u6539");
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button9MouseClicked(e);
            }
        });
        contentPane.add(button9);
        button9.setBounds(930, 450, 75, 30);

        //---- button8 ----
        button8.setText("\u5220\u9664");
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button8MouseClicked(e);
            }
        });
        contentPane.add(button8);
        button8.setBounds(930, 350, 75, 30);

        //---- button7 ----
        button7.setText("\u6dfb\u52a0");
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button7MouseClicked(e);
            }
        });
        contentPane.add(button7);
        button7.setBounds(930, 250, 75, 30);

        //---- button6 ----
        button6.setText("\u641c\u7d22");
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button6MouseClicked(e);
            }
        });
        contentPane.add(button6);
        button6.setBounds(930, 150, 75, 30);
        contentPane.add(separator1);
        separator1.setBounds(0, 135, 1100, 5);

        //---- label5 ----
        label5.setText("\u5c0f\u7ea2\u5e3d\u70b9\u9910\u7cfb\u7edf\u2122\u540e\u53f0\u8fd0\u8425\u7cfb\u7edf");
        label5.setFont(new Font("\u65b9\u6b63\u5c0f\u6807\u5b8b_GBK", Font.BOLD, 28));
        label5.setForeground(new Color(204, 0, 0));
        label5.setEnabled(false);
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(395, 45), label5.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(205, 150, 700, 30);

        //---- button5 ----
        button5.setText("\u6536\u76ca");
        button5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        contentPane.add(button5);
        button5.setBounds(20, 450, 150, 45);

        //---- button4 ----
        button4.setText("\u4f18\u60e0\u5238\u7ba1\u7406");
        button4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        contentPane.add(button4);
        button4.setBounds(20, 375, 150, 45);

        //---- button3 ----
        button3.setText("\u7528\u6237\u7ba1\u7406");
        button3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(20, 300, 150, 45);

        //---- button2 ----
        button2.setText("\u5546\u5bb6\u7ba1\u7406");
        button2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(20, 225, 150, 45);

        //---- button1 ----
        button1.setText("\u4e3b\u9875");
        button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(20, 150, 150, 45);

        //---- label1 ----
        label1.setText("Administrator");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(20, 100), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("icon");
        contentPane.add(label2);
        label2.setBounds(20, 20, 75, 75);

        //---- label4 ----
        label4.setText("logo");
        contentPane.add(label4);
        label4.setBounds(245, 25, 100, 100);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(205, 210, 700, scrollPane1.getPreferredSize().height);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());

        //======== dialog1 ========
        {
            Container dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(null);

            //---- label3 ----
            label3.setText("\u7528\u6237\u59d3\u540d\uff1a");
            dialog1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(50, 20), label3.getPreferredSize()));

            //---- label6 ----
            label6.setText("\u5730\u5740\uff1a");
            dialog1ContentPane.add(label6);
            label6.setBounds(new Rectangle(new Point(74, 60), label6.getPreferredSize()));

            //---- label7 ----
            label7.setText("\u7535\u8bdd\uff1a");
            dialog1ContentPane.add(label7);
            label7.setBounds(new Rectangle(new Point(74, 100), label7.getPreferredSize()));

            //---- label8 ----
            label8.setText("\u5934\u50cfURL\uff1a");
            dialog1ContentPane.add(label8);
            label8.setBounds(new Rectangle(new Point(51, 140), label8.getPreferredSize()));

            //---- label9 ----
            label9.setText("\u8d26\u53f7\uff1a");
            dialog1ContentPane.add(label9);
            label9.setBounds(new Rectangle(new Point(74, 180), label9.getPreferredSize()));

            //---- label10 ----
            label10.setText("\u5bc6\u7801\uff1a");
            dialog1ContentPane.add(label10);
            label10.setBounds(new Rectangle(new Point(74, 220), label10.getPreferredSize()));

            //---- label11 ----
            label11.setText("VIP\u7b49\u7ea7\uff1a");
            dialog1ContentPane.add(label11);
            label11.setBounds(new Rectangle(new Point(300, 20), label11.getPreferredSize()));

            //---- label12 ----
            label12.setText("\u6ce8\u518c\u65f6\u95f4\uff1a");
            dialog1ContentPane.add(label12);
            label12.setBounds(new Rectangle(new Point(294, 62), label12.getPreferredSize()));

            //---- label13 ----
            label13.setText("\u90ae\u7bb1\uff1a");
            dialog1ContentPane.add(label13);
            label13.setBounds(new Rectangle(new Point(318, 102), label13.getPreferredSize()));

            //---- label14 ----
            label14.setText("\u6635\u79f0\uff1a");
            dialog1ContentPane.add(label14);
            label14.setBounds(new Rectangle(new Point(318, 142), label14.getPreferredSize()));

            //---- label15 ----
            label15.setText("\u4fe1\u8a89\u79ef\u5206\uff1a");
            dialog1ContentPane.add(label15);
            label15.setBounds(new Rectangle(new Point(294, 182), label15.getPreferredSize()));
            dialog1ContentPane.add(textField2);
            textField2.setBounds(125, 15, 150, 30);
            dialog1ContentPane.add(textField3);
            textField3.setBounds(125, 55, 150, 30);
            dialog1ContentPane.add(textField4);
            textField4.setBounds(125, 95, 150, 30);
            dialog1ContentPane.add(textField5);
            textField5.setBounds(125, 135, 150, 30);
            dialog1ContentPane.add(textField6);
            textField6.setBounds(125, 175, 150, 30);
            dialog1ContentPane.add(textField7);
            textField7.setBounds(125, 215, 150, 30);
            dialog1ContentPane.add(textField8);
            textField8.setBounds(375, 13, 150, 30);
            dialog1ContentPane.add(textField10);
            textField10.setBounds(375, 95, 150, 30);
            dialog1ContentPane.add(textField11);
            textField11.setBounds(375, 135, 150, 30);

            //---- button10 ----
            button10.setText("\u786e\u5b9a");
            button10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button10MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button10);
            button10.setBounds(new Rectangle(new Point(350, 275), button10.getPreferredSize()));

            //---- button11 ----
            button11.setText("\u53d6\u6d88");
            button11.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button11MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button11);
            button11.setBounds(new Rectangle(new Point(450, 275), button11.getPreferredSize()));

            //---- label29 ----
            label29.setText("\u65e0\u9700\u586b\u5199\uff01");
            dialog1ContentPane.add(label29);
            label29.setBounds(375, 58, 150, 25);

            //---- label31 ----
            label31.setText("\u65e0\u9700\u586b\u5199\uff01");
            dialog1ContentPane.add(label31);
            label31.setBounds(375, 178, 150, 25);

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

            //---- button14 ----
            button14.setText("\u786e\u5b9a");
            button14.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button14MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button14);
            button14.setBounds(new Rectangle(new Point(350, 275), button14.getPreferredSize()));

            //---- button15 ----
            button15.setText("\u53d6\u6d88");
            button15.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button15MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button15);
            button15.setBounds(new Rectangle(new Point(450, 275), button15.getPreferredSize()));

            //---- label16 ----
            label16.setText("\u7528\u6237\u59d3\u540d\uff1a");
            dialog2ContentPane.add(label16);
            label16.setBounds(new Rectangle(new Point(50, 60), label16.getPreferredSize()));
            dialog2ContentPane.add(textField13);
            textField13.setBounds(125, 53, 150, 30);

            //---- label17 ----
            label17.setText("VIP\u7b49\u7ea7\uff1a");
            dialog2ContentPane.add(label17);
            label17.setBounds(new Rectangle(new Point(300, 60), label17.getPreferredSize()));
            dialog2ContentPane.add(textField14);
            textField14.setBounds(125, 93, 150, 30);
            dialog2ContentPane.add(textField15);
            textField15.setBounds(125, 133, 150, 30);

            //---- label18 ----
            label18.setText("\u6ce8\u518c\u65f6\u95f4\uff1a");
            dialog2ContentPane.add(label18);
            label18.setBounds(new Rectangle(new Point(294, 100), label18.getPreferredSize()));
            dialog2ContentPane.add(textField17);
            textField17.setBounds(125, 213, 150, 30);
            dialog2ContentPane.add(textField18);
            textField18.setBounds(375, 13, 150, 30);

            //---- label19 ----
            label19.setText("\u4fe1\u8a89\u79ef\u5206\uff1a");
            dialog2ContentPane.add(label19);
            label19.setBounds(new Rectangle(new Point(294, 220), label19.getPreferredSize()));

            //---- label20 ----
            label20.setText("\u6635\u79f0\uff1a");
            dialog2ContentPane.add(label20);
            label20.setBounds(new Rectangle(new Point(318, 180), label20.getPreferredSize()));

            //---- label21 ----
            label21.setText("\u90ae\u7bb1\uff1a");
            dialog2ContentPane.add(label21);
            label21.setBounds(new Rectangle(new Point(318, 140), label21.getPreferredSize()));
            dialog2ContentPane.add(textField19);
            textField19.setBounds(375, 53, 150, 30);
            dialog2ContentPane.add(textField21);
            textField21.setBounds(375, 133, 150, 30);
            dialog2ContentPane.add(textField22);
            textField22.setBounds(375, 173, 150, 30);

            //---- label22 ----
            label22.setText("\u5bc6\u7801\uff1a");
            dialog2ContentPane.add(label22);
            label22.setBounds(new Rectangle(new Point(318, 20), label22.getPreferredSize()));

            //---- label23 ----
            label23.setText("\u8d26\u53f7\uff1a");
            dialog2ContentPane.add(label23);
            label23.setBounds(new Rectangle(new Point(74, 220), label23.getPreferredSize()));

            //---- label24 ----
            label24.setText("\u5934\u50cfURL\uff1a");
            dialog2ContentPane.add(label24);
            label24.setBounds(new Rectangle(new Point(51, 180), label24.getPreferredSize()));

            //---- label25 ----
            label25.setText("\u7535\u8bdd\uff1a");
            dialog2ContentPane.add(label25);
            label25.setBounds(new Rectangle(new Point(74, 140), label25.getPreferredSize()));

            //---- label26 ----
            label26.setText("\u5730\u5740\uff1a");
            dialog2ContentPane.add(label26);
            label26.setBounds(new Rectangle(new Point(74, 100), label26.getPreferredSize()));

            //---- label27 ----
            label27.setText("\u7528\u6237\u7f16\u53f7\uff1a");
            dialog2ContentPane.add(label27);
            label27.setBounds(new Rectangle(new Point(50, 20), label27.getPreferredSize()));

            //---- label28 ----
            label28.setText("text");
            dialog2ContentPane.add(label28);
            label28.setBounds(125, 18, 100, 20);

            //---- label30 ----
            label30.setText("text");
            dialog2ContentPane.add(label30);
            label30.setBounds(375, 96, 150, 25);

            //---- label32 ----
            label32.setText("text");
            dialog2ContentPane.add(label32);
            label32.setBounds(125, 176, 150, 25);

            //---- label33 ----
            label33.setText("text");
            dialog2ContentPane.add(label33);
            label33.setBounds(375, 216, 150, 25);

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
        label2.setIcon(Imagesinks.png("images/administrator/admin.png",75,75));
        label4.setIcon(Imagesinks.png("images/logo/logo.png",100,100));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button9;
    private JButton button8;
    private JButton button7;
    private JButton button6;
    private JPopupMenu.Separator separator1;
    private JLabel label5;
    private JTextField textField1;
    private JButton button5;
    private JButton button4;
    private JButton button3;
    private JButton button2;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label4;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JDialog dialog1;
    private JLabel label3;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField10;
    private JTextField textField11;
    private JButton button10;
    private JButton button11;
    private JLabel label29;
    private JLabel label31;
    private JDialog dialog2;
    private JButton button14;
    private JButton button15;
    private JLabel label16;
    private JTextField textField13;
    private JLabel label17;
    private JTextField textField14;
    private JTextField textField15;
    private JLabel label18;
    private JTextField textField17;
    private JTextField textField18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JTextField textField19;
    private JTextField textField21;
    private JTextField textField22;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JLabel label28;
    private JLabel label30;
    private JLabel label32;
    private JLabel label33;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
}
