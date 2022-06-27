package jw3.c1.utils;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class scwj {
    public static void eventOnImport(JButton developer) {
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        /** 过滤文件类型 * */
        FileNameExtensionFilter filter = new FileNameExtensionFilter("png",
                "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(developer);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            /** 得到选择的文件* */
            File[] arrfiles = chooser.getSelectedFiles();
            if (arrfiles == null || arrfiles.length == 0) {
                return;
            }
            FileInputStream input = null;
            FileOutputStream out = null;
            String path = "images/tx/";
            try {
                for (File f : arrfiles) {
                    File dir = new File(path);
                    /** 目标文件夹 * */
                    File[] fs = dir.listFiles();
                    HashSet<String> set = new HashSet<String>();
                    for (File file : fs) {
                        set.add(file.getName());
                    }
                    /** 判断是否已有该文件* */
                    if (set.contains(f.getName())) {
                        JOptionPane.showMessageDialog(new JDialog(),
                                f.getName() + ":该文件已存在！");
                        return;
                    }
                    try {
                        input = new FileInputStream(f);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    byte[] buffer = new byte[1024];
                    File des = new File(path, f.getName());
                    out = new FileOutputStream(des);
                    int len = 0;
                    while (-1 != (len = input.read(buffer))) {
                        try {
                            out.write(buffer, 0, len);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    out.close();
                    input.close();
                }
                JOptionPane.showMessageDialog(null, "上传成功！", "提示",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (FileNotFoundException e1) {
                JOptionPane.showMessageDialog(null, "上传失败！", "提示",
                        JOptionPane.ERROR_MESSAGE);
                e1.printStackTrace();
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null, "上传失败！", "提示",
                        JOptionPane.ERROR_MESSAGE);
                e1.printStackTrace();
            }
        }
    }
    public static Map<String, String> getFilesDatas(String filePath){
        Map<String, String> files = new HashMap<>();
        File file = new File(filePath); //需要获取的文件的路径
        String[] fileNameLists = file.list(); //存储文件名的String数组
        File[] filePathLists = file.listFiles(); //存储文件路径的String数组
        for(int i=0;i<filePathLists.length;i++){
            if(filePathLists[i].isFile()){
                try {//读取指定文件路径下的文件内容
                    String fileDatas = readFile(filePathLists[i]);
                    //把文件名作为key,文件内容为value 存储在map中
                    files.put(fileNameLists[i], fileDatas);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return files;
    }
    public static String readFile(File path) throws IOException{
        //创建一个输入流对象
        InputStream is = new FileInputStream(path);
        //定义一个缓冲区
        byte[] bytes = new byte[1024];// 1kb
        //通过输入流使用read方法读取数据
        int len = is.read(bytes);
        //System.out.println("字节数:"+len);
        String str = null;
        while(len!=-1){
            //把数据转换为字符串
            str = new String(bytes, 0, len);
            //System.out.println(str);
            //继续进行读取
            len = is.read(bytes);
        }
        //释放资源
        is.close();
        return str;
    }
}
