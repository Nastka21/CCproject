package com.example.o.cincocuisine;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Recipes extends AppCompatActivity implements View.OnClickListener {
    private CardView recipe1,recipe2,recipe3,recipe4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        recipe1 = (CardView)findViewById(R.id.recipe1);
        recipe2 = (CardView)findViewById(R.id.recipe2);
        recipe3 = (CardView) findViewById(R.id.recipe3);
        recipe4 = (CardView)findViewById(R.id.recipe4);

        recipe1.setOnClickListener(this);
        recipe2.setOnClickListener(this);
        recipe3.setOnClickListener(this);
        recipe4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()) {
            case R.id.recipe1 : i = new Intent(this,Recipe1.class); startActivity(i); break ;
            case R.id.recipe2 : i =  new Intent(this,Recipe2.class);  startActivity(i); break ;
            case R.id.recipe3 : i =  new Intent(this,Recipe3.class); startActivity(i); break ;
            case R.id.recipe4 : i = new Intent(this,Recipe4.class); startActivity(i);break ;
            default:break;
        }

    }
}
