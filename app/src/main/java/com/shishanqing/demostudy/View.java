package com.shishanqing.demostudy;

/**
 * Created by shishanqing on 16-7-21.
 * 建立视图抽象，测量视图的宽高为公用代码，绘制实现交给具体的子类
 */
public abstract  class View {
    public abstract void draw();
    public void measure(int width, int height) {
        //测量视图大小
    }
}
