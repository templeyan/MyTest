package com.ymy.mystudy;

import android.util.Log;

/**
 * Created by ymy on 2017/3/1.
 */

public class ZG implements CallBack {
    public ZG(Worker worker){
        worker.doSomethings1(this,"打枪");
    }

    @Override
    public void backresult(String s) {
        Log.e("ssss","打枪"+s);
    }
}
