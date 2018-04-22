package com.example.o.cincocuisine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_p);


        final TextView t1 = (TextView)findViewById(R.id.text_username);
        final TextView t2 = (TextView)findViewById(R.id.text_name);
        final TextView t3 = (TextView)findViewById(R.id.text_birthday);
        final TextView t4 = (TextView)findViewById(R.id.text_interest);

        t1.setText(getIntent().getExtras().getString("username"));
        t2.setText(getIntent().getExtras().getString("name"));
        t3.setText(getIntent().getExtras().getString("birthday"));
        t4.setText(getIntent().getExtras().getString("interest"));
    }
}

