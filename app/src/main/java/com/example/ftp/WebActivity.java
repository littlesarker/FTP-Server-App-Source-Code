package com.example.ftp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;

public class WebActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView=findViewById(R.id.webViewID);

            Intent intent=getIntent();
            String str=  intent.getStringExtra("link");
            webView.loadUrl(str);


    }

    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        } else {

            super.onBackPressed();
        }
    }

}