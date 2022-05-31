/*
 * Created by JFormDesigner on Mon May 23 20:19:55 CST 2022
 */

package jw3.c1.view;
import java.awt.event.*;
import jw3.c1.utils.Imagesinks;
import jw3.c1.utils.QueryByClass;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author Brainrain
 */
public class Server_Index extends JFrame {
    public static void main(String[] args) {
        Server_Index w=new Server_Index();
    }
    public Server_Index() {
        this.setSize(1000,800);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
    }
    public static void close(){
        Order_info order_info=new Order_info();
        order_info.setVisible(false);
    }

    private void button1MouseClicked(MouseEvent e) {
        BusinessLogin b=new BusinessLogin();
        dispose();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label2 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label3 = new JLabel();
        panel7 = new JPanel();
        label1 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        panel2 = new JPanel();
        comboBox1 = new JComboBox<>();
        label10 = new JLabel();
        comboBox2 = new JComboBox<>();
        comboBox3 = new JComboBox<>();
        comboBox4 = new JComboBox<>();
        button2 = new JButton();
        comboBox5 = new JComboBox<>();
        panel6 = new JPanel();
        label11 = new JLabel();
        textField1 = new JTextField();
        label14 = new JLabel();
        textField4 = new JTextField();
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
        label25 = new JLabel();
        textField9 = new JTextField();
        label26 = new JLabel();
        label27 = new JLabel();
        textField10 = new JTextField();
        label28 = new JLabel();
        panel5 = new JPanel();
        label29 = new JLabel();
        label30 = new JLabel();
        textField11 = new JTextField();
        label31 = new JLabel();
        label32 = new JLabel();
        textField12 = new JTextField();
        label33 = new JLabel();
        textField5 = new JTextField();
        label16 = new JLabel();
        label17 = new JLabel();
        textField8 = new JTextField();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBorder(null);
            panel1.setLayout(null);

            //---- label2 ----
            label2.setText("\u56fe\u72472");
            panel1.add(label2);
            label2.setBounds(290, 10, 100, 100);

            //---- label4 ----
            label4.setText("\u6536\u76ca\uff1a");
            panel1.add(label4);
            label4.setBounds(980, 5, 90, 30);

            //---- label5 ----
            label5.setText("\u5165\u9a7b\u5e97\u94fa\uff1a");
            panel1.add(label5);
            label5.setBounds(980, 40, 110, 30);

            //---- label6 ----
            label6.setText("\u6ce8\u518c\u7528\u6237\uff1a");
            panel1.add(label6);
            label6.setBounds(980, 70, 130, 30);

            //---- label7 ----
            label7.setText("\u5185\u5bb91");
            panel1.add(label7);
            label7.setBounds(1080, 15, 55, 25);

            //---- label8 ----
            label8.setText("\u5185\u5bb92");
            panel1.add(label8);
            label8.setBounds(1080, 45, 55, 25);

            //---- label9 ----
            label9.setText("\u5185\u5bb93");
            panel1.add(label9);
            label9.setBounds(1080, 70, 55, 25);

            //---- label3 ----
            label3.setText("\u5c0f\u7ea2\u5e3d\u70b9\u9910\u7cfb\u7edf");
            label3.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 24));
            panel1.add(label3);
            label3.setBounds(475, 0, 225, 110);

            //======== panel7 ========
            {
                panel7.setBorder(null);
                panel7.setLayout(null);

                //---- label1 ----
                label1.setText("\u56fe\u72471");
                panel7.add(label1);
                label1.setBounds(30, 25, 60, 60);

                //---- label12 ----
                label12.setText("text");
                panel7.add(label12);
                label12.setBounds(105, 20, 45, 30);

                //---- label13 ----
                label13.setText("text");
                panel7.add(label13);
                label13.setBounds(105, 65, 35, 25);

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
            panel1.add(panel7);
            panel7.setBounds(0, 0, 150, 110);

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
        panel1.setBounds(0, 0, 1145, panel1.getPreferredSize().height);

        //======== panel2 ========
        {
            panel2.setBorder(null);
            panel2.setLayout(null);

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u7528\u6237",
                "\u7528\u6237\u7ba1\u7406",
                "\u9ed1\u540d\u5355"
            }));
            panel2.add(comboBox1);
            comboBox1.setBounds(20, 85, 130, 45);

            //---- label10 ----
            label10.setText("      \u4e3b\u9875");
            panel2.add(label10);
            label10.setBounds(15, 20, 125, 70);

            //---- comboBox2 ----
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u5e97\u94fa",
                "\u5e97\u94fa\u7ba1\u7406",
                "\u5e97\u94fa\u5ba1\u6838"
            }));
            panel2.add(comboBox2);
            comboBox2.setBounds(20, 135, 130, 45);

            //---- comboBox3 ----
            comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u5957\u9910",
                "\u5957\u9910\u7ba1\u7406"
            }));
            panel2.add(comboBox3);
            comboBox3.setBounds(20, 185, 130, 45);

            //---- comboBox4 ----
            comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u8ba2\u5355",
                "\u8ba2\u5355\u7ba1\u7406"
            }));
            panel2.add(comboBox4);
            comboBox4.setBounds(20, 235, 130, 45);

            //---- button2 ----
            button2.setText("\u6536\u76ca");
            panel2.add(button2);
            button2.setBounds(20, 340, 130, 45);

            //---- comboBox5 ----
            comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u4f18\u60e0\u5238",
                "\u4f18\u60e0\u5238\u7ba1\u7406"
            }));
            panel2.add(comboBox5);
            comboBox5.setBounds(20, 285, 130, 45);

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
        panel2.setBounds(0, 110, 150, 580);

        //======== panel6 ========
        {
            panel6.setLayout(null);

            //---- label11 ----
            label11.setText("\u56fe\u72473");
            label11.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(label11);
            label11.setBounds(40, 50, 100, 100);

            //---- textField1 ----
            textField1.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(textField1);
            textField1.setBounds(140, 50, 100, 100);

            //---- label14 ----
            label14.setText("\u56fe\u72473");
            label14.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(label14);
            label14.setBounds(535, 55, 100, 100);

            //---- textField4 ----
            textField4.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(textField4);
            textField4.setBounds(635, 55, 100, 100);

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //---- label15 ----
                label15.setText("\u7528\u6237\u6ce8\u518c\u4fe1\u606f");
                panel3.add(label15);
                label15.setBounds(0, 5, 165, 65);

                //---- label18 ----
                label18.setText("\u5df2\u6ce8\u518c\u7528\u6237\uff1a");
                panel3.add(label18);
                label18.setBounds(0, 90, 85, 55);
                panel3.add(textField6);
                textField6.setBounds(90, 95, 85, 40);

                //---- label19 ----
                label19.setText("\u4eba");
                panel3.add(label19);
                label19.setBounds(185, 95, 50, 40);

                //---- label20 ----
                label20.setText("\u9ed1\u540d\u5355\uff1a");
                panel3.add(label20);
                label20.setBounds(0, 185, 80, 65);
                panel3.add(textField7);
                textField7.setBounds(90, 195, 85, 42);

                //---- label21 ----
                label21.setText("\u4eba");
                panel3.add(label21);
                label21.setBounds(190, 200, 45, 35);

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
            panel3.setBounds(30, 195, 244, 287);

            //======== panel4 ========
            {
                panel4.setLayout(null);

                //---- label22 ----
                label22.setText("\u5e97\u94fa\u5165\u9a7b\u4fe1\u606f");
                panel4.add(label22);
                label22.setBounds(0, -5, 165, 65);

                //---- label25 ----
                label25.setText("\u5df2\u5165\u9a7b\u5e97\u94fa\uff1a");
                panel4.add(label25);
                label25.setBounds(0, 75, 95, 55);
                panel4.add(textField9);
                textField9.setBounds(105, 80, 75, 43);

                //---- label26 ----
                label26.setText("\u5bb6");
                panel4.add(label26);
                label26.setBounds(185, 85, 45, 33);

                //---- label27 ----
                label27.setText("\u9ed1\u540d\u5355\uff1a");
                panel4.add(label27);
                label27.setBounds(0, 175, 95, 55);
                panel4.add(textField10);
                textField10.setBounds(105, 180, 75, 45);

                //---- label28 ----
                label28.setText("\u5bb6");
                panel4.add(label28);
                label28.setBounds(185, 185, 45, 35);

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
            panel4.setBounds(311, 208, 239, 287);

            //======== panel5 ========
            {
                panel5.setLayout(null);

                //---- label29 ----
                label29.setText("\u8ba2\u5355\u4fe1\u606f");
                panel5.add(label29);
                label29.setBounds(0, 0, 165, 65);

                //---- label30 ----
                label30.setText("\u603b\u8ba2\u5355\uff1a");
                panel5.add(label30);
                label30.setBounds(0, 80, 95, 55);
                panel5.add(textField11);
                textField11.setBounds(105, 80, 80, 48);

                //---- label31 ----
                label31.setText("\u5355");
                panel5.add(label31);
                label31.setBounds(190, 85, 50, 40);

                //---- label32 ----
                label32.setText("\u4eca\u65e5\u8ba2\u5355\uff1a");
                panel5.add(label32);
                label32.setBounds(0, 175, 95, 55);
                panel5.add(textField12);
                textField12.setBounds(105, 185, 80, 40);

                //---- label33 ----
                label33.setText("\u5355");
                panel5.add(label33);
                label33.setBounds(190, 185, 50, 40);

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
            panel5.setBounds(671, 208, 244, 287);

            //---- textField5 ----
            textField5.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(textField5);
            textField5.setBounds(365, 55, 100, 100);

            //---- label16 ----
            label16.setText("\u56fe\u72473");
            label16.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(label16);
            label16.setBounds(265, 55, 100, 100);

            //---- label17 ----
            label17.setText("\u56fe\u72473");
            label17.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(label17);
            label17.setBounds(780, 55, 100, 100);

            //---- textField8 ----
            textField8.setBorder(LineBorder.createBlackLineBorder());
            panel6.add(textField8);
            textField8.setBounds(880, 55, 100, 100);

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
        panel6.setBounds(160, 90, 985, 565);

        //---- button1 ----
        button1.setText("\u9000\u51fa");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(1020, 650), button1.getPreferredSize()));

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
        QueryByClass q=new QueryByClass();
//        label9值输入
        label9.setText(String.valueOf(q.selectcount("select * from userinfo")));

        //        label8值输入
        textField9.setText(String.valueOf(q.selectcount("select * from mer")));
        label8.setText(String.valueOf(q.selectcount("select * from mer")));
        textField6.setText(String.valueOf(q.selectcount("select * from userinfo")));
//        textField1值输入
        textField1.setText(String.valueOf(q.selectcount("select * from userinfo")));
//          textField5值输入
        textField5.setText(String.valueOf(q.selectcount("select * from mer")));
        //  textField4值输入
        textField4.setText(String.valueOf(q.selectcount("select * from orderlist")));
        textField11.setText(String.valueOf(q.selectcount("select * from orderlist")));
//        label17.setText();
        textField7.setText(String.valueOf(q.selectcount("select * from prestige where p_score<60")));
//       图片
        label1.setIcon(Imagesinks.png("images/Sever_icon/IMG_2.png",60,60));
        label2.setIcon(Imagesinks.png("images/Sever_icon/little-red-hood.png",100,100));
        label11.setIcon(Imagesinks.png("images/Sever_icon/IMG_3.png",100,100));
        label16.setIcon(Imagesinks.png("images/Sever_icon/IMG_4.png",100,100));
        label14.setIcon(Imagesinks.png("images/Sever_icon/IMG_5.png",100,100));
        label17.setIcon(Imagesinks.png("images/Sever_icon/IMG_6.png",100,100));
//        信息

        this.setBounds(100,40,1600,1000);
        Dp_info dp=new Dp_info();
        dp.setBounds(160,100,1000,538);
        dp.setVisible(false);
        Order_info or=new Order_info();
        or.setBounds(160,100,900,538);
        or.setVisible(false);
        Discount_info di=new Discount_info();
        di.setBounds(160,100,900,538);
        di.setVisible(false);
        this.add(dp);
        this.add(or);
        this.add(di);
////        店铺信息
        comboBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED){
                    int x=comboBox2.getSelectedIndex();
                    if (x==1){
                        panel6.setVisible(false);
                        dp.setVisible(true);
                        or.setVisible(false);
                        di.setVisible(false);
                    }
                }
            }
        });

