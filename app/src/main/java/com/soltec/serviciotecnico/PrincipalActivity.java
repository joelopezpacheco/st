package com.soltec.serviciotecnico;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity);


    }
    public void ComenzarServicio(View view){
startService(new Intent(getBaseContext(),Services.class));
    }
    public void Pararservicio(View view){
        stopService(new Intent(getBaseContext(),Services.class));
    }
}
