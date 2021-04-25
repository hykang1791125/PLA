package com.example.pla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    Button carB1button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    //임시 주인공 버튼 : carB1button
        Button carB1button = (Button)findViewById(R.id.carB1button);

        Button carA1button = (Button)findViewById(R.id.carA1button);
        //Button carB1button = (Button)findViewById(R.id.carB1button);
        Button carC1button = (Button)findViewById(R.id.carC1button);
        Button carD1button = (Button)findViewById(R.id.carD1button);
        Button carA2button = (Button)findViewById(R.id.carA2button);
        Button carB2button = (Button)findViewById(R.id.carB2button);
        Button carC2button = (Button)findViewById(R.id.carC2button);
        Button carD2button = (Button)findViewById(R.id.carD2button);

        TextView textView = (TextView) findViewById(R.id.editTextTextPersonName);
        Intent intent = getIntent();
        String name = intent.getExtras().get("name").toString();
        textView.setText(name);


//        carB1button.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN)
//                    carB1button.setBackgroundColor(Color.TRANSPARENT);
//                else if (motionEvent.getAction() == MotionEvent.ACTION_UP)
//                    carB1button.setBackgroundColor(Color.LTGRAY);
//                return false;
//
//            }//버튼 누르면 투명, 때면 원상복구
//        });

        carB1button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN)
                    carB1button.setBackgroundColor(Color.BLUE);
                return false;
            }
        });
    }
}
