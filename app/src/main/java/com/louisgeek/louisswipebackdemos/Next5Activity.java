package com.louisgeek.louisswipebackdemos;

import android.os.Bundle;

import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

public class Next5Activity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next5);


        SwipeBackLayout  swipeBackLayout =getSwipeBackLayout();
        //swipeBackLayout.setEdgeSize(200);//可滑动的范围
        //swipeBackLayout.setEnableGesture(true);//滑动是否可用
        //swipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);//滑动的方向
    }
}
