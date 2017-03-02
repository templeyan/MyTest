package com.ymy.mystudy;

import android.util.Log;

/**
 * Created by ymy on 2017/3/1.
 * 工人这个类
 */

public class Worker {

  public void doSomethings(final CallBack callBack, String task){
      Log.e("sss","经理要你做"+task);

      new Thread(new Runnable() {
          @Override
          public void run() {
              try {
                  Thread.sleep(9000);
                  String r = "完成了";
                  callBack.backresult(r);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

          }
      }).start();

  }
    public void doSomethings1(final CallBack callBack, String task){
        Log.e("sss","主管要你做"+task);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                    String r = "完成了";
                    callBack.backresult(r);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

}
