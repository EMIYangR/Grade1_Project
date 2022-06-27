/*
 * Created by JFormDesigner on Fri May 27 09:45:02 CST 2022
 */

package jw3.c1.view.Administrator;

import jw3.c1.controller.AdministratorController;
import jw3.c1.utils.Imagesinks;
import jw3.c1.view.login.LoginChoise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Brainrain
 */
public class AdministratorLogin extends JFrame {
    public AdministratorLogin() {
        initComponents();
        setVisible(true);
        setSize(500,450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1MouseClicked(MouseEvent e) {
        //登录管理员主界面
        // TODO add your code here
        String administratorId = textField1.getText();
        id = textField1.getText();
        String administratorPwd = new String(passwordField1.getPassword());
        int a= AdministratorController.administratorLogin(administratorId,administratorPwd);
        switch (a){
            case 1:
                JOptionPane.showMessageDialog(null,"账号或密码错误");
                break;
            case 2:
                this.dispose();
                new AdministratorIndex();
                JOptionPane.showMessageDialog(null,"登录成功");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"账号或密码不能为空");
                break;
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        new LoginChoise();
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();
        label4 = new JLabel();
        label5 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        setTitle("\u7ba1\u7406\u5458\u767b\u5f55");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8d26\u53f7\uff1a");
        label1.setForeground(Color.cyan);
        label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(95, 145), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u5bc6\u7801\uff1a");
        label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        label2.setForeground(Color.cyan);
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(95, 200), label2.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(170, 135, 200, 30);
        contentPane.add(passwordField1);
        passwordField1.setBounds(170, 190, 200, 30);

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(170, 270, 100, 30);

        //---- button2 ----
        button2.setText("\u8fd4\u56de");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(270, 270, 100, 30);
        contentPane.add(label4);
        label4.setBounds(55, 15, 120, 105);

        //---- label5 ----
        label5.setText("\u7ba1\u7406\u5458\u767b\u5f55");
        label5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 22));
        label5.setForeground(Color.green);
        contentPane.add(label5);
        label5.setBounds(180, 40, 195, 55);

        //---- label3 ----
        label3.setIcon(new ImageIcon("D:\\Users\\EMI\\Desktop\\\u5c0f\u827e\u7c73\u7684\u82e6\u903c\u9879\u76ee\\\u5353\u8d8a\u9879\u76ee\u7ba1\u7406\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\Sever_icon\\6264.gif_wh860.gif"));
        contentPane.add(label3);
        label3.setBounds(0, 0, 500, 450);

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
        label4.setIcon(Imagesinks.png("images/logo/logo.png",100,100));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static String id;
}
