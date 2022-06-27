/*
 * Created by JFormDesigner on Mon May 30 16:50:32 CST 2022
 */

package jw3.c1.view.SeverOrder;

import jw3.c1.controller.Srcontroller;
import jw3.c1.utils.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

/**
 * @author Brainrain
 */
public class User_info extends JPanel {
    public User_info() {
        initComponents();
    }
//      搜索
    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        if (textField1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"请输入值");
        }else {
            showdata(textField1.getText());
            textField1.setText("");
        }
    }
//      加入黑名单
    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here

        int index=table1.getSelectedRow();

        if (index!=-1){
            int id=(int)data.get(index).get(0);
            String sql="UPDATE prestige a,userinfo b set a.p_score=59," +
                    "b.p_score=59 WHERE a.u_id=b.u_id and  b.u_id=?";
            boolean x=DBConnection.zsg(sql,id);
        if (x){
            JOptionPane.showMessageDialog(null
            ,"添加成功");
        }else {
            JOptionPane.showMessageDialog(null,"添加失败");
        }
        }else {
            JOptionPane.showMessageDialog(null,
                    "请选中一行");
        }
    }
//      刷新

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        showdata("");
    }
    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void textField1FocusGained(FocusEvent e) {
        // TODO add your code here
        label8.setVisible(true);
    }

    private void textField1FocusLost(FocusEvent e) {
        // TODO add your code here
        label8.setVisible(false);
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        textField1 = new JTextField();
        button3 = new JButton();
        label11 = new JLabel();
        button5 = new JButton();
        label8 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setBorder(null);
        setDoubleBuffered(false);
        setOpaque(false);
        setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(5, 95, 1100, 445);

        //---- textField1 ----
        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField1FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                textField1FocusLost(e);
            }
        });
        add(textField1);
        textField1.setBounds(645, 30, 375, 30);

        //---- button3 ----
        button3.setText("\u641c\u7d22");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button3);
        button3.setBounds(1050, 30, 90, 30);

        //---- label11 ----
        label11.setText("\u7528\u6237\u4fe1\u606f\uff1a");
        add(label11);
        label11.setBounds(20, 35, 135, 30);

        //---- button5 ----
        button5.setText("\u52a0\u5165\u9ed1\u540d\u5355");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5MouseClicked(e);
            }
        });
        add(button5);
        button5.setBounds(1115, 175, 115, 30);

        //---- label8 ----
        label8.setText("\u8bf7\u8f93\u5165\u7528\u6237\u540d\uff1a");
        label8.setForeground(new Color(255, 51, 51));
        add(label8);
        label8.setBounds(520, 30, 130, 30);

        //---- button1 ----
        button1.setText("\u5237\u65b0");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        add(button1);
        button1.setBounds(1115, 105, 115, 30);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        showdata("");
        label8.setVisible(false);
    }
    private void showdata(String x) {

        Vector<Object> heads=new Vector<Object>();
        heads.add("u_id");
        heads.add("u_name");
        heads.add("u_address");
        heads.add("u_phone");
        heads.add("u_headimage");
        heads.add("u_account");
        heads.add("u_pwd");
        heads.add("v_viprank");
        heads.add("u_registertime");
        heads.add("u_email");
        heads.add("u_nickname");

        data= Srcontroller.UsergetAll(x);

////3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm=new DefaultTableModel(data,heads);
        table1.setModel(dtm);;
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable table1;
    private JTextField textField1;
    private JButton button3;
    private JLabel label11;
    private JButton button5;
    private JLabel label8;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
}
