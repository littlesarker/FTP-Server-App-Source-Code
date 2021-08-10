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
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Eng(View view)
    {

        String str="http://172.16.50.7/SAM-FTP-2/English%20Movies/";
        Intent intent=new Intent(this,WebActivity.class);
        intent.putExtra("link",str);
        startActivity(intent);


    }
    public void Hind(View view)
    {

        String str="http://172.16.50.9/SAM-FTP-1/Hindi%20Movies/";
        Intent intent=new Intent(this,WebActivity.class);
        intent.putExtra("link",str);
        startActivity(intent);



    }
    public void ani(View view)
    {
        String str="http://172.16.50.10/SAM-FTP-3/Animation%20Movies/";
        Intent intent=new Intent(this,WebActivity.class);
        intent.putExtra("link",str);
        startActivity(intent);


    }
    public void tvWeb(View view)
    {
        String str="http://172.16.50.9/SAM-FTP-1TV%20%26%20WEB%20Series/";
        Intent intent=new Intent(this,WebActivity.class);
        intent.putExtra("link",str);
        startActivity(intent);


    }



}