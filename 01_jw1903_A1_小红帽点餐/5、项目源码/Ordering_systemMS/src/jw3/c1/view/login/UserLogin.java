/*
 * Created by JFormDesigner on Wed May 18 13:58:02 CST 2022
 */


package jw3.c1.view.login;

import jw3.c1.controller.BusinessController;
import jw3.c1.controller.Srcontroller;
import jw3.c1.controller.UserinfoController;
import jw3.c1.utils.Imagesinks;
import jw3.c1.utils.yzm;
import jw3.c1.view.Main_interface.Index;
import jw3.c1.view.SeverOrder.Server_Index;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Date;


/**
 * @author Brainrain
 */
public class UserLogin extends JFrame {
    public UserLogin() {
        initComponents();
        setVisible(true);
        setSize(800,550);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public String pdsj(){
        Date d=new Date();
        String sj1=d.toString();
        int sj2= Integer.parseInt(sj1.substring(11,13));
        if (sj2>20&&sj2<=24)
            sj="晚上好";
        if (sj2>12&&sj2<=13)
            sj="中午好";
        if (sj2>8&&sj2<=12)
            sj="早上好";
        if (sj2>=0&&sj2<=8)
            sj="凌晨好";
        if (sj2>13&&sj2<=20)
            sj="下午好";
        return sj;
    }
    private void button1MouseClicked(MouseEvent e) {
        dialog1.setModal(true);
        Object[] oj=yzm.createImage();
        ImageIcon img = new ImageIcon((BufferedImage)oj[1]);
        label5.setIcon((Icon) img);
        pd1= String.valueOf(oj[0]);
        dialog1.setVisible(true);
    }

    private void button2MouseClicked(MouseEvent e) {
        Register z=new Register();
        dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        ForgetPwd forgetPwd =new ForgetPwd();
        dispose();
    }

    private void thisWindowClosed(WindowEvent e) {
        // TODO add your code here
    }

    private void thisWindowClosing(WindowEvent e) {
        // TODO add your code here
    }

    private void button4MouseClicked(MouseEvent e) {
        LoginChoise loginChoise=new LoginChoise();
        dispose();
    }

    private void radioButton1MouseClicked(MouseEvent e) {
        button2.setVisible(true);
        button3.setVisible(true);
    }

    private void radioButton2MouseClicked(MouseEvent e) {
        button2.setVisible(false);
        button3.setVisible(false);
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        String  user=textField1.getText();
        String  pwd=passwordField1.getText();
        int a;
        if (radioButton1.isSelected()){
            a=UserinfoController.dlupd(user,pwd);
        }else {
            a= BusinessController.dlupd(user,pwd);
        }
        switch (a){
            case 1:
                JOptionPane.showMessageDialog(null,"账号或密码错误");
                textField2.setText("");
                dialog1.dispose();
                passwordField1.setText("");
                break;
            case 2:
                if (radioButton1.isSelected()){
                    if (textField2.getText().equals(pd1.toLowerCase())||textField2.getText().equals(pd1.toUpperCase())){
                        JOptionPane.showMessageDialog(null,pdsj()+",欢迎你，亲爱的小红帽用户");
                        dialog1.dispose();
                        Index.zh=user;
                        new Index();
                        dispose();
                    }else {
                        JOptionPane.showMessageDialog(null,"验证码输入错误,请重新输入");
                        Object[] oj=yzm.createImage();
                        ImageIcon img = new ImageIcon((BufferedImage)oj[1]);
                        label5.setIcon((Icon) img);
                        pd1= String.valueOf(oj[0]);
                        dialog1.setVisible(true);
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"感谢你注册为本软件的商家用户");
                    Srcontroller src=new Srcontroller();
                    src.getb(user,pwd,src);
                    new Server_Index();
                    dialog1.dispose();
                    dispose();
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"账号或密码不能为空");
                break;
        }
    }

    private void label5MouseClicked(MouseEvent e) {
        // TODO add your code here
        Object[] oj=yzm.createImage();
        ImageIcon img = new ImageIcon((BufferedImage)oj[1]);
        label5.setIcon((Icon) img);
        pd1= String.valueOf(oj[0]);
        dialog1.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        button1 = new JButton();
        button4 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        passwordField1 = new JPasswordField();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label3 = new JLabel();
        dialog1 = new JDialog();
        label4 = new JLabel();
        label5 = new JLabel();
        textField2 = new JTextField();
        button5 = new JButton();
        label7 = new JLabel();

        //======== this ========
        setTitle("\u7528\u6237/\u5546\u5bb6\u767b\u5f55");
        setIconImage(new ImageIcon("C:\\Users\\admin\\Desktop\\\u65b0\u5efa\u6587\u4ef6\u5939 (5)\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\logo\\logo.png").getImage());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                thisWindowClosed(e);
            }
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u8d26\u53f7\uff1a");
            label1.setBackground(Color.white);
            label1.setForeground(Color.white);
            panel1.add(label1);
            label1.setBounds(0, 0, 80, 35);
            panel1.add(textField1);
            textField1.setBounds(80, 0, 185, 35);

            //---- label2 ----
            label2.setText("\u5bc6\u7801\uff1a");
            label2.setForeground(Color.white);
            panel1.add(label2);
            label2.setBounds(0, 65, 80, 35);

            //---- button1 ----
            button1.setText("\u767b\u5f55");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(0, 160, 110, 45);

            //---- button4 ----
            button4.setText("\u53d6\u6d88");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            panel1.add(button4);
            button4.setBounds(155, 160, 110, 45);

            //---- button2 ----
            button2.setText("\u6ce8\u518c");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(155, 215, 110, 45);

            //---- button3 ----
            button3.setText("\u5fd8\u8bb0\u5bc6\u7801");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(0, 215, 110, 45);
            panel1.add(passwordField1);
            passwordField1.setBounds(80, 65, 185, 35);

            //---- radioButton1 ----
            radioButton1.setText("\u7528\u6237");
            radioButton1.setSelected(true);
            radioButton1.setOpaque(false);
            radioButton1.setForeground(Color.cyan);
            radioButton1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    radioButton1MouseClicked(e);
                }
            });
            panel1.add(radioButton1);
            radioButton1.setBounds(80, 110, 85, 30);

            //---- radioButton2 ----
            radioButton2.setText("\u5546\u5bb6");
            radioButton2.setOpaque(false);
            radioButton2.setForeground(Color.cyan);
            radioButton2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    radioButton2MouseClicked(e);
                }
            });
            panel1.add(radioButton2);
            radioButton2.setBounds(170, 110, 87, 30);

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
        panel1.setBounds(420, 185, 265, 265);
        contentPane.add(label3);
        label3.setBounds(55, 50, 165, 145);

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

            //---- label4 ----
            label4.setText("\u8bf7\u8f93\u5165\u9a8c\u8bc1\u7801\uff1a");
            dialog1ContentPane.add(label4);
            label4.setBounds(10, 80, 105, 35);

            //---- label5 ----
            label5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label5MouseClicked(e);
                }
            });
            dialog1ContentPane.add(label5);
            label5.setBounds(120, 30, 140, 45);
            dialog1ContentPane.add(textField2);
            textField2.setBounds(120, 80, 135, 35);

            //---- button5 ----
            button5.setText("\u786e\u5b9a");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button5);
            button5.setBounds(85, 130, 95, 40);

            //---- label7 ----
            label7.setText("\u70b9\u51fb\u56fe\u7247\u5207\u6362");
            dialog1ContentPane.add(label7);
            label7.setBounds(15, 35, 90, 40);

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
        label5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) //鼠标进入
            {
                label5.setForeground(Color.blue);
                label5.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) //鼠标移除
            {
                label5.setForeground(Color.black);
                setCursor(Cursor.getDefaultCursor());
            }
        });
        ButtonGroup b=new ButtonGroup();
        b.add(radioButton1);
        b.add(radioButton2);
//        label3.setIcon(Imagesinks.png("images/background/bj.png",500,500));
        panel1.setOpaque(false);
        button1.setOpaque(false);
        button2.setOpaque(false);
        button3.setOpaque(false);
        button4.setOpaque(false);
        ImageIcon l=new ImageIcon("images/logo/logo3.png");
        label3.setIcon(Imagesinks.png(String.valueOf(l),233,171));
        label3.setBounds(30,25,233,171);
        ImageIcon l1=new ImageIcon("images/tx/gx.gif");
//        label6.setIcon(l1);
        JLabel lblBackground = new JLabel(); // 创建一个标签组件对象
        ImageIcon icon = new ImageIcon("images/background/bj2.jpg"); // 创建背景图片对象
        lblBackground.setIcon(icon); // 设置标签组件要显示的图标
        lblBackground.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // 设置组件的显示位置及大小
        this.getContentPane().add(lblBackground); // 将组件添加到面板中
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JButton button1;
    private JButton button4;
    private JButton button2;
    private JButton button3;
    private JPasswordField passwordField1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label3;
    private JDialog dialog1;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField2;
    private JButton button5;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static String pd1="";
    public static String sj="";
}
