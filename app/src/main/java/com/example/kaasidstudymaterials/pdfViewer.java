package com.example.kaasidstudymaterials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.ScrollBar;

public class pdfViewer extends AppCompatActivity {

    PDFView pdfView;
    String pdfname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        pdfView=(PDFView)findViewById(R.id.pdfview);
        pdfname=getIntent().getStringExtra("pdfname");
        switch (pdfname)
        {
            case "three" :
            {
                pdfView.fromAsset("dinesh.pdf").load();
                break;
            }
            case "maths1" :
            {
                pdfView.fromAsset("unit1notes.pdf").load();
                break;
            }
        }

    }
}
