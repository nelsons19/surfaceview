package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

import java.util.ArrayList;

public class BeefJerky extends SurfaceView implements View.OnTouchListener {

    private ArrayList<Spot> theSpots = new ArrayList<Spot>();
    public static final int STARTING_SPOT_NUM = 100;

    public BeefJerky(Context context) {
        super(context);
        init();
    }

    public BeefJerky(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BeefJerky(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setWillNotDraw(false);
//        for(int i = 0; i < STARTING_SPOT_NUM; ++i) {
//            Spot uhSpot = new Spot();
//            this.theSpots.add(uhSpot);
//        }
        this.setOnTouchListener(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        for(Spot s : theSpots) {
            s.draw(canvas);
        }

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int xTouch = (int)event.getX();
        int yTouch = (int)event.getY();

        Spot newSpot = new Spot(xTouch, yTouch);
        theSpots.add(newSpot);

        this.invalidate();

        return true;
    }
}
