/*
 * Created by JFormDesigner on Wed May 18 13:58:02 CST 2022
 */


package jw3.c1.view;

import jw3.c1.controller.UserinfoController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;


/**
 * @author Brainrain
 */
public class UserLogin extends JFrame {
    public UserLogin() {
        initComponents();
        setVisible(true);
        setSize(474,355);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void button1MouseClicked(MouseEvent e) {
        String  user=textField1.getText();
        String  pwd=passwordField1.getText();
        int a=UserinfoController.dlupd(user,pwd);
        switch (a){
            case 1:
                JOptionPane.showMessageDialog(null,"账号或密码错误");
                passwordField1.setText("");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"登录成功");
                Index.zh=user;
                Index u1=new Index();
                dispose();
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"账号或密码不能为空");
                break;
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        Register z=new Register();
        dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        ForgetPwd forgetPwd =new ForgetPwd();
        dispose();
    }

    private void thisWindowClosed(WindowEvent e) {
        // TODO add your code here
    }

    private void thisWindowClosing(WindowEvent e) {
        // TODO add your code here
    }

    private void button4MouseClicked(MouseEvent e) {
        LoginChoise loginChoise=new LoginChoise();
        dispose();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        button1 = new JButton();
        button4 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        passwordField1 = new JPasswordField();

        //======== this ========
        setTitle("\u7528\u6237\u767b\u5f55");
        setIconImage(new ImageIcon("C:\\Users\\admin\\Desktop\\\u65b0\u5efa\u6587\u4ef6\u5939 (5)\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\logo\\logo.png").getImage());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                thisWindowClosed(e);
            }
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8d26\u53f7\uff1a");
        label1.setBackground(Color.white);
        label1.setForeground(Color.white);
        contentPane.add(label1);
        label1.setBounds(125, 45, 80, 35);
        contentPane.add(textField1);
        textField1.setBounds(205, 45, 185, 35);

        //---- label2 ----
        label2.setText("\u5bc6\u7801\uff1a");
        label2.setForeground(Color.white);
        contentPane.add(label2);
        label2.setBounds(125, 110, 80, 35);

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(125, 180, 110, 45);

        //---- button4 ----
        button4.setText("\u53d6\u6d88");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        contentPane.add(button4);
        button4.setBounds(280, 235, 110, 45);

        //---- button2 ----
        button2.setText("\u6ce8\u518c");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(280, 180, 110, 45);

        //---- button3 ----
        button3.setText("\u5fd8\u8bb0\u5bc6\u7801");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(125, 235, 110, 45);
        contentPane.add(passwordField1);
        passwordField1.setBounds(205, 110, 185, 35);

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
        JLabel lblBackground = new JLabel(); // 创建一个标签组件对象
        ImageIcon icon = new ImageIcon("images/background/bj.png"); // 创建背景图片对象
        lblBackground.setIcon(icon); // 设置标签组件要显示的图标
        lblBackground.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // 设置组件的显示位置及大小
        this.getContentPane().add(lblBackground); // 将组件添加到面板中


    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JButton button1;
    private JButton button4;
    private JButton button2;
    private JButton button3;
    private JPasswordField passwordField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
