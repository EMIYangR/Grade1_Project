/*
 * Created by JFormDesigner on Fri May 20 10:54:33 CST 2022
 */

package jw3.c1.view;

import java.awt.event.*;

import jw3.c1.controller.*;
import jw3.c1.model.Goods;
import jw3.c1.model.Mer;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author Brainrain
 */
public class Index extends JFrame {
    public Index() {
        initComponents();
        this.toFront();
        this.setSize(1200,700);
        this.setLocationRelativeTo(null);
//        this.setResizable(false);
        this.setBounds(200,200,1000,650);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void showData(String name){
        //方式一：一维数组作为表头、二维数组作为数据  缺陷:需要初始化长度、无法动态增删
        //方式二: 给表格设置模型,使用Vector<Object>完成
        //1、表头
        Vector<Object> heads=new Vector<Object>();
        heads.add("店铺ID");
        heads.add("店铺名称");
        heads.add("店铺介绍");
        heads.add("店铺类型");
        heads.add("店铺地址");
        heads.add("店铺电话");
        heads.add("是否支持点餐");
        //2、表数据
        data= MerController.getAll(name);
        //3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm=new DefaultTableModel(data,heads);
        table1.setModel(dtm);
        //table1=new JTable(dtm);   等同上面，但会增加开销
    }
    private void button2MouseClicked(MouseEvent e) {
        new UserProfile();
        dispose();
    }

    private void button1MouseClicked(MouseEvent e) {
        new Oderfrom();
        dispose();
    }

    private void button7MouseClicked(MouseEvent e) {
        new ShoppingTrolley1();
        dispose();
    }

    private void button5MouseClicked(MouseEvent e) {
        Inquireface i=new Inquireface();
        i.showData(userinfo.getU_id());
        i.setVisible(false);
        new Inquireface();
        dispose();
    }

    private void button8MouseClicked(MouseEvent e) {
        new wssj();
        dispose();
    }

    private void button9MouseClicked(MouseEvent e) {
        new UserLogin();
        dispose();
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        showData(textField1.getText());
        dialog1.setModal(true);
        dialog1.setVisible(true);
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents"<html>"+"地址:"+dz+"<br />"+"<html>"
        panel1 = new JPanel();
        label2 = new JLabel();
        button1 = new JButton();
        button5 = new JButton();
        button7 = new JButton();
        label23 = new JLabel();
        button2 = new JButton();
        label16 = new JLabel();
        button8 = new JButton();
        button9 = new JButton();
        panel2 = new JPanel();
        textField1 = new JTextField();
        button6 = new JButton();
        panel4 = new JPanel();
        label9 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        panel5 = new JPanel();
        label13 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        label26 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        label1 = new JLabel();
        label3 = new JLabel();
        dialog1 = new JDialog();
        label4 = new JLabel();
        panel3 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button3 = new JButton();

        //======== this ========
        setIconImage(new ImageIcon("C:\\Users\\admin\\Desktop\\\u65b0\u5efa\u6587\u4ef6\u5939 (5)\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\logo\\logo.png").getImage());
        setTitle("\u4e3b\u754c\u9762");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setOpaque(false);
            panel1.setLayout(null);

            //---- label2 ----
            label2.setText("\u6635\u79f0\uff1a");
            panel1.add(label2);
            label2.setBounds(10, 85, 55, 30);

            //---- button1 ----
            button1.setText("\u70b9\u9910");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(10, 130, 160, 70);

            //---- button5 ----
            button5.setText("\u8ba2\u5355\u67e5\u8be2");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            panel1.add(button5);
            button5.setBounds(10, 280, 160, 70);

            //---- button7 ----
            button7.setText("\u8d2d\u7269\u8f66");
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }
            });
            panel1.add(button7);
            button7.setBounds(10, 355, 160, 70);

            //---- label23 ----
            label23.setText("text");
            panel1.add(label23);
            label23.setBounds(60, 85, 115, 30);

            //---- button2 ----
            button2.setText("\u4e2a\u4eba\u4fe1\u606f");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(10, 205, 160, 70);
            panel1.add(label16);
            label16.setBounds(10, 5, 145, 80);

            //---- button8 ----
            button8.setText("\u6211\u662f\u5546\u5bb6");
            button8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button8MouseClicked(e);
                }
            });
            panel1.add(button8);
            button8.setBounds(10, 430, 160, 70);

            //---- button9 ----
            button9.setText("\u9000\u51fa\u767b\u5f55");
            button9.setBackground(new Color(255, 51, 51));
            button9.setForeground(Color.red);
            button9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button9MouseClicked(e);
                }
            });
            panel1.add(button9);
            button9.setBounds(10, 505, 160, 50);

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
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 190, 585);

        //======== panel2 ========
        {
            panel2.setLayout(null);
            panel2.add(textField1);
            textField1.setBounds(80, 10, 475, 40);

            //---- button6 ----
            button6.setText("\u641c\u7d22\u5e97\u94fa");
            button6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            panel2.add(button6);
            button6.setBounds(555, 10, 130, 40);

            //======== panel4 ========
            {
                panel4.setOpaque(false);
                panel4.setLayout(null);

                //---- label9 ----
                label9.setText("\u9910\u5385\u56fe\u7247");
                label9.setOpaque(true);
                panel4.add(label9);
                label9.setBounds(15, 15, 150, 135);

                //---- label11 ----
                label11.setText("\u8be6\u60c5");
                label11.setVerticalAlignment(SwingConstants.TOP);
                label11.setOpaque(true);
                panel4.add(label11);
                label11.setBounds(190, 15, 250, 110);

                //---- label12 ----
                label12.setText("\u5730\u5740");
                label12.setOpaque(true);
                panel4.add(label12);
                label12.setBounds(190, 125, 250, 65);

                //---- label14 ----
                label14.setText("phone");
                label14.setOpaque(true);
                panel4.add(label14);
                label14.setBounds(260, 195, 120, 25);

                //---- label15 ----
                label15.setText("\u63a8\u8350\u83dc\u56fe\u7247");
                label15.setOpaque(true);
                panel4.add(label15);
                label15.setBounds(545, 30, 145, 100);

                //---- label18 ----
                label18.setText("\u83dc\u540d");
                label18.setOpaque(true);
                panel4.add(label18);
                label18.setBounds(545, 160, 85, 25);

                //---- label19 ----
                label19.setText("\u9910\u5385\u540d\u79f0");
                label19.setHorizontalAlignment(SwingConstants.CENTER);
                label19.setOpaque(true);
                panel4.add(label19);
                label19.setBounds(15, 155, 155, 40);

                //---- label20 ----
                label20.setText("\u7535\u8bdd\uff1a");
                label20.setOpaque(true);
                panel4.add(label20);
                label20.setBounds(190, 195, 50, 25);

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
            panel2.add(panel4);
            panel4.setBounds(20, 340, 800, 225);

            //======== panel5 ========
            {
                panel5.setOpaque(false);
                panel5.setLayout(null);

                //---- label13 ----
                label13.setText("\u9910\u5385\u56fe\u7247");
                label13.setOpaque(true);
                panel5.add(label13);
                label13.setBounds(15, 5, 150, 135);

                //---- label21 ----
                label21.setText("\u8be6\u60c5");
                label21.setHorizontalAlignment(SwingConstants.LEFT);
                label21.setVerticalAlignment(SwingConstants.TOP);
                label21.setOpaque(true);
                panel5.add(label21);
                label21.setBounds(190, 15, 250, 110);

                //---- label22 ----
                label22.setText("\u5730\u5740");
                label22.setOpaque(true);
                panel5.add(label22);
                label22.setBounds(190, 125, 250, 65);

                //---- label24 ----
                label24.setText("phone");
                label24.setOpaque(true);
                panel5.add(label24);
                label24.setBounds(265, 195, 120, 25);

                //---- label25 ----
                label25.setText("\u63a8\u8350\u83dc\u56fe\u7247");
                label25.setOpaque(true);
                panel5.add(label25);
                label25.setBounds(545, 30, 145, 100);

                //---- label26 ----
                label26.setText("\u83dc\u540d");
                label26.setOpaque(true);
                panel5.add(label26);
                label26.setBounds(545, 160, 85, 25);

                //---- label27 ----
                label27.setText("\u9910\u5385\u540d\u79f0");
                label27.setHorizontalAlignment(SwingConstants.CENTER);
                label27.setOpaque(true);
                panel5.add(label27);
                label27.setBounds(15, 155, 155, 40);

                //---- label28 ----
                label28.setText("\u7535\u8bdd\uff1a");
                label28.setOpaque(true);
                panel5.add(label28);
                label28.setBounds(190, 195, 50, 25);

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
            panel2.add(panel5);
            panel5.setBounds(20, 100, 800, 225);

            //---- label1 ----
            label1.setOpaque(true);
            panel2.add(label1);
            label1.setBounds(20, 100, 800, 225);

            //---- label3 ----
            label3.setOpaque(true);
            panel2.add(label3);
            label3.setBounds(20, 340, 800, 225);

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
        panel2.setBounds(205, 0, 820, 595);

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

            //---- label4 ----
            label4.setText("\u641c\u7d22\u5230\uff1a");
            label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
            dialog1ContentPane.add(label4);
            label4.setBounds(15, 10, 120, 60);

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //======== scrollPane1 ========
                {

                    //---- table1 ----
                    table1.setPreferredScrollableViewportSize(new Dimension(1150, 390));
                    scrollPane1.setViewportView(table1);
                }
                panel3.add(scrollPane1);
                scrollPane1.setBounds(new Rectangle(new Point(25, 15), scrollPane1.getPreferredSize()));

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
            dialog1ContentPane.add(panel3);
            panel3.setBounds(10, 150, 1200, 400);

            //---- button3 ----
            button3.setText("\u8fd4\u56de");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button3);
            button3.setBounds(25, 80, 85, 45);

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
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        //背景图片
        Icon i=Imagesinks.png("images/background/indexbj.jpg",1200,800);
        label1.setIcon(i);
        label3.setIcon(i);

        userinfo=UserinfoController.user(zh);
        label23.setText(userinfo.getU_nickname());
        Userinfo U=UserinfoController.user(Index.zh);
        label16.setIcon(Imagesinks.png("images/tx/"+U.getU_headimage(),100,100));
        mer= MerController.sel();
        //图片
        String url="images/mer/"+(mer.get(0).getM_url());
        String url1="images/mer/"+(mer.get(1).getM_url());
//        店名
        String name=mer.get(0).getM_name();
        String name1=mer.get(1).getM_name();
//        详情
        String xq=mer.get(0).getM_des();
        String xq1=mer.get(1).getM_des();
//        地址
        String dz=mer.get(0).getM_address();
        String dz1=mer.get(1).getM_address();
//        电话
        String dh=mer.get(0).getM_phone();
        String dh1=mer.get(1).getM_phone();
//        图片
//        店铺1
//        Icon icon=new ImageIcon(url);
        label13.setIcon(Imagesinks.png(url,100,100));
        label13.setText("");
        label27.setText("<html>"+name+"<br />"+"<html>");
        label21.setText("<html>"+xq+"<br />"+"<html>");
        label22.setText("<html>"+"地址:"+dz+"<br />"+"<html>");
        label24.setText(dh);
        List<Goods> goods= GoodsController.sel(mer.get(0).getM_id());
        String gurl="images/goods/"+(goods.get(0).getG_url());
//        Icon gicon=new ImageIcon(gurl);
        label25.setIcon(Imagesinks.png(gurl,100,100));
        label25.setText("");
        label18.setText(goods.get(0).getG_name());

//        店铺2
//        Icon icon1=new ImageIcon();
        label9.setIcon(Imagesinks.png(url1,100,100));
        label9.setText("");
        label19.setText("<html>"+name1+"<br />"+"<html>");
        label11.setText("<html>"+xq1+"<br />"+"<html>");
        label12.setText("<html>"+"地址:"+dz1+"<br />"+"<html>");
        label14.setText(dh1);
        List<Goods> goods1= GoodsController.sel(mer.get(1).getM_id());
        String gurl1="images/goods/"+(goods1.get(0).getG_url());
//        Icon gicon1=new ImageIcon(gurl1);
        label15.setIcon(Imagesinks.png(gurl1,100,100));
        label15.setText("");
        label26.setText(goods1.get(0).getG_name());
        if(BusinessController.iscx()){
            button8.setEnabled(true);
            button8.setVisible(true);
        }else {
            button8.setEnabled(false);
            button8.setVisible(false);
        }
        }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label2;
    private JButton button1;
    private JButton button5;
    private JButton button7;
    private JLabel label23;
    private JButton button2;
    private JLabel label16;
    private JButton button8;
    private JButton button9;
    private JPanel panel2;
    private JTextField textField1;
    private JButton button6;
    private JPanel panel4;
    private JLabel label9;
    private JLabel label11;
    private JLabel label12;
    private JLabel label14;
    private JLabel label15;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JPanel panel5;
    private JLabel label13;
    private JLabel label21;
    private JLabel label22;
    private JLabel label24;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JLabel label28;
    private JLabel label1;
    private JLabel label3;
    private JDialog dialog1;
    private JLabel label4;
    private JPanel panel3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static Userinfo userinfo;
    public static String zh;
    public static List<Mer> mer;
    private Image image = null;
    private static Vector<Vector<Object>> data;
    public void BackgroundPanel(Image image) {
        this.image = image;
    }
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
