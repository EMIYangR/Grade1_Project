/*
 * Created by JFormDesigner on Mon May 23 20:19:55 CST 2022
 */

package jw3.c1.view.SeverOrder;

import jdk.nashorn.internal.scripts.JO;
import jw3.c1.controller.Srcontroller;
import jw3.c1.model.Business;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.Imagesinks;
import jw3.c1.utils.QueryByClass;
import jw3.c1.utils.yzm;
import jw3.c1.view.login.LoginChoise;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Brainrain
 */
public class Server_Index extends JFrame {
    public static void main(String[] args) {
        new Server_Index();
    }
    public Server_Index() {
        setResizable(false);
        this.setBounds(140,40,1480,880);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        this.setVisible(false);
        new LoginChoise();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        panel2.setVisible(true);
        panel8.setVisible(false);
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        panel2.setVisible(false);
        panel8.setVisible(true);
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog2.setVisible(true);
        dialog2.setSize(350,140);
    }

    private void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.dispose();
    }

    private void button9MouseClicked(MouseEvent e) {
        // TODO add your code here
        passwordField1.setText("");
        passwordField2.setText("");
        textField9.setText("");
        dialog1.setVisible(true);
        dialog2.dispose();
        panel7.setVisible(false);
        textField19.setText(pd1);
    }

    private void button10MouseClicked(MouseEvent e) {
        // TODO add your code here
        Object[] oj= yzm.createImage();
        ImageIcon img = new ImageIcon((BufferedImage)oj[1]);
        label53.setIcon((Icon) img);
        pd1= String.valueOf(oj[0]);
        passwordField1.setText("");
        passwordField2.setText("");
        textField9.setText("");
        dialog1.setVisible(true);
        dialog2.dispose();
        panel7.setVisible(true);
        textField19.setText("");
    }

    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
        Business bs=new Business();
        String xpwd="";
        bs.setB_pwd(passwordField1.getText());
        xpwd=passwordField2.getText();
        if (bs.getB_pwd().equals("") && xpwd.equals("")){
            JOptionPane.showMessageDialog(null,"密码不能为空");
            return;
        }else {
            if (textField19.getText().equals("")){
                JOptionPane.showMessageDialog(null,"请输入验证码");
                return;
            }
            if ( textField19.getText().compareToIgnoreCase(pd1)!=0) {
                JOptionPane.showMessageDialog(null,"验证码错误");
                return;
            }
            if (! bs.getB_pwd().equals(xpwd)){
                JOptionPane.showMessageDialog(null,"输入不正确");
                passwordField1.setText("");
                passwordField2.setText("");
                return;
            }
            String sql="UPDATE business SET b_pwd=? WHERE b_id=?";
            if (DBConnection.zsg(sql,bs.getB_pwd(),src.getId())){
                JOptionPane.showMessageDialog(null,"修改成功");
                dialog1.dispose();
                passwordField1.setText("");
                passwordField2.setText("");
             }else {
                JOptionPane.showMessageDialog(null,"修改失败");
                passwordField1.setText("");
                passwordField2.setText("");
            }
        }
    }

    private void label5MouseClicked(MouseEvent e) {
        // TODO add your code here
        Object[] oj= yzm.createImage();
        ImageIcon img = new ImageIcon((BufferedImage)oj[1]);
        label53.setIcon((Icon) img);
        pd1= String.valueOf(oj[0]);
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here

        if (time.isRunning()){
                img=0;
                time.stop();
                button6.setText("惊喜模式");
                label10.setIcon(Imagesinks.png("images/Sever_icon/QQ图片.jpg",1560,880));
                ccolor(Color.black);
        }else {
            if (JOptionPane.showConfirmDialog(null,"确定开启惊喜模式吗?","",0)
                    ==0) {
                ccolor(Color.white);
                label10.setIcon(Imagesinks.png("images/Sever_icon/2123.gif_wh860.gif",1560,880));
                img++;
                button6.setText("关闭");
                time.start();
            }
        }

    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label2 = new JLabel();
        label3 = new JLabel();
        label12 = new JLabel();
        label9 = new JLabel();
        label8 = new JLabel();
        label7 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        panel6 = new JPanel();
        panel3 = new JPanel();
        label15 = new JLabel();
        label18 = new JLabel();
        textField6 = new JTextField();
        label19 = new JLabel();
        label20 = new JLabel();
        textField7 = new JTextField();
        label21 = new JLabel();
        panel4 = new JPanel();
        label22 = new JLabel();
        label23 = new JLabel();
        textField9 = new JTextField();
        label24 = new JLabel();
        label25 = new JLabel();
        textField10 = new JTextField();
        label26 = new JLabel();
        panel5 = new JPanel();
        label27 = new JLabel();
        label28 = new JLabel();
        textField11 = new JTextField();
        label29 = new JLabel();
        label30 = new JLabel();
        textField12 = new JTextField();
        label31 = new JLabel();
        label16 = new JLabel();
        textField5 = new JTextField();
        label14 = new JLabel();
        textField4 = new JTextField();
        label17 = new JLabel();
        textField8 = new JTextField();
        label11 = new JLabel();
        textField1 = new JTextField();
        panel8 = new JPanel();
        button2 = new JButton();
        label1 = new JLabel();
        button3 = new JButton();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        comboBox3 = new JComboBox<>();
        comboBox4 = new JComboBox<>();
        comboBox5 = new JComboBox<>();
        button1 = new JButton();
        panel2 = new JPanel();
        button4 = new JButton();
        panel1 = new JPanel();
        label13 = new JLabel();
        label32 = new JLabel();
        textField13 = new JTextField();
        label33 = new JLabel();
        label34 = new JLabel();
        textField14 = new JTextField();
        label35 = new JLabel();
        label36 = new JLabel();
        label37 = new JLabel();
        textField15 = new JTextField();
        label38 = new JLabel();
        label39 = new JLabel();
        textField16 = new JTextField();
        label40 = new JLabel();
        label41 = new JLabel();
        textField17 = new JTextField();
        label42 = new JLabel();
        textField18 = new JTextField();
        label43 = new JLabel();
        label44 = new JLabel();
        button5 = new JButton();
        button6 = new JButton();
        label10 = new JLabel();
        dialog1 = new JDialog();
        label45 = new JLabel();
        label46 = new JLabel();
        label47 = new JLabel();
        label48 = new JLabel();
        label49 = new JLabel();
        label50 = new JLabel();
        button7 = new JButton();
        button8 = new JButton();
        panel7 = new JPanel();
        label51 = new JLabel();
        textField19 = new JTextField();
        label53 = new JLabel();
        passwordField2 = new JPasswordField();
        passwordField1 = new JPasswordField();
        dialog2 = new JDialog();
        button9 = new JButton();
        button10 = new JButton();

        //======== this ========
        setTitle("__");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label2 ----
        label2.setText("\u56fe\u72472");
        contentPane.add(label2);
        label2.setBounds(415, 35, 120, 120);

        //---- label3 ----
        label3.setText("\u5c0f\u7ea2\u5e3d\u70b9\u9910\u7cfb\u7edf");
        label3.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 44));
        contentPane.add(label3);
        label3.setBounds(610, 45, 370, 110);

        //---- label12 ----
        label12.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
        contentPane.add(label12);
        label12.setBounds(150, 65, 155, 60);

        //---- label9 ----
        label9.setText("\u5185\u5bb93");
        label9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label9);
        label9.setBounds(1215, 130, 100, 40);

        //---- label8 ----
        label8.setText("\u5185\u5bb92");
        label8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label8);
        label8.setBounds(1215, 90, 100, 40);

        //---- label7 ----
        label7.setText("\u5185\u5bb91");
        label7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label7);
        label7.setBounds(1215, 50, 100, 40);

        //---- label4 ----
        label4.setText("\u6536\u76ca\uff1a");
        contentPane.add(label4);
        label4.setBounds(1070, 50, 100, 40);

        //---- label5 ----
        label5.setText("\u5165\u9a7b\u5e97\u94fa\uff1a");
        contentPane.add(label5);
        label5.setBounds(1070, 90, 100, 40);

        //---- label6 ----
        label6.setText("\u8ba2\u5355\u603b\u6570\uff1a");
        contentPane.add(label6);
        label6.setBounds(1070, 130, 100, 40);

        //======== panel6 ========
        {
            panel6.setOpaque(false);
            panel6.setLayout(null);

            //======== panel3 ========
            {
                panel3.setOpaque(false);
                panel3.setLayout(null);

                //---- label15 ----
                label15.setText("\u7528\u6237\u6ce8\u518c\u4fe1\u606f");
                label15.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel3.add(label15);
                label15.setBounds(0, 5, 220, 105);

                //---- label18 ----
                label18.setText("\u5df2\u6ce8\u518c\u7528\u6237\uff1a");
                label18.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel3.add(label18);
                label18.setBounds(0, 135, 170, 95);

                //---- textField6 ----
                textField6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                panel3.add(textField6);
                textField6.setBounds(150, 160, 100, 40);

                //---- label19 ----
                label19.setText("\u4eba");
                panel3.add(label19);
                label19.setBounds(270, 160, 50, 40);

                //---- label20 ----
                label20.setText("\u9ed1\u540d\u5355\uff1a");
                label20.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel3.add(label20);
                label20.setBounds(0, 245, 140, 135);

                //---- textField7 ----
                textField7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                panel3.add(textField7);
                textField7.setBounds(150, 290, 100, 42);

                //---- label21 ----
                label21.setText("\u4eba");
                panel3.add(label21);
                label21.setBounds(275, 295, 45, 35);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            panel6.add(panel3);
            panel3.setBounds(55, 220, 320, 410);

            //======== panel4 ========
            {
                panel4.setOpaque(false);
                panel4.setLayout(null);

                //---- label22 ----
                label22.setText("\u5e97\u94fa\u4fe1\u606f");
                label22.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel4.add(label22);
                label22.setBounds(0, 5, 220, 105);

                //---- label23 ----
                label23.setText("\u5df2\u6ce8\u518c\u5e97\u94fa\uff1a");
                label23.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel4.add(label23);
                label23.setBounds(0, 135, 170, 95);

                //---- textField9 ----
                textField9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                panel4.add(textField9);
                textField9.setBounds(150, 160, 100, 40);

                //---- label24 ----
                label24.setText("\u5bb6");
                panel4.add(label24);
                label24.setBounds(270, 160, 50, 40);

                //---- label25 ----
                label25.setText("\u5728\u8425\u4e1a\u5e97\u94fa\uff1a");
                label25.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel4.add(label25);
                label25.setBounds(0, 245, 155, 135);

                //---- textField10 ----
                textField10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                panel4.add(textField10);
                textField10.setBounds(150, 290, 100, 42);

                //---- label26 ----
                label26.setText("\u5bb6");
                panel4.add(label26);
                label26.setBounds(275, 295, 45, 35);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel4.getComponentCount(); i++) {
                        Rectangle bounds = panel4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel4.setMinimumSize(preferredSize);
                    panel4.setPreferredSize(preferredSize);
                }
            }
            panel6.add(panel4);
            panel4.setBounds(450, 220, 320, 410);

            //======== panel5 ========
            {
                panel5.setOpaque(false);
                panel5.setLayout(null);

                //---- label27 ----
                label27.setText("\u8ba2\u5355\u4fe1\u606f");
                label27.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel5.add(label27);
                label27.setBounds(0, 5, 220, 105);

                //---- label28 ----
                label28.setText("\u8ba2\u5355\u603b\u6570\uff1a");
                label28.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel5.add(label28);
                label28.setBounds(0, 135, 170, 95);

                //---- textField11 ----
                textField11.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                panel5.add(textField11);
                textField11.setBounds(150, 160, 100, 40);

                //---- label29 ----
                label29.setText("\u5355");
                panel5.add(label29);
                label29.setBounds(270, 160, 50, 40);

                //---- label30 ----
                label30.setText("\u4eca\u65e5\u8ba2\u5355\uff1a");
                label30.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel5.add(label30);
                label30.setBounds(0, 245, 155, 135);

                //---- textField12 ----
                textField12.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                panel5.add(textField12);
                textField12.setBounds(150, 290, 100, 42);

                //---- label31 ----
                label31.setText("\u5355");
                panel5.add(label31);
                label31.setBounds(275, 295, 45, 35);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel5.getComponentCount(); i++) {
                        Rectangle bounds = panel5.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel5.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel5.setMinimumSize(preferredSize);
                    panel5.setPreferredSize(preferredSize);
                }
            }
            panel6.add(panel5);
            panel5.setBounds(865, 220, 320, 410);

            //---- label16 ----
            label16.setText("\u56fe\u72473");
            label16.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(label16);
            label16.setBounds(350, 95, 110, 110);

            //---- textField5 ----
            textField5.setBorder(LineBorder.createBlackLineBorder());
            textField5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            panel6.add(textField5);
            textField5.setBounds(460, 95, 110, 110);

            //---- label14 ----
            label14.setText("\u56fe\u72473");
            label14.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(label14);
            label14.setBounds(650, 95, 110, 110);

            //---- textField4 ----
            textField4.setBorder(LineBorder.createBlackLineBorder());
            textField4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            panel6.add(textField4);
            textField4.setBounds(760, 95, 110, 110);

            //---- label17 ----
            label17.setText("\u56fe\u72473");
            label17.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(label17);
            label17.setBounds(940, 95, 110, 110);

            //---- textField8 ----
            textField8.setBorder(LineBorder.createBlackLineBorder());
            textField8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            panel6.add(textField8);
            textField8.setBounds(1050, 95, 110, 110);

            //---- label11 ----
            label11.setText("\u56fe\u72473");
            label11.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(label11);
            label11.setBounds(65, 95, 110, 110);

            //---- textField1 ----
            textField1.setBorder(LineBorder.createBlackLineBorder());
            textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            panel6.add(textField1);
            textField1.setBounds(175, 95, 110, 110);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel6.getComponentCount(); i++) {
                    Rectangle bounds = panel6.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel6.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel6.setMinimumSize(preferredSize);
                panel6.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel6);
        panel6.setBounds(215, 145, 1255, 630);

        //======== panel8 ========
        {
            panel8.setOpaque(false);
            panel8.setLayout(null);

            //---- button2 ----
            button2.setBackground(new Color(153, 153, 153));
            button2.setText(">");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel8.add(button2);
            button2.setBounds(0, 70, 30, 100);

            //---- label1 ----
            label1.setText("\u56fe\u72471");
            panel8.add(label1);
            label1.setBounds(45, 75, 100, 100);

            //---- button3 ----
            button3.setText("\u4e3b\u9875");
            button3.setOpaque(false);
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel8.add(button3);
            button3.setBounds(25, 235, 190, 60);

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u7528\u6237",
                "\u7528\u6237\u4fe1\u606f",
                "\u9ed1\u540d\u5355"
            }));
            comboBox1.setOpaque(false);
            panel8.add(comboBox1);
            comboBox1.setBounds(25, 310, 190, 60);

            //---- comboBox2 ----
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u5e97\u94fa",
                "\u5e97\u94fa\u7ba1\u7406"
            }));
            comboBox2.setOpaque(false);
            panel8.add(comboBox2);
            comboBox2.setBounds(25, 385, 190, 60);

            //---- comboBox3 ----
            comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u9910\u54c1",
                "\u9910\u54c1\u7ba1\u7406"
            }));
            comboBox3.setOpaque(false);
            panel8.add(comboBox3);
            comboBox3.setBounds(25, 460, 190, 60);

            //---- comboBox4 ----
            comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u8ba2\u5355",
                "\u8ba2\u5355\u4fe1\u606f"
            }));
            comboBox4.setOpaque(false);
            panel8.add(comboBox4);
            comboBox4.setBounds(25, 535, 190, 60);

            //---- comboBox5 ----
            comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u4f18\u60e0\u5238",
                "\u4f18\u60e0\u5238\u7ba1\u7406"
            }));
            comboBox5.setOpaque(false);
            panel8.add(comboBox5);
            comboBox5.setBounds(25, 605, 190, 60);

            //---- button1 ----
            button1.setText("<  \u9000\u51fa\u767b\u5f55");
            button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            button1.setOpaque(false);
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel8.add(button1);
            button1.setBounds(25, 675, 190, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel8.getComponentCount(); i++) {
                    Rectangle bounds = panel8.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel8.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel8.setMinimumSize(preferredSize);
                panel8.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel8);
        panel8.setBounds(0, -30, 260, 880);

        //======== panel2 ========
        {
            panel2.setOpaque(false);
            panel2.setLayout(null);

            //---- button4 ----
            button4.setText("<");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            panel2.add(button4);
            button4.setBounds(230, 80, 30, 100);

            //======== panel1 ========
            {
                panel1.setLayout(null);

                //---- label13 ----
                label13.setText("\u56fe\u72471");
                panel1.add(label13);
                label13.setBounds(10, 15, 100, 100);

                //---- label32 ----
                label32.setText("\u5df2\u6ce8\u518c\u7528\u6237\uff1a");
                label32.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                panel1.add(label32);
                label32.setBounds(10, 135, 95, 40);

                //---- textField13 ----
                textField13.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                panel1.add(textField13);
                textField13.setBounds(95, 145, 90, 30);

                //---- label33 ----
                label33.setText("\u4eba");
                panel1.add(label33);
                label33.setBounds(200, 145, 50, 40);

                //---- label34 ----
                label34.setText("\u9ed1\u540d\u5355\uff1a");
                label34.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                panel1.add(label34);
                label34.setBounds(10, 185, 95, 45);

                //---- textField14 ----
                textField14.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                panel1.add(textField14);
                textField14.setBounds(95, 195, 90, 30);

                //---- label35 ----
                label35.setText("\u4eba");
                panel1.add(label35);
                label35.setBounds(200, 195, 45, 35);

                //---- label36 ----
                label36.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
                panel1.add(label36);
                label36.setBounds(115, 45, 120, 60);

                //---- label37 ----
                label37.setText("\u5df2\u6ce8\u518c\u5e97\u94fa\uff1a");
                label37.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                panel1.add(label37);
                label37.setBounds(10, 235, 95, 45);

                //---- textField15 ----
                textField15.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                panel1.add(textField15);
                textField15.setBounds(95, 250, 90, 30);

                //---- label38 ----
                label38.setText("\u5bb6");
                panel1.add(label38);
                label38.setBounds(200, 250, 45, 40);

                //---- label39 ----
                label39.setText("\u5728\u8425\u4e1a\u5e97\u94fa\uff1a");
                label39.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                panel1.add(label39);
                label39.setBounds(10, 295, 95, 45);

                //---- textField16 ----
                textField16.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                panel1.add(textField16);
                textField16.setBounds(95, 305, 90, 30);

                //---- label40 ----
                label40.setText("\u5bb6");
                panel1.add(label40);
                label40.setBounds(200, 310, 45, 40);

                //---- label41 ----
                label41.setText("\u8ba2\u5355\u603b\u6570\uff1a");
                label41.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                panel1.add(label41);
                label41.setBounds(10, 360, 95, 45);

                //---- textField17 ----
                textField17.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                panel1.add(textField17);
                textField17.setBounds(95, 365, 90, 30);

                //---- label42 ----
                label42.setText("\u4eca\u65e5\u8ba2\u5355\uff1a");
                label42.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                panel1.add(label42);
                label42.setBounds(10, 415, 95, 45);

                //---- textField18 ----
                textField18.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                panel1.add(textField18);
                textField18.setBounds(95, 425, 90, 30);

                //---- label43 ----
                label43.setText("\u5355");
                panel1.add(label43);
                label43.setBounds(200, 360, 50, 40);

                //---- label44 ----
                label44.setText("\u5355");
                panel1.add(label44);
                label44.setBounds(200, 425, 45, 35);

                //---- button5 ----
                button5.setText("< \u4fee\u6539\u4e2a\u4eba\u4fe1\u606f");
                button5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button5MouseClicked(e);
                    }
                });
                panel1.add(button5);
                button5.setBounds(0, 805, 130, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            panel2.add(panel1);
            panel1.setBounds(0, 30, 230, 850);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel2.getComponentCount(); i++) {
                    Rectangle bounds = panel2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel2.setMinimumSize(preferredSize);
                panel2.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel2);
        panel2.setBounds(new Rectangle(new Point(0, -30), panel2.getPreferredSize()));

        //---- button6 ----
        button6.setText("\u60ca\u559c\u6a21\u5f0f");
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button6MouseClicked(e);
            }
        });
        contentPane.add(button6);
        button6.setBounds(1375, 5, 90, 45);

        //---- label10 ----
        label10.setIcon(new ImageIcon("D:\\Users\\EMI\\Desktop\\\u5c0f\u827e\u7c73\u7684\u82e6\u903c\u9879\u76ee\\\u5353\u8d8a\u9879\u76ee\u7ba1\u7406\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\Sever_icon\\QQ\u56fe\u7247.jpg"));
        contentPane.add(label10);
        label10.setBounds(0, -30, 1480, 880);

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

            //---- label45 ----
            label45.setText("\u59d3\u540d");
            dialog1ContentPane.add(label45);
            label45.setBounds(25, 20, 105, 45);

            //---- label46 ----
            label46.setText("text");
            dialog1ContentPane.add(label46);
            label46.setBounds(115, 25, 150, 40);

            //---- label47 ----
            label47.setText("text");
            dialog1ContentPane.add(label47);
            label47.setBounds(115, 75, 150, 40);

            //---- label48 ----
            label48.setText("\u8d26\u53f7");
            dialog1ContentPane.add(label48);
            label48.setBounds(25, 70, 105, 45);

            //---- label49 ----
            label49.setText("\u65b0\u5bc6\u7801");
            dialog1ContentPane.add(label49);
            label49.setBounds(25, 120, 105, 45);

            //---- label50 ----
            label50.setText("\u786e\u8ba4\u5bc6\u7801");
            dialog1ContentPane.add(label50);
            label50.setBounds(25, 170, 105, 45);

            //---- button7 ----
            button7.setText("\u786e\u5b9a");
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button7);
            button7.setBounds(new Rectangle(new Point(115, 275), button7.getPreferredSize()));

            //---- button8 ----
            button8.setText("\u8fd4\u56de");
            button8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button8MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button8);
            button8.setBounds(new Rectangle(new Point(5, 310), button8.getPreferredSize()));

            //======== panel7 ========
            {
                panel7.setLayout(null);

                //---- label51 ----
                label51.setText("\u9a8c\u8bc1\u7801");
                panel7.add(label51);
                label51.setBounds(0, 5, 60, 35);
                panel7.add(textField19);
                textField19.setBounds(85, 5, 110, 40);

                //---- label53 ----
                label53.setBorder(null);
                label53.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        label5MouseClicked(e);
                    }
                });
                panel7.add(label53);
                label53.setBounds(210, 5, 85, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel7.getComponentCount(); i++) {
                        Rectangle bounds = panel7.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel7.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel7.setMinimumSize(preferredSize);
                    panel7.setPreferredSize(preferredSize);
                }
            }
            dialog1ContentPane.add(panel7);
            panel7.setBounds(25, 220, 295, 45);
            dialog1ContentPane.add(passwordField2);
            passwordField2.setBounds(110, 175, 150, 40);
            dialog1ContentPane.add(passwordField1);
            passwordField1.setBounds(110, 125, 150, 40);

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

            //---- button9 ----
            button9.setText("\u4fee\u6539\u5bc6\u7801");
            button9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button9MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button9);
            button9.setBounds(new Rectangle(new Point(45, 35), button9.getPreferredSize()));

            //---- button10 ----
            button10.setText("\u5fd8\u8bb0\u5bc6\u7801");
            button10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button10MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button10);
            button10.setBounds(new Rectangle(new Point(215, 35), button10.getPreferredSize()));

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
//        主页信息
        QueryByClass q=new QueryByClass();
