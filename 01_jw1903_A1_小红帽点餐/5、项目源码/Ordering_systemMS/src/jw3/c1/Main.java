package jw3.c1;

import jw3.c1.view.Index;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
        UIManager.put("RootPane.setupButtonVisible", false);
        // 启用皮肤
        try {
            BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Orderinterface o=new Orderinterface();
            Index u=new Index();
    }
}
