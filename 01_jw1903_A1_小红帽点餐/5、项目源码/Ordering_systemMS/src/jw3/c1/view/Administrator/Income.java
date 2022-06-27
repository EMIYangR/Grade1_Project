/*
 * Created by JFormDesigner on Mon Jun 20 16:46:59 CST 2022
 */

package jw3.c1.view.Administrator;

import jw3.c1.controller.*;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Brainrain
 */
public class Income extends JFrame {
    public Income() {
        initComponents();
        showData("");
        this.setSize(1080,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void showData(String name) {
        Vector<Object> heads = new Vector<Object>();
        heads.add("商家编号");
        heads.add("店铺名称");
        heads.add("商家名称");
        heads.add("收益");
        //2、表数据
        data = BusinessController.getAll1(name);
        //3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm = new DefaultTableModel(data, heads);
        table1.setModel(dtm);
    }
    //主页
    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        new AdministratorIndex();
        this.dispose();
    }
    //商家管理
    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        new MerchantManagement();
        this.dispose();
    }
    //用户管理
    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        new UserManagement();
        this.dispose();
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        new CouponManagement();
        this.dispose();
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        new Income();
        this.dispose();
    }

    private void button12MouseClicked(MouseEvent e) {
        // TODO add your code here
        new AdministratorLogin();
        this.dispose();
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        showData(textField1.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label5 = new JLabel();
        label4 = new JLabel();
        label2 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        separator1 = new JPopupMenu.Separator();
        textField1 = new JTextField();
        button6 = new JButton();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button12 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label5 ----
        label5.setText("\u5c0f\u7ea2\u5e3d\u70b9\u9910\u7cfb\u7edf\u2122\u540e\u53f0\u8fd0\u8425\u7cfb\u7edf");
        label5.setFont(new Font("\u65b9\u6b63\u5c0f\u6807\u5b8b_GBK", Font.BOLD, 28));
        label5.setForeground(new Color(204, 0, 0));
        label5.setEnabled(false);
        contentPane.add(label5);
        label5.setBounds(395, 45, 414, 50);

        //---- label4 ----
        label4.setText("logo");
        contentPane.add(label4);
        label4.setBounds(245, 25, 100, 100);

        //---- label2 ----
        label2.setText("icon");
        contentPane.add(label2);
        label2.setBounds(20, 20, 75, 75);

        //---- label1 ----
        label1.setText("Administrator");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
        contentPane.add(label1);
        label1.setBounds(20, 100, 96, 20);

        //---- button1 ----
        button1.setText("\u4e3b\u9875");
        button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
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
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5MouseClicked(e);
            }
        });
        contentPane.add(button5);
        button5.setBounds(20, 450, 150, 45);
        contentPane.add(separator1);
        separator1.setBounds(0, 135, 1100, 5);
        contentPane.add(textField1);
        textField1.setBounds(260, 160, 400, 30);

        //---- button6 ----
        button6.setText("\u641c\u7d22");
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button6MouseClicked(e);
            }
        });
        contentPane.add(button6);
        button6.setBounds(695, 160, 75, 30);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(0, 0, 700, 425);

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
        panel1.setBounds(new Rectangle(new Point(260, 230), panel1.getPreferredSize()));

        //---- button12 ----
        button12.setText("\u9000\u51fa\u767b\u5f55");
        button12.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        button12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button12MouseClicked(e);
            }
        });
        contentPane.add(button12);
        button12.setBounds(20, 525, 150, 45);

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
        label2.setIcon(Imagesinks.png("images/administrator/admin.png",75,75));
        label4.setIcon(Imagesinks.png("images/logo/logo.png",100,100));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label5;
    private JLabel label4;
    private JLabel label2;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPopupMenu.Separator separator1;
    private JTextField textField1;
    private JButton button6;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button12;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
}