////        订单信息
        comboBox4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED){
                    int x=comboBox4.getSelectedIndex();
                    System.out.println(x);
                    if (x==1){
                        panel6.setVisible(false);
                        dp.setVisible(false);
                        or.setVisible(true);
                        di.setVisible(false);
                    }
                }
            }
        });
        //    优惠券管理
        comboBox5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED){
                    int x=comboBox5.getSelectedIndex();
                    System.out.println(x);
                    if (x==1){
                        panel6.setVisible(false);
                        dp.setVisible(false);
                        or.setVisible(false);
                        di.setVisible(true);
                    }
                }
            }
        });
;
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label3;
    private JPanel panel7;
    private JLabel label1;
    private JLabel label12;
    private JLabel label13;
    private JPanel panel2;
    private JComboBox<String> comboBox1;
    private JLabel label10;
    private JComboBox<String> comboBox2;
    private JComboBox<String> comboBox3;
    private JComboBox<String> comboBox4;
    private JButton button2;
    private JComboBox<String> comboBox5;
    private JPanel panel6;
    private JLabel label11;
    private JTextField textField1;
    private JLabel label14;
    private JTextField textField4;
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
    private JLabel label25;
    private JTextField textField9;
    private JLabel label26;
    private JLabel label27;
    private JTextField textField10;
    private JLabel label28;
    private JPanel panel5;
    private JLabel label29;
    private JLabel label30;
    private JTextField textField11;
    private JLabel label31;
    private JLabel label32;
    private JTextField textField12;
    private JLabel label33;
    private JTextField textField5;
    private JLabel label16;
    private JLabel label17;
    private JTextField textField8;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
