package com.prem.noobhacker.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.prem.noobhacker.Ads.Admob;
import com.prem.noobhacker.R;

public class CryptographyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cryptography);

        getSupportActionBar().setTitle("Cryptography");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Admob.setBanner(findViewById(R.id.banner_ads), CryptographyActivity.this);
    }
}