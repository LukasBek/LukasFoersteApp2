package com.example.lukas.lukasfoersteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.webkit.WebView;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebViewClient;

public class HovedSkaerm extends AppCompatActivity implements View.OnClickListener {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoved_skaerm);

        Button indstillinger = (Button) findViewById(R.id.indstillinger);
        indstillinger.setOnClickListener(this);

        Button vejledning = (Button) findViewById(R.id.vejledning);
        vejledning.setOnClickListener(this);

        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(this);

        //Button søg = (Button) findViewById(R.id.søg);
        //søg.setOnClickListener(this);

        //webView = (WebView) findViewById(R.id.webView);
    }


    @Override
    public void onClick(View v) {
        TextView ændretTekst = (TextView) findViewById(R.id.tekstSomÆndrerSig);

        switch (v.getId()){
            case R.id.vejledning:

                System.out.println("Vejledning");
                ændretTekst.setText("Du trykkede på Vejledning");
                break;

            case R.id.indstillinger:

                System.out.println("Indstillinger");
                ændretTekst.setText("Du trykkede på Indstillinger");
                break;

            case R.id.next:

                startActivity(new Intent(HovedSkaerm.this, webview.class));
        }
    }
}
