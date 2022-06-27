/*
 * Created by JFormDesigner on Fri May 20 11:52:09 CST 2022
 */

package jw3.c1.view.Main_interface;

import jw3.c1.controller.DiscountController;
import jw3.c1.controller.GoodsController;
import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Discount;
import jw3.c1.model.Goods;
import jw3.c1.utils.Imagesinks;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Brainrain
 */
public class ShoppingTrolley1 extends JFrame {
    public ShoppingTrolley1() {
        initComponents();
        this.setSize(1200,900);
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ShoppingTrolley1 s=new ShoppingTrolley1();
    }
    public void showdata2(){
        i1=-1;
        Double[] sum= new Double[]{0.0,0.0};
        JPanel panel2=new JPanel();
        panel2.setLayout(new GridLayout(Index.map.size(), 1));
        for (Map.Entry<Integer, Integer> entry : Index.map.entrySet()) {
            List<Goods> goods=GoodsController.sel1();
            i1++;
            Goods goods1=goods.get(i1);
            JPanel panel=new JPanel();
            panel.setBounds(50,50,830,200);
            JLabel j1=new JLabel();
            String[] zs=new String[4];
            int aa=0;
            for (int i = 0; i < goods.size(); i++) {
                if (goods.get(i).getG_id()==entry.getKey()){
                    zs[aa++]=goods.get(i).getG_url();
                    zs[aa++]= String.valueOf(goods.get(i).getG_price());
                    zs[aa++]= String.valueOf(goods.get(i).getG_dprice());
//                    pdjg(zs[1],zs[2],goods.get(i).getG_id());
                    zs[aa++]=goods.get(i).getG_name();
                    break;
                }
            }
            j1.setIcon(Imagesinks.png("images/goods/"+zs[0],200,200));
            JLabel j2=new JLabel("菜名:"+zs[3]);
            JLabel j3=new JLabel("原价:"+zs[1]);
            sum[0]+=Double.parseDouble(zs[1]);
            JLabel j4=new JLabel("优惠价："+zs[2]);
            sum[1]+=Double.parseDouble(zs[2]);
            JLabel j5=new JLabel("数量:");
            JSpinner j6=new JSpinner();
            JButton b2=new JButton("撤销这类菜");
            j6.setValue(entry.getValue());
            //设置大小
            j1.setBounds(50,50,100,100);
            j2.setBounds(160,75,200,30);Font font=new Font("Microsoft YaHei UI",Font.BOLD,18);j2.setFont(font);
            j3.setBounds(380,75,100,30);Font font1=new Font("Microsoft YaHei UI",Font.BOLD,14);j3.setFont(font1);
            j4.setBounds(500,75,150,30);j4.setFont(font1);
            j5.setBounds(670,75,50,30);j5.setFont(font1);
            j6.setBounds(700,75,60,30);
            b2.setBounds(650,120,100,30);b2.setFont(font1);
            panel.setLayout(null);
            panel.add(j1);
            panel.add(j2);
            panel.add(j3);
            panel.add(j4);
            panel.add(j5);
            panel.add(j6);
            panel.add(b2);
            panel2.add(panel);
            c =entry.getValue();
            b2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    Goods goods=GoodsController.spcx(entry.getKey());
                    int gid=goods.getG_id();
                    if (JOptionPane.showConfirmDialog(null,"确认撤销吗?")==0){
                        for (int i = 0; i <Menu_page.l.size(); i++) {
                            if (Menu_page.l.get(i).getG_id()==gid){
                                Menu_page.l.remove(i);
                                i--;
                            }
                        }
                        Index.map.clear();
                        pdsl1();
                    }
                    showdata2();
                }
            });
            j6.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    c=entry.getValue();
                    Goods goods2=GoodsController.spcx(entry.getKey());
                    if ((int)(((JSpinner)e.getSource()).getValue())>c){
                        c1=(int)(((JSpinner)e.getSource()).getValue());
                        Index.map.replace(entry.getKey(),(entry.getValue()+(c1-c)));
                        for (int i = 0; i <(c1-c); i++) {
                            Menu_page.l.add(goods2);
                        }
                        c=entry.getValue();
                        a1.setText("");
                        a2.setText("");
                        showdata2();
                    }else{
                        if ((int)(((JSpinner)e.getSource()).getNextValue())<=1){
                            JOptionPane.showMessageDialog(null,"商品数量不能为负数或不能为零！");
                            ((JSpinner) e.getSource()).setValue(0);
                        }else {
                            c1=(int)(((JSpinner)e.getSource()).getValue());
                            Index.map.replace(entry.getKey(),(entry.getValue()-(c-c1)));
                            int sum1=0,xb=0;
                            for (int i = 0; i <(c-c1); i++) {
                                for (int j = 0; j < Menu_page.l.size(); j++) {
                                    if (sum1==(c-c1)){
                                        break;
                                    }else {
                                        if (goods2.getG_id()==(Menu_page.l.get(j).getG_id())){
                                            Menu_page.l.remove(j);
                                            sum1++;
                                        }
                                    }
                                }
                            }
                            c =entry.getValue();
                            a1.setText("");
                            a2.setText("");
                            showdata2();
                        }
                    }
                }
            });
        }

        JComboBox comboBox=new JComboBox();
        List<Discount> d=DiscountController.yhall1(UserinfoController.xxcx(Index.zh).get(0).getU_id());
        comboBox.addItem("无");
        if (UserProfile.xyjf>=60&&Menu_page.l.size()>0) {
        for (int i = 0; i < d.size(); i++) {
            comboBox.addItem(d.get(i).getD_name());
        }
        }
        try {
            comboBox.setSelectedIndex(Index.yhqxz);
        }catch (Exception e){
            comboBox.setSelectedIndex(0);
        }

            comboBox.addItemListener(e -> {
                Index.yhqxz = comboBox.getSelectedIndex();
                String x = String.valueOf(comboBox.getSelectedItem());
                if (x.equals("无")) {
                    Index.dname = "";
                    yh = 0.0;
                    a1.setText("");
                    a2.setText("");
                    showdata2();
                } else {
                    Index.dname = x;
                    yh = (double) DiscountController.yhjg1(x);
                    a1.setText("");
                    a2.setText("");
                    showdata2();
                }
            });

        for (int i = 0; i < Menu_page.l.size(); i++) {
            yjg=Double.parseDouble(String.valueOf(Menu_page.l.get(i).getG_dprice().add(BigDecimal.valueOf(yjg))));
            jg=Double.parseDouble(String.valueOf(Menu_page.l.get(i).getG_price().add(BigDecimal.valueOf(jg))));
            zyjg=yjg;
            zjg=jg;
        }
        yjg-=yh;
        a1.setText("原价:" + jg);
        a2.setText("优惠价:" + yjg);
        zyjg=yjg;
        yjg=0.0;
        jg=0.0;
        yh=0.0;
        JButton a3=new JButton("确认支付");
        Font font3=new Font("Microsoft YaHei UI",Font.BOLD,14);
        Font font2=new Font("Microsoft YaHei UI",Font.BOLD,16);
        comboBox.setBounds(150,45,200,30);
        a1.setBounds(380,45,100,30);
        a1.setFont(font3);
        a2.setBounds(500,45,150,30);
        a2.setFont(font2);
        a2.setForeground(Color.red);
        a3.setBounds(670,45,150,30);a3.setFont(font2);
        panel3.add(comboBox);
        panel3.add(a1);
        panel3.add(a2);
        panel3.add(a3);
        scrollPane1.setViewportView(panel2);
        panel2.setPreferredSize(new Dimension(830,200*Index.map.size()));
        a3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (Menu_page.l.size()>0){
                if (UserinfoController.address()!=null&&!UserinfoController.address().equals("")){
                int a=JOptionPane.showConfirmDialog(null,"确定要付款吗？","付款提示",0);
                if (a==0){
                    for (int i = 0; i < Index.map.size(); i++) {
                        Index.map.clear();
                        Index.count=0;
                        dispose();
                        new Payment();
                    }
                }
            }else {
                    JOptionPane.showMessageDialog(null,"你的收货地址为空，不能支付订单");
                    dispose();
                    new UserProfile();
                    Index.map.clear();
                    Index.count=0;
                }
            }else {
                    JOptionPane.showMessageDialog(null,"你未添加商品");
                }
            }
        });
    }

    private void button1MouseClicked(MouseEvent e) {
        if (Index.gwcpd==1){
            new Index();
            Index.map.clear();
            Index.count=0;
        }else {
            new Menu_page();
            Index.map.clear();
            Index.count=0;
        }
        dispose();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        panel2 = new JPanel();
        button1 = new JButton();
        panel3 = new JPanel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8d2d\u7269\u8f66");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
        label1.setIcon(null);
        contentPane.add(label1);
        label1.setBounds(20, 10, 100, 40);

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                //======== panel2 ========
                {
                    panel2.setLayout(new GridLayout());
                }
                scrollPane1.setViewportView(panel2);
            }
            panel1.add(scrollPane1);
        }
        contentPane.add(panel1);
        panel1.setBounds(200, 100, 800, 500);

        //---- button1 ----
        button1.setText("\u8fd4\u56de");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(385, 25), button1.getPreferredSize()));

        //======== panel3 ========
        {
            panel3.setLayout(null);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel3.getComponentCount(); i++) {
                    Rectangle bounds = panel3.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel3.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel3.setMinimumSize(preferredSize);
                panel3.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel3);
        panel3.setBounds(200, 600, 800, 100);

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
        if (Index.count==0)pdsl1();showdata2();
        if (UserProfile.xyjf<60)JOptionPane.showMessageDialog(null,"由于你是黑名单，你不能享受优惠券服务,请尽快解除黑名单");

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JPanel panel2;
    private JButton button1;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static int i1=0;//下标
    public static int c;//商品数量
    public static int c1;//商品数量
    public static Double[][] sp=new Double[Index.map.size()][2];
    public static Double jg=0.0;//总价格（原价）
    public static Double zjg=0.0;//总价格（原价）
    public static Double yjg=0.0;//总价格（优惠价）
    public static Double zyjg=0.0;//总价格（优惠价）
    public static Double yh=0.0;//优惠券的折扣
    public static JLabel a1=new JLabel();
    public static JLabel a2=new JLabel();
    public  void pdsl1(){
        List<Goods> cfd=new ArrayList<>();
        for (Goods s : Menu_page.l) {
            if (Index.map.containsKey(s.getG_id())){
                cfd.add(s);
                Integer num =Index.map.get(s.getG_id());
                Index.map.put(s.getG_id(),num+1);
            }else {
                Index.map.put(s.getG_id(),1);
            }
        }
        Index.count=1;
    }
}
