package com.shishanqing.demostudy;

import android.graphics.Bitmap;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by shishanqing on 16-7-21.
 * SD卡缓存DiskCache类
 */
public class DiskCache implements ImageCache {
    static String cacheDir = "sdcard/cache";

    @Override
    public Bitmap get(String url) {
        return null;//从本地文件中获取该图片
    }

    @Override
    public void put(String url, Bitmap bmp) {
        //将Bitmap写入文件中
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
