/*
 * Created by JFormDesigner on Mon May 30 16:39:55 CST 2022
 */

package jw3.c1.view.Administrator;

import jw3.c1.controller.*;
import jw3.c1.model.*;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Brainrain
 */
public class CouponManagement extends JFrame {
    public CouponManagement() {
        initComponents();
        showData("");
        this.setVisible(true);
        this.setSize(1080,720);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void showData(String user) {
        //1、表头
        Vector<Object> heads = new Vector<Object>();
        heads.add("优惠券编号");
        heads.add("优惠券编码");
        heads.add("用户ID");
        heads.add("优惠券名称");
        heads.add("优惠券详情");
        heads.add("是否与vip等级折扣叠加");
        heads.add("优惠价格");
        heads.add("优惠所需总额");
        //2、表数据
        data = DiscountController.getAll(user);
        //3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm = new DefaultTableModel(data, heads);
        table1.setModel(dtm);
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        new AdministratorIndex();
        this.setVisible(false);
    }
    //搜索
    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        showData(textField1.getText());
    }
    //添加
    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.setModal(true); //模态框
        dialog1.setSize(400,400);
        dialog1.setVisible(true);//显示出来
    }
    //添加判断
    private void button10MouseClicked(MouseEvent e) {
        // TODO add your code here
        Discount discount = new Discount();
        discount.setD_couuponnum(textField2.getText());
        discount.setU_id(Integer.parseInt(textField3.getText()));
        discount.setD_name(textField4.getText());
        discount.setD_details(textField5.getText());
        discount.setD_overlying(textField6.getText());
        discount.setD_concessionalrate(Integer.parseInt(textField7.getText()));
        discount.setD_value(Integer.parseInt(textField8.getText()));
        boolean add1 = (!discount.getD_couuponnum().equals("")
                && discount.getU_id() != 0
                && !discount.getD_name().equals("")
                && !discount.getD_details().equals("")
                && !discount.getD_overlying().equals("")
                && discount.getD_concessionalrate() != 0
                && discount.getD_value() != 0);
        if(add1){
            for (Vector<Object> v : data) {
                if (v.get(1).equals(discount.getD_couuponnum())) {
                    JOptionPane.showMessageDialog(null, "优惠券编号已存在！");
                    return;
                }
            }
            if (DiscountController.add(discount)) {
                showData("");
                JOptionPane.showMessageDialog(null, "添加成功！");
                dialog1.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "添加失败！");
            }
        } else {
            JOptionPane.showMessageDialog(null, "优惠券信息不能有空！");
        }
    }
    //关闭添加
    private void button11MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.dispose();
    }
    //删除
    private void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
        int row = table1.getSelectedRow();
        if (row != -1){
            if (JOptionPane.showConfirmDialog(null, "确定删除吗？") == 0){
                int id = (int) data.get(row).get(0);
                DiscountController d = new DiscountController();
//                if (DiscountController.delete(id)) {
//                    showData("");
//                    JOptionPane.showMessageDialog(null, "删除成功");
//                } else {
//                    JOptionPane.showMessageDialog(null, "删除失败");
//                }
                if (d.delete(id)){
                    JOptionPane.showMessageDialog(null, "删除成功!");
                    this.showData("");//刷新
                }else{
                    JOptionPane.showMessageDialog(null, "删除失败!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "您未选中任意一行!");
        }
    }
    //修改
    private void button9MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();//选中行的索引
        if (index!=-1){//是否选中了一行
            label20.setText(data.get(index).get(0).toString());
            textField9.setText(data.get(index).get(1).toString());
            textField10.setText(data.get(index).get(2).toString());
            textField11.setText(data.get(index).get(3).toString());
            textField12.setText(data.get(index).get(4).toString());
            textField13.setText(data.get(index).get(5).toString());
            textField14.setText(data.get(index).get(6).toString());
            textField15.setText(data.get(index).get(7).toString());
            //后展示对话框
            dialog2.setModal(true); //模态框
            dialog2.setSize(400,400);
            dialog2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "您未选中任意一行!");
        }
    }
    //修改判断
    private void button12MouseClicked(MouseEvent e) {
        // TODO add your code here
        Discount discount = new Discount();
        discount.setD_couponid(Integer.parseInt(label20.getText()));
        discount.setD_couuponnum(textField9.getText());
        discount.setU_id(Integer.parseInt(textField10.getText()));
        discount.setD_name(textField11.getText());
        discount.setD_details(textField12.getText());
        discount.setD_overlying(textField13.getText());
        discount.setD_concessionalrate(Integer.parseInt(textField14.getText()));
        discount.setD_value(Integer.parseInt(textField15.getText()));
        boolean add1 = (!discount.getD_couuponnum().equals("")
                && discount.getU_id() != 0
                && !discount.getD_name().equals("")
                && !discount.getD_details().equals("")
                && !discount.getD_overlying().equals("")
                && discount.getD_concessionalrate() != 0
                && discount.getD_value() != 0);
        if (add1) {
            for (Vector<Object> v : data) {
                if (v.get(1).equals(discount.getD_couuponnum())) {
                    JOptionPane.showMessageDialog(null, "优惠券编号已存在！");
                    return;
                }
            }
            if (DiscountController.update(discount)) {
                showData("");
                JOptionPane.showMessageDialog(null, "修改成功！");
                dialog2.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "修改失败！");
            }
        } else {
            JOptionPane.showMessageDialog(null, "优惠券信息不能有空！");
        }
    }
    //关闭修改
    private void button13MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog2.dispose();
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
        label4 = new JLabel();
        label5 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        separator1 = new JPopupMenu.Separator();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        textField1 = new JTextField();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        dialog1 = new JDialog();
        label3 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        button10 = new JButton();
        button11 = new JButton();
        dialog2 = new JDialog();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        textField9 = new JTextField();
        textField10 = new JTextField();
        textField11 = new JTextField();
        textField12 = new JTextField();
        textField13 = new JTextField();
        textField14 = new JTextField();
        textField15 = new JTextField();
        button12 = new JButton();
        button13 = new JButton();
        label19 = new JLabel();
        label20 = new JLabel();

        //======== this ========
        setTitle("\u540e\u53f0\u8fd0\u8425\u7cfb\u7edf");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

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
        label5.setBounds(new Rectangle(new Point(395, 45), label5.getPreferredSize()));

        //---- label1 ----
        label1.setText("Administrator");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(20, 100), label1.getPreferredSize()));

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
        contentPane.add(separator1);
        separator1.setBounds(0, 135, 1100, 5);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(205, 210, 700, scrollPane1.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(205, 150, 700, 30);

        //---- button6 ----
        button6.setText("\u641c\u7d22");
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button6MouseClicked(e);
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
            Container dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(null);

            //---- label3 ----
            label3.setText("\u4f18\u60e0\u5238\u7f16\u7801\uff1a");
            dialog1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(75, 20), label3.getPreferredSize()));

            //---- label6 ----
            label6.setText("\u7528\u6237ID\uff1a");
            dialog1ContentPane.add(label6);
            label6.setBounds(new Rectangle(new Point(99, 60), label6.getPreferredSize()));

            //---- label7 ----
            label7.setText("\u4f18\u60e0\u5238\u540d\u79f0\uff1a");
            dialog1ContentPane.add(label7);
            label7.setBounds(new Rectangle(new Point(75, 100), label7.getPreferredSize()));

            //---- label8 ----
            label8.setText("\u4f18\u60e0\u5238\u8be6\u60c5\uff1a");
            dialog1ContentPane.add(label8);
            label8.setBounds(new Rectangle(new Point(75, 140), label8.getPreferredSize()));

            //---- label9 ----
            label9.setText("\u662f\u5426\u4e0evip\u7b49\u7ea7\u6298\u6263\u53e0\u52a0\uff1a");
            dialog1ContentPane.add(label9);
            label9.setBounds(new Rectangle(new Point(9, 180), label9.getPreferredSize()));

            //---- label10 ----
            label10.setText("\u4f18\u60e0\u4ef7\u683c\uff1a");
            dialog1ContentPane.add(label10);
            label10.setBounds(new Rectangle(new Point(87, 220), label10.getPreferredSize()));

            //---- label11 ----
            label11.setText("\u4f18\u60e0\u6240\u9700\u603b\u989d\uff1a");
            dialog1ContentPane.add(label11);
            label11.setBounds(new Rectangle(new Point(63, 260), label11.getPreferredSize()));
            dialog1ContentPane.add(textField2);
            textField2.setBounds(165, 13, 150, 30);
            dialog1ContentPane.add(textField3);
            textField3.setBounds(165, 53, 150, 30);
            dialog1ContentPane.add(textField4);
            textField4.setBounds(165, 93, 150, 30);
            dialog1ContentPane.add(textField5);
            textField5.setBounds(165, 133, 150, 30);
            dialog1ContentPane.add(textField6);
            textField6.setBounds(165, 173, 150, 30);
            dialog1ContentPane.add(textField7);
            textField7.setBounds(165, 213, 150, 30);
            dialog1ContentPane.add(textField8);
            textField8.setBounds(165, 253, 150, 30);

            //---- button10 ----
            button10.setText("\u786e\u5b9a");
            button10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button10MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button10);
            button10.setBounds(new Rectangle(new Point(75, 300), button10.getPreferredSize()));

            //---- button11 ----
            button11.setText("\u53d6\u6d88");
            button11.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button11MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button11);
            button11.setBounds(new Rectangle(new Point(200, 300), button11.getPreferredSize()));

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
            Container dialog2ContentPane = dialog2.getContentPane();
            dialog2ContentPane.setLayout(null);

            //---- label12 ----
            label12.setText("\u4f18\u60e0\u5238\u7f16\u7801\uff1a");
            dialog2ContentPane.add(label12);
            label12.setBounds(new Rectangle(new Point(75, 45), label12.getPreferredSize()));

            //---- label13 ----
            label13.setText("\u7528\u6237ID\uff1a");
            dialog2ContentPane.add(label13);
            label13.setBounds(new Rectangle(new Point(99, 85), label13.getPreferredSize()));

            //---- label14 ----
            label14.setText("\u4f18\u60e0\u5238\u540d\u79f0\uff1a");
            dialog2ContentPane.add(label14);
            label14.setBounds(new Rectangle(new Point(75, 125), label14.getPreferredSize()));

            //---- label15 ----
            label15.setText("\u4f18\u60e0\u5238\u8be6\u60c5\uff1a");
            dialog2ContentPane.add(label15);
            label15.setBounds(new Rectangle(new Point(75, 165), label15.getPreferredSize()));

            //---- label16 ----
            label16.setText("\u662f\u5426\u4e0evip\u7b49\u7ea7\u6298\u6263\u53e0\u52a0\uff1a");
            dialog2ContentPane.add(label16);
            label16.setBounds(new Rectangle(new Point(9, 205), label16.getPreferredSize()));

            //---- label17 ----
            label17.setText("\u4f18\u60e0\u4ef7\u683c\uff1a");
            dialog2ContentPane.add(label17);
            label17.setBounds(new Rectangle(new Point(87, 245), label17.getPreferredSize()));

            //---- label18 ----
            label18.setText("\u4f18\u60e0\u6240\u9700\u603b\u989d\uff1a");
            dialog2ContentPane.add(label18);
            label18.setBounds(new Rectangle(new Point(63, 285), label18.getPreferredSize()));
            dialog2ContentPane.add(textField9);
            textField9.setBounds(165, 40, 150, 30);
            dialog2ContentPane.add(textField10);
            textField10.setBounds(165, 80, 150, 30);
            dialog2ContentPane.add(textField11);
            textField11.setBounds(165, 120, 150, 30);
            dialog2ContentPane.add(textField12);
            textField12.setBounds(165, 160, 150, 30);
            dialog2ContentPane.add(textField13);
            textField13.setBounds(165, 200, 150, 30);
            dialog2ContentPane.add(textField14);
            textField14.setBounds(165, 240, 150, 30);
            dialog2ContentPane.add(textField15);
            textField15.setBounds(165, 280, 150, 30);

            //---- button12 ----
            button12.setText("\u786e\u5b9a");
            button12.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button12MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button12);
            button12.setBounds(new Rectangle(new Point(75, 325), button12.getPreferredSize()));

            //---- button13 ----
            button13.setText("\u53d6\u6d88");
            button13.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button13MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button13);
            button13.setBounds(new Rectangle(new Point(200, 325), button13.getPreferredSize()));

            //---- label19 ----
            label19.setText("\u4f18\u60e0\u5238\u7f16\u53f7\uff1a");
            dialog2ContentPane.add(label19);
            label19.setBounds(new Rectangle(new Point(75, 10), label19.getPreferredSize()));

            //---- label20 ----
            label20.setText("text");
            dialog2ContentPane.add(label20);
            label20.setBounds(165, 10, 100, 20);

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
    private JLabel label4;
    private JLabel label5;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPopupMenu.Separator separator1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JTextField textField1;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JDialog dialog1;
    private JLabel label3;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton button10;
    private JButton button11;
    private JDialog dialog2;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JButton button12;
    private JButton button13;
    private JLabel label19;
    private JLabel label20;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
}
