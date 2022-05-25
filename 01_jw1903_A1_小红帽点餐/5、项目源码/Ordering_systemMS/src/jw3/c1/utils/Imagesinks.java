package jw3.c1.utils;

import javax.swing.*;
import java.awt.*;

public class Imagesinks {
    //url是路径，a是长度，b为宽度
    public static ImageIcon png(String url,int a,int b){
        ImageIcon image=new ImageIcon(url);
        image.setImage(image.getImage().getScaledInstance(a,b, Image.SCALE_DEFAULT));
        return image;
    }
    public static Image png1(String url,int a,int b){
        ImageIcon imageIcon=new ImageIcon(url);
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(a,b,Image.SCALE_DEFAULT));
        Image image=imageIcon.getImage();
        return image;
    }
}
