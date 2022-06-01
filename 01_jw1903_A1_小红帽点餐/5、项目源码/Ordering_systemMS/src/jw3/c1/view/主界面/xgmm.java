/*
 * Created by JFormDesigner on Thu May 26 22:37:06 CST 2022
 */

package jw3.c1.view.主界面;

import jw3.c1.controller.UserinfoController;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class xgmm extends JFrame {
    public xgmm() {
        initComponents();
        setVisible(true);
        setBounds(400,400,700,520);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1MouseClicked(MouseEvent e) {
        if (label4.isVisible()||label5.isVisible()){
            JOptionPane.showMessageDialog(null,"修改失败！");
        }else {
            if (UserinfoController.mmcx1(Index.zh,passwordField1.getText())==2){
                String a=textField1.getText();
                String b=passwordField2.getText();
                String c=passwordField3.getText();
                int a2=UserinfoController.mmcx1(Index.zh,b);
                switch (a2){
                    case 1:
                        UserinfoController.xxxg1(a,b);
                        JOptionPane.showMessageDialog(null,"修改成功");
                        Index.zh=a;
                        UserProfile.zh1=a;
                        UserProfile u=new UserProfile();
                        dispose();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"密码不能与之前相同");
                        break;
                }
            }else {
                JOptionPane.showMessageDialog(null,"原密码输入错误!");
            }

        }

    }

    private void passwordField1KeyReleased(KeyEvent e) {

    }

    private void passwordField2KeyReleased(KeyEvent e) {
        String pwd=passwordField2.getText();
        if (pwd.length()>0){
            if (pwd.length()>=10){
                label4.setText("密码长度不能超过10");
                label4.setVisible(true);
            }else {
                label4.setVisible(false);
            }
            if (pwd.length()<=6){
                label4.setText("密码长度不能低于6");
                label4.setVisible(true);
            }else {
                label4.setVisible(false);
            }
//            label8.setVisible(false);
        } else {
            label4.setText("密码长度不能为空");
            label4.setVisible(true);
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        UserProfile u=new UserProfile();
        dispose();
    }

    private void passwordField3KeyReleased(KeyEvent e) {
        String pwd=passwordField2.getText();
        String pwd1=passwordField3.getText();
        if (pwd.length()>0&&pwd1.length()>0){
            if (!pwd.equals(pwd1)){
                label5.setText("两次输入密码不一样");
                label5.setVisible(true);
            }else {
                label5.setVisible(false);
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        label3 = new JLabel();
        passwordField2 = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        passwordField3 = new JPasswordField();

        //======== this ========
        setIconImage(new ImageIcon("C:\\Users\\admin\\Desktop\\\u65b0\u5efa\u6587\u4ef6\u5939 (5)\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\logo\\logo.png").getImage());
        setTitle("\u4fee\u6539\u5bc6\u7801");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8f93\u5165\u9700\u8981\u66f4\u6539\u7684\u8d26\u53f7\uff1a");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label1);
        label1.setBounds(25, 50, 160, 40);
        contentPane.add(textField1);
        textField1.setBounds(200, 50, 170, 40);

        //---- label2 ----
        label2.setText("\u8f93\u5165\u539f\u5bc6\u7801\uff1a");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(85, 102, 100, 40);

        //---- passwordField1 ----
        passwordField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                passwordField1KeyReleased(e);
                passwordField1KeyReleased(e);
            }
        });
        contentPane.add(passwordField1);
        passwordField1.setBounds(205, 105, 165, 35);

        //---- label3 ----
        label3.setText("\u8f93\u5165\u73b0\u5bc6\u7801\uff1a");
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label3);
        label3.setBounds(85, 147, 100, 40);

        //---- passwordField2 ----
        passwordField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                passwordField2KeyReleased(e);
                passwordField2KeyReleased(e);
            }
        });
        contentPane.add(passwordField2);
        passwordField2.setBounds(205, 150, 165, 35);

        //---- button1 ----
        button1.setText("\u786e\u5b9a");
        button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(95, 275, 90, 40);

        //---- button2 ----
        button2.setText("\u53d6\u6d88");
        button2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(275, 280, 90, 40);

        //---- label4 ----
        label4.setText("text");
        label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        label4.setForeground(Color.red);
        contentPane.add(label4);
        label4.setBounds(380, 155, 150, 25);

        //---- label5 ----
        label5.setText("text");
        label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        label5.setForeground(Color.red);
        contentPane.add(label5);
        label5.setBounds(375, 195, 150, 25);

        //---- label6 ----
        label6.setText("\u786e\u8ba4\u73b0\u5bc6\u7801\uff1a");
        label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label6);
        label6.setBounds(75, 185, 100, 40);

        //---- passwordField3 ----
        passwordField3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                passwordField2KeyReleased(e);
                passwordField3KeyReleased(e);
            }
        });
        contentPane.add(passwordField3);
        passwordField3.setBounds(205, 190, 165, 35);

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
        label4.setVisible(false);
        label5.setVisible(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JLabel label3;
    private JPasswordField passwordField2;
    private JButton button1;
    private JButton button2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JPasswordField passwordField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
