package com.prem.noobhacker.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.prem.noobhacker.Ads.Admob;
import com.prem.noobhacker.R;

public class WirelessHackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wireless_hack);

        getSupportActionBar().setTitle("Wireless Hack");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Admob.setBanner(findViewById(R.id.banner_ads), WirelessHackActivity.this);
    }
}