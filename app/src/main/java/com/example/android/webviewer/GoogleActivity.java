package com.example.android.webviewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class GoogleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        WebView googleView = (WebView) findViewById(R.id.googleWebView);
        googleView.loadUrl("https://www.google.com/");
    }
}
