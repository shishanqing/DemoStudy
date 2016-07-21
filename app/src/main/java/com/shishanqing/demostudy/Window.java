package com.shishanqing.demostudy;


/**
 * Created by shishanqing on 16-7-21.
 * 窗口类
 * Window依赖于View，而View定义了一个视图抽象，measure是各个子类共享的方法，子类通过覆写View的draw方法实现
 * 具有各自特色的功能，在这里，这个功能就是绘制自身的内容。任何继承自View的子类都可以设置给show方法，就是所说
 * 的里氏替换。通过里氏替换，就可以自定义各式各样、千变万化的View，然后传递给Window，Window负责组织View，
 * 并且将View显示到屏幕上。
 */
public class Window {
    public void show(View child) {
        child.draw();
    }
}