//        商家姓名
        label12.setText(src.getName());
        label36.setText(src.getName());
        label46.setText(src.getName());
//        商家账号
        label47.setText(src.getCount());
//        店铺数量
        textField9.setText(String.valueOf(src.selectcount("SELECT *FROM business a,mer b WHERE a.b_id=b.b_id AND b.b_id=?",true)));
        textField15.setText(String.valueOf(src.selectcount("SELECT *FROM business a,mer b WHERE a.b_id=b.b_id AND b.b_id=?",true)));
        label8.setText(String.valueOf(src.selectcount("SELECT *FROM business a,mer b WHERE a.b_id=b.b_id AND b.b_id=?",true)));
        textField5.setText(String.valueOf(src.selectcount("SELECT *FROM business a,mer b WHERE a.b_id=b.b_id AND b.b_id=?",true)));
//        总用户
        textField6.setText(String.valueOf(src.selectcount("select * from userinfo",false)));
        textField13.setText(String.valueOf(src.selectcount("select * from userinfo",false)));
        textField1.setText(String.valueOf(src.selectcount("select * from userinfo",false)));
//        订单数量
        textField4.setText(String.valueOf(src.selectcount("SELECT * FROM business a,mer b,orderlist c WHERE a.b_id=b.b_id" +
                " AND b.m_id=c.m_id AND b.b_id=?",true)));
        textField11.setText(String.valueOf(src.selectcount("SELECT * FROM business a,mer b,orderlist c WHERE a.b_id=b.b_id" +
                " AND b.m_id=c.m_id AND b.b_id=?",true)));
        textField17.setText(String.valueOf(src.selectcount("SELECT * FROM business a,mer b,orderlist c WHERE a.b_id=b.b_id" +
                " AND b.m_id=c.m_id AND b.b_id=?",true)));
        label9.setText(String.valueOf(src.selectcount("SELECT * FROM business a,mer b,orderlist c WHERE a.b_id=b.b_id " +
                "AND b.m_id=c.m_id AND b.b_id=?",true)));
