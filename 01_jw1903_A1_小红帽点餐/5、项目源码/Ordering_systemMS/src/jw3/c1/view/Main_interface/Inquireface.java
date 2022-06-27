/*
 * Created by JFormDesigner on Fri May 27 02:39:12 CST 2022
 */

package jw3.c1.view.Main_interface;

import jw3.c1.controller.*;
import jw3.c1.model.*;
import jw3.c1.utils.Imagesinks;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author Brainrain
 */
public class Inquireface extends JFrame {
    public Inquireface() {
        initComponents();
        this.setSize(1400,700);
        this.setLocationRelativeTo(null);
        setResizable(false);
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
        heads.add("接单起送时间");
        heads.add("结单时间");
        //2、表数据
        data=new Vector<>();
        if (OrderlistController.getAll(id).size()>0){
            data=OrderlistController.getAll(id);
        }else {
            JOptionPane.showMessageDialog(null,"暂无订单");
            new Index();
            this.setVisible(false);
            dispose();
        }
        //3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm=new DefaultTableModel(data,heads);
        table1.setModel(dtm);
        showData5();
    }
    private void button1MouseClicked(MouseEvent e) {
        new Index();
        dispose();
    }
    public void showData2(){
        int a=data.size();
        showData5();
        Vector<Vector<Object>> d=new Vector<>();
        Vector<Object> head=new Vector<>();
        head.add("消费时间");
        head.add("消费金额");
        for (int i = 0; i <a ; i++) {
            Vector<Object> v=new Vector<>();
            v.add(data.get(i).get(8));
            v.add(xf.get(i));
            d.add(v);
        }
        DefaultTableModel dtm=new DefaultTableModel(d,head);
        table2.setModel(dtm);
    }
    public void showData5(){
        xf=new ArrayList<>();
        if (data.size()>0){
            for (int i = 0; i < data.size(); i++) {
                g=GoodsController.dd(String.valueOf(data.get(i).get(0)));
                v= VipController.vcx(u.getV_viprank());
                int a=g.size();
                double p1=0;
                for (int j = 0; j <a ; j++) {
                    p1+=g.get(j).getG_price().doubleValue();
                }
                double p2=0;
                for (int j = 0; j <a ; j++) {
                    p2+=g.get(j).getG_dprice().doubleValue();
                }
                double p3=0;
                if (!data.get(i).get(4).equals("是")){
                    if (data.get(i).get(5)==null){
                        p3=0;
                    }else {
                        d=DiscountController.yhjg(String.valueOf(data.get(i).get(5)));
                        p3=d.get(0).getD_concessionalrate();
                    }
                }else {
                    p3=0;
                }
                double t=v.getV_discount().doubleValue();
                double p4=0;
                if ((p1-p2)>0){
                    p4=(p1-p2*t)+p3;
                }else {
                    p4=(p2-p2*t)+p3;
                }
                if (!data.get(i).get(7).equals("未支付")){
                    xf.add(Double.valueOf(String.format("%.2f",p1-p4)));
                }else {
                    xf.add(0.0);
                }
            }
        }else {
            xf.add((double) 0);
        }
    }
    public void showData1(String num){
        int index=table1.getSelectedRow();
        g=GoodsController.dd(num);
        v= VipController.vcx(u.getV_viprank());
        int a=g.size();
        JPanel panel3=new JPanel();
        panel3.setLayout(new GridLayout(a, 1));
        for (int i = 0; i < a; i++) {
            JPanel panel=new JPanel();
            JLabel j1=new JLabel();
            JLabel j2=new JLabel();
            JLabel j3=new JLabel();
            JLabel j4=new JLabel();
            j1.setIcon(Imagesinks.png("images/goods/"+g.get(i).getG_url(),160,160));
            j2.setText("菜名:"+g.get(i).getG_name());
            j3.setText("价格:"+g.get(i).getG_price());
            j4.setText("优惠价格:"+g.get(i).getG_dprice());
            j1.setBounds(5,5,160,160);
            j2.setBounds(170,5,160,50);
            j3.setBounds(170,35,160,50);
            j4.setBounds(170,60,160,70);
            panel.setLayout(null);
            panel.setBounds(0,0,300,180);
            panel.add(j1);
            panel.add(j2);
            panel.add(j3);
            panel.add(j4);
            panel3.add(panel);
        }
        scrollPane2.setViewportView(panel3);
        panel3.setPreferredSize(new Dimension(600,180*a));

        double p1=0;
        for (int i = 0; i <a ; i++) {
            p1+=g.get(i).getG_price().doubleValue();
        }
        label4.setText("总价格:￥"+String.format("%.2f",p1));
        double p2=0;
        for (int i = 0; i <a ; i++) {
            p2+=g.get(i).getG_dprice().doubleValue();
        }
        label5.setText("店铺优惠价:￥"+String.format("%.2f",p2));
        double p3=0;
        if (data.get(index).get(4).equals("是")){
            try {
                d=DiscountController.yhjg(String.valueOf(data.get(index).get(5)));
                p3=d.get(0).getD_concessionalrate();
                label9.setText("优惠卷优惠:￥"+p3);
            }catch (Exception e1){
                label9.setText("未使用优惠券");
            }
        }else {
            label9.setText("未使用优惠券");
            p3=0;
        }
        double t=v.getV_discount().doubleValue();
        double p4=0;
        if ((p1-p2)>0){
            p4=(p1-p2*t)+p3;
        }else {
            p4=(p2-p2*t)+p3;
        }
        label3.setText("已优惠:￥"+String.format("%.2f",p4));
        label11.setText("Vip等级折扣:"+t+"折");
        label12.setText("接单起送时间"+data.get(index).get(8));
        label13.setText("结单时间"+data.get(index).get(9));
        if (data.get(index).get(7).equals("已支付")){
            label10.setText("总消费:￥"+String.format("%.2f",p1-p4));
        }else {
            label10.setText("总消费:未支付");
        }
    }
    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();
        String a= (String) data.get(index).get(0);
        m=MerController.dd(a);
        showData1(a);
        label6.setText("订单编号:"+a);
        label7.setText("店铺名称:"+m.getM_name());
        dialog1.setModal(true);
        dialog1.setVisible(true);
        DiscountController.SC();
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

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        Oderfrom1 o=new Oderfrom1();
        o.showData(m.getM_name());
        dispose();
        dialog1.dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        showData2();
        dialog2.setModal(true);
        dialog2.setVisible(true);
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog2.dispose();
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
        panel3 = new JPanel();
        button4 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        button5 = new JButton();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        dialog2 = new JDialog();
        button6 = new JButton();
        panel4 = new JPanel();
        scrollPane3 = new JScrollPane();
        table2 = new JTable();

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
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
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
            label2.setBounds(120, 15, 125, 55);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //======== scrollPane2 ========
                {
                    scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                    //======== panel3 ========
                    {
                        panel3.setLayout(new GridLayout());
                    }
                    scrollPane2.setViewportView(panel3);
                }
                panel2.add(scrollPane2);
                scrollPane2.setBounds(25, 10, 640, 295);

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
            panel2.setBounds(15, 190, 690, 335);

