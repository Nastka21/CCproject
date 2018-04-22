package com.example.o.cincocuisine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recipe2 extends AppCompatActivity {
    private Button mbutton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe2);
        mbutton2 = (Button) findViewById(R.id.btntimer2);

        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimer2();

            }
        });
    }

    public void openTimer2(){
        Intent intent = new Intent(this,Timer2.class);
        startActivity(intent);
    }
}

