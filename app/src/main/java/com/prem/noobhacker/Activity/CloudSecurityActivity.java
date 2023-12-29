package com.prem.noobhacker.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.prem.noobhacker.Ads.Admob;
import com.prem.noobhacker.R;

public class CloudSecurityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_security);

        getSupportActionBar().setTitle("Cloud Security");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Admob.setBanner(findViewById(R.id.banner_ads), CloudSecurityActivity.this);
    }
}