/*
 * Created by JFormDesigner on Mon May 30 16:50:52 CST 2022
 */

package jw3.c1.view.Administrator;

import javax.swing.*;
import java.awt.*;

/**
 * @author Brainrain
 */
public class AAmoban extends JFrame {
    //只是模板，不能直接运行
    public AAmoban() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label2 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        separator1 = new JPopupMenu.Separator();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        textField1 = new JTextField();
        dialog1 = new JDialog();
        label3 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        button10 = new JButton();
        button11 = new JButton();
        dialog2 = new JDialog();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        textField9 = new JTextField();
        textField10 = new JTextField();
        textField11 = new JTextField();
        textField12 = new JTextField();
        textField13 = new JTextField();
        textField14 = new JTextField();
        textField15 = new JTextField();
        button12 = new JButton();
        button13 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label2 ----
        label2.setText("icon");
        contentPane.add(label2);
        label2.setBounds(20, 20, 75, 75);

        //---- label4 ----
        label4.setText("logo");
        contentPane.add(label4);
        label4.setBounds(245, 25, 100, 100);

        //---- label5 ----
        label5.setText("\u5c0f\u7ea2\u5e3d\u70b9\u9910\u7cfb\u7edf\u2122\u540e\u53f0\u8fd0\u8425\u7cfb\u7edf");
        label5.setFont(new Font("\u65b9\u6b63\u5c0f\u6807\u5b8b_GBK", Font.BOLD, 28));
        label5.setForeground(new Color(204, 0, 0));
        label5.setEnabled(false);
        contentPane.add(label5);
        label5.setBounds(395, 45, 414, 50);

        //---- label1 ----
        label1.setText("Administrator");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
        contentPane.add(label1);
        label1.setBounds(20, 100, 96, 20);

        //---- button1 ----
        button1.setText("\u4e3b\u9875");
        button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        contentPane.add(button1);
        button1.setBounds(20, 150, 150, 45);

        //---- button2 ----
        button2.setText("\u5546\u5bb6\u7ba1\u7406");
        button2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        contentPane.add(button2);
        button2.setBounds(20, 225, 150, 45);

        //---- button3 ----
        button3.setText("\u7528\u6237\u7ba1\u7406");
        button3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        contentPane.add(button3);
        button3.setBounds(20, 300, 150, 45);

        //---- button4 ----
        button4.setText("\u4f18\u60e0\u5238\u7ba1\u7406");
        button4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        contentPane.add(button4);
        button4.setBounds(20, 375, 150, 45);

        //---- button5 ----
        button5.setText("\u6536\u76ca");
        button5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        contentPane.add(button5);
        button5.setBounds(20, 450, 150, 45);

        //---- button6 ----
        button6.setText("\u641c\u7d22");
        contentPane.add(button6);
        button6.setBounds(930, 150, 75, 30);

        //---- button7 ----
        button7.setText("\u6dfb\u52a0");
        contentPane.add(button7);
        button7.setBounds(930, 250, 75, 30);

        //---- button8 ----
        button8.setText("\u5220\u9664");
        contentPane.add(button8);
        button8.setBounds(930, 350, 75, 30);

