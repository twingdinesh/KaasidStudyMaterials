package com.example.kaasidstudymaterials;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class pdflistview extends AppCompatActivity {
    ListView pdflistview;
    int pos,mainpos;
    ArrayList<ArrayList<String>> pdfnames=new ArrayList<>();
    ArrayList<String> pdf=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdflistview);
        pdflistview=(ListView)findViewById(R.id.pdflistview);
        mainpos=getIntent().getIntExtra("mainpos",0);
        pos=getIntent().getIntExtra("pos",0);
        switch (mainpos) {
            case 0 : {
                switch (pos) {
                    case 0: {
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 1: {
                        pdf.add("eng1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 2: {
                        pdf.add("two");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 3: {
                        pdf.add("three");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                }
                break;
            }
            case 1 : {
                switch (pos) {
                    case 0: {
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 1: {
                        pdf.add("eng1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 2: {
                        pdf.add("two");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                }
                break;
            }
            case 2 : {
                switch (pos) {
                    case 0: {
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 1: {
                        pdf.add("eng1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 2: {
                        pdf.add("two");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 3: {
                        pdf.add("three");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                }
                break;
            }
            case 3 : {
                switch (pos) {
                    case 0: {
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 1: {
                        pdf.add("eng1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 2: {
                        pdf.add("two");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                }
                break;
            }
            case 4 : {
                switch (pos) {
                    case 0: {
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 1: {
                        pdf.add("eng1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 2: {
                        pdf.add("two");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                    case 3: {
                        pdf.add("three");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        pdf.add("maths1");
                        break;
                    }
                }
                break;
            }
        }
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,pdf);
        pdflistview.setAdapter(adapter);
        pdflistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent in=new Intent(getApplicationContext(),pdfViewer.class);
                in.putExtra("pdfname",pdf.get(position));
                startActivity(in);
            }
        });

    }
}
