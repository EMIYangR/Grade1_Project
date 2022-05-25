/*
 * Created by JFormDesigner on Tue May 24 10:54:36 CST 2022
 */

package jw3.c1.view;

import jw3.c1.controller.BusdinessController;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class BusinessLogin extends JFrame {
    public BusinessLogin() {
        initComponents();
        setVisible(true);
        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1MouseClicked(MouseEvent e) {
        String  user=textField1.getText();
        String  pwd=passwordField1.getText();
        int a=BusdinessController.dlupd(user,pwd);
        switch (a){
            case 1:
                JOptionPane.showMessageDialog(null,"账号或密码错误");
                passwordField1.setText("");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"登录成功");
                System.exit(0);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"账号或密码不能为空");
                break;
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        setVisible(false);
        LoginChoise a=new LoginChoise();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("\u5546\u5bb6\u767b\u5f55");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8d26\u53f7\uff1a");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label1);
        label1.setBounds(50, 55, 55, 30);

        //---- label2 ----
        label2.setText("\u5bc6\u7801\uff1a");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(50, 95, 55, 30);
        contentPane.add(textField1);
        textField1.setBounds(135, 53, 150, 35);
        contentPane.add(passwordField1);
        passwordField1.setBounds(135, 93, 150, 35);

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(50, 170, 75, 35);

        //---- button2 ----
        button2.setText("\u53d6\u6d88");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(210, 170, 75, 35);

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
    private JLabel label2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