//        总收益
        textField8.setText(String.valueOf(selectsumprice()));
        label7.setText(String.valueOf(selectsumprice()));
//        黑名单
        textField7.setText(String.valueOf(src.selectcount("select * from prestige where p_score<60",false)));
        textField14.setText(String.valueOf(src.selectcount("select * from prestige where p_score<60",false)));

//        今日订单
        textField12.setText(String.valueOf(src.selectcount("SELECT * FROM orderlist a,orderlist b,mer c,business d WHERE a.o_id=b.o_id AND b.m_id=c.m_id \n" +
                "AND c.b_id=d.b_id AND d.b_id=? AND SUBSTR(a.o_begintime FROM 1 FOR 10)=CURDATE();",true)));
        textField18.setText(String.valueOf(src.selectcount("SELECT * FROM orderlist a,orderlist b,mer c,business d WHERE a.o_id=b.o_id AND b.m_id=c.m_id \n" +
                "AND c.b_id=d.b_id AND d.b_id=? AND SUBSTR(a.o_begintime FROM 1 FOR 10)=CURDATE();",true)));

//        在营业餐厅
        textField10.setText(String.valueOf(src.selectcount("SELECT * FROM mer A,business b WHERE a.b_id=b.b_id AND b.b_id=? AND a.m_isorder='1'",true)));
        textField16.setText(String.valueOf(src.selectcount("SELECT * FROM mer A,business b WHERE a.b_id=b.b_id AND b.b_id=? AND a.m_isorder='1'",true)));
