package com.example.pla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

//깃허브 확인용 주석문222
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button carA1button = (Button)findViewById(R.id.carA1button);
        Button carA2button = (Button)findViewById(R.id.carA2button);
        Button carB1button = (Button)findViewById(R.id.carB1button);
        Button carB2button = (Button)findViewById(R.id.carB2button);
        Button carC1button = (Button)findViewById(R.id.carC1button);
        Button carC2button = (Button)findViewById(R.id.carC2button);
        Button carD1button = (Button)findViewById(R.id.carD1button);
        Button carD2button = (Button)findViewById(R.id.carD2button);
        Button locationSavebutton = (Button) findViewById(R.id.locationSavebutton);

        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);

        Intent intent = getIntent();
        String name2 = intent.getExtras().get("name").toString();
        editText.setText(name2);
        //final EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);




        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.carA1button: {
                        carA1button.setBackgroundColor(Color.GREEN);
                        carA2button.setBackgroundColor(Color.DKGRAY);
                        carB1button.setBackgroundColor(Color.DKGRAY);
                        carB2button.setBackgroundColor(Color.DKGRAY);
                        carC1button.setBackgroundColor(Color.DKGRAY);
                        carC2button.setBackgroundColor(Color.DKGRAY);
                        carD1button.setBackgroundColor(Color.DKGRAY);
                        carD2button.setBackgroundColor(Color.DKGRAY);
                        locationSavebutton.setBackgroundColor(Color.rgb(120, 202, 192));

                    }
                    break;
                    case R.id.carA2button: {
                        carA1button.setBackgroundColor(Color.DKGRAY);
                        carA2button.setBackgroundColor(Color.GREEN);
                        carB1button.setBackgroundColor(Color.DKGRAY);
                        carB2button.setBackgroundColor(Color.DKGRAY);
                        carC1button.setBackgroundColor(Color.DKGRAY);
                        carC2button.setBackgroundColor(Color.DKGRAY);
                        carD1button.setBackgroundColor(Color.DKGRAY);
                        carD2button.setBackgroundColor(Color.DKGRAY);
                        locationSavebutton.setBackgroundColor(Color.rgb(120, 202, 192));

                    }
                    break;
                    case R.id.carB1button: {
                        carA1button.setBackgroundColor(Color.DKGRAY);
                        carA2button.setBackgroundColor(Color.DKGRAY);
                        carB1button.setBackgroundColor(Color.GREEN);
                        carB2button.setBackgroundColor(Color.DKGRAY);
                        carC1button.setBackgroundColor(Color.DKGRAY);
                        carC2button.setBackgroundColor(Color.DKGRAY);
                        carD1button.setBackgroundColor(Color.DKGRAY);
                        carD2button.setBackgroundColor(Color.DKGRAY);
                        locationSavebutton.setBackgroundColor(Color.rgb(120, 202, 192));
                    }
                    break;
                    case R.id.carB2button: {
                        carA1button.setBackgroundColor(Color.DKGRAY);
                        carA2button.setBackgroundColor(Color.DKGRAY);
                        carB1button.setBackgroundColor(Color.DKGRAY);
                        carB2button.setBackgroundColor(Color.GREEN);
                        carC1button.setBackgroundColor(Color.DKGRAY);
                        carC2button.setBackgroundColor(Color.DKGRAY);
                        carD1button.setBackgroundColor(Color.DKGRAY);
                        carD2button.setBackgroundColor(Color.DKGRAY);
                        locationSavebutton.setBackgroundColor(Color.rgb(120, 202, 192));
                    }
                    break;
                    case R.id.carC1button: {
                        carA1button.setBackgroundColor(Color.DKGRAY);
                        carA2button.setBackgroundColor(Color.DKGRAY);
                        carB1button.setBackgroundColor(Color.DKGRAY);
                        carB2button.setBackgroundColor(Color.DKGRAY);
                        carC1button.setBackgroundColor(Color.GREEN);
                        carC2button.setBackgroundColor(Color.DKGRAY);
                        carD1button.setBackgroundColor(Color.DKGRAY);
                        carD2button.setBackgroundColor(Color.DKGRAY);
                        locationSavebutton.setBackgroundColor(Color.rgb(120, 202, 192));
                    }
                    break;
                    case R.id.carC2button: {
                        carA1button.setBackgroundColor(Color.DKGRAY);
                        carA2button.setBackgroundColor(Color.DKGRAY);
                        carB1button.setBackgroundColor(Color.DKGRAY);
                        carB2button.setBackgroundColor(Color.DKGRAY);
                        carC1button.setBackgroundColor(Color.DKGRAY);
                        carC2button.setBackgroundColor(Color.GREEN);
                        carD1button.setBackgroundColor(Color.DKGRAY);
                        carD2button.setBackgroundColor(Color.DKGRAY);
                        locationSavebutton.setBackgroundColor(Color.rgb(120, 202, 192));
                    }
                    break;
                    case R.id.carD1button: {
                        carA1button.setBackgroundColor(Color.DKGRAY);
                        carA2button.setBackgroundColor(Color.DKGRAY);
                        carB1button.setBackgroundColor(Color.DKGRAY);
                        carB2button.setBackgroundColor(Color.DKGRAY);
                        carC1button.setBackgroundColor(Color.DKGRAY);
                        carC2button.setBackgroundColor(Color.DKGRAY);
                        carD1button.setBackgroundColor(Color.GREEN);
                        carD2button.setBackgroundColor(Color.DKGRAY);
                        locationSavebutton.setBackgroundColor(Color.rgb(120, 202, 192));
                    }
                    break;
                    case R.id.carD2button: {
                        carA1button.setBackgroundColor(Color.DKGRAY);
                        carA2button.setBackgroundColor(Color.DKGRAY);
                        carB1button.setBackgroundColor(Color.DKGRAY);
                        carB2button.setBackgroundColor(Color.DKGRAY);
                        carC1button.setBackgroundColor(Color.DKGRAY);
                        carC2button.setBackgroundColor(Color.DKGRAY);
                        carD1button.setBackgroundColor(Color.DKGRAY);
                        carD2button.setBackgroundColor(Color.GREEN);
                        locationSavebutton.setBackgroundColor(Color.rgb(120, 202, 192));
                    }
                    break;
                    case R.id.locationSavebutton:{
                        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                        startActivity(intent);
                    }break;
                }
            }
      };

        locationSavebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                //intent.putExtra("name2", editText.getText());
                startActivity(intent);
            }
        });

        carA1button.setOnClickListener(listener);
        carA2button.setOnClickListener(listener);
        carB1button.setOnClickListener(listener);
        carB2button.setOnClickListener(listener);
        carC1button.setOnClickListener(listener);
        carC2button.setOnClickListener(listener);
        carD1button.setOnClickListener(listener);
        carD2button.setOnClickListener(listener);
        locationSavebutton.setOnClickListener(listener);


    }
}
