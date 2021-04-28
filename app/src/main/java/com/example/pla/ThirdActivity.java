package com.example.pla;

import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button carA1button = (Button)findViewById(R.id.carA1button);
        Button carA2button = (Button)findViewById(R.id.carA2button);
        Button carB1button = (Button)findViewById(R.id.carB1button);
        Button carB2button = (Button)findViewById(R.id.carB2button);
        Button carC1button = (Button)findViewById(R.id.carC1button);
        Button carC2button = (Button)findViewById(R.id.carC2button);
        Button carD1button = (Button)findViewById(R.id.carD1button);
        Button carD2button = (Button)findViewById(R.id.carD2button);

        Button close_button = (Button)findViewById(R.id.close_button);
        Button activeAlarm = (Button)findViewById(R.id.activeAlarm);
        TextView textView = (TextView) findViewById(R.id.editTextTextPersonName);

        Intent intent = getIntent();
//        String name3 = intent.getExtras().get("name2").toString();
//        textView.setText(name3);

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.carA1button:
                    {
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                    }break;
                    case R.id.carA2button:
                    {
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                    }break;
                    case R.id.carB1button:{
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                    }break;
                    case R.id.carB2button:{
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                    }break;
                    case R.id.carC1button:{
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                    }break;
                    case R.id.carC2button:{
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                    }break;
                    case R.id.carD1button:{
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                    }break;
                    case R.id.carD2button:{
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(),"선택할 수 없는 자리입니다", Toast.LENGTH_LONG).show();
                    }break;
                    case R.id.activeAlarm:{
                        Toast.makeText(getApplicationContext(),"주차 자리가 생기면 알림이 울립니다", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(),"주차 자리가 생기면 알림이 울립니다", Toast.LENGTH_LONG).show();
                    }break;
                    case R.id.close_button:{
                        finish();
                    }break;
                }
            }
        };

        carA1button.setOnClickListener(listener);
        carA2button.setOnClickListener(listener);
        carB1button.setOnClickListener(listener);
        carB2button.setOnClickListener(listener);
        carC1button.setOnClickListener(listener);
        carC2button.setOnClickListener(listener);
        carD1button.setOnClickListener(listener);
        carD2button.setOnClickListener(listener);
        activeAlarm.setOnClickListener(listener);
        close_button.setOnClickListener(listener);

    }

//    public void onButtonClicked(View view){
//        Toast.makeText(getApplicationContext(),"주차 자리가 생기면 알림이 작동", Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(),"주차 자리가 생기면 알림이 작동", Toast.LENGTH_LONG).show();
//    }

}