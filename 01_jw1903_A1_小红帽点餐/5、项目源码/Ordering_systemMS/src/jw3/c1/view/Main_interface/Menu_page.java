/*
 * Created by JFormDesigner on Mon May 30 17:06:46 CST 2022
 */

package jw3.c1.view.Main_interface;


import jw3.c1.controller.GoodsController;
import jw3.c1.controller.MerController;
import jw3.c1.model.Goods;
import jw3.c1.model.Mer;
import jw3.c1.utils.Imagesinks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Brainrain
 */
public class Menu_page extends JFrame {
    public Menu_page() {
        initComponents();
        setSize(1200,800);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Menu_page s=new Menu_page();
    }
    private  void showData1(String a){
        //1、获取所有数据
        Mer merList= MerController.dpcx(Oderfrom1.id);
        cd=MerController.dpcxo(Oderfrom1.id).size();
        label1.setText("<html>地址："+merList.getM_name()+"<br /></html>");
        label2.setIcon(Imagesinks.png("images/mer/"+merList.getM_url(),100,100));
        label3.setText("<html>电话："+merList.getM_phone()+"<br /></html>");
        label4.setText("<html>简介："+merList.getM_des()+"<br /></html>");
        List<Goods> goods =new ArrayList<>();
        if (pd==0){
            goods=GoodsController.sp(Oderfrom1.id);//全查
        }else if(pd==1){
            goods=GoodsController.sp1(Oderfrom1.id,textField1.getText());//搜索商品
        }else if(pd==2){
                goods=GoodsController.zhj(Oderfrom1.id);//优惠商品
        }
        if (pd==2&& Objects.equals(a, "综合")){
            goods=GoodsController.sp(Oderfrom1.id);
        }
        if (pd==1&&goods.size()==0){
            JOptionPane.showMessageDialog(null,"暂无商品！");
            goods=GoodsController.sp(Oderfrom1.id);
        }
        JPanel panel2=new JPanel();
        panel2.setLayout(new GridLayout(goods.size(), 1));
        //2、循环生成控件，做动态绑定
        for (int i = 0; i < goods.size(); i++) {
            JPanel panel=new JPanel();
            JPanel panel1=new JPanel();
            Goods g= goods.get(i);
            JLabel j1=new JLabel();
            j1.setIcon(Imagesinks.png("images/goods/"+g.getG_url(),200,200));
            j1.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) //鼠标进入
                {
                    j1.setForeground(Color.blue);
                    j1.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                public void mouseExited(MouseEvent e) //鼠标移除
                {
                    j1.setForeground(Color.black);
                    setCursor(Cursor.getDefaultCursor());
                }
            });
            JLabel j2=new JLabel("菜品编号:"+g.getG_id());
            JLabel j3=new JLabel("菜名:"+g.getG_name());
            JLabel j4=new JLabel("价格："+g.getG_price());
            JLabel j5=new JLabel("特惠价格"+g.getG_dprice());
            JButton b1=new JButton("加入购物车");
            //设置大小
            j1.setBounds(10,10,200,200);
            j2.setBounds(220,10,100,30);Font font=new Font("Microsoft YaHei UI",Font.BOLD,18);j2.setFont(font);
            j3.setBounds(220,50,100,30);Font font1=new Font("Microsoft YaHei UI",Font.BOLD,14);j3.setFont(font1);
            j4.setBounds(220,100,150,30);Font font2=new Font("Microsoft YaHei UI",Font.BOLD,14);j4.setFont(font2);
            j5.setBounds(220,150,150,30);Font font3=new Font("Microsoft YaHei UI",Font.BOLD,14);j5.setFont(font3);
            b1.setBounds(620,150,150,50);Font font4=new Font("Microsoft YaHei UI",Font.BOLD,14);b1.setFont(font4);b1.setVisible(false);

            //添加进入panel
            panel.setLayout(null);
            panel.setSize(900,300);
            panel.add(j1);
            panel.add(j2);
            panel.add(j3);
            panel.add(j4);
            panel.add(j5);
            panel.add(b1);

