package com.example.o.cincocuisine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private FirebaseAuth firebaseAuth;
    private Button logout;
    private CardView recipesCard,timersCard, dietCard,reviewsCard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        firebaseAuth = FirebaseAuth.getInstance();
        logout = (Button)findViewById(R.id.btnLogout);
        //define cards
        recipesCard=(CardView) findViewById(R.id.recipe_card);
        timersCard=(CardView) findViewById(R.id.timers_card);
        dietCard=(CardView) findViewById(R.id.diet_card);
        reviewsCard=(CardView)findViewById(R.id.reviews_card);
        //add click listener

        recipesCard.setOnClickListener(this);
        timersCard.setOnClickListener(this);
        dietCard.setOnClickListener(this);
        reviewsCard.setOnClickListener(this);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logout();

            }
        });


    }
    private void Logout() {
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SecondActivity.this,MainActivity.class));


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.logoutMenu:{
                Logout();

            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {

            case R.id.recipe_card: i=new Intent(this,Recipes.class); startActivity(i); break;
            case R.id.timers_card: i=new Intent(this,Timers.class);startActivity(i); break;
            case R.id.diet_card: i=new Intent(this,Diet.class); startActivity(i);break;
            case R.id.reviews_card: i=new Intent(this,Reviews.class); startActivity(i);break;
            default:break;
        }

    }
}
