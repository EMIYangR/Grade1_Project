/*
 * Created by JFormDesigner on Fri Jun 10 09:39:12 CST 2022
 */

package jw3.c1.view.Main_interface;

import java.awt.event.*;

import jw3.c1.controller.*;
import jw3.c1.model.*;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Payment extends JFrame {
    public Payment() {
        initComponents();
        this.setVisible(true);
        setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600,400);
    }
    public void showData(){

        int a=g.size();
        v= VipController.vcx(u.getV_viprank());
        double p1=0;
        for (int j = 0; j <a ; j++) {
            p1+=g.get(j).getG_price().doubleValue();
        }
        double p2=0;
        for (int j = 0; j <a ; j++) {
            p2+=g.get(j).getG_dprice().doubleValue();
        }
        double t=v.getV_discount().doubleValue();
        double p4=ShoppingTrolley1.zyjg;
        if (p4>0){
            p4*=t;
        }else {
            p4=0;
        }
        label4.setText(String.valueOf(p4));
//        if (!Index.dname.equals("")){
//            System.out.println(Index.dname);
//            label5.setText("支持");
//        }else {
//            System.out.println(Index.dname);
//            label5.setText("不支持");
//        }
        label7.setIcon(Imagesinks.png("images/logo/sk.png",220,220));
        dialog1.setSize(330,370);
        String name="";
        if (Index.dname.equals("")){
            name="未使用优惠券";
            label5.setText("不支持");
        }else {
            name=Index.dname;
            label5.setText("支持");
        }
        label8.setText(name);
    }

    private void comboBox1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.setVisible(true);

    }
    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        Random rdm=new Random();
        char[] a=new char[]{'A','B','C','D','E','F','G',
                'H','I','J','K','L','M','N','O','P','Q','R','S',
                'T','U','V','W','X','Y','Z'};
        String b1="";
        String d1="1";
        int c=rdm.nextInt(7);
        for (int i = 0; i <7; i++) {
            if (i== c){
                c=rdm.nextInt(9)+1;
                b1+=c;
            }
            b1+= String.valueOf(a[rdm.nextInt(26)]);
        }
        for (int i = 0; i <10 ; i++) {
            d1+=rdm.nextInt(9);
        }
        String a1;
        if (Index.dname.equals("")){
            a1="0";
        }else {
            a1="1";
        }

        String a2="";
        String a3="";
        if (radioButton1.isSelected()){
            a3="微信";
        }
        if (radioButton2.isSelected()){
            a3="支付宝";
        }
        if (radioButton3.isSelected()){
            a3="云闪付";
        }
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=new Date(System.currentTimeMillis());

        String a4=f.format(d);
        long time1=30*60*1000;
        d=new Date(System.currentTimeMillis()+time1);
        String a5=f.format(d);
        long time2=(rdm.nextInt(20)+10)*60*1000;
        d=new Date(System.currentTimeMillis()+time2);
        String a6=f.format(d);
        if (OrderlistController.add1(0,b1,u.getU_phone(),u.getU_address(),"等待出货",a1,
                DiscountController.yhjg2(Index.dname),a3,"已支付",m.getM_id(),u.getU_id(),a4,a5,a6)){
            ord=OrderlistController.orde();
            boolean blo=true;
            for (int i = 0; i <Menu_page.l.size() ; i++) {
                if ( OrderderailsController.add1
                            (OrderderailsController.cx()+1,ord.getO_id(),Menu_page.l.get(i).getM_id(),Menu_page.l.get(i).getG_id())){
                    blo=true;
                }else {
                    blo=false;
                    break;
                }
            }
            if (blo){
                JOptionPane.showMessageDialog(null,"支付成功");
                DiscountController.sc(UserinfoController.user(Index.zh).getU_id(),DiscountController.yhjg2(Index.dname));
                if (UserProfile.xyjf<=95){
                    UserinfoController.xyjf1(u.getU_id());
                    PrestigeController.xyjf(u.getU_id());
                }
                dialog1.dispose();
                Menu_page.l.clear();
                new Index();
                dispose();
            }else {
                JOptionPane.showMessageDialog(null,"支付失败");
            }
        }else {
            JOptionPane.showMessageDialog(null,"支付失败");
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        Random rdm=new Random();
        char[] a=new char[]{'A','B','C','D','E','F','G',
                'H','I','J','K','L','M','N','O','P','Q','R','S',
                'T','U','V','W','X','Y','Z'};
        String b1="";
        String d1="1";
        int c=rdm.nextInt(7);
        for (int i = 0; i <7; i++) {
            if (i== c){
                c=rdm.nextInt(9)+1;
                b1+=c;
            }
            b1+= String.valueOf(a[rdm.nextInt(26)]);
        }
        for (int i = 0; i <10 ; i++) {
            d1+=rdm.nextInt(9);
        }
        String a1;
        if (Index.dname.equals("")){
            a1="0";
        }else {
            a1="1";
        }
        String a2="";
        String a3="";
        if (radioButton1.isSelected()){
            a3="微信";
        }
        if (radioButton2.isSelected()){
            a3="支付宝";
        }
        if (radioButton3.isSelected()){
            a3="云闪付";
        }
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=new Date(System.currentTimeMillis());

        String a4=f.format(d);
        String a5=null;
        String a6=null;
        if (JOptionPane.showConfirmDialog(null,"确认取消支付嘛，逃单行为将扣除信誉积分")==0){
            if (OrderlistController.add1(0,b1,u.getU_phone(),u.getU_address(),"已被用户取消",a1,
                    DiscountController.yhjg2(Index.dname),a3,"未支付",m.getM_id(),u.getU_id(),a4,a5,a6)){
                JOptionPane.showMessageDialog(null,"已取消交易");
                Index.count=0;
                UserinfoController.xyjf(u.getU_id());
                PrestigeController.xyjf(u.getU_id());
                new ShoppingTrolley1();
                dispose();
                JOptionPane.showMessageDialog(null,"由于你未支付，系统将扣除你的信誉分");
            }else {
                JOptionPane.showMessageDialog(null,"取消失败");
            }
        }

    }

    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here

    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label1 = new JLabel();
        label2 = new JLabel();
        radioButton3 = new JRadioButton();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label8 = new JLabel();
        dialog1 = new JDialog();
        label7 = new JLabel();
        button3 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

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
        panel1.setBounds(new Rectangle(new Point(20, 5), panel1.getPreferredSize()));

        //---- radioButton1 ----
        radioButton1.setText("\u5fae\u4fe1");
        contentPane.add(radioButton1);
        radioButton1.setBounds(115, 92, 135, 40);

        //---- radioButton2 ----
        radioButton2.setText("\u4e91\u95ea\u4ed8");
        contentPane.add(radioButton2);
        radioButton2.setBounds(400, 92, 135, 40);

        //---- label1 ----
        label1.setText("\u652f\u4ed8\u65b9\u5f0f");
        contentPane.add(label1);
        label1.setBounds(10, 92, 95, 40);

        //---- label2 ----
        label2.setText("\u662f\u5426\u6ee1\u8db3\u4f7f\u7528\u4f18\u60e0\u5238");
        contentPane.add(label2);
        label2.setBounds(10, 155, 230, 45);

        //---- radioButton3 ----
        radioButton3.setText("\u652f\u4ed8\u5b9d");
        contentPane.add(radioButton3);
        radioButton3.setBounds(255, 92, 135, 40);

        //---- label3 ----
        label3.setText("\u6d88\u8d39\u91d1\u989d\uff1a");
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
        contentPane.add(label3);
        label3.setBounds(15, 10, 150, 55);

        //---- label4 ----
        label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
        contentPane.add(label4);
        label4.setBounds(205, 10, 130, 55);
        contentPane.add(label5);
        label5.setBounds(265, 155, 105, 45);

        //---- label6 ----
        label6.setText("\u6240\u4f7f\u7528\u4f18\u60e0\u5238");
        contentPane.add(label6);
        label6.setBounds(10, 210, 130, 40);

        //---- button1 ----
        button1.setText("\u786e\u8ba4\u652f\u4ed8");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(70, 265, 125, 45);

        //---- button2 ----
        button2.setText("\u53d6\u6d88\u652f\u4ed8");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(255, 265, 125, 45);

        //---- label8 ----
        label8.setHorizontalAlignment(SwingConstants.LEFT);
        label8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label8);
        label8.setBounds(235, 200, 120, 45);

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
            dialog1ContentPane.add(label7);
            label7.setBounds(50, 10, 220, 220);

            //---- button3 ----
            button3.setText("\u652f\u4ed8");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button3);
            button3.setBounds(90, 240, 140, 45);

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

        u= UserinfoController.geta(UserinfoController.xxcx(Index.zh).get(0).getU_id());
        g=GoodsController.all(Menu_page.l.get(0).getM_id());
        for(Map.Entry<Integer, Integer> entry: Index.map.entrySet()){
            g.add(GoodsController.spcx(entry.getKey()));
        }
