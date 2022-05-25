/*
 * Created by JFormDesigner on Fri May 20 10:54:33 CST 2022
 */

package jw3.c1.view;

import java.awt.event.*;

import jw3.c1.controller.GoodsController;
import jw3.c1.controller.MerController;
import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Goods;
import jw3.c1.model.Mer;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Index extends JFrame {
    public Index() {
        initComponents();
        this.setSize(950,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label2 = new JLabel();
        button1 = new JButton();
        button5 = new JButton();
        button7 = new JButton();
        label23 = new JLabel();
        button2 = new JButton();
        label16 = new JLabel();
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

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label2 ----
            label2.setText("\u6635\u79f0\uff1a");
            panel1.add(label2);
            label2.setBounds(10, 85, 55, 30);

            //---- button1 ----
            button1.setText("\u70b9\u9910");
            panel1.add(button1);
            button1.setBounds(10, 130, 160, 70);

            //---- button5 ----
            button5.setText("\u8ba2\u5355\u67e5\u8be2");
            panel1.add(button5);
            button5.setBounds(10, 280, 160, 70);

            //---- button7 ----
            button7.setText("\u8d2d\u7269\u8f66");
            panel1.add(button7);
            button7.setBounds(10, 355, 160, 70);

            //---- label23 ----
            label23.setText("text");
            panel1.add(label23);
            label23.setBounds(60, 85, 115, 30);

            //---- button2 ----
            button2.setText("\u4e2a\u4eba\u4fe1\u606f");
            panel1.add(button2);
            button2.setBounds(10, 205, 160, 70);

            //---- label16 ----
            label16.setText("\u7528\u6237\u5934\u50cf");
            panel1.add(label16);
            label16.setBounds(10, 5, 145, 80);

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
        panel1.setBounds(0, 0, 190, 435);

        //======== panel2 ========
        {
            panel2.setLayout(null);
            panel2.add(textField1);
            textField1.setBounds(0, 5, 310, 30);

            //---- button6 ----
            button6.setText("\u641c\u7d22");
            panel2.add(button6);
            button6.setBounds(310, 5, 65, button6.getPreferredSize().height);

            //======== panel4 ========
            {
                panel4.setLayout(null);

                //---- label9 ----
                label9.setText("\u9910\u5385\u56fe\u7247");
                panel4.add(label9);
                label9.setBounds(0, 15, 115, 105);

                //---- label11 ----
                label11.setText("\u8be6\u60c5");
                panel4.add(label11);
                label11.setBounds(125, 15, 250, 35);

                //---- label12 ----
                label12.setText("\u5730\u5740");
                panel4.add(label12);
                label12.setBounds(125, 70, 250, 35);

                //---- label14 ----
                label14.setText("phone");
                panel4.add(label14);
                label14.setBounds(245, 125, 120, 25);

                //---- label15 ----
                label15.setText("\u63a8\u8350\u83dc\u56fe\u7247");
                panel4.add(label15);
                label15.setBounds(390, 10, 145, 100);

                //---- label18 ----
                label18.setText("\u83dc\u540d");
                panel4.add(label18);
                label18.setBounds(390, 125, 85, 25);

                //---- label19 ----
                label19.setText("\u9910\u5385\u540d\u79f0");
                panel4.add(label19);
                label19.setBounds(0, 125, 155, 25);

                //---- label20 ----
                label20.setText("\u7535\u8bdd\uff1a");
                panel4.add(label20);
                label20.setBounds(185, 125, 50, 25);

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
            panel4.setBounds(20, 240, 570, 160);

            //======== panel5 ========
            {
                panel5.setLayout(null);

                //---- label13 ----
                label13.setText("\u9910\u5385\u56fe\u7247");
                panel5.add(label13);
                label13.setBounds(0, 15, 115, 105);

                //---- label21 ----
                label21.setText("\u8be6\u60c5");
                panel5.add(label21);
                label21.setBounds(125, 15, 250, 35);

                //---- label22 ----
                label22.setText("\u5730\u5740");
                panel5.add(label22);
                label22.setBounds(125, 70, 250, 35);

                //---- label24 ----
                label24.setText("phone");
                panel5.add(label24);
                label24.setBounds(245, 125, 120, 25);

                //---- label25 ----
                label25.setText("\u63a8\u8350\u83dc\u56fe\u7247");
                panel5.add(label25);
                label25.setBounds(390, 10, 145, 100);

                //---- label26 ----
                label26.setText("\u83dc\u540d");
                panel5.add(label26);
                label26.setBounds(390, 120, 85, 25);

                //---- label27 ----
                label27.setText("\u9910\u5385\u540d\u79f0");
                panel5.add(label27);
                label27.setBounds(0, 125, 155, 25);

                //---- label28 ----
                label28.setText("\u7535\u8bdd\uff1a");
                panel5.add(label28);
                label28.setBounds(185, 125, 50, 25);

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
            panel5.setBounds(20, 55, 570, 160);

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
        panel2.setBounds(205, 0, 490, 420);

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
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        userinfo=UserinfoController.user(zh);
        label23.setText(userinfo.getU_nickname());
        Icon tx=new ImageIcon("images/mer/甜点.png");
        label16.setIcon(tx);
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
        Icon icon=new ImageIcon(url);
        label13.setIcon(icon);
        label27.setText(name);
        label21.setText(xq);
        label22.setText(dz);
        label24.setText(dh);
        List<Goods> goods= GoodsController.sel(mer.get(0).getM_id());
        String gurl="images/goods/"+(goods.get(0).getG_url());
        Icon gicon=new ImageIcon(gurl);
        label25.setIcon(gicon);
        label18.setText(goods.get(0).getG_name());

//        店铺2
        Icon icon1=new ImageIcon(url1);
        label9.setIcon(icon1);
        label19.setText(name1);
        label11.setText(xq1);
        label12.setText(dz1);
        label14.setText(dh1);
        List<Goods> goods1= GoodsController.sel(mer.get(1).getM_id());
        String gurl1="images/goods/"+(goods1.get(0).getG_url());
        Icon gicon1=new ImageIcon(gurl1);
        label15.setIcon(gicon1);
        label26.setText(goods1.get(0).getG_name());
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static Userinfo userinfo;
    public static String zh;
    public static List<Mer> mer;
}
