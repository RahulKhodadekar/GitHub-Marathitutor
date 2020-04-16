package com.example.login;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class after_login extends AppCompatActivity {

    CardView svarCardView, व्यंजनCardView,बाराखड़ीCardView;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_login);

        svarCardView = findViewById(R.id.card_one);
        व्यंजनCardView = findViewById(R.id.card_three);
        बाराखड़ीCardView = findViewById(R.id.card_five);

        databaseHelper = new DatabaseHelper(getApplicationContext());



        svarCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(after_login.this, svar.class));

            }
        });

        व्यंजनCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(after_login.this, vyanjan.class));

            }
        });

        बाराखड़ीCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(after_login.this, barakhadi.class));

            }
        });



    }

}
