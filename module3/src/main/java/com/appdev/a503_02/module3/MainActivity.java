package com.appdev.a503_02.module3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        //스레드 : 앱을 종료시키면 같이 종료된다.
        Thread th = new Thread(){
            @Override
            public void run(){

                for(int i=0; i<30; i++){
                    try{
                        Thread.sleep(1000);
                        Log.e("Thread", i+"");
                    }catch (Exception e){}
                }

            }
        };

        th.start();
        */

        //인텐트 서비스 (데몬) : 앱을 종료시키면 같이 종료된다.
        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);

        registerReceiver(new MyReceiver(), new IntentFilter("com.example.sendbroadcast1"));


        /*
        //서비스 (스타트 서비스) : 앱이 종료되더라도 계속 실행된다.
        Intent intent1 = new Intent(this, MyService.class);
        startService(intent1);
        */
    }


}
