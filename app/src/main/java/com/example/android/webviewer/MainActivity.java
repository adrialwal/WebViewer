package com.example.android.webviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonUcsd, buttonGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonUcsd = (Button) findViewById(R.id.buttonUcsd);
        buttonUcsd.setOnClickListener(this);

        buttonGoogle = (Button) findViewById(R.id.buttonGoogle);
        buttonGoogle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.buttonUcsd:
                Intent u;
                u = new Intent(this, UcsdActivity.class);
                startActivity(u);
                break;
            case R.id.buttonGoogle:
                Intent g;
                g = new Intent(this, GoogleActivity.class);
                startActivity(g);
                break;
        }
    }
}

