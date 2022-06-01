/*
 * Created by JFormDesigner on Sun May 29 12:10:29 CST 2022
 */

package jw3.c1.view.主界面;

import java.awt.event.*;
import jw3.c1.controller.MerController;
import jw3.c1.controller.MertypeController;
import jw3.c1.model.Mer;
import jw3.c1.model.Mertype;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.util.List;
import java.util.Random;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class dc extends JFrame {
    public dc() {
        initComponents();
        setVisible(true);
        setBounds(200,200,1000,850);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        dc d=new dc();
    }

    private void comboBox1FocusLost(FocusEvent e) {
        xz=2;
        yc1();
        ys=1;
        List<Mer> m;
        Object xz1=comboBox1.getItemAt(comboBox1.getSelectedIndex());
        lx=xz1;
        if (xz1!="综合"){
            m=MerController.dpcx1(MertypeController.cx1(String.valueOf(xz1)));
        }else {
            m=MerController.sel1();
        }
        cd=m.size();
        if (cd>4&&ys==1){
            sy=cd-4;
            cd-=sy;
            System.out.println("下拉框"+cd);
        }else if (cd>8&&ys==1){
            sy=cd-8;
            cd-=sy;
        }else if(cd>12){
            sy=cd-12;
            cd-=sy;
        }
        yc(cd);
        try {
            tup(m,cd);
            dpmz(m,cd);
            dz(m,cd);
        }catch (Exception e1){
            JOptionPane.showMessageDialog(null,"暂无店铺！");
        }
        jg();
        pf();

    }

    private void button1MouseClicked(MouseEvent e) {
        xz=3;
        yc1();
        ys=1;
        String a=textField1.getText();
        List<Mer> l= MerController.sel4(a);
        cd=l.size();
        System.out.println("搜索按钮"+cd);
        if (cd>12&&ys==1){
            sy=cd-12;
            cd-=12;
            System.out.println("搜索按钮"+cd);
        }else if (cd>8&&ys==1){
            sy=cd-8;
            cd-=8;
            System.out.println("搜索按钮"+cd);
        }else if(cd>4&&ys==1){
            sy=cd-4;
            cd-=sy;
            System.out.println("搜索按钮"+cd);
        }
        try {
            yc(cd);
            tup(l,cd);
            dpmz(l,cd);
            dz(l,cd);
        }catch (Exception e1){
            JOptionPane.showMessageDialog(null,"暂无店铺！");
        }
        jg();
        pf();
    }

    private void button3MouseClicked(MouseEvent e) {
        List<Mer> l=P();
        try {

            if (ys<2){
                ys+=1;
                cd+=sy;
                yc1();
                yc(cd);
                try {
                    tup(l,cd);
                    jg();
                    dpmz(l,cd);
                    pf();
                    dz(l,cd);
                }catch (Exception e2){
                    JOptionPane.showMessageDialog(null,"暂无店铺！");
                }

                System.out.println(l.get(4).getM_name());
            }else {
                JOptionPane.showMessageDialog(null,"已到最后页");
            }
        }catch (Exception e1){
            JOptionPane.showMessageDialog(null,"已到最后页1");
        }
        System.out.println(cd);
        System.out.println("页数"+ys);
        if (ys>1){

            System.out.println("显示"+sy);
        }else {
            yc(cd);
        }

    }

    private void button2MouseClicked(MouseEvent e) {
        List<Mer> l=P();
        if (ys>1){
            ys-=1;
            cd-=sy;
        }else {
            JOptionPane.showMessageDialog(null,"已到首页");
        }
        System.out.println(cd);
        System.out.println("页数"+ys);
        if (ys>1){
            yc1();
            yc(cd);
            System.out.println("显示"+sy);
        }else {
            yc(cd);
        }
        yc(cd);
        tup(l,cd);
        jg();
        dpmz(l,cd);
        pf();
        dz(l,cd);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        panel3 = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        panel2 = new JPanel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        panel4 = new JPanel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        panel5 = new JPanel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label25 = new JLabel();
        label26 = new JLabel();
        comboBox1 = new JComboBox();
        label17 = new JLabel();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(textField1);
        textField1.setBounds(470, 25, 295, 45);

        //---- button1 ----
        button1.setText("\u641c\u7d22");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(762, 25, button1.getPreferredSize().width, 45);

        //======== scrollPane1 ========
        {

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //======== panel1 ========
                {
                    panel1.setLayout(null);
                    panel1.add(label1);
                    label1.setBounds(20, 20, 120, 100);

                    //---- label2 ----
                    label2.setText("\u5e97\u94fa\u540d");
                    label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel1.add(label2);
                    label2.setBounds(150, 0, 220, 55);

                    //---- label3 ----
                    label3.setText("\u8bc4\u5206");
                    label3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                    label3.setForeground(Color.orange);
                    panel1.add(label3);
                    label3.setBounds(155, 55, 35, 25);

                    //---- label4 ----
                    label4.setText("\u5730\u5740");
                    panel1.add(label4);
                    label4.setBounds(155, 70, 245, 65);

                    //---- label19 ----
                    label19.setText("\u5e73\u5747\u4ef7\u683c");
                    label19.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel1.add(label19);
                    label19.setBounds(430, 55, 80, 25);

                    //---- label20 ----
                    label20.setText("text");
                    label20.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel1.add(label20);
                    label20.setBounds(510, 50, 40, 35);

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
                panel3.add(panel1);
                panel1.setBounds(0, 0, 610, 140);

                //======== panel2 ========
                {
                    panel2.setLayout(null);
                    panel2.add(label5);
                    label5.setBounds(20, 20, 120, 100);

                    //---- label6 ----
                    label6.setText("\u5e97\u94fa\u540d");
                    label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel2.add(label6);
                    label6.setBounds(155, 0, 220, 50);

                    //---- label7 ----
                    label7.setText("\u8bc4\u5206");
                    label7.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                    label7.setForeground(Color.orange);
                    panel2.add(label7);
                    label7.setBounds(155, 55, 35, 25);

                    //---- label8 ----
                    label8.setText("\u5730\u5740");
                    panel2.add(label8);
                    label8.setBounds(155, 70, 245, 65);

                    //---- label21 ----
                    label21.setText("\u5e73\u5747\u4ef7\u683c");
                    label21.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel2.add(label21);
                    label21.setBounds(430, 55, 80, 25);

                    //---- label22 ----
                    label22.setText("text");
                    label22.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel2.add(label22);
                    label22.setBounds(510, 50, 40, 35);

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
                panel3.add(panel2);
                panel2.setBounds(0, 150, 610, 140);

                //======== panel4 ========
                {
                    panel4.setLayout(null);
                    panel4.add(label9);
                    label9.setBounds(20, 20, 120, 100);

                    //---- label10 ----
                    label10.setText("\u5e97\u94fa\u540d");
                    label10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel4.add(label10);
                    label10.setBounds(155, 0, 220, 50);

                    //---- label11 ----
                    label11.setText("\u8bc4\u5206");
                    label11.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                    label11.setForeground(Color.orange);
                    panel4.add(label11);
                    label11.setBounds(155, 55, 35, 25);

                    //---- label12 ----
                    label12.setText("\u5730\u5740");
                    panel4.add(label12);
                    label12.setBounds(155, 70, 245, 65);

                    //---- label23 ----
                    label23.setText("\u5e73\u5747\u4ef7\u683c");
                    label23.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel4.add(label23);
                    label23.setBounds(430, 55, 80, 25);

                    //---- label24 ----
                    label24.setText("text");
                    label24.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel4.add(label24);
                    label24.setBounds(510, 50, 40, 35);

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
                panel3.add(panel4);
                panel4.setBounds(0, 300, 610, 140);

                //======== panel5 ========
                {
                    panel5.setLayout(null);
                    panel5.add(label13);
                    label13.setBounds(20, 20, 120, 100);

                    //---- label14 ----
                    label14.setText("\u5e97\u94fa\u540d");
                    label14.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel5.add(label14);
                    label14.setBounds(155, 0, 220, 50);

                    //---- label15 ----
                    label15.setText("\u8bc4\u5206");
                    label15.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                    label15.setForeground(Color.orange);
                    panel5.add(label15);
                    label15.setBounds(155, 55, 35, 25);

                    //---- label16 ----
                    label16.setText("\u5730\u5740");
                    panel5.add(label16);
                    label16.setBounds(155, 70, 245, 65);

                    //---- label25 ----
                    label25.setText("\u5e73\u5747\u4ef7\u683c");
                    label25.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel5.add(label25);
                    label25.setBounds(430, 55, 80, 25);

                    //---- label26 ----
                    label26.setText("text");
                    label26.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                    panel5.add(label26);
                    label26.setBounds(510, 50, 40, 35);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel5.getComponentCount(); i++) {
                            Rectangle bounds = panel5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel5.setMinimumSize(preferredSize);
                        panel5.setPreferredSize(preferredSize);
                    }
                }
                panel3.add(panel5);
                panel5.setBounds(0, 450, 610, 140);

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
            scrollPane1.setViewportView(panel3);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(220, 120, 670, 200);

        //---- comboBox1 ----
        comboBox1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                comboBox1FocusLost(e);
            }
        });
        contentPane.add(comboBox1);
        comboBox1.setBounds(300, 82, 110, 40);

        //---- label17 ----
        label17.setText("\u7c7b\u578b");
        label17.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
        contentPane.add(label17);
        label17.setBounds(245, 85, 50, 35);

        //---- button2 ----
        button2.setText("\u4e0a\u4e00\u9875");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(490, 690, 78, 30);

        //---- button3 ----
        button3.setText("\u4e0b\u4e00\u9875");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(565, 690, 78, 30);

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

        List<Mertype> l=MertypeController.cx2();
        comboBox1.addItem("综合");
        for (int i = 0; i < l.size(); i++) {
            comboBox1.addItem(l.get(i).getMt_name());
        }
        show1();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JPanel panel3;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label19;
    private JLabel label20;
    private JPanel panel2;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label21;
    private JLabel label22;
    private JPanel panel4;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label23;
    private JLabel label24;
    private JPanel panel5;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label25;
    private JLabel label26;
    private JComboBox comboBox1;
    private JLabel label17;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static int xz=1;
    public static int sy=4;
    public static int ys=1;
    public static int cd=4;
    public static Object lx;
    public void show1(){
        List<Mer> l=MerController.sel1();
//        for (int i = 0; i <l.size() ; i++) {
//            System.out.println(l.get(i).getM_url());
//        }
        panel1.setVisible(true);
        panel2.setVisible(true);
        panel4.setVisible(true);
        panel5.setVisible(true);
        tup(l,4);
        jg();
        dpmz(l,4);
        pf();
        dz(l,4);

    }
    public ImageIcon tp(List<Mer> a,int i){
        ImageIcon i1=Imagesinks.png("images/mer/"+a.get(i).getM_url(),100,100);
        return i1;
    }
    public void tup(List<Mer> l,int a){
        switch (ys){
            case 1:
                switch (a){
                    case 4:
                        label13.setIcon(tp(l,3));
                    case 3:
                        label9.setIcon(tp(l,2));
                    case 2:
                        label5.setIcon(tp(l,1));
                    case 1:
                        label1.setIcon(tp(l,0));
                }break;
            case 2:
                switch (a-4){
                    case 4:
                        label13.setIcon(tp(l,7));
                    case 3:
                        label9.setIcon(tp(l,6));
                    case 2:
                        label5.setIcon(tp(l,5));
                    case 1:
                        label1.setIcon(tp(l,4));
                }break;
        }

    }
    public void jg(){
            int[] a=MerController.sel2();

        label20.setText(String.valueOf(a[0]));
        label22.setText(String.valueOf(a[1]));
        label24.setText(String.valueOf(a[2]));
        label26.setText(String.valueOf(a[3]));
    }
    public void dpmz(List<Mer> a,int b){
        switch (ys){
            case 1:
                switch (b){
                    case 4:
                        label14.setText("<html>"+a.get(3).getM_name()+"<br /></html>");
                    case 3:
                        label10.setText("<html>"+a.get(2).getM_name()+"<br /></html>");
                    case 2:
                        label6.setText("<html>"+a.get(1).getM_name()+"<br /></html>");
                    case 1:
                        label2.setText("<html>"+a.get(0).getM_name()+"<br /></html>");
                }break;
            case 2:
                switch (b-4){
                    case 4:
                        label14.setText("<html>"+a.get(7).getM_name()+"<br /></html>");
                    case 3:
                        label10.setText("<html>"+a.get(6).getM_name()+"<br /></html>");
                    case 2:
                        label6.setText("<html>"+a.get(5).getM_name()+"<br /></html>");
                    case 1:
                        label2.setText("<html>"+a.get(4).getM_name()+"<br /></html>");
                }
        }



    }
    public void pf(){
        Random r=new Random();
        int[] sj=new int[4];
        for (int i = 0; i <sj.length ; i++) {
            sj[i]=r.nextInt(4)+1;
        }
        label3.setText(String.valueOf(sj[0])+"分");
        label7.setText(String.valueOf(sj[1])+"分");
        label11.setText(String.valueOf(sj[2])+"分");
        label15.setText(String.valueOf(sj[3])+"分");
    }
    public void dz(List<Mer> a,int b){
        switch (ys){
            case 1:
                switch (b){
                    case 4:
                        label16.setText("<html>"+a.get(3).getM_address()+"<br /></html>");
                    case 3:
                        label12.setText("<html>"+a.get(2).getM_address()+"<br /></html>");
                    case 2:
                        label8.setText("<html>"+a.get(1).getM_address()+"<br /></html>");
                    case 1:
                        label4.setText("<html>"+a.get(0).getM_address()+"<br /></html>");
                }break;
            case 2:
                switch (b-4){
                    case 4:
                        label16.setText("<html>"+a.get(7).getM_address()+"<br /></html>");
                    case 3:
                        label12.setText("<html>"+a.get(6).getM_address()+"<br /></html>");
                    case 2:
                        label8.setText("<html>"+a.get(5).getM_address()+"<br /></html>");
                    case 1:
                        label4.setText("<html>"+a.get(4).getM_address()+"<br /></html>");
                }break;
        }



    }
    public void yc(int a){
        switch (ys){
            case 1:
                switch (a){
                    case 4:
                        panel5.setVisible(true);
                    case 3:
                        panel4.setVisible(true);
                    case 2:
                        panel2.setVisible(true);
                    case 1:
                        panel1.setVisible(true);
                }break;
            case 2:
                switch (a-4){
                    case 4:
                        panel5.setVisible(true);
                    case 3:
                        panel4.setVisible(true);
                    case 2:
                        panel2.setVisible(true);
                    case 1:
                        panel1.setVisible(true);
                }break;
        }

    }
    public void yc1(){
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
    }
    public int pd(int cd){
        if (cd>4){
            cd=cd-4;
        }else if (cd>8){
            cd=cd-4;
        }else if (cd>12){
            cd=cd-4;
        }else if(cd>16){
            cd=cd-4;
        }else if (cd>20){
            cd=cd-4;
        }
        return cd;
    }
    public List<Mer> P(){
        List<Mer> l=null;
        switch (xz){
            case 1:l=MerController.sel1();break;
            case 3:String a=textField1.getText();
                l= MerController.sel4(a);break;
            case 2: Object xz1=comboBox1.getItemAt(comboBox1.getSelectedIndex());
                lx=xz1;
                if (xz1!="综合"){
                    l=MerController.dpcx1(MertypeController.cx1(String.valueOf(xz1)));
                }else {
                    l=MerController.sel1();
                }
        }
        return l;
    }

}
