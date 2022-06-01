/*
 * Created by JFormDesigner on Mon May 30 16:44:44 CST 2022
 */

package jw3.c1.view.主界面;

import jw3.c1.controller.MerController;
import jw3.c1.model.Mer;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class dc1 extends JFrame {
    public dc1() {
        initComponents();
        setVisible(true);
        setSize(1000,850);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        dc1 d=new dc1();
    }

    private void showdata(){
        List<Mer> merList= MerController.sel1();
        int row=(int)merList.size()/4;
        panel1.setLayout(new GridLayout(row,1));
        panel1.setSize(670,580);

//        JScrollPane j=new JScrollPane();
//        j.setBounds(220,120,670,580);
//        j.add(panel1);
//        j.setVisible(true);
        for (; i <sy; i++) {
            Mer mer=merList.get(i);
            JPanel jPanel=new JPanel();
            jPanel.setBounds(0,0,610,140);
            JLabel j1=new JLabel();
            JLabel j2=new JLabel();
            JLabel j3=new JLabel();
            JButton an=new JButton();
            int finalI = i;
            an.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,merList.get(finalI).getM_name());
                }
            });
            //图片
            String url="images/mer/"+merList.get(i).getM_url();
            ImageIcon tp= Imagesinks.png(url,100,100);
            j1.setIcon(tp);
            //名字
            j2.setText("<html>"+merList.get(i).getM_name()+"<br /></html>");
            //地址
            j3.setText("<html>"+merList.get(i).getM_address()+"<br /></html>");
            //设置坐标和大小
            j1.setBounds(20,20,120,100);
            j2.setBounds(150,0,300,55);
            j3.setBounds(155,40,245,65);
            an.setBounds(480,20,100,40);
            //详情
            an.setText("详情");
            jPanel.setLayout(null);
            jPanel.setSize(610,140);
            jPanel.add(j1);
            jPanel.add(j2);
            jPanel.add(j3);
            jPanel.add(an);
            panel1.add(jPanel);
        }
//        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
//        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
//        JScrollPane j=new JScrollPane(panel1,v,h);
//        j.setBounds(220,120,670,580);
//        this.add(j);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        panel1 = new JPanel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {

            //======== panel1 ========
            {
                panel1.setLayout(new GridLayout(2, 1));
            }
            scrollPane1.setViewportView(panel1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(220, 120, 670, 580);

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
        JButton b1=new JButton("上一页");
        b1.setBounds(490,750,78,30);
        JButton b2=new JButton("下一页");
        b2.setBounds(565,750,78,30);
        b2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (i==24){
                        JOptionPane.showMessageDialog(null,"已到末页");
                    }else {
                        i+=sy;
                        sy+=sy1;
                        showdata();
                        System.out.println(i);
                        System.out.println(sy);
                    }
                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null,"已到末页");
                }

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
        b1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (i==0){
                        JOptionPane.showMessageDialog(null,"已到首页");
                    }else {
                        i-=sy;
                        sy-=sy1;
                        showdata();
                        System.out.println(i);
                        System.out.println(sy);
                    }

                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null,"已到首页");
                }
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
        this.add(b1);
        this.add(b2);
        List<Mer> merList= MerController.sel1();
        sy1=(int)merList.size()/4;
        showdata();
        i-=5;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static int i=0;
    public static int sy=6;
    public static int sy1;
}
