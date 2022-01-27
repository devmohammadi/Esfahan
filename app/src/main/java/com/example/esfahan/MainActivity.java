package com.example.esfahan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    View menu;
    CardView place, history, handicrafts, historicalMonuments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = findViewById(R.id.menu);
        place = findViewById(R.id.cvPlace);
        history = findViewById(R.id.cvHistory);
        handicrafts = findViewById(R.id.cvHandicrafts);
        historicalMonuments = findViewById(R.id.cvHistoricalMonuments);

        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlaceActivity.class));
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HistoryActivity.class));
            }
        });

        handicrafts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HandicraftsActivity.class));
            }
        });

        historicalMonuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HistoricalMonumentsActivity.class));
            }
        });
    }

    public void showMenu(View v) {
        PopupMenu popup = new PopupMenu(MainActivity.this, menu);
        popup.getMenuInflater().inflate(R.menu.menu, popup.getMenu());

        popup.setOnMenuItemClickListener(item -> {
            switch (item.getItemId()) {
                case R.id.about:
                    startActivity(new Intent(MainActivity.this, AboutActivity.class));
                    return true;
                case R.id.mayor:
                    startActivity(new Intent(MainActivity.this, MayorActivity.class));
                    return true;
                case R.id.close:
                    MainActivity.this.finish();
                    System.exit(0);
                    return true;
                default:
                    return false;
            }
        });

        popup.show();
    }

}