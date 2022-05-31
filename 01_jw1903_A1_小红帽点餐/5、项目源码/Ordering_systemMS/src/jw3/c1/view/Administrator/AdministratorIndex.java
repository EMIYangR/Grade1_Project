/*
 * Created by JFormDesigner on Fri May 27 10:36:04 CST 2022
 */

package jw3.c1.view.Administrator;

import java.awt.event.*;
import jw3.c1.controller.AdministratorController;
import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Administrator;
import jw3.c1.model.Business;
import jw3.c1.model.Mer;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.Imagesinks;
import jw3.c1.utils.QueryByClass;
import jw3.c1.view.Index;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class AdministratorIndex extends JFrame {
    public static void main(String[] args) {
        new AdministratorIndex();
    }
    public AdministratorIndex() {
        initComponents();
        this.setVisible(true);
        this.setSize(1080,720);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void comboBox2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void comboBox4MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        new AdministratorIndex();
        this.setVisible(false);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        new MerchantManagement();
        this.setVisible(false);
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        new UserManagement();
        this.setVisible(false);
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        new CouponManagement();
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        separator1 = new JPopupMenu.Separator();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();

        //======== this ========
        setTitle("\u540e\u53f0\u8fd0\u8425\u7cfb\u7edf");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Administrator");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(20, 100), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("icon");
        contentPane.add(label2);
        label2.setBounds(20, 20, 75, 75);

        //---- label4 ----
        label4.setText("logo");
        contentPane.add(label4);
        label4.setBounds(245, 25, 100, 100);

        //---- label5 ----
        label5.setText("\u5c0f\u7ea2\u5e3d\u70b9\u9910\u7cfb\u7edf\u2122\u540e\u53f0\u8fd0\u8425\u7cfb\u7edf");
        label5.setFont(new Font("\u65b9\u6b63\u5c0f\u6807\u5b8b_GBK", Font.BOLD, 28));
        label5.setForeground(new Color(204, 0, 0));
        label5.setEnabled(false);
        contentPane.add(label5);
        label5.setBounds(395, 45, label5.getPreferredSize().width, 50);

        //---- label6 ----
        label6.setText("\u6b22\u8fce\u767b\u5f55\u540e\u53f0\u8fd0\u8425\u7cfb\u7edf\uff01");
        label6.setFont(new Font("\u65b9\u6b63\u9ed1\u4f53_GBK", Font.PLAIN, 48));
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(338, 330), label6.getPreferredSize()));
        contentPane.add(separator1);
        separator1.setBounds(0, 135, 1100, 5);

        //---- button1 ----
        button1.setText("\u4e3b\u9875");
        button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(20, 150, 150, 45);

        //---- button2 ----
        button2.setText("\u5546\u5bb6\u7ba1\u7406");
        button2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(20, 225, 150, 45);

        //---- button3 ----
        button3.setText("\u7528\u6237\u7ba1\u7406");
        button3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(20, 300, 150, 45);

        //---- button4 ----
        button4.setText("\u4f18\u60e0\u5238\u7ba1\u7406");
        button4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        contentPane.add(button4);
        button4.setBounds(20, 375, 150, 45);

        //---- button5 ----
        button5.setText("\u6536\u76ca");
        button5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        contentPane.add(button5);
        button5.setBounds(20, 450, 150, 45);

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
//        AdministratorController.username(.get(0).getA_name());
        label2.setIcon(Imagesinks.png("images/administrator/admin.png",75,75));
        label4.setIcon(Imagesinks.png("images/logo/logo.png",100,100));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JPopupMenu.Separator separator1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static Administrator administrator;
    public static String a;
}
