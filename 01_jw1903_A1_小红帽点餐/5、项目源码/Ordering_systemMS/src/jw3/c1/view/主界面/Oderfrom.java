/*
 * Created by JFormDesigner on Thu May 26 19:48:13 CST 2022
 */

package jw3.c1.view.主界面;

import java.awt.event.*;
import jw3.c1.controller.GoodsController;
import jw3.c1.controller.MerController;
import jw3.c1.model.Goods;
import jw3.c1.model.Mer;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author Brainrain
 */
public class Oderfrom extends JFrame {
    public Oderfrom() {
        this.setSize(1200,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        initComponents();
    }
    //1、全查  2、模糊查
    private void showData(String user){
        //方式一：一维数组作为表头、二维数组作为数据  缺陷:需要初始化长度、无法动态增删

        //方式二: 给表格设置模型,使用Vector<Object>完成
        //1、表头
        Vector<Object> heads=new Vector<Object>();
        heads.add("菜品ID");
        heads.add("菜名");
        heads.add("店铺ID");
        heads.add("店铺");
        heads.add("价格");
        heads.add("优惠价格");
        heads.add("配送时间");
        //2、表数据
        data= GoodsController.getAll(user);
        //3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm=new DefaultTableModel(data,heads);
        table1.setModel(dtm);
        //table1=new JTable(dtm);   等同上面，但会增加开销
    }
    //点击菜品显示菜品详情按钮，进行点餐
    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();//获取选择第一行的所索引
        int id=(int)data.get(index).get(0);
        g=GoodsController.spcx(id);

        m=MerController.dpcx(MerController.spdp(id));
        label4.setText(g.getG_name());
        //获取菜品图片
        label7.setIcon(Imagesinks.png("images/goods/"+g.getG_url(),160,120));
        label6.setText(m.getM_name());//店铺名称
        label9.setText(m.getM_phone());//店铺电话
        label11.setText("<html>"+m.getM_des()+"<br />"+"<html>");//店铺详情
        label22.setText("<html>"+m.getM_address()+"<br />"+"<html>");//店铺地址
        label18.setText(String.valueOf(g.getG_price()));//价格
        label20.setText(String.valueOf(g.getG_dprice()));//优惠价格
        dialog1.setModal(true);
        dialog1.setVisible(true);

    }
    //接受是否点击菜品
    private void table1MouseClicked(MouseEvent e) {
        // TODO add your code here
        button1.setVisible(true);
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        JOptionPane.showMessageDialog(null,"加入购物车成功");
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        new Index();
        dispose();
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        showData(textField1.getText());
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button2 = new JButton();
        textField1 = new JTextField();
        button6 = new JButton();
        dialog1 = new JDialog();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        button5 = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(26, 37));
        setTitle("\u70b9\u9910");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u70b9\u51fb\u83dc\u54c1\u67e5\u770b\u8be6\u60c5\uff1a");
            label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 28));
            panel1.add(label1);
            label1.setBounds(10, 5, 260, 35);

            //---- button1 ----
            button1.setText("\u83dc\u54c1\u8be6\u60c5");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(325, 5, 235, 35);

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
        panel1.setBounds(0, 0, 575, 45);

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(1200, 250));
            panel2.setLayout(new FlowLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setMinimumSize(new Dimension(20, 20));

                //---- table1 ----
                table1.setPreferredScrollableViewportSize(new Dimension(1150, 400));
                table1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                table1.setBackground(new Color(255, 255, 204));
                table1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        table1MouseClicked(e);
                    }
                });
                scrollPane1.setViewportView(table1);
            }
            panel2.add(scrollPane1);
        }
        contentPane.add(panel2);
        panel2.setBounds(0, 125, 1200, 400);

        //---- button2 ----
        button2.setText("\u8fd4\u56de");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(25, 65, 150, 45);
        contentPane.add(textField1);
        textField1.setBounds(220, 67, 390, 40);

        //---- button6 ----
        button6.setText("\u641c\u7d22");
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button6MouseClicked(e);
            }
        });
        contentPane.add(button6);
        button6.setBounds(615, 65, 90, 45);

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
            dialog1.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
            dialog1.setBackground(new Color(255, 204, 204));
            Container dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(null);

            //---- label2 ----
            label2.setText("\u8be6\u60c5\uff1a");
            label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            dialog1ContentPane.add(label2);
            label2.setBounds(10, 5, 90, 40);

            //---- label3 ----
            label3.setText("\u83dc\u540d\uff1a");
            dialog1ContentPane.add(label3);
            label3.setBounds(10, 50, 85, 35);
            dialog1ContentPane.add(label4);
            label4.setBounds(130, 50, 120, 45);

            //---- label5 ----
            label5.setText("\u5e97\u94fa\u540d\uff1a");
            dialog1ContentPane.add(label5);
            label5.setBounds(260, 10, 130, 35);

            //---- label6 ----
            label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
            dialog1ContentPane.add(label6);
            label6.setBounds(400, -8, 355, 70);
            dialog1ContentPane.add(label7);
            label7.setBounds(10, 95, 220, 185);

            //---- label8 ----
            label8.setText("\u5e97\u94fa\u7535\u8bdd\uff1a");
            dialog1ContentPane.add(label8);
            label8.setBounds(260, 100, 125, 38);
            dialog1ContentPane.add(label9);
            label9.setBounds(400, 100, 270, 40);

            //---- label10 ----
            label10.setText("\u5e97\u94fa\u4ecb\u7ecd\uff1a");
            dialog1ContentPane.add(label10);
            label10.setBounds(260, 155, 110, 35);

            //---- label11 ----
            label11.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
            dialog1ContentPane.add(label11);
            label11.setBounds(400, 150, 360, 90);

            //---- button3 ----
            button3.setText("\u5e97\u94fa\u8bc4\u4ef7");
            dialog1ContentPane.add(button3);
            button3.setBounds(260, 255, 130, 40);

            //---- button4 ----
            button4.setText("\u52a0\u5165\u8d2d\u7269\u8f66");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button4);
            button4.setBounds(555, 285, 155, 55);

            //---- label17 ----
            label17.setText("\u5f53\u524d\u4ef7\u683c\uff1a");
            dialog1ContentPane.add(label17);
            label17.setBounds(260, 325, 120, 30);
            dialog1ContentPane.add(label18);
            label18.setBounds(400, 320, 115, 40);

            //---- label19 ----
            label19.setText("\u4f18\u60e0\u4ef7\u683c\uff1a");
            label19.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            dialog1ContentPane.add(label19);
            label19.setBounds(260, 370, 115, 40);

            //---- label20 ----
            label20.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            dialog1ContentPane.add(label20);
            label20.setBounds(400, 370, 115, 40);

            //---- label21 ----
            label21.setText("\u5e97\u94fa\u5730\u5740\uff1a");
            dialog1ContentPane.add(label21);
            label21.setBounds(10, 285, 120, 30);
            dialog1ContentPane.add(label22);
            label22.setBounds(10, 320, 225, 85);

            //---- button5 ----
            button5.setText("\u53d6\u6d88");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button5);
            button5.setBounds(555, 350, 155, 50);

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
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        showData("");
        button1.setVisible(false);

    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JButton button1;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button2;
    private JTextField textField1;
    private JButton button6;
    private JDialog dialog1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JButton button3;
    private JButton button4;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
    private static Mer m;
    private static Goods g;
}
