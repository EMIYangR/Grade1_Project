/*
 * Created by JFormDesigner on Tue May 31 22:03:15 CST 2022
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
public class Prestige extends JPanel {
    public Prestige() {
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

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }
//      移出黑名单
    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();
        if (index!=-1){
            int id=(int)data.get(index).get(0);
            String sql="UPDATE prestige a,userinfo b set a.p_score=100," +
                    "b.p_score=100 WHERE a.u_id=b.u_id and  b.u_id=?";
            boolean x= DBConnection.zsg(sql,id);
            if (x){
                JOptionPane.showMessageDialog(null
                        ,"移出成功");
                showdata("");
            }else {
                JOptionPane.showMessageDialog(null,"移出失败");
            }
        }else {
            JOptionPane.showMessageDialog(null,
                    "请选中一行");
        }
    }
//      刷新
    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        showdata("");
    }

    private void button2MouseClicked(MouseEvent e) {
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
        button4 = new JButton();
        button5 = new JButton();
        label8 = new JLabel();

        //======== this ========
        setBorder(null);
        setOpaque(false);
        setLayout(null);

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setOpaque(false);
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(5, 100, 1110, 440);

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
        label11.setText("\u9ed1\u540d\u5355\u4fe1\u606f\uff1a");
        add(label11);
        label11.setBounds(20, 35, 120, 30);

        //---- button4 ----
        button4.setText("\u79fb\u51fa\u9ed1\u540d\u5355");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        add(button4);
        button4.setBounds(1125, 175, 100, 30);

        //---- button5 ----
        button5.setText("\u5237\u65b0");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5MouseClicked(e);
            }
        });
        add(button5);
        button5.setBounds(1125, 105, 100, 30);

        //---- label8 ----
        label8.setText("\u8bf7\u8f93\u5165id\uff1a");
        label8.setForeground(new Color(255, 51, 51));
        add(label8);
        label8.setBounds(545, 30, 105, 30);

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
    public void showdata(String x) {

        Vector<Object> heads=new Vector<>();
        heads.add("p_id");
        heads.add("p_score");
        heads.add("u_name");
        data= Srcontroller.PtgetAll(x);

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
    private JButton button4;
    private JButton button5;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
}
