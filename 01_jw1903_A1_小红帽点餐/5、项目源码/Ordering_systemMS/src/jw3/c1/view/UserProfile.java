/*
 * Created by JFormDesigner on Thu May 26 16:46:35 CST 2022
 */

package jw3.c1.view;

import java.awt.event.*;
import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.Imagesinks;
import jw3.c1.view.Index;

import java.awt.*;
import javax.swing.*;
import java.util.List;

/**
 * @author Brainrain
 */
public class UserProfile extends JFrame {
    public UserProfile() {
        initComponents();
        setVisible(true);
        setBounds(400,200,800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button3MouseClicked(MouseEvent e) {
        uuuu a=new uuuu();
        setVisible(false);
    }

    private void button4MouseClicked(MouseEvent e) {
        xgmm x=new xgmm();
        setVisible(false);
    }

    private void button1MouseClicked(MouseEvent e) {
        Index I=new Index();
        setVisible(false);
    }

    private void button2MouseClicked(MouseEvent e) {
        yhq y=new yhq();
        setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label16 = new JLabel();
        label2 = new JLabel();
        label23 = new JLabel();
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
        button3 = new JButton();
        label17 = new JLabel();
        label18 = new JLabel();
        button4 = new JButton();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setForeground(SystemColor.desktop);
        setIconImage(new ImageIcon("C:\\Users\\admin\\Desktop\\\u65b0\u5efa\u6587\u4ef6\u5939 (5)\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\logo\\logo.png").getImage());
        setTitle("\u4e2a\u4eba\u754c\u9762");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(label16);
        label16.setBounds(15, 15, 145, 80);

        //---- label2 ----
        label2.setText("\u6635\u79f0\uff1a");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(25, 100, 55, 30);

        //---- label23 ----
        label23.setText("text");
        label23.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label23.setForeground(Color.magenta);
        contentPane.add(label23);
        label23.setBounds(85, 100, 115, 30);

        //---- label6 ----
        label6.setText("\u5934\u50cf  ");
        label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(330, 145), label6.getPreferredSize()));

        //---- label7 ----
        label7.setText("userID");
        label7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label7);
        label7.setBounds(400, 204, 155, 35);

        //---- label8 ----
        label8.setText("\u8d26\u53f7\uff1a");
        label8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label8);
        label8.setBounds(new Rectangle(new Point(324, 210), label8.getPreferredSize()));

        //---- label9 ----
        label9.setText("usericon");
        contentPane.add(label9);
        label9.setBounds(400, 105, 135, 95);

        //---- label10 ----
        label10.setText("\u624b\u673a\u53f7\uff1a");
        label10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label10);
        label10.setBounds(new Rectangle(new Point(308, 270), label10.getPreferredSize()));

        //---- label11 ----
        label11.setText("\u6536\u8d27\u5730\u5740\uff1a");
        label11.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label11);
        label11.setBounds(new Rectangle(new Point(292, 330), label11.getPreferredSize()));

        //---- label12 ----
        label12.setText("\u4fe1\u8a89\u79ef\u5206\uff1a");
        label12.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label12);
        label12.setBounds(new Rectangle(new Point(292, 390), label12.getPreferredSize()));

        //---- label13 ----
        label13.setText("phone");
        label13.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label13);
        label13.setBounds(400, 266, 155, 30);

        //---- label14 ----
        label14.setText("address");
        label14.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label14);
        label14.setBounds(400, 324, 350, 35);

        //---- label15 ----
        label15.setText("score");
        label15.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label15);
        label15.setBounds(400, 386, 165, 30);

        //---- button3 ----
        button3.setText("\u7f16\u8f91\u8d44\u6599");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(20, 235, 135, 45);

        //---- label17 ----
        label17.setText("VIP\u7b49\u7ea7\uff1a");
        label17.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label17);
        label17.setBounds(287, 450, 85, 30);

        //---- label18 ----
        label18.setText("vip");
        label18.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label18);
        label18.setBounds(400, 444, 155, 42);

        //---- button4 ----
        button4.setText("\u8d26\u53f7\u5bc6\u7801\u4fee\u6539");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        contentPane.add(button4);
        button4.setBounds(20, 295, 135, 45);

        //---- button1 ----
        button1.setText("\u8fd4\u56de");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(650, 505, 125, 50);

        //---- button2 ----
        button2.setText("\u4f18\u60e0\u5238\u7ba1\u7406");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(20, 355, 135, 45);

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
        List<Userinfo> userinfoList=UserinfoController.xxcx(zh1);
        String url="images/tx/"+(userinfoList.get(0).getU_headimage());
        label16.setIcon(Imagesinks.png(url,100,100));
        label16.setText("");
        label9.setIcon(Imagesinks.png(url,100,100));
        label7.setText(userinfoList.get(0).getU_account());
        label13.setText(userinfoList.get(0).getU_phone());
        if (userinfoList.get(0).getU_address()==null){
            label14.setText("暂无详细地址请填写");
            label14.setForeground(Color.red);
        }else {
            label14.setText(userinfoList.get(0).getU_address());
        }
        label15.setText(String.valueOf(userinfoList.get(0).getP_score()));
        label18.setText(String.valueOf(userinfoList.get(0).getV_viprank()));
        label23.setText(userinfoList.get(0).getU_nickname());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label16;
    private JLabel label2;
    private JLabel label23;
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
    private JButton button3;
    private JLabel label17;
    private JLabel label18;
    private JButton button4;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static String zh1=Index.zh;

}
