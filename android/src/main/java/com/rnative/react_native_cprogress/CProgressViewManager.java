package com.rnative.reactnativecprogress;

import android.support.annotation.Nullable;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import android.graphics.Color;
import android.util.Log;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

/**
 * Created by Sathis on 2016/06/6.
 */
public class CProgressViewManager  extends SimpleViewManager<CircularProgressBar> {

    public static final String REACT_CLASS = "RCTCircularProgress";

    private int duration = 1500;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected CircularProgressBar createViewInstance(ThemedReactContext reactContext) {
        CircularProgressBar view = new CircularProgressBar(reactContext, null);
        return  view;
    }

    @ReactProp(name = "progressColor")
    public void setColor(CircularProgressBar view, String progressColor) {
        Log.d("RCProgress", "setColor");
        view.setColor(Color.parseColor(progressColor));
        view.invalidate();
    }

    @ReactProp(name = "bgColor")
    public void setBgColor(CircularProgressBar view, String color) {
        Log.d("RCProgress", "setBgColor");
        view.setBackgroundColor(Color.parseColor(color));
        view.invalidate();
    }

    @ReactProp(name = "duration")
    public void setDuration(CircularProgressBar view, int duration) {
        Log.d("RCProgress", "setDuration");
        this.duration = duration;
    }

    @ReactProp(name = "bgWidth")
    public void setBgWidth(CircularProgressBar view, int width) {
        Log.d("RCProgress", "setBgWidth");
        view.setBackgroundProgressBarWidth(width);
        view.invalidate();
    }


    @ReactProp(name = "progressWidth")
    public void setProgressWidth(CircularProgressBar view, int width) {
        Log.d("RCProgress", "setProgressWidth");
        view.setProgressBarWidth(width);
        view.invalidate();
    }

    @ReactProp(name = "progress")
    public void setProgress(CircularProgressBar view, int progress) {
        Log.d("RCProgress", "setProgress");
        view.setProgressWithAnimation(progress, this.duration);
    }
}
