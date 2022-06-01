/*
 * Created by JFormDesigner on Mon May 30 19:46:11 CST 2022
 */

package jw3.c1.view.Administrator;

import java.awt.event.*;
import jw3.c1.controller.*;
import jw3.c1.model.*;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Brainrain
 */
public class MerchantManagement extends JFrame {
    public MerchantManagement() {
        initComponents();
        showData("");
        this.setVisible(true);
        this.setSize(1080,720);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    //查询
    private void showData(String user) {
        //1、表头
        Vector<Object> heads = new Vector<Object>();
        heads.add("商家编号");
        heads.add("商家名称");
        heads.add("账号");
        heads.add("密码");
        //2、表数据
        data = BusinessController.getAll(user);
        //3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm = new DefaultTableModel(data, heads);
        table1.setModel(dtm);
    }
    //搜索
    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        showData(textField1.getText());
    }
    //添加
    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.setModal(true);
        dialog1.setSize(400,250);
        dialog1.setVisible(true);
    }
    //添加判断
    private void button10MouseClicked(MouseEvent e) {
        // TODO add your code here
        Business business = new Business();
        business.setB_name(textField2.getText());
        business.setB_userid(textField3.getText());
        business.setB_pwd(textField3.getText());
        if (!business.getB_name().equals("") && !business.getB_userid().equals("") && !business.getB_pwd().equals("")){
            for (Vector<Object> item:data){
                if(item.contains(business.getB_userid())){
                    JOptionPane.showMessageDialog(null, "该账号已存在!");
                    return;
                }
            }
            if (BusinessController.register(business)){
                showData("");
                JOptionPane.showMessageDialog(null, "注册成功!");
                dialog1.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "添加失败!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "商家信息不能有空!");
        }
    }
    //取消添加
    private void button11MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.dispose();
    }
    //删除
    private void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();
        if (index!=-1){
            if (JOptionPane.showConfirmDialog(null, "您是否确认删除此数据?")==0){
                int id=(int)data.get(index).get(0);
                if (BusinessController.logOut(id)){
                    showData("");
                    JOptionPane.showMessageDialog(null, "删除成功!");
                }else {
                    JOptionPane.showMessageDialog(null, "删除失败!");
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "您未选中任意一行!");
        }
    }
    //修改
    private void button9MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();
        if (index != -1){
            label11.setText(data.get(index).get(0).toString());
            textField5.setText(data.get(index).get(1).toString());
            textField6.setText(data.get(index).get(2).toString());
            textField7.setText(data.get(index).get(3).toString());
            dialog2.setModal(true);
            dialog2.setSize(350,300);
            dialog2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "您未选中任意一行!");
        }
    }
    //修改判断
    private void button12MouseClicked(MouseEvent e) {
        // TODO add your code here
        Business business = new Business();
        business.setB_id(Integer.parseInt(label11.getText()));
        business.setB_name(textField5.getText());
        business.setB_userid(textField6.getText());
        business.setB_pwd(textField7.getText());
        if (!business.getB_name().equals("")
                && !business.getB_userid().equals("")
                && !business.getB_pwd().equals("")){
            for (Vector<Object> item:data){
                if(item.contains(business.getB_userid())){
                    JOptionPane.showMessageDialog(null, "该账号已存在!");
                    return;
                }
            }
            if (BusinessController.update(business)){
                showData("");
                JOptionPane.showMessageDialog(null, "修改成功!");
                dialog2.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "修改失败!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "商家信息不能有空!");
        }
    }
    //取消修改
    private void button13MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog2.dispose();
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
        label2 = new JLabel();
        label1 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        separator1 = new JPopupMenu.Separator();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        textField1 = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        dialog1 = new JDialog();
        label3 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        button10 = new JButton();
        button11 = new JButton();
        dialog2 = new JDialog();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        button12 = new JButton();
        button13 = new JButton();
        label11 = new JLabel();
        label12 = new JLabel();

        //======== this ========
        setTitle("\u540e\u53f0\u8fd0\u8425\u7cfb\u7edf");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label2 ----
        label2.setText("icon");
        contentPane.add(label2);
        label2.setBounds(20, 20, 75, 75);

        //---- label1 ----
        label1.setText("Administrator");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(20, 100), label1.getPreferredSize()));

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
        label5.setBounds(new Rectangle(new Point(395, 45), label5.getPreferredSize()));
        contentPane.add(separator1);
        separator1.setBounds(0, 135, 1100, 5);

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
        contentPane.add(button5);
        button5.setBounds(20, 450, 150, 45);

        //---- button6 ----
        button6.setText("\u641c\u7d22");
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button6MouseClicked(e);
            }
        });
        contentPane.add(button6);
        button6.setBounds(930, 150, 75, 30);

        //---- button7 ----
        button7.setText("\u6dfb\u52a0");
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button7MouseClicked(e);
            }
        });
        contentPane.add(button7);
        button7.setBounds(930, 250, 75, 30);

        //---- button8 ----
        button8.setText("\u5220\u9664");
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button8MouseClicked(e);
            }
        });
        contentPane.add(button8);
        button8.setBounds(930, 350, 75, 30);

        //---- button9 ----
        button9.setText("\u4fee\u6539");
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button9MouseClicked(e);
            }
        });
        contentPane.add(button9);
        button9.setBounds(930, 450, 75, 30);
        contentPane.add(textField1);
        textField1.setBounds(205, 150, 700, 30);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(205, 195, 700, scrollPane1.getPreferredSize().height);

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

        //======== dialog1 ========
        {
            dialog1.setTitle("\u6dfb\u52a0\u5546\u5bb6");
            Container dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(null);

            //---- label3 ----
            label3.setText("\u5546\u5bb6\u540d\u79f0\uff1a");
            dialog1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(87, 20), label3.getPreferredSize()));

            //---- label6 ----
            label6.setText("\u8d26\u53f7\uff1a");
            dialog1ContentPane.add(label6);
            label6.setBounds(new Rectangle(new Point(111, 60), label6.getPreferredSize()));

            //---- label7 ----
            label7.setText("\u5bc6\u7801\uff1a");
            dialog1ContentPane.add(label7);
            label7.setBounds(new Rectangle(new Point(111, 100), label7.getPreferredSize()));
            dialog1ContentPane.add(textField2);
            textField2.setBounds(165, 13, 150, 30);
            dialog1ContentPane.add(textField3);
            textField3.setBounds(165, 53, 150, 30);
            dialog1ContentPane.add(textField4);
            textField4.setBounds(165, 93, 150, 30);

            //---- button10 ----
            button10.setText("\u786e\u5b9a");
            button10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button10MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button10);
            button10.setBounds(new Rectangle(new Point(125, 150), button10.getPreferredSize()));

            //---- button11 ----
            button11.setText("\u53d6\u6d88");
            button11.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button11MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button11);
            button11.setBounds(new Rectangle(new Point(250, 150), button11.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialog1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = dialog1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialog1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialog1ContentPane.setMinimumSize(preferredSize);
                dialog1ContentPane.setPreferredSize(preferredSize);
            }
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }

        //======== dialog2 ========
        {
            dialog2.setTitle("\u4fee\u6539\u5546\u5bb6\u4fe1\u606f");
            Container dialog2ContentPane = dialog2.getContentPane();
            dialog2ContentPane.setLayout(null);

            //---- label8 ----
            label8.setText("\u5546\u5bb6\u540d\u79f0\uff1a");
            dialog2ContentPane.add(label8);
            label8.setBounds(new Rectangle(new Point(90, 70), label8.getPreferredSize()));

            //---- label9 ----
            label9.setText("\u8d26\u53f7\uff1a");
            dialog2ContentPane.add(label9);
            label9.setBounds(new Rectangle(new Point(115, 110), label9.getPreferredSize()));

            //---- label10 ----
            label10.setText("\u5bc6\u7801\uff1a");
            dialog2ContentPane.add(label10);
            label10.setBounds(new Rectangle(new Point(115, 150), label10.getPreferredSize()));
            dialog2ContentPane.add(textField5);
            textField5.setBounds(170, 65, 150, 30);
            dialog2ContentPane.add(textField6);
            textField6.setBounds(170, 105, 150, 30);
            dialog2ContentPane.add(textField7);
            textField7.setBounds(170, 145, 150, 30);

            //---- button12 ----
            button12.setText("\u786e\u5b9a");
            button12.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button12MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button12);
            button12.setBounds(new Rectangle(new Point(125, 200), button12.getPreferredSize()));

            //---- button13 ----
            button13.setText("\u53d6\u6d88");
            button13.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button13MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button13);
            button13.setBounds(new Rectangle(new Point(250, 200), button13.getPreferredSize()));

            //---- label11 ----
            label11.setText("text");
            dialog2ContentPane.add(label11);
            label11.setBounds(170, 30, 100, 20);

            //---- label12 ----
            label12.setText("\u5546\u5bb6\u7f16\u53f7\uff1a");
            dialog2ContentPane.add(label12);
            label12.setBounds(new Rectangle(new Point(90, 32), label12.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialog2ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = dialog2ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialog2ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialog2ContentPane.setMinimumSize(preferredSize);
                dialog2ContentPane.setPreferredSize(preferredSize);
            }
            dialog2.pack();
            dialog2.setLocationRelativeTo(dialog2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        label2.setIcon(Imagesinks.png("images/administrator/admin.png",75,75));
        label4.setIcon(Imagesinks.png("images/logo/logo.png",100,100));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label2;
    private JLabel label1;
    private JLabel label4;
    private JLabel label5;
    private JPopupMenu.Separator separator1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JDialog dialog1;
    private JLabel label3;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button10;
    private JButton button11;
    private JDialog dialog2;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton button12;
    private JButton button13;
    private JLabel label11;
    private JLabel label12;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
}
