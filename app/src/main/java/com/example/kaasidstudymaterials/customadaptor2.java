package com.example.kaasidstudymaterials;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class customadaptor2 extends ArrayAdapter {
    Activity context;
    String[] names;
    int[] images;
    public customadaptor2(@NonNull Activity context, String[] sub, int[] images) {
        super(context, R.layout.activity_submenu,sub);
        this.context= context;
        this.names=sub;
        this.images=images;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        View view=inflater.inflate(R.layout.customlayout,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.customimage);
        TextView textView=(TextView)view.findViewById(R.id.customtext);
        imageView.setImageResource(images[position]);
        textView.setText(names[position]);
        Animation animation= AnimationUtils.loadAnimation(view.getContext(),R.anim.scrollfadeout);
        view.setAnimation(animation);
        return view;
    }
}
