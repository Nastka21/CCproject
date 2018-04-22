package com.example.o.cincocuisine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recipe4 extends AppCompatActivity {
    private Button mbutton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe4);

        mbutton4 = (Button) findViewById(R.id.btntimer4);

        mbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimer4();

            }
        });
    }

    public void openTimer4(){
        Intent intent = new Intent(this,Timer4.class);
        startActivity(intent);
    }
}

