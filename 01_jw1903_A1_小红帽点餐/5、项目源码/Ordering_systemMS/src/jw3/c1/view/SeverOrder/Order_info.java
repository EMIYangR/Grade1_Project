/*
 * Created by JFormDesigner on Thu May 26 20:01:50 CST 2022
 */

package jw3.c1.view.SeverOrder;


import jw3.c1.utils.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

/**
 * @author Brainrain
 */
public class Order_info extends JPanel {
    public Order_info() {
        initComponents();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        showdata(textField1.getText());
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();//获取选择第一行的所索引
        if (index!=-1){//是否选中了一行
            if (JOptionPane.showConfirmDialog(null,
                    "您是否确认删除此数据?")==0){//是否点击了确定
                //取id   data、index  data是二维集合，第一个get获取了行、第二个get获取了列
                int id=(int)data.get(index).get(0);
                //判断完成删除
                String sql="delete from orderlist where o_id=?";
                boolean x= DBConnection.zsg(sql,id);
                if (x){
                    showdata("");//自动刷新
                    JOptionPane.showMessageDialog(null,
                            "删除成功!");

                }else{
                    JOptionPane.showMessageDialog(null,
                            "删除失败!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,
                    "您未选中任意一行!");
        }
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        showdata("");
        textField1.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        textField1 = new JTextField();
        button3 = new JButton();
        label11 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button4 = new JButton();
        button5 = new JButton();

        //======== this ========
        setBorder(null);
        setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(5, 95, 735, 410);
        add(textField1);
        textField1.setBounds(230, 35, 375, 30);

        //---- button3 ----
        button3.setText("\u641c\u7d22");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
                button3MouseClicked(e);
            }
        });
        add(button3);
        button3.setBounds(620, 35, 90, 30);

        //---- label11 ----
        label11.setText("\u5e97\u94fa\u4fe1\u606f\uff1a");
        add(label11);
        label11.setBounds(20, 35, 85, 30);

        //---- button1 ----
        button1.setText("\u5220\u9664");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        add(button1);
        button1.setBounds(762, 265, 60, 30);

        //---- button2 ----
        button2.setText("\u4fee\u6539");
        add(button2);
        button2.setBounds(762, 355, 60, 30);

        //---- button4 ----
        button4.setText("\u6dfb\u52a0");
        add(button4);
        button4.setBounds(762, 440, 60, 30);

        //---- button5 ----
        button5.setText("\u5237\u65b0");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5MouseClicked(e);
            }
        });
        add(button5);
        button5.setBounds(760, 175, 65, button5.getPreferredSize().height);

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
    }
    private void showdata(String x) {
        Vector<Object> heads=new Vector<Object>();
        heads.add("o_id");
        heads.add("o_number");
        heads.add("o_phone");
        heads.add("o_address");
        heads.add("o_statue");
        heads.add("o_isuse");
        heads.add("d_couponnum");
        heads.add("o_method");
        heads.add("o_paustatue");
        heads.add("m_id");
        heads.add("u_id");
        heads.add("o_begintime");
        heads.add("o_estimate");
        heads.add("o_endtime");

        data= GetAll.OrgetAll(x);

////3、将表头和数据赋值给模型，表格模型构造完成
        DefaultTableModel dtm=new DefaultTableModel(data,heads);
        table1.setModel(dtm);
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable table1;
    private JTextField textField1;
    private JButton button3;
    private JLabel label11;
    private JButton button1;
    private JButton button2;
    private JButton button4;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
}