//       图片
        label1.setIcon(Imagesinks.png("images/Sever_icon/IMG_2.png",100,100));
        label13.setIcon(Imagesinks.png("images/Sever_icon/IMG_2.png",100,100));
        label2.setIcon(Imagesinks.png("images/Sever_icon/little-red-hood.png",120,120));
        label11.setIcon(Imagesinks.png("images/Sever_icon/IMG_3.png",110,110));
        label16.setIcon(Imagesinks.png("images/Sever_icon/IMG_4.png",110,110));
        label14.setIcon(Imagesinks.png("images/Sever_icon/IMG_5.png",110,110));
        label17.setIcon(Imagesinks.png("images/Sever_icon/IMG_6.png",110,110));
//        信息
        this.setBounds(100,20,1480,880);
        Prestige pt=new Prestige();
        Goods_info gs=new Goods_info();
        User_info uif=new User_info();
        Dp_info dp=new Dp_info();
        Order_info or=new Order_info();
        Discount_info di=new Discount_info();
        start(uif,dp,or,di,gs,pt);

        this.getContentPane().add(pt);
        this.getContentPane().add(gs);
        this.getContentPane().add(uif);
        this.getContentPane().add(dp);
        this.getContentPane().add(or);
        this.getContentPane().add(di);
        this.getContentPane().add(label10 );
        this.getContentPane().add(panel2,0);
        panel2.setVisible(false);

