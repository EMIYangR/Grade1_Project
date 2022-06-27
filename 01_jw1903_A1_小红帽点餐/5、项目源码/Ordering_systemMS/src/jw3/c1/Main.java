package jw3.c1;

import jw3.c1.view.Main_interface.Evaluate;
import jw3.c1.view.Main_interface.Payment;
import jw3.c1.view.login.LoginChoise;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        new LoginChoise();
    }
}
