/*
 * Created by JFormDesigner on Fri May 27 09:38:01 CST 2022
 */

package jw3.c1.view.主界面;

import java.awt.event.*;

import jw3.c1.controller.BusinessController;
import jw3.c1.controller.MerController;
import jw3.c1.controller.MertypeController;
import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Mer;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.Imagesinks;
import jw3.c1.view.主界面.Index;

import java.awt.*;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class wssj extends JFrame {
    public wssj() {
        initComponents();
        this.setBounds(200,200,1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void comboBox1FocusLost(FocusEvent e) {
        int a=comboBox1.getSelectedIndex();
        String b= String.valueOf(comboBox1.getItemAt(a));
        String url="images/mer/"+b;
        label4.setIcon(Imagesinks.png(url,100,100));
        label4.setText("");
        tx=b;
    }

    private void button1MouseClicked(MouseEvent e) {
         Userinfo u=UserinfoController.user(Index.zh);//获取用户的名字，账号，密码
         String name=u.getU_name();
         String zh=u.getU_account();
         String mm=u.getU_pwd();
         //获取用户输入的值
         String lx=textField3.getText();//类型
        String mz=textField1.getText();//店铺名字
        String dz=textField2.getText();//店铺地址
        String xq=textArea1.getText();//店铺简介
        //根据用户输入的贩卖类型添加店铺类型表
        if(MertypeController.cx3(lx)){
            MertypeController.tj(lx);
        }
        //将用户变为商家
        if(BusinessController.iscx()){
            BusinessController.xxtj(name,zh,mm);
        }
        //获取用户的电话
        Userinfo u1=UserinfoController.user(zh);
        String dh=u1.getU_phone();
        //查询店铺类型的id
        int lxid=MertypeController.cx1(lx);
        //添加店铺表数据
       MerController.dptj(mz,xq,lxid,dz,dh,tx,1);
       JOptionPane.showMessageDialog(null,"注册商家成功!");
       Index i=new Index();
        dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        Index i=new Index();
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        comboBox1 = new JComboBox();
        label5 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button1 = new JButton();
        button2 = new JButton();
        label6 = new JLabel();
        textField3 = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u5e97\u94fa\u540d\u5b57\uff1a");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label1);
        label1.setBounds(210, 135, 80, 45);
        contentPane.add(textField1);
        textField1.setBounds(315, 135, 245, 45);

        //---- label2 ----
        label2.setText("\u5e97\u94fa\u5730\u5740\uff1a");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(210, 190, 80, 45);
        contentPane.add(textField2);
        textField2.setBounds(315, 190, 245, 45);

        //---- label3 ----
        label3.setText("\u5e97\u94fa\u56fe\u7247\uff1a");
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label3);
        label3.setBounds(225, 35, 80, 45);

        //---- label4 ----
        label4.setText("text");
        contentPane.add(label4);
        label4.setBounds(315, 25, 135, 95);

        //---- comboBox1 ----
        comboBox1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                comboBox1FocusLost(e);
            }
        });
        contentPane.add(comboBox1);
        comboBox1.setBounds(485, 65, 210, 45);

        //---- label5 ----
        label5.setText("\u5e97\u94fa\u7b80\u4ecb\uff1a");
        label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label5);
        label5.setBounds(210, 370, 80, 45);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(320, 375, 240, 140);

        //---- button1 ----
        button1.setText("\u786e\u5b9a");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(210, 540, 95, 50);

        //---- button2 ----
        button2.setText("\u53d6\u6d88");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(465, 540, 95, 50);

        //---- label6 ----
        label6.setText("\u5e97\u94fa\u4e3b\u8425\uff1a");
        label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label6);
        label6.setBounds(210, 275, 80, 45);
        contentPane.add(textField3);
        textField3.setBounds(315, 275, 245, 45);

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
        List<Mer> list= MerController.sel1();
        tx=list.get(0).getM_url();
        String url="images/mer/"+list.get(0).getM_url();
        label4.setIcon(Imagesinks.png(url,100,100));
        label4.setText("");
        List<Mer> list1=MerController.sel1();
        for (int i = 0; i < list1.size(); i++) {
            comboBox1.addItem(list1.get(i).getM_url());
        }
        int a=comboBox1.getSelectedIndex();

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JComboBox comboBox1;
    private JLabel label5;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;
    private JLabel label6;
    private JTextField textField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static String tx;
}
