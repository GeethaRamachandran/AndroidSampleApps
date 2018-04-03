package com.compassites.geetha.notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.crashlytics.android.Crashlytics;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());//For fabric crashlytics
        setContentView(R.layout.activity_main);
       // FirebaseApp.initializeApp(this);
        String token= FirebaseInstanceId.getInstance().getToken();
        Toast.makeText(this, ""+token, Toast.LENGTH_SHORT).show();
        Log.d("refresh",""+token);
    }

}
