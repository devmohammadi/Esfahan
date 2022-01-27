package com.example.esfahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MayorActivity extends AppCompatActivity {

    MaterialButton btnSend;
    EditText message;
    View back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayor);

        btnSend = findViewById(R.id.btnSend);
        message = findViewById(R.id.etMessage);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messageText = message.getText().toString();

                if (TextUtils.isEmpty(messageText)) {
                    Toast.makeText(MayorActivity.this, "لطفا متنی را وارد کنید!!", Toast.LENGTH_LONG).show();
                } else {
                    message.setText("");
                    Toast.makeText(MayorActivity.this, "پیغام شما برای شهردار ارسال شد ، با تشکر از پیشنهاد شما", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}