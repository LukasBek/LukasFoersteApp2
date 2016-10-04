package com.example.lukas.lukasfoersteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HovedSkaerm extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoved_skaerm);

        Button indstillinger = (Button) findViewById(R.id.indstillinger);
        indstillinger.setOnClickListener(this);

        Button vejledning = (Button) findViewById(R.id.vejledning);
        vejledning.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        TextView ændretTekst = (TextView) findViewById(R.id.tekstSomÆndrerSig);

        switch (v.getId()){
            case R.id.vejledning:

                ændretTekst.setText("Du trykkede på Vejledning");
                break;

            case R.id.indstillinger:

                ændretTekst.setText("Du trykkede på Indstillinger");
        }


    }
}
