package com.example.esfahan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PlaceActivity extends AppCompatActivity {

    View back;
    ListView list;

    String[] name = {
            "عالی قاپو", "میدان نقش جهان", "مسجد شیخ لطف الله", "عمارت هشت بهشت"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        back = findViewById(R.id.back);
        list = findViewById(R.id.list);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, name);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PlaceActivity.this, VideoViewActivity.class);
                intent.putExtra("video", position);
                startActivity(intent);
            }
        });


    }
}

