/*
 * Created by JFormDesigner on Tue May 31 18:08:23 CST 2022
 */

package jw3.c1.view.Main_interface;

import jw3.c1.controller.GoodsController;
import jw3.c1.controller.MerController;
import jw3.c1.controller.MertypeController;
import jw3.c1.model.Goods;
import jw3.c1.model.Mer;
import jw3.c1.model.Mertype;
import jw3.c1.utils.Imagesinks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * @author Brainrain
 */
public class Oderfrom1 extends JFrame {
    public Oderfrom1() {

//        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(1200,750);
        setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
    }
    public void showData(String name){
        if(mt_id==0){
             m= MerController.sel2(name);
        }else {
            m=MerController.dpcx1(Integer.parseInt(name));
            if (m.size()==0){
                JOptionPane.showMessageDialog(null,"该店铺暂无商品!");
                showData(String.valueOf(1));
                comboBox1.setSelectedIndex(1);
            }
        }
        JPanel panel3=new JPanel(); 
        panel3.setLayout(new GridLayout(m.size(), 1));
        for (int i = 0; i < m.size(); i++) {
            JPanel panel=new JPanel();
            panel.setBounds(50,50,800,300);
            Mer m1=m.get(i);
            JLabel j=new JLabel();
            j.setIcon(Imagesinks.png("images/mer/"+m1.getM_url(),200,200));
            JLabel j1=new JLabel();
            JLabel j2=new JLabel();
            JLabel j3=new JLabel();
            JButton b1=new JButton("详情");
            j1.setText("<html>店铺名称:"+m1.getM_name()+"<br />"+"<html>");
            j2.setText("<html>店铺类型:"+MertypeController.tpl(m1.getMt_id()).get(0).getMt_name()+"<br />"+"<html>");
            j3.setText("<html>店铺地址:"+m1.getM_address()+"<br />"+"<html>");
            //给店铺设置大小
            panel.setLayout(null);
            j.setBounds(50,50,200,200);
            j1.setBounds(280,50,580,30);Font font=new Font("Microsoft YaHei UI",Font.BOLD,18);
            j1.setFont(font);
            j2.setBounds(280,100,200,50);Font font1=new Font("Microsoft YaHei UI",Font.BOLD,14);
            j2.setFont(font1);
            j3.setBounds(280,200,580,50);Font font2=new Font("Microsoft YaHei UI",Font.BOLD,14);
            j3.setFont(font2);
            b1.setBounds(750,200,150,50);
            b1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    id=m1.getM_id();
                    e.setSource(m1.getM_id());
                    btnmouseClicked(e);

                }
            });
            panel.add(j);
            panel.add(j1);
            panel.add(j2);
            panel.add(j3);
            panel.add(b1);
            panel3.add(panel);

        }
        scrollPane1.setViewportView(panel3);
        panel3.setPreferredSize(new Dimension(800,300*m.size()));

    }
    private void btnmouseClicked(MouseEvent e){
        if (GoodsController.sp(id).size()==0){
            JOptionPane.showMessageDialog(null,"该店暂无商品！");
        }else {
            Menu_page s=new Menu_page();
            dispose();
        }
    }

    private void panel3MouseClicked(MouseEvent e) {
        // TODO add your code here

    }
    private void button3MouseClicked(MouseEvent e) {
        if (GoodsController.sp(id).size()==0){
            JOptionPane.showMessageDialog(null,"该店暂无商品！");
        }else {
        Menu_page s=new Menu_page();
        dispose();
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        new Index();
        dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        mt_id=0;
        showData(textField1.getText());
        setVisible(true);
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        textField1 = new JTextField();
        button2 = new JButton();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        panel3 = new JPanel();
        comboBox1 = new JComboBox();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("\u8fd4\u56de");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(840, 70, 85, 35);
        contentPane.add(textField1);
        textField1.setBounds(415, 70, 320, 35);

        //---- button2 ----
        button2.setText("\u641c\u7d22");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(755, 70, 85, 35);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout());

            //======== scrollPane1 ========
            {

                //======== panel3 ========
                {
                    panel3.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            panel3MouseClicked(e);
                        }
                    });
                    panel3.setLayout(new GridLayout());
                }
                scrollPane1.setViewportView(panel3);
            }
            panel2.add(scrollPane1);
        }
        contentPane.add(panel2);
        panel2.setBounds(145, 140, 1000, 600);
        contentPane.add(comboBox1);
        comboBox1.setBounds(145, 95, 125, 45);

        //---- label1 ----
        label1.setIcon(new ImageIcon("D:\\Users\\EMI\\Desktop\\\u5c0f\u827e\u7c73\u7684\u82e6\u903c\u9879\u76ee\\\u5353\u8d8a\u9879\u76ee\u7ba1\u7406\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\background\\bjxf.jpg"));
        contentPane.add(label1);
        label1.setBounds(0, 0, 1200, 750);

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
        mt_id=0;
        showData("");
//        scrollPane1.setSize(850,400);
        List<Mertype> l=MertypeController.cx2();
        comboBox1.addItem("综合");
        for (int i = 0; i < l.size(); i++) {
            comboBox1.addItem(l.get(i).getMt_name());
        }
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mt_id=1;
                Object name=comboBox1.getSelectedItem();
                if (name=="综合"){
                    mt_id=0;
                    showData("");
                }else {
                int id=MertypeController.cx1(String.valueOf(name));
                showData(String.valueOf(id));}
            }
        });
//        JLabel lblBackground = new JLabel(); // 创建一个标签组件对象
//        ImageIcon icon = new ImageIcon("images/background/bj2.jpg"); // 创建背景图片对象
//        lblBackground.setIcon(Imagesinks.png(String.valueOf(icon),1000,1000)); // 设置标签组件要显示的图标
//        lblBackground.setBounds(0, 0,1000, 500); // 设置组件的显示位置及大小
////        this.add(label1); // 将组件添加到面板中
//        this.getContentPane().add(lblBackground);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JTextField textField1;
    private JButton button2;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JPanel panel3;
    private JComboBox comboBox1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static List<Mer> m;//店铺
    private static List<Mertype> my;//店铺
    private static List<Goods> g;//店铺
    public static int id;
    public static int mt_id=0;
}
