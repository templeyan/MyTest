package com.ymy.mystudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Worker worker = new Worker();
        Boss boss = new Boss(worker);
        ZG zg = new ZG(worker);
    }
}
