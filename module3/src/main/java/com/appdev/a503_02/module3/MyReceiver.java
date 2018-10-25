package com.appdev.a503_02.module3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {


            Intent intent1 = new Intent(context, MainActivity.class);
            context.startActivity(intent1);
            Toast.makeText(context,"카운트가 끝났습니다.", Toast.LENGTH_LONG).show();

        }
}
