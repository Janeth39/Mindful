package com.example.mindful_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeScrn extends AppCompatActivity {
    private Button anxietyBtn;
    private Button panicBtn;
    public static boolean p = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_scrn);

        anxietyBtn = (Button) findViewById(R.id.anxietyAttack);
        anxietyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityA();
            }
        });

        panicBtn = (Button) findViewById(R.id.panicAttack);
        panicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                p = true;
                openActivityP();
            }
        });
    }

    public void openActivityA()
    {
        Intent intent = new Intent(this, Breathing.class);
        startActivity(intent);
    }
    public void openActivityP()
    {
        Intent intent = new Intent(this, Breathing.class);
        startActivity(intent);
    }
}