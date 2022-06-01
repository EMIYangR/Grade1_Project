package jw3.c1;

import jw3.c1.view.登录.UserLogin;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import javax.swing.*;

public class text {
    public static void main(String[] args) {
        BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
        UIManager.put("RootPane.setupButtonVisible", false);
        // 启用皮肤
        try {
            BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new UserLogin();
    }
}