            int finalI = i;
            j1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    b1.setVisible(true);
                }
            });
            b1.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    JOptionPane.showMessageDialog(null,g.getG_name()+"已成功添加1份");
                    l.add(g);
                    for (int j = 0; j <l.size()-1 ; j++) {
                        if (g.getM_id()!=l.get(j).getM_id()){
                            JOptionPane.showMessageDialog(null,"现在暂时只能点一家店！");
                            int w=l.size();
                            l.remove(w-1);
                            JOptionPane.showMessageDialog(null,g.getG_name()+"已移除");
                            break;
                        }
                    }
                    label5.setText(String.valueOf(l.size()));
                    if (!label5.getText().equals("0")){
                        button7.setIcon(Imagesinks.png("images/tb/gwc.png",50,50));
                    }else {
                        button7.setIcon(Imagesinks.png("images/tb/gwc1.png",50,50));
                    }
                    showData1("");
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            panel1.add(panel);
            panel2.add(panel);
        }
        panel2.setPreferredSize(new Dimension(700,300*goods.size()));
        scrollPane2.setViewportView(panel2);
    }


    private void button1MouseClicked(MouseEvent e) {
        Oderfrom1 o=new Oderfrom1();
        dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        pd=1;
        showData1(textField1.getText());
    }

    private void button7MouseClicked(MouseEvent e) {
        new ShoppingTrolley1();
        Index.gwcpd=0;
        Index.count=0;
        dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        new Evaluate();
        dispose();
    }

    private void button4MouseClicked(MouseEvent e) {
        new Index();
        dispose();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        panel2 = new JPanel();
        button1 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        comboBox1 = new JComboBox();
        textField1 = new JTextField();
        button2 = new JButton();
        button7 = new JButton();
        button3 = new JButton();
        label5 = new JLabel();
        button4 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //======== scrollPane2 ========
            {

                //======== panel2 ========
                {
                    panel2.setLayout(new GridLayout());
                }
                scrollPane2.setViewportView(panel2);
            }
            panel1.add(scrollPane2);
            scrollPane2.setBounds(0, 0, 800, 500);

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
        panel1.setBounds(250, 150, 800, 500);

        //---- button1 ----
        button1.setText("\u8fd4\u56de");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(810, 50, 80, 45);

        //---- label1 ----
        label1.setText("text");
        contentPane.add(label1);
        label1.setBounds(0, 150, 250, 40);
        contentPane.add(label2);
        label2.setBounds(30, 10, 160, 140);

        //---- label3 ----
        label3.setText("text");
        contentPane.add(label3);
        label3.setBounds(0, 215, 250, 35);

        //---- label4 ----
        label4.setText("text");
        label4.setHorizontalTextPosition(SwingConstants.LEADING);
        label4.setVerticalAlignment(SwingConstants.TOP);
        contentPane.add(label4);
        label4.setBounds(0, 280, 250, 130);
        contentPane.add(comboBox1);
        comboBox1.setBounds(250, 100, 150, 50);
        contentPane.add(textField1);
        textField1.setBounds(445, 50, 280, 45);

        //---- button2 ----
        button2.setText("\u641c\u7d22");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(725, 50, button2.getPreferredSize().width, 45);

        //---- button7 ----
        button7.setText("\u8d2d\u7269\u8f66");
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button7MouseClicked(e);
            }
        });
        contentPane.add(button7);
        button7.setBounds(0, 550, 160, 70);

        //---- button3 ----
        button3.setText("\u8bc4\u8bba");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(0, 450, 160, 70);

        //---- label5 ----
        label5.setText("text");
        label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        label5.setForeground(Color.red);
        contentPane.add(label5);
        label5.setBounds(160, 550, 40, 25);

        //---- button4 ----
        button4.setText("\u4e3b\u754c\u9762");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        contentPane.add(button4);
        button4.setBounds(265, 35, 140, 45);

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
        showData1("");
        comboBox1.addItem("综合");
        comboBox1.addItem("折扣商品");
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String xz= String.valueOf(comboBox1.getSelectedItem());
                pd=2;
                showData1(xz);
            }
        });
        label5.setText(String.valueOf(l.size()));
        button3.setIcon(Imagesinks.png("images/tb/pl.png",50,50));
        if (!label5.getText().equals("0")){
            button7.setIcon(Imagesinks.png("images/tb/gwc.png",50,50));
        }else {
            button7.setIcon(Imagesinks.png("images/tb/gwc1.png",50,50));
        }

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JPanel panel2;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton button2;
    private JButton button7;
    private JButton button3;
    private JLabel label5;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static List<Goods> l=new ArrayList<>();
    public static int pd=0;
    public static int cd;
    public static int[] i2=new int[cd];

}
