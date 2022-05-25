/*
 * Created by JFormDesigner on Mon May 23 22:33:09 CST 2022
 */

package jw3.c1.view;

import jw3.c1.controller.UserinfoController;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class ForgetPwd extends JFrame {
    public ForgetPwd() {
        initComponents();
        setVisible(true);
        setSize(500,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
        private void textField2KeyPressed(KeyEvent e) {

        }
        private void button1MouseClicked(MouseEvent e) {
            String a=textField1.getText();
            String b=textField2.getText();
            String c=passwordField2.getText();
            int a1=UserinfoController.zhpd(a);
            int b1=UserinfoController.yxpd(b);
            if (label5.isVisible()||label6.isVisible()||label7.isVisible()){

            }else {
                if (a1==2&&b1==2){
//                    int a2=UserinfoController.mmcx(a,c);
                    int a2=UserinfoController.mmcx1(a,c);
                    switch (a2){
                        case 1:
                            UserinfoController.mmxg(c,a,b);
                            JOptionPane.showMessageDialog(null,"修改成功");
                            setVisible(false);
                            UserLogin l=new UserLogin();
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,"密码不能与之前相同");
                            break;
                    }

                }
            }

        }
        private void textField2FocusLost(FocusEvent e) {
            String yx=textField2.getText();
            char[] yx1=yx.toCharArray();
            boolean a=yx.endsWith("@163.com");
            boolean b=yx.endsWith("@qq.com");
            if (yx.length()>0) {
                if (a == true || b == true) {
//            label7.setVisible(false);
                    int l = yx1.length;
                    if (a && l >= 9 || b && l >= 8) {
                        if (a && l >= 9) {
                            for (int k = 0; k < l - 8; k++) {
                                if (yx1[k] < '0' || yx1[k] > '9') {
                                    label7.setText("@前暂时只能位数字");
                                    label7.setVisible(true);
                                    break;
                                } else {
                                    int b1 = UserinfoController.yxpd(yx);
                                    switch (b1) {
                                        case 1:
                                            label7.setVisible(false);
                                            break;
                                        case 2:
//                                            label7.setText("该邮箱已被使用");
//                                            label7.setVisible(true);
                                            break;
                                    }
                                }
                            }
                        }
                        if (b && l >= 8) {
                            for (int k = 0; k < l - 7; k++) {
                                if (yx1[k] < '0' || yx1[k] > '9') {
                                    label7.setText("@前暂时只能位数字");
                                    label7.setVisible(true);
                                    break;
                                } else {
                                    int b1 = UserinfoController.yxpd(yx);
                                    switch (b1) {
                                        case 1:
                                            label7.setVisible(false);
                                            break;
                                        case 2:
//                                            label7.setText("该邮箱已被使用");
//                                            label7.setVisible(true);
                                            break;
                                    }
                                }
                            }
                        }

                    } else {
                        label7.setText("格式不正确");
                        label7.setVisible(true);
                    }
                } else {
                    label7.setText("目前只能为163.com或qq.com");
                }
            }else {
                label7.setText("邮箱不能为空");
                label7.setVisible(true);
            }
        }
        private void button2MouseClicked(MouseEvent e) {
            setVisible(false);
            UserLogin l=new UserLogin();
        }
        private void passwordField2KeyReleased(KeyEvent e) {
            String pwd=passwordField2.getText();
            String user=textField1.getText();
            if (pwd.length()>0){
                if (pwd.length()>=10){
                    label5.setText("密码长度不能超过10");
                    label5.setVisible(true);
                }else {
                    label5.setVisible(false);
                }
                if (pwd.length()<=6){
                    label5.setText("密码长度不能低于6");
                    label5.setVisible(true);
                }else {
                    label5.setVisible(false);
                }
            } else {
                label5.setText("密码长度不能为空");
                label5.setVisible(true);
            }
        }
        private void passwordField1KeyReleased(KeyEvent e) {
            String pwd=passwordField1.getText();
            String pwd1=passwordField2.getText();
            if (pwd.length()>0&&pwd1.length()>0){
                if (!pwd.equals(pwd1)){
                    label6.setText("两次输入密码不一样");
                    label6.setVisible(true);
                }else {
                    label6.setVisible(false);
                }
            }
        }
        private void passwordField1FocusGained(FocusEvent e) {
            String pwd=passwordField1.getText();
            String pwd1=passwordField2.getText();
            if (pwd.length()>0&&pwd1.length()>0){
                if (!pwd.equals(pwd1)){
                    label6.setText("两次输入密码不一样");
                    label6.setVisible(true);
                }else {
                    label6.setVisible(false);
                }
            }
    }
    private void textField2KeyReleased(KeyEvent e) {
        String yx=textField2.getText();
        char[] yx1=yx.toCharArray();
        boolean a=yx.endsWith("@163.com");
        boolean b=yx.endsWith("@qq.com");
        if (yx.length()>0) {
            if (a || b) {
//            label7.setVisible(false);
                int l = yx1.length;
                if (a && l >= 9 || b && l >= 8) {
                    if (a && l >= 9) {
                        for (int k = 0; k < l - 8; k++) {
                            if (yx1[k] < '0' || yx1[k] > '9') {
                                label7.setText("暂时@前面只能为数字");
                                label7.setVisible(true);
                                break;
                            } else {
                                int b1 = UserinfoController.yxpd(yx);
                                switch (b1) {
                                    case 1:
                                    case 2:
//                                            label7.setText("该邮箱已被使用");
                                        label7.setVisible(false);
                                        break;
                                }
                            }
                        }
                    }
                    if (b && l >= 8) {
                        for (int k = 0; k < l - 7; k++) {
                            if (yx1[k] < '0' || yx1[k] > '9') {
                                label7.setText("暂时@前面只能为数字");
                                label7.setVisible(true);
                                break;
                            } else {
                                int b1 = UserinfoController.yxpd(yx);
                                switch (b1) {
                                    case 1:
                                    case 2:
//                                            label7.setText("该邮箱已被使用");
                                        label7.setVisible(false);
                                        break;
                                }
                            }
                        }
                    }

                } else {
                    label7.setText("格式不正确");
                    label7.setVisible(true);
                }
            } else {
                label7.setText("目前只能为163.com或qq.com");
                label7.setVisible(true);
            }
        }else {
            label7.setText("邮箱不能为空");
            label7.setVisible(true);
        }
    }

    private void initComponents(){
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label5 = new JLabel();
        passwordField1 = new JPasswordField();
        passwordField2 = new JPasswordField();
        label6 = new JLabel();
        label7 = new JLabel();

        //======== this ========
        setTitle("\u5fd8\u8bb0\u5bc6\u7801");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8f93\u5165\u8981\u627e\u56de\u5bc6\u7801\u7684\u8d26\u53f7\uff1a");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label1);
        label1.setBounds(20, 54, 180, label1.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(195, 50, 165, 30);

        //---- label2 ----
        label2.setText("\u8f93\u5165\u4f60\u7684\u90ae\u7bb1\uff1a");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(85, 94, 115, 22);

        //---- textField2 ----
        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                textField2KeyPressed(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                textField2KeyReleased(e);
            }
        });
        textField2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                textField2FocusLost(e);
            }
        });
        contentPane.add(textField2);
        textField2.setBounds(195, 90, 165, 30);

        //---- label3 ----
        label3.setText("\u8f93\u5165\u8981\u4fee\u6539\u7684\u5bc6\u7801\uff1a");
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(50, 139), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("\u786e\u8ba4\u4fee\u6539\u7684\u5bc6\u7801\uff1a");
        label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label4);
        label4.setBounds(65, 175, 144, 22);

        //---- button1 ----
        button1.setText("\u786e\u5b9a");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(90, 215, 78, 30);

        //---- button2 ----
        button2.setText("\u53d6\u6d88");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(235, 215, 78, 30);

        //---- label5 ----
        label5.setText("text");
        label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label5.setForeground(new Color(255, 0, 51));
        contentPane.add(label5);
        label5.setBounds(365, 135, 150, label5.getPreferredSize().height);

        //---- passwordField1 ----
        passwordField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

            }
            @Override
            public void keyReleased(KeyEvent e) {
                passwordField1KeyReleased(e);
            }
        });
        passwordField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                passwordField1FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        contentPane.add(passwordField1);
        passwordField1.setBounds(195, 175, 165, 30);

        //---- passwordField2 ----
        passwordField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                passwordField2KeyReleased(e);
            }
        });
        contentPane.add(passwordField2);
        passwordField2.setBounds(195, 130, 165, 30);

        //---- label6 ----
        label6.setText("text");
        label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label6.setForeground(new Color(255, 0, 51));
        contentPane.add(label6);
        label6.setBounds(365, 175, 150, 22);

        //---- label7 ----
        label7.setText("text");
        label7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        label7.setForeground(new Color(255, 0, 51));
        contentPane.add(label7);
        label7.setBounds(360, 95, 150, 22);

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
        label5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JButton button1;
    private JButton button2;
    private JLabel label5;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JLabel label6;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
