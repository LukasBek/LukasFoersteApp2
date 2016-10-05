package com.example.lukas.lukasfoersteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class webview extends AppCompatActivity implements View.OnClickListener {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Button søg = (Button) findViewById(R.id.søg);
        søg.setOnClickListener(this);

        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(this);

        webView = (WebView) findViewById(R.id.webView);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.søg:
                System.out.println("søg");
                TextView enteredURL = (TextView) findViewById(R.id.url);
                String url = enteredURL.getText().toString();
                System.out.println(url);
                webView.loadUrl(url);
                break;

            case R.id.next:
                startActivity(new Intent(webview.this, dmi.class));
                break;
        }
    }
}


