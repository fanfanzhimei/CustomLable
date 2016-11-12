package com.zhi.customlable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * 自定义标题
 * 注意：不在style里自定义一个CustomTheme而直接设置背景色，左右两边会有一定的灰色区域空白
 * 这是因为android的主题部分使用的是两个帧布局，上面一层它设置了一定的距离
 * 解决办法是：把上一层中的布局设置为透明色，而把下一层中的布局设置成我们想要的背景色即可
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
    }
}
