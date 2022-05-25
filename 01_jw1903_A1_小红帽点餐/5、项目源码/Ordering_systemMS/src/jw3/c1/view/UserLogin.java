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


/**
 * @author Brainrain
 */
public class UserLogin extends JFrame {
    public UserLogin() {
        initComponents();
        setVisible(true);
        setSize(320,300);
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
                setVisible(false);
                Index.zh=user;
                Index u1=new Index();
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"账号或密码不能为空");
                break;
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        Register z=new Register();
        setVisible(false);
    }

    private void button3MouseClicked(MouseEvent e) {
        ForgetPwd forgetPwd =new ForgetPwd();
        setVisible(false);
    }

    private void thisWindowClosed(WindowEvent e) {
        // TODO add your code here
    }

    private void thisWindowClosing(WindowEvent e) {
        // TODO add your code here
    }

    private void button4MouseClicked(MouseEvent e) {
        setVisible(false);
        LoginChoise loginChoise=new LoginChoise();
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
        contentPane.add(label1);
        label1.setBounds(50, 20, 80, 35);
        contentPane.add(textField1);
        textField1.setBounds(130, 20, 150, 35);

        //---- label2 ----
        label2.setText("\u5bc6\u7801\uff1a");
        contentPane.add(label2);
        label2.setBounds(50, 75, 80, 35);

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(50, 130, 95, 30);

        //---- button4 ----
        button4.setText("\u53d6\u6d88");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        contentPane.add(button4);
        button4.setBounds(185, 170, 95, 30);

        //---- button2 ----
        button2.setText("\u6ce8\u518c");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(185, 130, 95, 30);

        //---- button3 ----
        button3.setText("\u5fd8\u8bb0\u5bc6\u7801");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(50, 170, 95, 30);
        contentPane.add(passwordField1);
        passwordField1.setBounds(130, 75, 150, 35);

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
