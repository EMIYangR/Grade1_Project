/*
 * Created by JFormDesigner on Fri Jun 10 08:48:30 CST 2022
 */

package jw3.c1.view.Main_interface;

import java.awt.event.*;

import jdk.nashorn.internal.scripts.JO;
import jw3.c1.controller.Evaluate1Controller;
import jw3.c1.controller.GoodsController;
import jw3.c1.controller.MerController;
import jw3.c1.controller.UserinfoController;
import jw3.c1.model.Goods;
import jw3.c1.model.Mer;
import jw3.c1.model.Userinfo;

import java.awt.*;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author Brainrain
 */
public class Evaluate extends JFrame {
    public Evaluate() {
        initComponents();
        this.setVisible(true);
        setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(900,600);
    }
    public void showData(int id){
        Vector<Object> head=new Vector<>();
        head.add("序号");
        head.add("评价");
        head.add("昵称");
        data= Evaluate1Controller.getAll(id);
        DefaultTableModel dtm=new DefaultTableModel(data,head);
        table1.setModel(dtm);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.setModal(true);
        dialog1.setVisible(true);
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.dispose();
        showData(m.getM_id());
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("")){
            int a=spid[0];
            if (comboBox1.getSelectedIndex()!=0){
                a=spid[comboBox1.getSelectedIndex()];
            }
            if (Evaluate1Controller.add(textField1.getText(),u.getU_id(),a)){
                JOptionPane.showMessageDialog(null,"您的评论成功，感谢支持！");
                dialog1.dispose();
                showData(m.getM_id());
            }else {
                JOptionPane.showMessageDialog(null,"评论失败");
            }
        }else {
            JOptionPane.showMessageDialog(null,"你输入的评价不能为空");
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        new Menu_page();
        dispose();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        dialog1 = new JDialog();
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        label2 = new JLabel();
        textField1 = new JTextField();
        button3 = new JButton();
        button4 = new JButton();

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
        button1.setBounds(560, 10, 78, 35);

        //---- button2 ----
        button2.setText("\u6211\u8981\u8bc4\u4ef7");
        button2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(155, 10, 160, 50);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(table1);
            }
            panel1.add(scrollPane2);
            scrollPane2.setBounds(0, 0, 880, 380);

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
        panel1.setBounds(15, 110, 880, 380);

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

            //---- label1 ----
            label1.setText("\u8bf7\u9009\u62e9\u9700\u8981\u8bc4\u4ef7\u7684\u5546\u54c1\uff1a");
            dialog1ContentPane.add(label1);
            label1.setBounds(35, 25, 310, 45);
            dialog1ContentPane.add(comboBox1);
            comboBox1.setBounds(395, 25, 210, 45);

            //---- label2 ----
            label2.setText("\u8bf7\u8f93\u5165\u4f60\u7684\u8bc4\u4ef7\uff1a");
            dialog1ContentPane.add(label2);
            label2.setBounds(35, 95, 225, 40);
            dialog1ContentPane.add(textField1);
            textField1.setBounds(35, 145, 410, 50);

            //---- button3 ----
            button3.setText("\u786e\u8ba4\u8bc4\u4ef7");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button3);
            button3.setBounds(155, 225, 110, 45);

            //---- button4 ----
            button4.setText("\u8fd4\u56de");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button4);
            button4.setBounds(370, 225, 110, 45);

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
        g= GoodsController.sp(m.getM_id());
        for (int i = 0; i <g.size() ; i++) {
            comboBox1.addItem(g.get(i).getG_name());
        }
        System.out.println(Oderfrom1.id);
        showData(m.getM_id());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JTable table1;
    private JDialog dialog1;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static int[] spid=GoodsController.cxspid(Oderfrom1.id);
    public static Vector<Vector<Object>> data;
    public static Mer m= MerController.cx(Oderfrom1.id);//获取对应店铺
    public static List<Goods> g=GoodsController.all(Oderfrom1.id);//获取该店的所有商品
    public static Userinfo u= UserinfoController.user(Index.zh);//获取用户即可
}
