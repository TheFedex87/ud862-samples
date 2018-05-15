package com.example.android.tickcross;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView tickCross;
    private ImageView burgerArrow;
    private AnimatedVectorDrawable tickToCross;
    private AnimatedVectorDrawable crossToTick;
    private AnimatedVectorDrawable burgerToArrow;
    private AnimatedVectorDrawable arrowToBurger;
    private boolean tick = true;
    private boolean burger = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tickCross = (ImageView) findViewById(R.id.tick_cross);
        tickToCross = (AnimatedVectorDrawable) getDrawable(R.drawable.avd_tick_to_cross);
        crossToTick = (AnimatedVectorDrawable) getDrawable(R.drawable.avd_cross_to_tick);

        burgerArrow = findViewById(R.id.burger_arrow);
        burgerToArrow = (AnimatedVectorDrawable) getDrawable(R.drawable.avd_burger_to_arrow);
        arrowToBurger = (AnimatedVectorDrawable) getDrawable(R.drawable.avd_arrow_to_burger);
    }

    public void animate_tick_cross(View view) {
        AnimatedVectorDrawable drawable = tick ? tickToCross : crossToTick;
        tickCross.setImageDrawable(drawable);
        drawable.start();
        tick = !tick;
    }

    public void animate_burger_arrow(View view) {
        AnimatedVectorDrawable drawable = burger ? burgerToArrow : arrowToBurger;
        burgerArrow.setImageDrawable(drawable);
        drawable.start();
        burger = !burger;
    }
}
