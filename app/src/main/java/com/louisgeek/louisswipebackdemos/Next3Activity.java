package com.louisgeek.louisswipebackdemos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hannesdorfmann.swipeback.Position;
import com.hannesdorfmann.swipeback.SwipeBack;

public class Next3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_next3);

        // Init the swipe back
        SwipeBack.attach(this, Position.LEFT)
                .setContentView(R.layout.activity_next3)
                .setSwipeBackView(R.layout.swipeback_default);

        /*https://github.com/sockeqwe/SwipeBack

        SwipeBack.attach(this, Position.LEFT)
                .setDrawOverlay(true)
                .setDivider(drawable)
                .setDividerEnabled(true) // Must be called to enable, setDivider() is not enough
                .setSwipeBackTransformer(new SlideSwipeBackTransformer())
                .setContentView(R.layout.activity_simple)
                .setSwipeBackView(R.layout.swipeback_default);*/
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.swipeback_stack_to_front,
                R.anim.swipeback_stack_right_out);
    }
}
