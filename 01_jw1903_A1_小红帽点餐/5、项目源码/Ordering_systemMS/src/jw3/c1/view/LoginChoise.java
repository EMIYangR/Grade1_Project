/*
 * Created by JFormDesigner on Thu May 19 15:04:54 CST 2022
 */

package jw3.c1.view;

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
        setSize(250,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1MouseClicked(MouseEvent e) {
        UserLogin u=new UserLogin();
        setVisible(false);
    }

    private void button2MouseClicked(MouseEvent e) {
        setVisible(false);
        BusinessLogin sjl=new BusinessLogin();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("\u767b\u9646\u7cfb\u7edf\u9009\u62e9");
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
        button1.setBounds(25, 40, 82, 30);

        //---- button2 ----
        button2.setText("\u5546\u5bb6\u767b\u5f55");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(115, 40, 82, 30);

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
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
