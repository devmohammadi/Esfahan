package com.example.esfahan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final String[] des;
    private final Integer[] image;

    public ListAdapter(Activity context, String[] name, String[] des, Integer[] image) {
        super(context, R.layout.item_historical_monuments, name);

        this.context = context;
        this.name = name;
        this.des = des;
        this.image = image;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_historical_monuments, null, true);

        TextView nameText = rowView.findViewById(R.id.tvNameHistoricalMonuments);
        ImageView imageView = rowView.findViewById(R.id.ivHistoricalMonuments);
        TextView desText = rowView.findViewById(R.id.tvDesHistoricalMonuments);

        nameText.setText(name[position]);
        imageView.setImageResource(image[position]);
        desText.setText(des[position]);

        return rowView;

    }

    ;
}