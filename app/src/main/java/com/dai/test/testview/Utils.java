package com.dai.test.testview;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;

public class Utils {
    public static float dpToPixel(float dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return dp * metrics.density;
    }
    public static int setColor(float val,int mCount) {
        float one = (255 + 255) / (mCount * 2 / 3);
        int r = 0, g = 0, b = 0;
        if (val < (mCount * 1 / 3)) {
            r = (int) (one * val);
            g = 255;
        } else if (val >= (mCount * 1 / 3) && val < (mCount * 2 / 3)) {
            r = 255;
            g = 255 - (int) ((val - (mCount * 1 / 3)) * one);
        } else {
            r = 255;
        }//最后一个三等分
        return Color.rgb(r, g, b);
    }
}
