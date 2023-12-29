package com.prem.noobhacker;

import static android.Manifest.permission.POST_NOTIFICATIONS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.prem.noobhacker.Activity.BufferOverflowActivity;
import com.prem.noobhacker.Activity.CloudSecurityActivity;
import com.prem.noobhacker.Activity.CryptographyActivity;
import com.prem.noobhacker.Activity.ExplorationActivity;
import com.prem.noobhacker.Activity.IOTActivity;
import com.prem.noobhacker.Activity.IncidentResActivity;
import com.prem.noobhacker.Activity.InformationGatherActivity;
import com.prem.noobhacker.Activity.MalwareActivity;
import com.prem.noobhacker.Activity.MobileSecurityActivity;
import com.prem.noobhacker.Activity.NetworkFunActivity;
import com.prem.noobhacker.Activity.OSActivity;
import com.prem.noobhacker.Activity.PenetrationTastingActivity;
import com.prem.noobhacker.Activity.ScanningEnumActivity;
import com.prem.noobhacker.Activity.SecurityToolsActivity;
import com.prem.noobhacker.Activity.SocialEngeeActivity;
import com.prem.noobhacker.Activity.VulnerabilityActivity;
import com.prem.noobhacker.Activity.WebSecurityActivity;
import com.prem.noobhacker.Activity.WirelessHackActivity;
import com.prem.noobhacker.Ads.Admob;
import com.prem.noobhacker.Ads.OnDismiss;

import org.jetbrains.annotations.Nullable;

import eu.dkaratzas.android.inapp.update.Constants;
import eu.dkaratzas.android.inapp.update.InAppUpdateManager;
import eu.dkaratzas.android.inapp.update.InAppUpdateStatus;

public class MainActivity extends AppCompatActivity implements InAppUpdateManager.InAppUpdateHandler {

    private LinearLayout networkFun, os, informationGather, scanningEnum, vulnerability, exploration, malware, socialEngee, wirelessHack, webSecurity, penetrationTasting;
    private LinearLayout cryptography, bufferOverflow, incidentRes, mobileSecurity, iot, cloudSecurity, securityTools;
    private RelativeLayout syllabus, developer, otherApp, feedback;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;
    private InAppUpdateManager inAppUpdateManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Admob.showOpenAds(MainActivity.this);
        Admob.setBanner(findViewById(R.id.banner_ads), MainActivity.this);


        // Android 13 Permission
        NotificationPerm13();

        // DrawerLayout Method
        DrawerLayoutMethod();

        //  Navigation Item with Click Listener
        NavigationItem();

        // App Update Method
        AppUpdateMethod();

        networkFun = findViewById(R.id.networkFun);
        os = findViewById(R.id.os);
        informationGather = findViewById(R.id.informationGather);
        scanningEnum = findViewById(R.id.scanningEnum);
        vulnerability = findViewById(R.id.vulnerability);
        exploration = findViewById(R.id.exploration);
        malware = findViewById(R.id.malware);
        socialEngee = findViewById(R.id.socialEngee);
        wirelessHack = findViewById(R.id.wirelessHack);
        webSecurity = findViewById(R.id.webSecurity);
        penetrationTasting = findViewById(R.id.penetrationTasting);
        cryptography = findViewById(R.id.cryptography);
        bufferOverflow = findViewById(R.id.bufferOverflow);
        incidentRes = findViewById(R.id.incidentRes);
        mobileSecurity = findViewById(R.id.mobileSecurity);
        iot = findViewById(R.id.iot);
        cloudSecurity = findViewById(R.id.cloudSecurity);
        securityTools = findViewById(R.id.securityTools);
        syllabus = findViewById(R.id.syllabus);
        developer = findViewById(R.id.developer);
        otherApp = findViewById(R.id.otherApp);
        feedback = findViewById(R.id.feedback);

        networkFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NetworkFunActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OSActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        informationGather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InformationGatherActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        scanningEnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScanningEnumActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        vulnerability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VulnerabilityActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        exploration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ExplorationActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        malware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MalwareActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        socialEngee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SocialEngeeActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        wirelessHack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WirelessHackActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        webSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WebSecurityActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        penetrationTasting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PenetrationTastingActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        cryptography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CryptographyActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        bufferOverflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BufferOverflowActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        incidentRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, IncidentResActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        mobileSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MobileSecurityActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, IOTActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        cloudSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CloudSecurityActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        securityTools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecurityToolsActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SyllabusActivity.class));
                new Admob(new OnDismiss() {
                    @Override
                    public void onDismiss() {

                    }
                }).showInterstitialsAds(MainActivity.this, true);
            }
        });
        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Currently Working on this topics!!!", Toast.LENGTH_SHORT).show();
            }
        });
        otherApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/dev?id=7800284619870932914");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Unable to open\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Currently Working on this topics!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void NotificationPerm13() {

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            int permissionNotif = ActivityCompat.checkSelfPermission(this, POST_NOTIFICATIONS);
            if(permissionNotif != PackageManager.PERMISSION_GRANTED){
                String[] NOTIF_PERM = {POST_NOTIFICATIONS};
                ActivityCompat.requestPermissions(this, NOTIF_PERM,100);
            }
        }
    }
    //Drawer Layout
    public void DrawerLayoutMethod(){
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_bar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void NavigationItem(){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.theme){
                    Toast.makeText(MainActivity.this, "No theme available!!!", Toast.LENGTH_SHORT).show();
                } else if (id== R.id.share_app) {
                    try {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_SUBJECT, "Share this app");
                        intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                        startActivity(Intent.createChooser(intent, "Share with"));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } else if (id == R.id.rateUs) {
                    Uri uri = Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                    Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                    try {
                        startActivity(intent);
                    }catch (Exception e){
                        Toast.makeText(MainActivity.this, "Unable to open\n"+e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }else if (id == R.id.linkedin) {
                    Uri uri = Uri.parse("https://www.linkedin.com/in/prem-maurya-80a285251/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Unable to open\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }else if (id == R.id.youtube) {
                    Uri uri = Uri.parse("https://www.youtube.com/channel/UCteQr9HxtE88C-w7MD6GM3w");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Unable to open\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }else if (id == R.id.moreApp) {
                    Uri uri = Uri.parse("https://play.google.com/store/apps/dev?id=7800284619870932914");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Unable to open\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }else if (id == R.id.privacy_policy) {
                    Uri uri = Uri.parse("https://sites.google.com/view/noobhacker1/home");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Unable to open\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                if(drawerLayout.isDrawerOpen(GravityCompat.START)){
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return false;
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    // App Update Method
    public void AppUpdateMethod(){
        inAppUpdateManager = InAppUpdateManager.Builder(this, 101)
                .resumeUpdates(true)
                .mode(Constants.UpdateMode.FLEXIBLE)
                .snackBarAction("An update has just been downloaded!!!")
                .snackBarAction("RESTART")
                .handler(this);
        inAppUpdateManager.checkForAppUpdate();
    }
    @Override
    public void onInAppUpdateError(int code, Throwable error) {

    }

    @Override
    public void onInAppUpdateStatus(InAppUpdateStatus status) {
        if(status.isDownloaded()){
            View view =getWindow().getDecorView().findViewById(android.R.id.content);
            Snackbar snackbar= Snackbar.make(view,
                    "An updates just been downloaded!!!",
                    Snackbar.LENGTH_INDEFINITE);

            snackbar.setAction("", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    inAppUpdateManager.completeUpdate();
                }
            });
            snackbar.show();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 101) {
            if (resultCode == Activity.RESULT_CANCELED) {
                // If the update is cancelled by the user,
                // you can request to start the update again.
                inAppUpdateManager.checkForAppUpdate();

            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
    @Override
    public void onBackPressed() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Exit")
                    .setMessage("Are you sure you want to Exit?")
                    .setNegativeButton("No",null)
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finishAffinity();
                        }
                    }).show();
    }
}