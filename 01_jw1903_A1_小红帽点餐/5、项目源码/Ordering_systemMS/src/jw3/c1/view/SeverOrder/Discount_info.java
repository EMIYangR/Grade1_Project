/*
 * Created by JFormDesigner on Thu May 26 21:03:19 CST 2022
 */

package jw3.c1.view.SeverOrder;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

/**
 * @author Brainrain
 */
public  class Discount_info extends JPanel {
    public Discount_info() {
        setVisible(true);
        setSize(800,600);
        initComponents();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        showdata(textField1.getText());
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
            }
        });
        add(button3);
        button3.setBounds(635, 35, 90, 30);

        //---- label11 ----
        label11.setText("\u4f18\u60e0\u5238\u4fe1\u606f\uff1a");
        add(label11);
        label11.setBounds(20, 35, 85, 30);

        //---- button1 ----
        button1.setText("\u5220\u9664");
        add(button1);
        button1.setBounds(760, 210, 60, 30);

        //---- button2 ----
        button2.setText("\u4fee\u6539");
        add(button2);
        button2.setBounds(760, 310, 60, 30);

        //---- button4 ----
        button4.setText("\u6dfb\u52a0");
        add(button4);
        button4.setBounds(760, 405, 60, 30);

        //---- button5 ----
        button5.setText("\u5237\u65b0");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5MouseClicked(e);
                button5MouseClicked(e);
            }
        });
        add(button5);
        button5.setBounds(760, 110, 60, 30);

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
        heads.add("d_couponid");
        heads.add("d_couponnum");
        heads.add("u_id");
        heads.add("d_name");
        heads.add("d_details");
        heads.add("d_overlying");
        heads.add("d_concessionalrate");
        heads.add("d_value");

        data= GetAll.DigetAll(x);

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
