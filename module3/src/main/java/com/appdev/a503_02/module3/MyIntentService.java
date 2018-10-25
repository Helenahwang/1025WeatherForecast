package com.appdev.a503_02.module3;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "com.appdev.a503_02.module3.action.FOO";
    private static final String ACTION_BAZ = "com.appdev.a503_02.module3.action.BAZ";

    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "com.appdev.a503_02.module3.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.appdev.a503_02.module3.extra.PARAM2";

    public MyIntentService() {
        super("MyIntentService");
    }

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, MyIntentService.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionBaz(Context context, String param1, String param2) {
        Intent intent = new Intent(context, MyIntentService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //MainActivity activity = (MainActivity)intent.getSerializableExtra("mainActivity");
        for(int i=0; i<30; i++){
            try{
                Thread.sleep(1000);
                Log.e("IntentService", i+"");

            }catch (Exception e){}
        }

        //방송을 송신
        Intent intent1 = new Intent();
        //방송 액션
        intent1.setAction("com.example.sendbroadcast1");
        //실행한 적이 없어도 설치되어 있으면 방송을 수신
        intent1.addFlags(intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        //방송을 송신
        sendBroadcast(intent1);


    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
