package jw3.c1.controller;

import javax.swing.*;
import java.awt.*;

public class FrameShow {
    //jframe 需要控制的窗体，aw宽，bh高
    public static void mdSize(JFrame jFrame,float aw,float bh){
        Component[] components=jFrame.getRootPane().getContentPane().getComponents();
        for (Component co:components) {
            float lx=co.getX() * aw;
            float lh=co.getY() * bh;
            float width=co.getWidth() * aw;
            float height=co.getHeight() * bh;
            co.setLocation((int)lx,(int)lh);
            co.setSize((int)width,(int)height);
            int size=(int)(co.getFont().getSize() * bh);
            Font font=new Font(co.getFont().getFontName(),co.getFont().getStyle(),size);
            co.setFont(font);
        }
    }
}
