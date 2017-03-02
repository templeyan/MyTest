package com.ymy.mystudy;

import android.util.Log;
import android.widget.ImageView;

/**
 * Created by ymy on 2017/3/1.
 * 老板这个类
 */

public class Boss implements CallBack{
    //CallBack callBack = null;
    public Boss(Worker worker){
        worker.doSomethings(this,"看电影");
    }
    @Override
    public void backresult(String s) {
        Log.e("sss","事情"+s);
    }
}
