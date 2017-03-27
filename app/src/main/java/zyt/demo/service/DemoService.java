package zyt.demo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by zyt on 2017/3/26 20:53.
 */

public class DemoService extends Service {

    private static final String TAG = "DemoService";

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: executed");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: executed");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: executed");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: executed");
        return null;
    }
}
