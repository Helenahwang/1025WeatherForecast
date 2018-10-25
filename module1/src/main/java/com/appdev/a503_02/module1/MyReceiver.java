package com.appdev.a503_02.module1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    // ex) 카카오톡 택시... 카카오톡 앱 안에 택시 앱을 켤 수 있다.

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"방송이 수신되었습니다.", Toast.LENGTH_LONG).show();

        //앱이 실행중이 아니면 실행하기
        Intent intent1 = new Intent(context, MainActivity.class);

        //인텐트가 없었으면 새로운 작업을 만들어서 실행하도록 옵션을 조정
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);

    }
}
