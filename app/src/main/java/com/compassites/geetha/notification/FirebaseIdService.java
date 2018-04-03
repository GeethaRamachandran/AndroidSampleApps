package com.compassites.geetha.notification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by geetha on 3/4/18.
 */

public class FirebaseIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token=FirebaseInstanceId.getInstance().getToken();
        Log.d("Refresh token : ",""+token);

    }
}
