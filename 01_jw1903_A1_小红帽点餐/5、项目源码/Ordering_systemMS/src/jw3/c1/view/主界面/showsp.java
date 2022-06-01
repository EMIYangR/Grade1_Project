/*
 * Created by JFormDesigner on Mon May 30 14:35:33 CST 2022
 */

package jw3.c1.view.主界面;

import jw3.c1.controller.GoodsController;
import jw3.c1.controller.MerController;
import jw3.c1.model.Goods;
import jw3.c1.model.Mer;
import jw3.c1.utils.Imagesinks;
import jw3.c1.utils.QueryByClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class showsp extends JFrame {
    public showsp() {
        initComponents();
        setSize(1800,1400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        showsp s=new showsp();
    }
    private List<Mer> showdata(){
        List<Mer> merList= MerController.sel1();
        System.out.println(merList.get(0).getM_url());
        String sql="";
        int row=(int)Math.ceil(merList.size()/4.0);
        panel1.setLayout(new GridLayout(row, 4));
        for (int i = 0; i <merList.size(); i++) {
            JPanel jPanel=new JPanel();
            JLabel j1=new JLabel();
            JLabel j2=new JLabel();
            JLabel j3=new JLabel();
            Button an=new Button();
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
            j1.setBounds(10,10,100,100);
            j2.setBounds(110,0,110,50);
            j3.setBounds(110,50,110,50);
            an.setBounds(40,170,80,40);
            //详情
            an.setLabel("详情");

            jPanel.setLayout(null);
            jPanel.add(j1);
            jPanel.add(j2);
            jPanel.add(j3);
            jPanel.add(an);
            panel1.add(jPanel);
        }
        QueryByClass<Goods> qc=new QueryByClass<>();
//        goodsList=qc.select(Goods.class,sql);
        return merList;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(4, 4));
        }
        contentPane.add(panel1);
        panel1.setBounds(300, 100, 1000, 1200);

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
        this.showdata();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
