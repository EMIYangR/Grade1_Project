/*
 * Created by JFormDesigner on Fri May 27 17:39:54 CST 2022
 */

package jw3.c1.view.Main_interface;

import jw3.c1.controller.DiscountController;
import jw3.c1.controller.MerController;
import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Discount;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.Imagesinks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Random;

/**
 * @author Brainrain
 */
public class Coupons1 extends JFrame {
    public Coupons1() {
        initComponents();
        setVisible(true);
        setSize(800,600);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Coupons1 q=new Coupons1();
    }
    public void showdata(){
        DiscountController.SC();
        Userinfo u=UserinfoController.user(Index.zh);
        int sl1=DiscountController.yhall(u.getU_id()).size();//获取用户优惠券数量
        if (sl1<=0){
            JLabel j0=new JLabel("暂无优惠券！");
            button4.setVisible(true);
            j0.setBounds(250,50,100,20);
            Font font=new Font("Microsoft YaHei UI",Font.BOLD,18);
            j0.setFont(font);
            j0.setForeground(Color.red);
            panel1.add(j0);
        }else {
            button4.setVisible(false);
       List<Discount> discountList=DiscountController.yhall(u.getU_id());
       JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(sl1, 1));
        for (int i = 0; i <sl1 ; i++) {
            JPanel panel2=new JPanel();
            panel2.setBounds(20,20,400,100);
            Discount d=discountList.get(i);
            JLabel j1=new JLabel();
            JLabel j2=new JLabel();
            JLabel j3=new JLabel();
            JLabel j4=new JLabel();
            j1.setText(d.getD_name());
            j2.setText(d.getD_details());
            j3.setText("数量");
            j4.setText(String.valueOf(d.getD_value()));
            panel2.setLayout(null);
            Font font=new Font("Microsoft YaHei UI",Font.BOLD,18);
            Font font1=new Font("Microsoft YaHei UI",Font.BOLD,14);
            j1.setBounds(50,20,180,25);
            j1.setFont(font);
            j2.setBounds(230,20,210,25);
            j2.setFont(font1);
            j3.setBounds(450,20,55,25);
            j3.setFont(font1);
            j4.setBounds(510,20,55,25);
            j4.setFont(font1);
            panel2.add(j1);
            panel2.add(j2);
            panel2.add(j3);
            panel2.add(j4);
            panel1.add(panel2);
        }
        scrollPane1.setViewportView(panel1);
        panel1.setPreferredSize(new Dimension(400,100*sl1));
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        setBackground(Color.red);
        button2.setBackground(Color.white);
        scrollPane1.setVisible(true);
    }

    private void button2MouseClicked(MouseEvent e) {
        setBackground(Color.red);
        button1.setBackground(Color.white);
        scrollPane1.setVisible(false);
    }

    private void button3MouseClicked(MouseEvent e) {
        new UserProfile();
        dispose();
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        Random sj=new Random();
        int sum=DiscountController.cxall().size()-1;
        int id=sj.nextInt(sum)+2;
        Discount d=DiscountController.cxid(id);
        String no=sum+2+"EXCCES";
        if (DiscountController.tj(sum+3,no,UserinfoController.user(Index.zh).getU_id(),d.getD_name(),d.getD_details(),d.getD_concessionalrate())){
            showdata();
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        scrollPane1 = new JScrollPane();
        panel1 = new JPanel();
        button4 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("text");
        contentPane.add(label1);
        label1.setBounds(35, 25, 105, 80);

        //---- label2 ----
        label2.setText("\u6635\u79f0\uff1a");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(35, 115, 65, 35);

        //---- label3 ----
        label3.setText("text");
        label3.setForeground(Color.magenta);
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label3);
        label3.setBounds(80, 110, 125, 45);

        //---- button1 ----
        button1.setText("\u6240\u6301\u6709");
        button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        button1.setBackground(Color.red);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(210, 55, 220, 50);

        //---- button2 ----
        button2.setText("\u8fc7\u671f");
        button2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        button2.setForeground(Color.red);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(425, 55, 220, 50);

        //---- button3 ----
        button3.setText("\u8fd4\u56de");
        button3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(35, 195, 90, 50);

        //======== scrollPane1 ========
        {

            //======== panel1 ========
            {
                panel1.setLayout(new GridLayout());
            }
            scrollPane1.setViewportView(panel1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(210, 150, 565, 415);

        //---- button4 ----
        button4.setText("\u70b9\u51fb\u9886\u53d6");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        contentPane.add(button4);
        button4.setBounds(20, 320, 145, 45);

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
        Userinfo U= UserinfoController.user(Index.zh);
        label1.setIcon(Imagesinks.png("images/tx/"+U.getU_headimage(),100,100));
        label3.setText(U.getU_nickname());
        showdata();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JScrollPane scrollPane1;
    private JPanel panel1;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
