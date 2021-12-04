package com.example.epsilon_coder;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = (WebView) findViewById(R.id.webView);

        WebSettings webSettings= webview.getSettings();

        webSettings.setJavaScriptEnabled(true);

        webview.setWebViewClient(new WebViewClient());

        webview.loadUrl("https://hacker1998-thosiba.github.io/Portfolio/");






    }
}
