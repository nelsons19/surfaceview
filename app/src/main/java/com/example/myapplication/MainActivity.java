package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    SurfaceView mySurfaceview = null;
    BeefJerky listener = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.svlayout);

        mySurfaceview = (findViewById(R.id.slim_jim));
        listener = new BeefJerky(this);
        mySurfaceview.setOnTouchListener(listener);

    }
}
