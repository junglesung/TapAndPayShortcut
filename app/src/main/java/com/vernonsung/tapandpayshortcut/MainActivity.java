package com.vernonsung.tapandpayshortcut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(Settings.ACTION_NFC_PAYMENT_SETTINGS).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        this.finish();
    }
}
