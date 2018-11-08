package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //global pointA value
    int pointA=0;
    int pointB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }
    public void plus1A(View view) {
        //PLUS1A = FREE THROW
        //get current value from ID
        pointA+=1;
        displayA(pointA);//WHY DISPLAY (int Number) ?
}
    public void plus2A(View view) {
        //get current value from ID\
        pointA+=2;
        displayA(pointA);//WHY DISPLAY (int Number) ?
    }
    public void plus3A(View view) {
        //get current value from ID
        pointA+=3;

        displayA(pointA);//WHY DISPLAY (int Number) ?
    }
    public void plus1B(View view) {
        //get current value from ID\
        pointB+=1;
        displayB(pointB);//WHY DISPLAY (int Number) ?
    }
    public void plus2B(View view) {
        //get current value from ID\
        pointB+=2;
        displayB(pointB);//WHY DISPLAY (int Number) ?
    }
    public void plus3B(View view) {
        //get current value from ID
        pointB+=3;

        displayB(pointB);//WHY DISPLAY (int Number) ?
    }
    public void RESET(View view) {
        //get current value from ID
        pointB=0;//NEED DEBUG
        pointA=0;
        displayB(pointB);//WHY DISPLAY (int Number) ?
        displayA(pointA);
    }
    private void displayA(int point) {
        //SET VALUE POINTS
        TextView quantityTextView = (TextView) findViewById(R.id.textView2); //decide where to display* R.id.@id
        quantityTextView.setText(""+point); //convert number to String
    }
    private void displayB(int point) {
        //SET VALUE POINTS
        TextView quantityTextView = (TextView) findViewById(R.id.textView211); //decide where to display* R.id.@id
        quantityTextView.setText(""+point); //convert number to String
    }

    }