////        店铺信息
        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=comboBox2.getSelectedIndex();
                if (x==1){
                    close(uif,dp,or,di,gs,pt);
                    dp.setVisible(true);
                }
            }
        });
        comboBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=comboBox3.getSelectedIndex();
                if (x==1){
                    close(uif,dp,or,di,gs,pt);
                    gs.setVisible(true);
                }
            }
        });
////        订单信息
        comboBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=comboBox4.getSelectedIndex();
                if (x==1){
                    close(uif,dp,or,di,gs,pt);
                    or.setVisible(true);
                }
            }
        });
        //    优惠券管理
        comboBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=comboBox5.getSelectedIndex();
                    if (x==1){
                        close(uif,dp,or,di,gs,pt);
                        di.setVisible(true);
                    }
            }
        });
//        用户信息
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=comboBox1.getSelectedIndex();
                        if (x==1){
                            close(uif,dp,or,di,gs,pt);
                            uif.setVisible(true);
                        }else if (x==2){
                            close(uif,dp,or,di,gs,pt);
                            pt.showdata("");
                            pt.setVisible(true);
                        }
            }
        });
        button3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                close(uif,dp,or,di,gs,pt);
                panel6.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
        public void start(User_info uif,Dp_info dp,Order_info or,Discount_info di,Goods_info gs,Prestige pt){
            pt.setBounds(230,170,1400,600);
            gs.setBounds(230,170,1400,600);
            uif.setBounds(230,170,1400,600);
            dp.setBounds(230,170,1400,600);
            or.setBounds(230,170,1400,600);
            di.setBounds(230,170,1400,600);
            close(uif, dp, or, di, gs,pt);
            panel6.setVisible(true);
        }
        public void close(User_info uif,Dp_info dp,Order_info or,Discount_info di,Goods_info gs,Prestige pt){
            panel6.setVisible(false);
            pt.setVisible(false);
            dp.setVisible(false);
            or.setVisible(false);
            di.setVisible(false);
            uif.setVisible(false);
            gs.setVisible(false);
        }
    public double selectsumprice(){

        String sql="SELECT SUM(e.g_price) as sum FROM business a,mer b,orderlist c,orderdetails d,goods e WHERE a.b_id=b.b_id AND\n" +
                " b.m_id=c.m_id AND c.o_id=d.o_id AND d.g_id=e.g_id AND a.b_id=?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Double x = 0.0;
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,src.getId());
            rs = ps.executeQuery();
            while (rs.next()){
                x=rs.getDouble("sum");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public void ccolor(Color color){
        label1.setForeground(color);
        label12.setForeground(color);
        label3.setForeground(color);
        label4.setForeground(color);
        label5.setForeground(color);
        label6.setForeground(color);
        label7.setForeground(color);
        label8.setForeground(color);
        label9.setForeground(color);
        label15.setForeground(color);
        label18.setForeground(color);
        label20.setForeground(color);
        label22.setForeground(color);
        label23.setForeground(color);
        label25.setForeground(color);
        label27.setForeground(color);
        label28.setForeground(color);
        label30.setForeground(color);
        label19.setForeground(color);
        label21.setForeground(color);
        label24.setForeground(color);
        label26.setForeground(color);
        label29.setForeground(color);
        label31.setForeground(color);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label2;
    private JLabel label3;
    private JLabel label12;
    private JLabel label9;
    private JLabel label8;
    private JLabel label7;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JPanel panel6;
    private JPanel panel3;
    private JLabel label15;
    private JLabel label18;
    private JTextField textField6;
    private JLabel label19;
    private JLabel label20;
    private JTextField textField7;
    private JLabel label21;
    private JPanel panel4;
    private JLabel label22;
    private JLabel label23;
    private JTextField textField9;
    private JLabel label24;
    private JLabel label25;
    private JTextField textField10;
    private JLabel label26;
    private JPanel panel5;
    private JLabel label27;
    private JLabel label28;
    private JTextField textField11;
    private JLabel label29;
    private JLabel label30;
    private JTextField textField12;
    private JLabel label31;
    private JLabel label16;
    private JTextField textField5;
    private JLabel label14;
    private JTextField textField4;
    private JLabel label17;
    private JTextField textField8;
    private JLabel label11;
    private JTextField textField1;
    private JPanel panel8;
    private JButton button2;
    private JLabel label1;
    private JButton button3;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JComboBox<String> comboBox3;
    private JComboBox<String> comboBox4;
    private JComboBox<String> comboBox5;
    private JButton button1;
    private JPanel panel2;
    private JButton button4;
    private JPanel panel1;
    private JLabel label13;
    private JLabel label32;
    private JTextField textField13;
    private JLabel label33;
    private JLabel label34;
    private JTextField textField14;
    private JLabel label35;
    private JLabel label36;
    private JLabel label37;
    private JTextField textField15;
    private JLabel label38;
    private JLabel label39;
    private JTextField textField16;
    private JLabel label40;
    private JLabel label41;
    private JTextField textField17;
    private JLabel label42;
    private JTextField textField18;
    private JLabel label43;
    private JLabel label44;
    private JButton button5;
    private JButton button6;
    private JLabel label10;
    private JDialog dialog1;
    private JLabel label45;
    private JLabel label46;
    private JLabel label47;
    private JLabel label48;
    private JLabel label49;
    private JLabel label50;
    private JButton button7;
    private JButton button8;
    private JPanel panel7;
    private JLabel label51;
    private JTextField textField19;
    private JLabel label53;
    private JPasswordField passwordField2;
    private JPasswordField passwordField1;
    private JDialog dialog2;
    private JButton button9;
    private JButton button10;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    String usercount;
    int userid;
    Srcontroller src=Srcontroller.src;
    public static String pd1="";
    int img=0;
    Timer time=new Timer(6000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            img++;
            if (img==6){
                img=1;
            }
            switch (img){
                case 1:
                    label10.setIcon(Imagesinks.png("images/Sever_icon/2123.gif_wh860.gif",1560,880));
                    break;
                case 2:
                    label10.setIcon(Imagesinks.png("images/Sever_icon/6264.gif_wh860.gif",1560,880));
                    break;
                case 3:
                    label10.setIcon(Imagesinks.png("images/Sever_icon/9969.gif_wh860.gif",1560,880));
                    break;
                case 4:
                    label10.setIcon(Imagesinks.png("images/Sever_icon/m1.gif",1560,880));
                    break;
                case 5:
                    label10.setIcon(Imagesinks.png("images/Sever_icon/m2.gif",1560,880));
                    break;
            }
        }
    });
}
