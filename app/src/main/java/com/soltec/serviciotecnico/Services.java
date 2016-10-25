package com.soltec.serviciotecnico;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by JOELITO on 24/10/2016.
 */
public class Services extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"el servicio se está ejecutando",Toast.LENGTH_SHORT).show();
       // return super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OOH! El servicio se ha destruido",Toast.LENGTH_SHORT).show();

    }
}
