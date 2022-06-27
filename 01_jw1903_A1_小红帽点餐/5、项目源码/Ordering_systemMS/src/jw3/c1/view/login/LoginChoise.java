/*
 * Created by JFormDesigner on Thu May 19 15:04:54 CST 2022
 */

package jw3.c1.view.login;

import jw3.c1.utils.Imagesinks;
import jw3.c1.view.Administrator.AdministratorLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Brainrain
 */
public class LoginChoise extends JFrame {
    public LoginChoise() {
        initComponents();
        setVisible(true);
        setSize(300,200);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1MouseClicked(MouseEvent e) {
        new UserLogin();
        dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        AdministratorLogin a=new AdministratorLogin();
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setTitle("\u767b\u9646\u7cfb\u7edf\u9009\u62e9");
        setIconImage(new ImageIcon("D:\\\u684c\u9762\\\u65b0\u5efa\u6587\u4ef6\u5939 (5)\\01_jw1903_A1_\u5c0f\u7ea2\u5e3d\u70b9\u9910\\5\u3001\u9879\u76ee\u6e90\u7801\\Ordering_systemMS\\images\\logo\\logo.png").getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("\u7528\u6237\u767b\u5f55");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(105, 27, 120, 30);

        //---- button2 ----
        button2.setText("\u7ba1\u7406\u5458\u767b\u5f55");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(105, 102, 120, 30);

        //---- label1 ----
        label1.setText("text");
        contentPane.add(label1);
        label1.setBounds(30, 20, 55, 45);

        //---- label2 ----
        label2.setText("text");
        contentPane.add(label2);
        label2.setBounds(30, 95, 55, 45);

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
        label1.setIcon(Imagesinks.png("images/dlu/user.png",50,50));
        label2.setIcon(Imagesinks.png("images/dlu/admin.png",50,50));
//        this.setIconImage(Imagesinks.png1("images/logo.logo.png",50,50));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
