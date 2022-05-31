/*
 * Created by JFormDesigner on Wed May 18 22:35:59 CST 2022
 */

package jw3.c1.view;

import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Userinfo;
import jw3.c1.utils.DBConnection;
import jw3.c1.utils.QueryByClass;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Brainrain
 */
public class Register extends JFrame {
    public Register() {
        initComponents();
        setVisible(true);
        setSize(679,479);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void button1MouseClicked(MouseEvent e) {
        sjhpd();
        mmpd();
        yxpd();
        ncpd();
        if (label6.isVisible()||label7.isVisible()||label8.isVisible()||label9.isVisible()||label10.isVisible()){
            JOptionPane.showMessageDialog(null,"有内容没填或者输入有误");
        }else{
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.now();
            QueryByClass<Userinfo> qc=new QueryByClass<Userinfo>();
            String sql="INSERT into userinfo VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            DBConnection.zsg(sql,0,null,null,textField2.getText(),null,textField2.getText(),passwordField2.getText(),1,dtf.format(localDate),textField3.getText(),textField1.getText(),100);
            JOptionPane.showMessageDialog(null,"注册成功");
            setVisible(false);
            UserLogin l=new UserLogin();
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        //注册成功
        UserLogin d=new UserLogin();
        setVisible(false);
    }

    private void textField1FocusGained(FocusEvent e) {
        //判断昵称是否被使用
        ncpd();
    }

    private void textField3FocusGained(FocusEvent e) {
        //判断邮箱是否合理或者是否被使用
        yxpd();
    }
    private void textField1FocusLost(FocusEvent e) {
        //失去焦点时的昵称判断
        ncpd();
    }
    private void passwordField2KeyPressed(KeyEvent e) {
//        判断密码的合理性
        mmpd1();
    }

    private void passwordField3KeyReleased(KeyEvent e) {
//        判断是否输入的密码跟上面一样
        mmpd();
    }

    private void passwordField2KeyReleased(KeyEvent e) {
//        判断密码合理性
        mmpd1();
    }

    private void textField3KeyReleased(KeyEvent e) {
//        邮箱的判断
        yxpd();
    }

    private void textField2KeyReleased(KeyEvent e) {
        sjhpd();
    }

    private void textField1KeyReleased(KeyEvent e) {
        //判断昵称是否被使用
        ncpd();
    }

    private void textField2FocusGained(FocusEvent e) {
        // TODO add your code here
    }

    private void textField2FocusLost(FocusEvent e) {
        // TODO add your code here
    }

    private void passwordField2FocusGained(FocusEvent e) {
        // TODO add your code here
    }

    private void passwordField2FocusLost(FocusEvent e) {
        // TODO add your code here
    }

    private void passwordField3FocusGained(FocusEvent e) {
        // TODO add your code here
    }

    private void passwordField3FocusLost(FocusEvent e) {
        // TODO add your code here
    }

    private void textField3FocusLost(FocusEvent e) {
        // TODO add your code here
    }

    private void textField3KeyPressed(KeyEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        passwordField2 = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();
        label5 = new JLabel();
        passwordField3 = new JPasswordField();
        label6 = new JLabel();
        textField3 = new JTextField();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();

        //======== this ========
        setTitle("\u6ce8\u518c\u8d26\u53f7");
        setIconImage(new ImageIcon("C:\\Users\\admin\\Desktop\\\u65b0\u5efa\u6587\u4ef6\u5939 (5)\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\logo\\logo.png").getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u6635\u79f0\uff1a");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label1);
        label1.setBounds(125, 70, 50, 30);

        //---- textField1 ----
        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField1FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                textField1FocusLost(e);
                textField1FocusLost(e);
            }
        });
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                textField1KeyReleased(e);
            }
        });
        contentPane.add(textField1);
        textField1.setBounds(185, 68, 230, 35);

        //---- textField2 ----
        textField2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField2FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                textField2FocusLost(e);
            }
        });
        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                textField2KeyReleased(e);
            }
        });
        contentPane.add(textField2);
        textField2.setBounds(185, 125, 230, 35);

        //---- label3 ----
        label3.setText("Email\uff1a");
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label3);
        label3.setBounds(115, 180, 60, 30);

        //---- label4 ----
        label4.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");
        label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label4);
        label4.setBounds(95, 290, 80, 30);

        //---- passwordField2 ----
        passwordField2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                passwordField2FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                passwordField2FocusLost(e);
            }
        });
        passwordField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                passwordField2KeyPressed(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                passwordField2KeyReleased(e);
            }
        });
        contentPane.add(passwordField2);
        passwordField2.setBounds(185, 233, 230, 35);

        //---- button1 ----
        button1.setText("\u786e\u5b9a\u6ce8\u518c");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(120, 360, 100, 50);

        //---- button2 ----
        button2.setText("\u53d6\u6d88\u6ce8\u518c");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(310, 360, 100, 50);

        //---- label5 ----
        label5.setText("\u5bc6\u7801\uff1a");
        label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label5);
        label5.setBounds(125, 235, 50, 30);

        //---- passwordField3 ----
        passwordField3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                passwordField3FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                passwordField3FocusLost(e);
            }
        });
        passwordField3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                passwordField3KeyReleased(e);
            }
        });
        contentPane.add(passwordField3);
        passwordField3.setBounds(185, 288, 230, 35);

        //---- label6 ----
        label6.setText("tips");
        label6.setForeground(Color.orange);
        contentPane.add(label6);
        label6.setBounds(420, 125, 160, 30);

        //---- textField3 ----
        textField3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField3FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                textField3FocusLost(e);
            }
        });
        textField3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                textField3KeyPressed(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                textField3KeyReleased(e);
            }
        });
        contentPane.add(textField3);
        textField3.setBounds(185, 173, 230, 35);

        //---- label7 ----
        label7.setText("tips");
        label7.setForeground(Color.orange);
        contentPane.add(label7);
        label7.setBounds(420, 175, 245, 30);

        //---- label8 ----
        label8.setText("tips");
        label8.setForeground(Color.orange);
        contentPane.add(label8);
        label8.setBounds(420, 235, 160, 30);

        //---- label9 ----
        label9.setText("tips");
        label9.setForeground(Color.orange);
        contentPane.add(label9);
        label9.setBounds(420, 290, 160, 30);

        //---- label10 ----
        label10.setText("tips");
        label10.setForeground(Color.orange);
        contentPane.add(label10);
        label10.setBounds(420, 70, 160, 30);

        //---- label11 ----
        label11.setText("\u624b\u673a\u53f7\uff1a");
        label11.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label11);
        label11.setBounds(115, 125, 65, 30);

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
        JLabel lblBackground = new JLabel(); // 创建一个标签组件对象
        ImageIcon icon = new ImageIcon("images/background/zcbj1.jpg"); // 创建背景图片对象
        lblBackground.setIcon(icon); // 设置标签组件要显示的图标
        lblBackground.setBounds(-25, 0, icon.getIconWidth(), icon.getIconHeight()); // 设置组件的显示位置及大小
        this.getContentPane().add(lblBackground); // 将组件添加到面板中
        label6.setVisible(false);
        label7.setVisible(false);
        label8.setVisible(false);
        label9.setVisible(false);
        label10.setVisible(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JPasswordField passwordField2;
    private JButton button1;
    private JButton button2;
    private JLabel label5;
    private JPasswordField passwordField3;
    private JLabel label6;
    private JTextField textField3;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void sjhpd(){
        int i;
        UserinfoController a2=new UserinfoController();
        String a=textField2.getText();
        char[] sjh1=a.toCharArray();
        if (a.length()>0){
            if (sjh1[0]=='1'){
                for (i = 1; i < sjh1.length; i++) {
                    if (sjh1[i]<'0'||sjh1[i]>'9'){
                        label6.setText("输入手机号不合理");
                        label6.setVisible(true);
                        break;
                    }else {
                        label6.setVisible(false);
                    }
                }
            }else {
                label6.setText("目前手机号开头只能为1");
                label6.setVisible(true);
            }
            if (sjh1.length==11){
                int b=a2.sjhpd(a);
                switch (b){
                    case 1:
                        label6.setVisible(false);
                        break;
                    case 2:
                        label6.setText("该手机号已被使用");
                        label6.setVisible(true);
                        break;
                }
            }else {
                label6.setText("输入手机号格式不合理");
                label6.setVisible(true);
            }
        }else {
            label6.setText("手机号不能为空");
            label6.setVisible(true);
        }
    }
    public void mmpd(){
        String pwd=passwordField2.getText();
        String pwd1=passwordField3.getText();
        if (pwd.length()>0&&pwd1.length()>0){
            if (!pwd.equals(pwd1)){
                label9.setText("两次输入密码不一样");
                label9.setVisible(true);
            }else {
                label9.setVisible(false);
            }
        }
    }
    public void mmpd1(){
        String pwd=passwordField2.getText();
        if (pwd.length()>0){
            if (pwd.length()>=10){
                label8.setText("密码长度不能超过10");
                 label8.setVisible(true);
             }else {
                 label8.setVisible(false);
          }
              if (pwd.length()<=6){
                  label8.setText("密码长度不能低于6");
                  label8.setVisible(true);
             }else {
                   label8.setVisible(false);
          }
//            label8.setVisible(false);
        } else {
            label8.setText("密码长度不能为空");
            label8.setVisible(true);
    }
}
    public void yxpd(){
        String yx=textField3.getText();
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
                                label7.setText("暂时@前面只能为数字");
                                label7.setVisible(true);
                                break;
                            } else {
                                int b1 = UserinfoController.yxpd(yx);
                                switch (b1) {
                                    case 1:
                                        label7.setVisible(false);
                                        break;
                                    case 2:
                                        label7.setText("该邮箱已被使用");
                                        label7.setVisible(true);
                                        break;
                                }
                            }
                        }
                    }
                    if (b && l >= 8) {
                        for (int k = 0; k < l - 7; k++) {
                            if (yx1[k] < '0' || yx1[k] > '9') {
                                label7.setText("暂时@前面只能为数字");
                                label7.setVisible(true);
                                break;
                            } else {
                                int b1 = UserinfoController.yxpd(yx);
                                switch (b1) {
                                    case 1:
                                        label7.setVisible(false);
                                        break;
                                    case 2:
                                        label7.setText("该邮箱已被使用");
                                        label7.setVisible(true);
                                        break;
                                }
                            }
                        }
                    }

                } else {
                    label7.setText("格式不正确");
                    label7.setVisible(true);
                }
            } else {
                label7.setText("目前只能为163.com或qq.com");
            }
        }else {
            label7.setText("邮箱不能为空");
            label7.setVisible(true);
        }
    }
    public void ncpd(){
        UserinfoController a1=new UserinfoController();
       String a=textField1.getText();
        int b=a1.ncpd(a);
        switch (b){
            case 1:
                label10.setVisible(false);
                break;
            case 2:
                label10.setText("改昵称已被使用");
                label10.setVisible(true);
                break;
            case 3:
                label10.setText("昵称不能为空");
                label10.setVisible(true);
                break;
        }
    }


}
