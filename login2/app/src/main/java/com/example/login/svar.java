package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.media.AudioAttributes.USAGE_ASSISTANCE_SONIFICATION;

public class svar extends AppCompatActivity {
    private SoundPool soundPool;
    private int अ,आ,इ,ई,उ,ऊ,ए,ऐ,ओ,औ,अं,अः;
    Button button1, button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.svar);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11= findViewById(R.id.button11);
        button12= findViewById(R.id.button12);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button अ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(अ,1,1,0,0,1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button आ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(आ,1,1,0,0,1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button इ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(इ,1,1,0,0,1);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ई Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ई,1,1,0,0,1);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button उ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(उ,1,1,0,0,1);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ऊ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ऊ,1,1,0,0,1);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ए Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ए,1,1,0,0,1);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ऐ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ऐ,1,1,0,0,1);
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ओ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ओ,1,1,0,0,1);
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button औ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(औ,1,1,0,0,1);
            }
        });


        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button अं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(अं,1,1,0,0,1);
            }
        });


        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button अः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(अः,1,1,0,0,1);
            }
        });



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(2)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        }

        अ = soundPool.load(this,R.raw.sound1,1);
        आ = soundPool.load(this,R.raw.sound2,1);
        इ = soundPool.load(this,R.raw.sound3,1);
        ई = soundPool.load(this,R.raw.sound4,1);
        उ = soundPool.load(this,R.raw.sound5,1);
        ऊ= soundPool.load(this,R.raw.sound6,1);
        ए = soundPool.load(this,R.raw.sound7,1);
        ऐ = soundPool.load(this,R.raw.sound8,1);
        ओ = soundPool.load(this,R.raw.sound9,1);
        औ = soundPool.load(this,R.raw.sound10,1);
        अं = soundPool.load(this,R.raw.sound11,1);
        अः = soundPool.load(this,R.raw.sound12,1);


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

    public void playsound(View view) {
    }
}


