package com.louisgeek.louisswipebackdemos;

import android.os.Bundle;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

//继承自ActionBarActivity的SwipeBackActivity
public class Next4Activity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next4);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);
    }
}
