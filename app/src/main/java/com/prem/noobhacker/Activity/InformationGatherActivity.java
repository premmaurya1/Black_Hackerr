package com.prem.noobhacker.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.prem.noobhacker.Ads.Admob;
import com.prem.noobhacker.R;

public class InformationGatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_gather);

        getSupportActionBar().setTitle("Info.. Gathering");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Admob.setBanner(findViewById(R.id.banner_ads), InformationGatherActivity.this);
    }
}