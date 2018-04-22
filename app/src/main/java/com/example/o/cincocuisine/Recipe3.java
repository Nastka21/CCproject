package com.example.o.cincocuisine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recipe3 extends AppCompatActivity {

    private Button mbutton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe3);
        mbutton3 = (Button) findViewById(R.id.btntimer3);

        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimer3();

            }
        });
    }

    public void openTimer3(){
        Intent intent = new Intent(this,Timer3.class);
        startActivity(intent);
    }
}

