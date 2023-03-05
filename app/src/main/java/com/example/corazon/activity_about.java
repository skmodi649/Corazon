package com.example.corazon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class activity_about extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("cardio_guide.pdf").autoSpacing(true).load();

    }
}