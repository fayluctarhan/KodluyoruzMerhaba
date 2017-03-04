package com.kodluyoruzmerhaba;

import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KodluyoruzMerhabaActivity extends AppCompatActivity {


    private String getTime(String methodName){

        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
        Date date = new Date();

        Log.e(methodName,dateFormat.format(date));

        return dateFormat.format(date);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getTime("onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kodluyoruz_merhaba);

    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        getTime("onCreateView");
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    protected void onStop() {
        getTime("onStop");
        super.onStop();
    }

    @Override
    protected void onStart() {
        getTime("onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        getTime("onResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        getTime("onDestroy");
        super.onDestroy();

    }

    @Override
    protected void onPause() {
        getTime("onPause");
        super.onPause();

    }

    @Override
    protected void onRestart() {
        getTime("onRestart");
        super.onRestart();

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        getTime("onSaveInstanceState");
        super.onSaveInstanceState(outState, outPersistentState);

    }
}
