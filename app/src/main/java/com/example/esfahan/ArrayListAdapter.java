package com.example.esfahan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayListAdapter extends ArrayAdapter<Integer> {

    private final Activity context;
    private final Integer[] image;

    public ArrayListAdapter(Activity context , Integer[] image) {
        super(context, R.layout.item_handicraft , image);

        this.context = context;
        this.image = image;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_handicraft, null, true);
        ImageView imageView = rowView.findViewById(R.id.ivHandicraft);
        imageView.setImageResource(image[position]);
        return rowView;

    }
}