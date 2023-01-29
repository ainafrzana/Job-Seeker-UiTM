package com.ict602.jobapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView linktextView;

    Button openActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openActivity = (Button) findViewById(R.id.button);

        linktextView = findViewById(R.id.linkhyper);
        linktextView.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void openActivity2(View view){
        Intent intent = new Intent (this, MainPage.class);
        startActivity(intent);
    }
}