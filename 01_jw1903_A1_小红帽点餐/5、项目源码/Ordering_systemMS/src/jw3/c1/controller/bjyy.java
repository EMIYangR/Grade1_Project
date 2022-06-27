package jw3.c1.controller;

import javax.print.DocFlavor;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class bjyy {
    static Clip clip;
    private static void playMusic(){
                 try
                 {
                     //这里面放 绝对路径，音频必须是wav格式，用音频转换软件 把mp3 转成wav格式
                     File musicPath = new File("D:\\桌面\\新建文件夹 (5)\\01_jw1903_A1_小红帽点餐\\5、项目源码\\Ordering_systemMS\\bgm\\bjyy.wav");
                     if(musicPath.exists())
                     {
                         AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                         clip = AudioSystem.getClip();
                         clip.open(audioInput);
                         FloatControl gainControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
                         gainControl.setValue(6.0f);//设置音量，范围为 -60.0f 到 6.0f
                         clip.start();
                         clip.loop(Clip.LOOP_CONTINUOUSLY);
                     }
                     else {}
                 }
                 catch(Exception ex)
                 {
                     ex.printStackTrace();
                 }

}

    public static void main(String[] args) {
        bjyy.playMusic();
    }
}
