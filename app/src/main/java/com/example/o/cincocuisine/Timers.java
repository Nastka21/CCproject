package com.example.o.cincocuisine;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Timers extends AppCompatActivity implements View.OnClickListener {
    private CardView timer1, timer2, timer3, timer4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timers);

        timer1 = (CardView)findViewById(R.id.timer1);
        timer2 = (CardView)findViewById(R.id.timer2);
        timer3 = (CardView)findViewById(R.id.timer3);
        timer4 = (CardView)findViewById(R.id.timer4);

        timer1.setOnClickListener(this);
        timer2.setOnClickListener(this);
        timer3.setOnClickListener(this);
        timer4.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch(view.getId()){
        case R.id.timer1 : i = new Intent(this,Timer1.class); startActivity(i); break ;
        case R.id.timer2 : i =  new Intent(this,Timer2.class);  startActivity(i); break ;
        case R.id.timer3 : i =  new Intent(this,Timer3.class); startActivity(i); break ;
        case R.id.timer4 : i = new Intent(this,Timer4.class); startActivity(i);break ;
        default:break;
    }

}
}


