package com.example.seungkim.annotation;

import android.app.NotificationManager;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.SystemService;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.BooleanRes;
import org.androidannotations.annotations.res.ColorRes;
import org.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById
    TextView tvTitle;

    @ViewById(R.id.btnEvent)
    Button btnNotice;

    @StringRes(R.string.app_name)
    String appName;

    @StringRes
    String hello;

    @AfterViews
    void afterViews(){
        tvTitle.setText(hello);
    }

    @Click({R.id.btnEvent})
    void click(View v){
        Log.i("Annotaion", v.toString());
    }
}
