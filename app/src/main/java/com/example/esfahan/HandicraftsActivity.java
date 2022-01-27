package com.example.esfahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class HandicraftsActivity extends AppCompatActivity {

    View back;
    ListView list;

    Integer[] image = {
            R.drawable.handicrafts1,
            R.drawable.handicrafts2,
            R.drawable.handicrafts3,
            R.drawable.handicrafts4,
            R.drawable.handicrafts5,
            R.drawable.handicrafts6,
            R.drawable.handicrafts7,
            R.drawable.handicrafts8,
            R.drawable.handicrafts9,
            R.drawable.handicrafts10,
            R.drawable.handicrafts11,
            R.drawable.handicrafts12,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handicrafts);

        back = findViewById(R.id.back);
        list = findViewById(R.id.list);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ArrayListAdapter adapter = new ArrayListAdapter(this , image);
        list.setAdapter(adapter);

    }
}