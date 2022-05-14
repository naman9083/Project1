package com.example.android.newsfeed;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class readNews extends AppCompatActivity {
    TextView text;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String url = getIntent().getStringExtra("URL");
        setContentView(R.layout.activity_read_news);
        WebView w = (WebView) findViewById(R.id.ReadNews);
        w.loadUrl(url);
        w.getSettings().setJavaScriptEnabled(true);
        w.setWebViewClient(new WebViewClient());

    }

}
