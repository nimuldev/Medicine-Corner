package com.share.your.happiness.medicinecorner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView medicine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        medicine.setWebViewClient(new WebViewClient());
        medicine.loadUrl("http://medishop.doflutter.com/");
        medicine.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
    private void init() {
        medicine=findViewById(R.id.medicine);
        WebSettings webSettings = medicine.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}