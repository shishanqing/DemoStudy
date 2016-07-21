package com.shishanqing.demostudy;

import android.graphics.Bitmap;

/**
 * Created by shishanqing on 16-7-21.
 * 图片缓存接口,用来抽象图片缓存的功能。
 * 定义了获取，缓存图片两个函数，缓存的key是图片的url，值是图片本身。
 * 内存缓存、SD卡缓存、双缓存都实现了该接口
 */
public interface ImageCache {
    public Bitmap get(String url);
    public void put(String url, Bitmap bmp);
}
