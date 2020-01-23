package com.example.kaasidstudymaterials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import maes.tech.intentanim.CustomIntent;

public class MainActivity extends AppCompatActivity {

    ListView listView;
  public   int images[]={R.drawable.notes,R.drawable.questions,R.drawable.notes2,R.drawable.formula,R.drawable.ncert};
   public String names[]={"KOTA notes","PAST papers","KOTA short notes","FORMULA sheet","NCERT SOLUTIONS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.mainlist);
        customadapter customadapter=new customadapter();
        listView.setAdapter(customadapter);
        listView.setCacheColorHint(Color.TRANSPARENT);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent in=new Intent(MainActivity.this,submenu.class);
                        in.putExtra("pos",position);
                        startActivity(in);
            }
        });

    }
    class customadapter extends BaseAdapter
    {


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.customimage);
            TextView textView=(TextView)view.findViewById(R.id.customtext);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);
            Animation animation= AnimationUtils.loadAnimation(view.getContext(),R.anim.scrollfadeout);
            view.setAnimation(animation);
            return view;
        }


}

}