        //---- button9 ----
        button9.setText("\u4fee\u6539");
        contentPane.add(button9);
        button9.setBounds(930, 450, 75, 30);
        contentPane.add(separator1);
        separator1.setBounds(0, 135, 1100, 5);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(205, 210, 700, scrollPane1.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(205, 150, 700, 30);

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

            //---- label3 ----
            label3.setText("\u4f18\u60e0\u5238\u7f16\u7801\uff1a");
            dialog1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(75, 20), label3.getPreferredSize()));

            //---- label6 ----
            label6.setText("\u7528\u6237ID\uff1a");
            dialog1ContentPane.add(label6);
            label6.setBounds(new Rectangle(new Point(99, 60), label6.getPreferredSize()));

            //---- label7 ----
            label7.setText("\u4f18\u60e0\u5238\u540d\u79f0\uff1a");
            dialog1ContentPane.add(label7);
            label7.setBounds(new Rectangle(new Point(75, 100), label7.getPreferredSize()));

            //---- label8 ----
            label8.setText("\u4f18\u60e0\u5238\u8be6\u60c5\uff1a");
            dialog1ContentPane.add(label8);
            label8.setBounds(new Rectangle(new Point(75, 140), label8.getPreferredSize()));

            //---- label9 ----
            label9.setText("\u662f\u5426\u4e0evip\u7b49\u7ea7\u6298\u6263\u53e0\u52a0\uff1a");
            dialog1ContentPane.add(label9);
            label9.setBounds(new Rectangle(new Point(9, 180), label9.getPreferredSize()));

            //---- label10 ----
            label10.setText("\u4f18\u60e0\u4ef7\u683c\uff1a");
            dialog1ContentPane.add(label10);
            label10.setBounds(new Rectangle(new Point(87, 220), label10.getPreferredSize()));

            //---- label11 ----
            label11.setText("\u4f18\u60e0\u6240\u9700\u603b\u989d\uff1a");
            dialog1ContentPane.add(label11);
            label11.setBounds(new Rectangle(new Point(63, 260), label11.getPreferredSize()));
            dialog1ContentPane.add(textField2);
            textField2.setBounds(165, 13, 150, 30);
            dialog1ContentPane.add(textField3);
            textField3.setBounds(165, 53, 150, 30);
            dialog1ContentPane.add(textField4);
            textField4.setBounds(165, 93, 150, 30);
            dialog1ContentPane.add(textField5);
            textField5.setBounds(165, 133, 150, 30);
            dialog1ContentPane.add(textField6);
            textField6.setBounds(165, 173, 150, 30);
            dialog1ContentPane.add(textField7);
            textField7.setBounds(165, 213, 150, 30);
            dialog1ContentPane.add(textField8);
            textField8.setBounds(165, 253, 150, 30);

            //---- button10 ----
            button10.setText("\u786e\u5b9a");
            dialog1ContentPane.add(button10);
            button10.setBounds(new Rectangle(new Point(75, 300), button10.getPreferredSize()));

            //---- button11 ----
            button11.setText("\u53d6\u6d88");
            dialog1ContentPane.add(button11);
            button11.setBounds(new Rectangle(new Point(200, 300), button11.getPreferredSize()));

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

        //======== dialog2 ========
        {
            Container dialog2ContentPane = dialog2.getContentPane();
            dialog2ContentPane.setLayout(null);

            //---- label12 ----
            label12.setText("\u4f18\u60e0\u5238\u7f16\u7801\uff1a");
            dialog2ContentPane.add(label12);
            label12.setBounds(new Rectangle(new Point(75, 20), label12.getPreferredSize()));

            //---- label13 ----
            label13.setText("\u7528\u6237ID\uff1a");
            dialog2ContentPane.add(label13);
            label13.setBounds(new Rectangle(new Point(99, 60), label13.getPreferredSize()));

            //---- label14 ----
            label14.setText("\u4f18\u60e0\u5238\u540d\u79f0\uff1a");
            dialog2ContentPane.add(label14);
            label14.setBounds(new Rectangle(new Point(75, 100), label14.getPreferredSize()));

            //---- label15 ----
            label15.setText("\u4f18\u60e0\u5238\u8be6\u60c5\uff1a");
            dialog2ContentPane.add(label15);
            label15.setBounds(new Rectangle(new Point(75, 140), label15.getPreferredSize()));

            //---- label16 ----
            label16.setText("\u662f\u5426\u4e0evip\u7b49\u7ea7\u6298\u6263\u53e0\u52a0\uff1a");
            dialog2ContentPane.add(label16);
            label16.setBounds(new Rectangle(new Point(9, 180), label16.getPreferredSize()));

            //---- label17 ----
            label17.setText("\u4f18\u60e0\u4ef7\u683c\uff1a");
            dialog2ContentPane.add(label17);
            label17.setBounds(new Rectangle(new Point(87, 220), label17.getPreferredSize()));

            //---- label18 ----
            label18.setText("\u4f18\u60e0\u6240\u9700\u603b\u989d\uff1a");
            dialog2ContentPane.add(label18);
            label18.setBounds(new Rectangle(new Point(63, 260), label18.getPreferredSize()));
            dialog2ContentPane.add(textField9);
            textField9.setBounds(165, 13, 150, 30);
            dialog2ContentPane.add(textField10);
            textField10.setBounds(165, 53, 150, 30);
            dialog2ContentPane.add(textField11);
            textField11.setBounds(165, 93, 150, 30);
            dialog2ContentPane.add(textField12);
            textField12.setBounds(165, 133, 150, 30);
            dialog2ContentPane.add(textField13);
            textField13.setBounds(165, 173, 150, 30);
            dialog2ContentPane.add(textField14);
            textField14.setBounds(165, 213, 150, 30);
            dialog2ContentPane.add(textField15);
            textField15.setBounds(165, 253, 150, 30);

            //---- button12 ----
            button12.setText("\u786e\u5b9a");
            dialog2ContentPane.add(button12);
            button12.setBounds(new Rectangle(new Point(75, 300), button12.getPreferredSize()));

            //---- button13 ----
            button13.setText("\u53d6\u6d88");
            dialog2ContentPane.add(button13);
            button13.setBounds(new Rectangle(new Point(200, 300), button13.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialog2ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = dialog2ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialog2ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialog2ContentPane.setMinimumSize(preferredSize);
                dialog2ContentPane.setPreferredSize(preferredSize);
            }
            dialog2.pack();
            dialog2.setLocationRelativeTo(dialog2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPopupMenu.Separator separator1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JTextField textField1;
    private JDialog dialog1;
    private JLabel label3;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton button10;
    private JButton button11;
    private JDialog dialog2;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JButton button12;
    private JButton button13;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
