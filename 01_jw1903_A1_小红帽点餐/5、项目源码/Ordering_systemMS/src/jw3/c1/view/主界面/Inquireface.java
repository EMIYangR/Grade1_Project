/*
 * Created by JFormDesigner on Fri May 27 02:39:12 CST 2022
 */

package jw3.c1.view.主界面;

import jw3.c1.view.主界面.Index;

import jw3.c1.controller.GoodsController;
import jw3.c1.controller.OrderlistController;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author Brainrain
 */
public class Inquireface extends JFrame {
    public Inquireface() {
        initComponents();
        this.setSize(1300,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void showData(int id){
        //方式一：一维数组作为表头、二维数组作为数据  缺陷:需要初始化长度、无法动态增删

        //方式二: 给表格设置模型,使用Vector<Object>完成
        //1、表头
        Vector<Object> heads=new Vector<Object>();
        heads.add("订单编号");
        heads.add("送餐电话");
        heads.add("送餐地址");
        heads.add("订单状态");
        heads.add("是否使用优惠券");
        heads.add("优惠券编码");
        heads.add("支付方式");
        heads.add("支付状态");
        //2、表数据
        data= OrderlistController.getAll(id);
        //3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm=new DefaultTableModel(data,heads);
        table1.setModel(dtm);
        //table1=new JTable(dtm);   等同上面，但会增加开销
    }
    private void button1MouseClicked(MouseEvent e) {
        new Index();
        dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.setModal(true);
        dialog1.setVisible(true);
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.dispose();
    }

    private void scrollPane1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void table1MouseClicked(MouseEvent e) {
        // TODO add your code here
        button2.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        dialog1 = new JDialog();
        label2 = new JLabel();
        panel2 = new JPanel();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        button4 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u6211\u7684\u8ba2\u5355");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
        contentPane.add(label1);
        label1.setBounds(25, 5, 140, 45);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //======== scrollPane1 ========
            {
                scrollPane1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        scrollPane1MouseClicked(e);
                    }
                });

                //---- table1 ----
                table1.setPreferredScrollableViewportSize(new Dimension(1150, 400));
                table1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        table1MouseClicked(e);
                    }
                });
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(40, 35, 1205, 395);

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
        panel1.setBounds(15, 105, 1265, 435);

        //---- button1 ----
        button1.setText("\u8fd4\u56de");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(540, 15, 160, 40);

        //---- button2 ----
        button2.setText("\u8be6\u60c5");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(335, 15, 160, 40);

        //---- button3 ----
        button3.setText("\u6d88\u8d39\u8bb0\u5f55");
        contentPane.add(button3);
        button3.setBounds(25, 55, 135, 40);

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

            //---- label2 ----
            label2.setText("\u8be6\u60c5\uff1a");
            label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
            dialog1ContentPane.add(label2);
            label2.setBounds(25, 15, 100, 55);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(table2);
                }
                panel2.add(scrollPane2);
                scrollPane2.setBounds(15, 15, 560, 200);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            dialog1ContentPane.add(panel2);
            panel2.setBounds(35, 75, 585, 230);

            //---- button4 ----
            button4.setText("\u8fd4\u56de");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button4);
            button4.setBounds(170, 20, 100, 45);

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
        showData(1);
        button2.setVisible(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JDialog dialog1;
    private JLabel label2;
    private JPanel panel2;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
}
