package com.example.wzb97.startservice_homework24;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    final String TAG="MyService Tag";
    public MyService() {
    }

    @Override
    public void onCreate() {
        Log.v(TAG,"onCreate");
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.v(TAG,"onBind");
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.v(TAG,"onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.v(TAG,"onStartCommand");
        int n=intent.getIntExtra("num",0);
        Log.v(TAG,"int is:"+n);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.v(TAG,"onDestory");
        super.onDestroy();
    }

    @Override
    public void onRebind(Intent intent) {
        Log.v(TAG,"onRebind");
        super.onRebind(intent);
    }

}
