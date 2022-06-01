/*
 * Created by JFormDesigner on Thu May 26 20:38:07 CST 2022
 */

package jw3.c1.view.主界面;

import java.awt.event.*;
import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.Imagesinks;

import java.awt.*;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class uuuu extends JFrame {
    public uuuu() {
        initComponents();
        setVisible(true);
        setSize(800,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void comboBox1MouseReleased(MouseEvent e) {
//        int a=comboBox1.getSelectedIndex();
//        System.out.println(a);
//        String b= String.valueOf(comboBox1.getItemAt(a));
//        String url="images/tx/"+b;
//        label3.setIcon(Imagesinks.png(url,100,100));
//        label3.setText("");
    }

    private void comboBox1FocusLost(FocusEvent e) {
        int a=comboBox1.getSelectedIndex();
        String b= String.valueOf(comboBox1.getItemAt(a));
        String url="images/tx/"+b;
        label3.setIcon(Imagesinks.png(url,100,100));
        label3.setText("");
        tx=b;
    }

    private void button1MouseClicked(MouseEvent e) {
        if (label7.isVisible()){
            JOptionPane.showMessageDialog(null,"修改出错");
        }else {
            String a=textField4.getText();
            String b=textField1.getText();
            String c=textField2.getText();
            String d=textField3.getText();
            String e1=textField5.getText();
            UserinfoController.xxxg(a,b,d,c,tx,e1);
            JOptionPane.showMessageDialog(null,"修改成功");
        }

    }

    private void textField2KeyReleased(KeyEvent e) {
        int i;
        UserinfoController a2=new UserinfoController();
        String a=textField2.getText();
        char[] sjh1=a.toCharArray();
        if (a.length()>0){
            if (sjh1[0]=='1'){
                for (i = 1; i < sjh1.length; i++) {
                    if (sjh1[i]<'0'||sjh1[i]>'9'){
                        label7.setText("输入手机号不合理");
                        label7.setVisible(true);
                        break;
                    }else {
                        label7.setVisible(false);
                    }
                }
            }else {
                label7.setText("目前手机号开头只能为1");
                label7.setVisible(true);
            }
            if (sjh1.length==11){
                int b=a2.sjhpd(a);
                switch (b){
                    case 1:
                        label7.setVisible(false);
                        break;
                    case 2:
                        label7.setText("该手机号已被使用");
                        label7.setVisible(true);
                        break;
                }
            }else {
                label7.setText("输入手机号格式不合理");
                label7.setVisible(true);
            }
        }else {
            label7.setText("手机号不能为空");
            label7.setVisible(true);
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        UserProfile u=new UserProfile();
        dispose();
    }

    private void textField5KeyReleased(KeyEvent e) {
        String yx=textField5.getText();
        char[] yx1=yx.toCharArray();
        boolean a=yx.endsWith("@163.com");
        boolean b=yx.endsWith("@qq.com");
        if (yx.length()>0) {
            if (a == true || b == true) {
//            label7.setVisible(false);
                int l = yx1.length;
                if (a && l >= 9 || b && l >= 8) {
                    if (a && l >= 9) {
                        for (int k = 0; k < l - 8; k++) {
                            if (yx1[k] < '0' || yx1[k] > '9') {
                                label9.setText("暂时@前面只能为数字");
                                label9.setVisible(true);
                                break;
                            } else {
                                int b1 = UserinfoController.yxpd(yx);
                                switch (b1) {
                                    case 1:
                                        label9.setVisible(false);
                                        break;
                                    case 2:
                                        label9.setText("该邮箱已被使用");
                                        label9.setVisible(true);
                                        break;
                                }
                            }
                        }
                    }
                    if (b && l >= 8) {
                        for (int k = 0; k < l - 7; k++) {
                            if (yx1[k] < '0' || yx1[k] > '9') {
                                label9.setText("暂时@前面只能为数字");
                                label9.setVisible(true);
                                break;
                            } else {
                                int b1 = UserinfoController.yxpd(yx);
                                switch (b1) {
                                    case 1:
                                        label9.setVisible(false);
                                        break;
                                    case 2:
                                        label9.setText("该邮箱已被使用");
                                        label9.setVisible(true);
                                        break;
                                }
                            }
                        }
                    }

                } else {
                    label9.setText("格式不正确");
                    label9.setVisible(true);
                }
            } else {
                label9.setText("目前只能为163.com或qq.com");
            }
        }else {
            label9.setText("邮箱不能为空");
            label9.setVisible(true);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        comboBox1 = new JComboBox();
        label4 = new JLabel();
        textField2 = new JTextField();
        label5 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        label6 = new JLabel();
        textField4 = new JTextField();
        label7 = new JLabel();
        label8 = new JLabel();
        textField5 = new JTextField();
        label9 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon("C:\\Users\\admin\\Desktop\\\u65b0\u5efa\u6587\u4ef6\u5939 (5)\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\logo\\logo.png").getImage());
        setTitle("\u4e2a\u4eba\u8d44\u6599\u7f16\u8f91");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u6635\u79f0\uff1a");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label1);
        label1.setBounds(240, 230, 50, 35);
        contentPane.add(textField1);
        textField1.setBounds(325, 227, 190, 40);

        //---- label2 ----
        label2.setText("\u5934\u50cf\uff1a");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(235, 85, 75, 35);

        //---- label3 ----
        label3.setText("text");
        contentPane.add(label3);
        label3.setBounds(320, 65, 110, 80);

        //---- comboBox1 ----
        comboBox1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                comboBox1FocusLost(e);
            }
        });
        contentPane.add(comboBox1);
        comboBox1.setBounds(435, 95, 165, comboBox1.getPreferredSize().height);

        //---- label4 ----
        label4.setText("\u624b\u673a\u53f7\uff1a");
        label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label4);
        label4.setBounds(225, 290, 65, 35);

        //---- textField2 ----
        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                textField2KeyReleased(e);
            }
        });
        contentPane.add(textField2);
        textField2.setBounds(325, 287, 190, 40);

        //---- label5 ----
        label5.setText("\u6536\u8d27\u5730\u5740\uff1a");
        label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label5);
        label5.setBounds(210, 350, 80, 35);
        contentPane.add(textField3);
        textField3.setBounds(325, 347, 190, 40);

        //---- button1 ----
        button1.setText("\u4fdd\u5b58");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(235, 535, 98, 40);

        //---- button2 ----
        button2.setText("\u53d6\u6d88");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(435, 535, 98, 40);

        //---- label6 ----
        label6.setText("\u771f\u5b9e\u540d\u5b57\uff1a");
        label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label6);
        label6.setBounds(210, 170, 80, 35);
        contentPane.add(textField4);
        textField4.setBounds(325, 167, 190, 40);

        //---- label7 ----
        label7.setText("text");
        label7.setForeground(Color.red);
        contentPane.add(label7);
        label7.setBounds(525, 295, 170, 30);

        //---- label8 ----
        label8.setText("\u90ae\u7bb1\u5730\u5740\uff1a");
        label8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label8);
        label8.setBounds(200, 410, 80, 35);

        //---- textField5 ----
        textField5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                textField5KeyReleased(e);
            }
        });
        contentPane.add(textField5);
        textField5.setBounds(325, 405, 190, 40);

        //---- label9 ----
        label9.setText("text");
        label9.setForeground(Color.red);
        contentPane.add(label9);
        label9.setBounds(525, 410, 170, 30);

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
        List<Userinfo> list= UserinfoController.xxcx(Index.zh);
        tx=list.get(0).getU_headimage();
        String url="images/tx/"+list.get(0).getU_headimage();
        label3.setIcon(Imagesinks.png(url,100,100));
        label3.setText("");
        textField1.setText(list.get(0).getU_nickname());
        textField2.setText(list.get(0).getU_phone());
        textField3.setText(list.get(0).getU_address());
        textField4.setText(list.get(0).getU_name());
        textField5.setText(list.get(0).getU_email());
        List<Userinfo> list1= UserinfoController.xxcx1();
        for (int i = 0; i < list1.size(); i++) {
            comboBox1.addItem(list1.get(i).getU_headimage());
        }
        int a=comboBox1.getSelectedIndex();
        label7.setVisible(false);
        label9.setVisible(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JLabel label3;
    private JComboBox comboBox1;
    private JLabel label4;
    private JTextField textField2;
    private JLabel label5;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    private JLabel label6;
    private JTextField textField4;
    private JLabel label7;
    private JLabel label8;
    private JTextField textField5;
    private JLabel label9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public String tx;
}