//        g=GoodsController.all(Integer.parseInt(Index.zh));
        d= DiscountController.yhall(UserinfoController.xxcx(Index.zh).get(0).getU_id());
        m=MerController.cx(Menu_page.l.get(0).getM_id());
        v=VipController.vcx(UserinfoController.user(Index.zh).getV_viprank());
//        u= UserinfoController.geta(1);用户id
//        g=GoodsController.all(1);从购物车里面获取
//        d= DiscountController.yhall(1);用户id
//        m=MerController.cx(1);店铺id
//        v=VipController.vcx(1);用户的vip等级
        ButtonGroup bg=new ButtonGroup();
        radioButton1.setSelected(true);
        bg.add(radioButton1);
        bg.add(radioButton2);
        bg.add(radioButton3);
        dialog1.setModal(true);
        showData();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label1;
    private JLabel label2;
    private JRadioButton radioButton3;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JButton button1;
    private JButton button2;
    private JLabel label8;
    private JDialog dialog1;
    private JLabel label7;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static List<Goods> g=new ArrayList<>();//购物车里面的所有商品
    public static Mer m;//获取对应店铺
    public static Userinfo u;//获取购买商品的用户
    public static Vip v;//通过用户vip等级获取
    public static List<Discount> d;//获取用户对应的优惠券
    private static Orderlist ord;
    private static double jg=ShoppingTrolley1.zyjg;
}
