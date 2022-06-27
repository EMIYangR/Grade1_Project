/*
 * Created by JFormDesigner on Thu May 26 20:01:50 CST 2022
 */

package jw3.c1.view.SeverOrder;


import jw3.c1.controller.Srcontroller;
import jw3.c1.model.Orderlist;
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
public class Order_info extends JPanel {
    Srcontroller src=Srcontroller.src;
    public Order_info() {
        initComponents();
    }
//      查询
    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        if (textField1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"请输入值");
        }else {
            showdata(textField1.getText());
            textField1.setText("");
        }
    }
//  删除
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
//      刷新
    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        showdata("");
    }
//      修改按钮
    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        dialog1.setSize(500,500);
        int index=table1.getSelectedRow();//选中行的索引
        if (index!=-1){//是否选中了一行
            //获取值 data、index
            //先传值
                textField2.setText(String.valueOf(data.get(index).get(2)));
                textField3.setText(String.valueOf(data.get(index).get(3)));
            comboBox1.removeAllItems();
            comboBox1.addItem("等待付款");
            comboBox1.addItem("等待出货");
            comboBox1.addItem("已出货");
            comboBox1.addItem("等待取货");
            comboBox1.addItem("已送达");
            comboBox1.setSelectedItem(data.get(index).get(4));
            switch (comboBox1.getSelectedIndex()){
                case 1:
                    comboBox1.removeItem("等待付款");
                    break;
                case 2:
                    comboBox1.removeItem("等待付款");
                    comboBox1.removeItem("等待出货");
                    break;
                case 3:
                    comboBox1.removeItem("等待付款");
                    comboBox1.removeItem("等待出货");
                    comboBox1.removeItem("已出货");
                    break;
                case 4:
                    comboBox1.removeItem("等待付款");
                    comboBox1.removeItem("等待出货");
                    comboBox1.removeItem("已出货");
                    comboBox1.removeItem("等待取货");
                    break;
            }
            if (data.get(index).get(5).equals("1")){
                checkBox1.setSelected(true);
            }else {
                checkBox1.setSelected(false);
            }
            if (data.get(index).get(8).equals("已支付")){
                radioButton1.setSelected(true);
            }else {
                radioButton2.setSelected(true);
            }
//                comboBox2.setSelectedItem(data.get(index).get(8));
            //后展示对话框
            dialog1.setModal(true);
            dialog1.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,
                    "您未选中任意一行!");
        }
    }

    //          修改弹窗按钮
    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index=table1.getSelectedRow();
        Orderlist ol=new Orderlist();
        //1、获取数据
        int id=(int)data.get(index).get(0);
        ol.setO_id(id);

        ol.setO_phone(textField2.getText());
        ol.setO_address(textField3.getText());
        ol.setO_statue(String.valueOf(comboBox1.getSelectedItem()));
        if (checkBox1.isSelected()){
            ol.setO_isuse("1");
        }else {
            ol.setO_isuse("0");
        }

        if (radioButton1.isSelected()){
            ol.setO_paustatue("已支付");
        }else {
            ol.setO_paustatue("未支付");
        }
        //2、简单判断
        if (!( ol.getO_phone().equals("") ||ol.getO_address().equals(""))){
                for (Vector<Object> item:data) {
                    if (item.contains(ol.getO_id()) && item.contains(ol.getO_phone()) && item.contains(ol.getO_address()) && item.contains(ol.getO_isuse())
                    && item.contains(ol.getO_statue()) && item.contains(ol.getO_paustatue()) ){
                        JOptionPane.showMessageDialog(null,
                                "记录未修改");
                        return;
                    }
                }
//            for (int i = 0; i < data.size(); i++) {
//                for (int j = 0; j < data.get(i).size(); j++) {
//                    if (String.valueOf(data.get(i).get(j)).equals(ol.getO_phone())){
//                        JOptionPane.showMessageDialog(null,
//                                "记录重复");
//                        return;
//                    }
//                }
//            }
//            for (int i = 0; i < data.size(); i++) {
//                for (int j = 0; j < data.get(i).size(); j++) {
//                    if (data.get(i).contains(ol.getO_phone())){
//                        JOptionPane.showMessageDialog(null,
//                                "记录重复");
//                        return;
//                    }
//                }
//            }
            if (!(ol.getO_isuse().equals("1") || ol.getO_isuse().equals("0"))){
                    JOptionPane.showMessageDialog(null,"请输入0或1");
            }else {
                String sql="UPDATE orderlist SET o_phone=?,o_address=?,o_statue=?,o_isuse=?,o_paustatue=? WHERE o_id=?";
                boolean x=DBConnection.zsg(sql,ol.getO_phone(),ol.getO_address(),ol.getO_statue(),ol.getO_isuse()
                        ,ol.getO_paustatue(),ol.getO_id());
                if (x){
                    showdata("");
                    JOptionPane.showMessageDialog(null,
                            "修改成功");
                    dialog1.setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,
                            "修改失败");
                }
            }

        }else {
            JOptionPane.showMessageDialog(null,
                    "不能为空");
        }
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
        button2 = new JButton();
        button5 = new JButton();
        label8 = new JLabel();
        dialog1 = new JDialog();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label5 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button4 = new JButton();
        label4 = new JLabel();
        comboBox1 = new JComboBox();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        checkBox1 = new JCheckBox();
        label6 = new JLabel();
        label7 = new JLabel();

        //======== this ========
        setBorder(null);
        setOpaque(false);
        setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(5, 95, 1145, 445);

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
        textField1.setBounds(670, 35, 375, 30);

        //---- button3 ----
        button3.setText("\u641c\u7d22");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button3);
        button3.setBounds(1060, 35, 90, 30);

        //---- label11 ----
        label11.setText("\u8ba2\u5355\u4fe1\u606f\uff1a");
        add(label11);
        label11.setBounds(20, 35, 105, 30);

        //---- button2 ----
        button2.setText("\u4fee\u6539");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        add(button2);
        button2.setBounds(1165, 340, 60, 30);

        //---- button5 ----
        button5.setText("\u5237\u65b0");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5MouseClicked(e);
            }
        });
        add(button5);
        button5.setBounds(1165, 170, 65, button5.getPreferredSize().height);

        //---- label8 ----
        label8.setText("\u8bf7\u8f93\u5165id\uff1a");
        label8.setForeground(new Color(255, 51, 51));
        add(label8);
        label8.setBounds(550, 35, 105, 30);

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

        //======== dialog1 ========
        {
            Container dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(null);

            //---- label1 ----
            label1.setText("\u7535\u8bdd\u53f7\u7801");
            dialog1ContentPane.add(label1);
            label1.setBounds(45, 35, 90, 25);

            //---- label2 ----
            label2.setText("\u5730\u5740");
            dialog1ContentPane.add(label2);
            label2.setBounds(45, 80, 90, 25);

            //---- label3 ----
            label3.setText("\u8d27\u7269\u72b6\u6001");
            dialog1ContentPane.add(label3);
            label3.setBounds(45, 125, 90, 25);

            //---- label5 ----
            label5.setText("\u652f\u4ed8\u72b6\u6001");
            dialog1ContentPane.add(label5);
            label5.setBounds(45, 215, 90, 25);
            dialog1ContentPane.add(textField2);
            textField2.setBounds(160, 32, 145, textField2.getPreferredSize().height);
            dialog1ContentPane.add(textField3);
            textField3.setBounds(160, 77, 145, 30);

            //---- button4 ----
            button4.setText("\u786e\u5b9a");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button4);
            button4.setBounds(new Rectangle(new Point(145, 265), button4.getPreferredSize()));

            //---- label4 ----
            label4.setText("0_isuse");
            dialog1ContentPane.add(label4);
            label4.setBounds(45, 170, 85, 30);
            dialog1ContentPane.add(comboBox1);
            comboBox1.setBounds(160, 125, 135, comboBox1.getPreferredSize().height);

            //---- radioButton1 ----
            radioButton1.setText("\u5df2\u652f\u4ed8");
            dialog1ContentPane.add(radioButton1);
            radioButton1.setBounds(160, 212, 100, 30);

            //---- radioButton2 ----
            radioButton2.setText("\u672a\u652f\u4ed8");
            dialog1ContentPane.add(radioButton2);
            radioButton2.setBounds(275, 212, 95, 30);

            //---- checkBox1 ----
            checkBox1.setText("O_isuse");
            dialog1ContentPane.add(checkBox1);
            checkBox1.setBounds(160, 170, 135, 35);

            //---- label6 ----
            label6.setText("\u4e0d\u80fd\u4e3a\u7a7a");
            label6.setForeground(Color.red);
            dialog1ContentPane.add(label6);
            label6.setBounds(310, 30, 85, 35);

            //---- label7 ----
            label7.setText("\u4e0d\u80fd\u4e3a\u7a7a");
            label7.setForeground(Color.red);
            dialog1ContentPane.add(label7);
            label7.setBounds(310, 75, 90, 35);

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
        showdata("");
        label8.setVisible(false);
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
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
        data= Srcontroller.OrgetAll(x,src.getId());

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
    private JButton button2;
    private JButton button5;
    private JLabel label8;
    private JDialog dialog1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label5;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button4;
    private JLabel label4;
    private JComboBox comboBox1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JCheckBox checkBox1;
    private JLabel label6;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Vector<Vector<Object>> data;
    private ButtonGroup buttonGroup1=new ButtonGroup();
}
