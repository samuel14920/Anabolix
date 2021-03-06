package com.android.gang.anabolix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mKevinButton;
    private Button mSamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mKevinButton = findViewById(R.id.kevin_button);
        mKevinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello, this is Kevin!", Toast.LENGTH_SHORT).show();
            }
        });


        mSamButton = findViewById(R.id.sam_button);
        mSamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hi, I'm Sam!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
