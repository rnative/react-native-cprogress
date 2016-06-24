package com.rnative.react_native_cprogress;

import android.support.annotation.Nullable;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import android.graphics.Color;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

/**
 * Created by Sathis on 2016/06/6.
 */
public class CProgressViewManager  extends SimpleViewManager<CircularProgressBar> {

    public static final String REACT_CLASS = "RCTCircularProgress";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected CircularProgressBar createViewInstance(ThemedReactContext reactContext) {
        CircularProgressBar view = new CircularProgressBar(reactContext, null);
        view.setColor(Color.GREEN);
        view.setBackgroundColor(Color.DKGRAY);
        view.setProgressBarWidth(20);
        view.setBackgroundProgressBarWidth(20);
        return  view;
    }

    @ReactProp(name = "color")
    public void setColor(CircularProgressBar view, String color) {
        view.setColor(Color.parseColor(color));
        view.invalidate();
    }

    @ReactProp(name = "bgColor")
    public void setBgColor(CircularProgressBar view, String color) {
        view.setBackgroundColor(Color.parseColor(color));
        view.invalidate();
    }

    @ReactProp(name = "bgWidth")
    public void setBgWidth(CircularProgressBar view, int width) {
        view.setBackgroundProgressBarWidth(width);
        view.invalidate();
    }


    @ReactProp(name = "progressWidth")
    public void setProgressWidth(CircularProgressBar view, int width) {
        view.setProgressBarWidth(width);
        view.invalidate();
    }

    @ReactProp(name = "progress")
    public void setProgress(CircularProgressBar view, int progress) {
        view.setProgressWithAnimation(progress, 1000);
    }
}
