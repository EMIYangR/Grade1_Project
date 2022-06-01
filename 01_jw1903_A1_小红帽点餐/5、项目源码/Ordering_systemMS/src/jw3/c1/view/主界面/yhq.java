/*
 * Created by JFormDesigner on Fri May 27 17:39:54 CST 2022
 */

package jw3.c1.view.主界面;

import java.awt.event.*;
import jw3.c1.controller.DiscountController;
import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Discount;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class yhq extends JFrame {
    public yhq() {
        initComponents();
        setVisible(true);
        setSize(800,550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        yhq q=new yhq();
    }

    private void button1MouseClicked(MouseEvent e) {
        this.show1();
        setBackground(Color.red);
        button2.setBackground(Color.white);
    }

    private void button2MouseClicked(MouseEvent e) {
        setBackground(Color.red);
        button1.setBackground(Color.white);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
        label8.setVisible(false);
        label9.setVisible(false);
        label10.setVisible(false);
        label11.setVisible(false);
        label12.setVisible(false);
        label13.setVisible(false);
        label14.setVisible(false);
        label15.setVisible(false);
        label16.setVisible(false);
        label17.setVisible(false);
        label18.setVisible(false);
        label19.setVisible(false);
        label21.setVisible(false);
        label22.setVisible(false);
        label23.setVisible(false);
        label24.setVisible(false);
    }

    private void button3MouseClicked(MouseEvent e) {
        UserProfile u=new UserProfile();
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label4 = new JLabel();
        label5 = new JLabel();
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
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        button3 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("text");
        contentPane.add(label1);
        label1.setBounds(35, 25, 105, 80);

        //---- label2 ----
        label2.setText("\u6635\u79f0\uff1a");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(35, 115, 65, 35);

        //---- label3 ----
        label3.setText("text");
        label3.setForeground(Color.magenta);
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label3);
        label3.setBounds(80, 110, 125, 45);

        //---- button1 ----
        button1.setText("\u6240\u6301\u6709");
        button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        button1.setBackground(Color.red);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(210, 55, 220, 50);

        //---- button2 ----
        button2.setText("\u8fc7\u671f");
        button2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        button2.setForeground(Color.red);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(425, 55, 220, 50);

        //---- label4 ----
        label4.setText("\u4f18\u60e0\u5238\u540d\u5b57");
        label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label4.setVisible(false);
        contentPane.add(label4);
        label4.setBounds(210, 150, 215, 55);

        //---- label5 ----
        label5.setText("\u8be6\u60c5");
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setVisible(false);
        contentPane.add(label5);
        label5.setBounds(295, 165, 210, 25);

        //---- label6 ----
        label6.setText("\u8be6\u60c5");
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setVisible(false);
        contentPane.add(label6);
        label6.setBounds(295, 215, 210, 25);

        //---- label7 ----
        label7.setText("\u4f18\u60e0\u5238\u540d\u5b57");
        label7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label7.setVisible(false);
        contentPane.add(label7);
        label7.setBounds(210, 200, 215, 55);

        //---- label8 ----
        label8.setText("\u4f18\u60e0\u5238\u540d\u5b57");
        label8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label8.setVisible(false);
        contentPane.add(label8);
        label8.setBounds(210, 250, 215, 55);

        //---- label9 ----
        label9.setText("\u8be6\u60c5");
        label9.setHorizontalAlignment(SwingConstants.CENTER);
        label9.setVisible(false);
        contentPane.add(label9);
        label9.setBounds(295, 265, 210, 25);

        //---- label10 ----
        label10.setText("\u6570\u91cf");
        label10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label10.setVisible(false);
        contentPane.add(label10);
        label10.setBounds(530, 160, 55, 35);

        //---- label11 ----
        label11.setText("null");
        label11.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label11.setForeground(Color.red);
        label11.setVisible(false);
        contentPane.add(label11);
        label11.setBounds(595, 160, 55, 35);

        //---- label12 ----
        label12.setText("\u6570\u91cf");
        label12.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label12.setVisible(false);
        contentPane.add(label12);
        label12.setBounds(530, 210, 55, 35);

        //---- label13 ----
        label13.setText("null");
        label13.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label13.setForeground(Color.red);
        label13.setVisible(false);
        contentPane.add(label13);
        label13.setBounds(595, 210, 55, 35);

        //---- label14 ----
        label14.setText("\u6570\u91cf");
        label14.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label14.setVisible(false);
        contentPane.add(label14);
        label14.setBounds(530, 260, 55, 35);

        //---- label15 ----
        label15.setText("null");
        label15.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label15.setForeground(Color.red);
        label15.setVisible(false);
        contentPane.add(label15);
        label15.setBounds(595, 260, 55, 35);

        //---- label16 ----
        label16.setText("\u4f18\u60e0\u5238\u540d\u5b57");
        label16.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label16.setVisible(false);
        contentPane.add(label16);
        label16.setBounds(210, 300, 215, 55);

        //---- label17 ----
        label17.setText("\u8be6\u60c5");
        label17.setHorizontalAlignment(SwingConstants.CENTER);
        label17.setVisible(false);
        contentPane.add(label17);
        label17.setBounds(295, 315, 210, 25);

        //---- label18 ----
        label18.setText("\u6570\u91cf");
        label18.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label18.setVisible(false);
        contentPane.add(label18);
        label18.setBounds(530, 310, 55, 35);

        //---- label19 ----
        label19.setText("null");
        label19.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label19.setForeground(Color.red);
        label19.setVisible(false);
        contentPane.add(label19);
        label19.setBounds(595, 310, 55, 35);

        //---- label20 ----
        label20.setText("\u6ce8\u610f\uff1a\u7528\u6237\u6240\u62e5\u6709\u7684\u4f18\u60e0\u5238\u79cd\u7c7b\u4e0d\u80fd\u8d85\u8fc7\u4e94\u79cd\uff01");
        label20.setForeground(Color.red);
        contentPane.add(label20);
        label20.setBounds(new Rectangle(new Point(220, 495), label20.getPreferredSize()));

        //---- label21 ----
        label21.setText("\u4f18\u60e0\u5238\u540d\u5b57");
        label21.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label21.setVisible(false);
        contentPane.add(label21);
        label21.setBounds(205, 350, 215, 55);

        //---- label22 ----
        label22.setText("\u8be6\u60c5");
        label22.setHorizontalAlignment(SwingConstants.CENTER);
        label22.setVisible(false);
        contentPane.add(label22);
        label22.setBounds(290, 365, 210, 25);

        //---- label23 ----
        label23.setText("\u6570\u91cf");
        label23.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label23.setVisible(false);
        contentPane.add(label23);
        label23.setBounds(525, 360, 55, 35);

        //---- label24 ----
        label24.setText("null");
        label24.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label24.setForeground(Color.red);
        label24.setVisible(false);
        contentPane.add(label24);
        label24.setBounds(590, 360, 55, 35);

        //---- button3 ----
        button3.setText("\u8fd4\u56de");
        button3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(35, 195, 90, 50);

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
        this.show1();
        Userinfo U= UserinfoController.user(Index.zh);
        label1.setIcon(Imagesinks.png("images/tx/"+U.getU_headimage(),100,100));
        label3.setText(U.getU_nickname());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JLabel label4;
    private JLabel label5;
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
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void show1(){
        List<Discount> l= DiscountController.cx(99);
        int[] a1=DiscountController.cx3();
        int b1=DiscountController.cx4(Index.zh);
        int a=l.size();
        switch (b1){
            case 5:
                label21.setVisible(true);label22.setVisible(true);label23.setVisible(true);label24.setVisible(true);
                label21.setText(l.get(4).getD_name());label22.setText(l.get(4).getD_details());
                assert a1 != null;
                label24.setText(String.valueOf(a1[4]));
            case 4:
                label16.setVisible(true);label17.setVisible(true);label18.setVisible(true);label19.setVisible(true);
                label16.setText(l.get(3).getD_name());label17.setText(l.get(3).getD_details());
                assert a1 != null;
                label19.setText(String.valueOf(a1[3]));
            case 3:
                label8.setVisible(true);label9.setVisible(true);label14.setVisible(true);label15.setVisible(true);
                label8.setText(l.get(2).getD_name());label9.setText(l.get(2).getD_details());
                assert a1 != null;
                label15.setText(String.valueOf(a1[2]));

            case 2:
                label7.setVisible(true);label6.setVisible(true);label12.setVisible(true);label13.setVisible(true);
                label7.setText(l.get(1).getD_name());label6.setText(l.get(1).getD_details());
                assert a1 != null;
                label13.setText(String.valueOf(a1[1]));
            case 1:
                label4.setVisible(true);label5.setVisible(true);label10.setVisible(true);label11.setVisible(true);
                label4.setText(l.get(0).getD_name());label5.setText(l.get(0).getD_details());
                assert a1 != null;
                label11.setText(String.valueOf(a1[0]));
                break;
            case 0:
                label4.setVisible(true);label4.setText("暂无优惠券！");Font font=new Font("Microsoft YaHei UI", Font.PLAIN, 20);
                label4.setForeground(Color.red);label4.setFont(font);
        }
    }
}
