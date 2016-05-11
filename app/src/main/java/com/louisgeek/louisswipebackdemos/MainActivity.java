package com.louisgeek.louisswipebackdemos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.id_btn1)
    Button idBtn1;
    @Bind(R.id.id_btn2)
    Button idBtn2;
    @Bind(R.id.id_btn3)
    Button idBtn3;
    @Bind(R.id.id_btn4)
    Button idBtn4;
    @Bind(R.id.id_btn5)
    Button idBtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.id_btn1, R.id.id_btn2, R.id.id_btn3, R.id.id_btn4, R.id.id_btn5})
    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId()) {
            case R.id.id_btn1:
                 intent=new Intent(this,NextActivity.class);
                startActivity(intent);
                break;
            case R.id.id_btn2:
                 intent=new Intent(this,Next2Activity.class);
                startActivity(intent);
                break;
            case R.id.id_btn3:
                intent=new Intent(this,Next3Activity.class);
                startActivity(intent);
                break;
            case R.id.id_btn4:
                intent=new Intent(this,Next4Activity.class);
                startActivity(intent);
                break;
            case R.id.id_btn5:
                intent=new Intent(this,Next5Activity.class);
                startActivity(intent);
                break;
        }
    }
}
