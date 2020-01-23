package com.example.kaasidstudymaterials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class submenu extends AppCompatActivity {

    ListView submenu;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu);
        submenu=(ListView)findViewById(R.id.submenu);
        String[][] sub={{"maths","chemistry","biology","physics"},{"jee advanced","jee main","neet"},{"maths","chemistry","biology","physics"},{"chemistry","maths","physics"},{"chemistry","maths","physics"}};
        int [][] images={{R.drawable.maths,R.drawable.chemistry,R.drawable.biology,R.drawable.physics},{R.drawable.jeeadvanced,R.drawable.jeemain,R.drawable.neet},{R.drawable.maths,R.drawable.chemistry,R.drawable.biology,R.drawable.physics},{R.drawable.chemistry,R.drawable.maths,R.drawable.physics},{R.drawable.chemistry,R.drawable.maths,R.drawable.physics}};
        Intent in=getIntent();
        pos=in.getIntExtra("pos",0);
        customadaptor2 customadapter=new customadaptor2(this,sub[pos],images[pos]);
        submenu.setAdapter(customadapter);
        submenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent in=new Intent(submenu.this,pdflistview.class);
                in.putExtra("mainpos",pos);
                in.putExtra("pos",position);
                startActivity(in);
            }
        });

    }
}