            //---- button4 ----
            button4.setText("\u8fd4\u56de");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button4);
            button4.setBounds(0, 20, 100, 45);
            dialog1ContentPane.add(label3);
            label3.setBounds(720, 385, 235, 50);
            dialog1ContentPane.add(label4);
            label4.setBounds(720, 145, 235, 50);
            dialog1ContentPane.add(label5);
            label5.setBounds(720, 205, 235, 50);

            //---- button5 ----
            button5.setText("\u518d\u6b21\u8fdb\u5e97");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button5);
            button5.setBounds(265, 20, 130, 45);
            dialog1ContentPane.add(label6);
            label6.setBounds(10, 80, 265, 55);
            dialog1ContentPane.add(label7);
            label7.setBounds(320, 80, 530, 55);

            //---- label8 ----
            label8.setText("\u8ba2\u5355\u8be6\u60c5\uff1a");
            dialog1ContentPane.add(label8);
            label8.setBounds(10, 140, 195, 35);
            dialog1ContentPane.add(label9);
            label9.setBounds(720, 265, 235, 50);
            dialog1ContentPane.add(label10);
            label10.setBounds(720, 445, 235, 50);
            dialog1ContentPane.add(label11);
            label11.setBounds(720, 325, 235, 50);
            dialog1ContentPane.add(label12);
            label12.setBounds(455, 15, 345, 45);
            dialog1ContentPane.add(label13);
            label13.setBounds(820, 15, 345, 45);

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

            //---- button6 ----
            button6.setText("\u8fd4\u56de");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button6);
            button6.setBounds(new Rectangle(new Point(10, 10), button6.getPreferredSize()));

            //======== panel4 ========
            {
                panel4.setLayout(null);

                //======== scrollPane3 ========
                {
                    scrollPane3.setViewportView(table2);
                }
                panel4.add(scrollPane3);
                scrollPane3.setBounds(0, 0, 510, 245);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel4.getComponentCount(); i++) {
                        Rectangle bounds = panel4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel4.setMinimumSize(preferredSize);
                    panel4.setPreferredSize(preferredSize);
                }
            }
            dialog2ContentPane.add(panel4);
            panel4.setBounds(new Rectangle(new Point(20, 55), panel4.getPreferredSize()));

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
        scrollPane2.setSize(620,330);
        OrderlistController.xgzt();
        OrderlistController.xgzt1();
        showData(u.getU_id());
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
    private JPanel panel3;
    private JButton button4;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JButton button5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JDialog dialog2;
    private JButton button6;
    private JPanel panel4;
    private JScrollPane scrollPane3;
    private JTable table2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static Vector<Vector<Object>> data;
    public static Mer m;
    public static List<Goods> g;
    public static Vip v;
    public static Userinfo u=UserinfoController.user(Index.zh);
    public static List<Discount> d;
    private static List<Double> xf=new ArrayList<>();
}
