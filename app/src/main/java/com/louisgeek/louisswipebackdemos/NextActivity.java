package com.louisgeek.louisswipebackdemos;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import ooo.oxo.library.widget.PullBackLayout;

public class NextActivity extends AppCompatActivity implements PullBackLayout.Callback {

    @Bind(R.id.id_iv)
    ImageView idIv;
    @Bind(R.id.id_pbl)
    PullBackLayout idPbl;
    @Bind(R.id.id_vp)
    ViewPager idVp;

    List<String> stringList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        ButterKnife.bind(this);

        for (int i = 0; i < 5; i++) {
            stringList.add("Page"+i);
        }
        MyPagerAdapter myPagerAdapter=new MyPagerAdapter(stringList,this);
        idVp.setAdapter(myPagerAdapter  );
        /* ... */
        idPbl.setCallback(this);
    }

    @Override
    public void onPullStart() {
        // fade out Action Bar ...
        // show Status Bar ...
    }

    @Override
    public void onPull(float v) {
        // set the opacity of the window's background
    }

    @Override
    public void onPullCancel() {
        // fade in Action Bar
    }

    @Override
    public void onPullComplete() {
        supportFinishAfterTransition();
    }
}
