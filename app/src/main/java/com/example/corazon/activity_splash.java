package com.example.corazon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class activity_splash extends AppCompatActivity {
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = findViewById(R.id.progressBar);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(activity_splash.this, activity_home.class));
            progressBar.setVisibility(View.VISIBLE);
            finish();
        }, 2000);
        progressBar.setVisibility(View.GONE);
    }
}