package com.example.o.cincocuisine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recipe1 extends AppCompatActivity {
     private Button mbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe1);

        mbutton1 = (Button) findViewById(R.id.btntimer1);

        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimer1();

            }
        });
    }

        public void openTimer1(){
            Intent intent = new Intent(this,Timer1.class);
            startActivity(intent);
    }
    }

