package com.example.pla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


//사용자 이름 editText id : username
//차 넘버 editText id : carnum
//등록버튼 button id : enterinform


public class MainActivity extends AppCompatActivity {
    //user id 만들기 위한 코드
    //string과 int를 더하면 string이 되기 때문에 db에 넣을 수 있음
    public static Integer ID = 001;

    //파이어베이스 객체 생성 해결 완료
    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference database = firebaseDatabase.getReference();

    EditText EditText_username, EditText_carnum;
    //Button Button_enterinformbutton;
    //saveButton을 대신한 코드 같음
    String enterusername, entercarnum, userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button Button_user_input = (Button) findViewById(R.id.user_input);

        EditText_username = findViewById(R.id.eneterusername);
        EditText_carnum = findViewById(R.id.enetercarnum);
        Button saveButton = (Button) findViewById(R.id.saveButton);
        final EditText editText = (EditText) findViewById(R.id.eneterusername);

        saveButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                enterusername = EditText_username.getText().toString();
                entercarnum = EditText_carnum.getText().toString();
                //writeNewUser();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                //intent.putExtra("name", editText.getText());
                intent.putExtra("username", enterusername);
                intent.putExtra("carnum", entercarnum);

                startActivity(intent);
            }
        });
    }

//    public void writeNewUser(){
//        UserInfo userInfo = new UserInfo();
//        userInfosetUsername(enterusername);
//        userInfo.setCarnum(entercarnum);
//        //Integer userId = ID ;
//
//        //database.child("users").child(String.valueOf(userId)).setValue(userInfo);
//        userid = database.child("users").push().getKey();
//        database.child("users").child(userid).setValue(userInfo);
//        //ID++;
//
//    }




    //화면 터치 시 자판 내려가기
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus();
        if (view != null && (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass().getName().startsWith("android.webkit.")) {
            int scrcoords[] = new int[2];
            view.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + view.getLeft() - scrcoords[0];
            float y = ev.getRawY() + view.getTop() - scrcoords[1];
            if (x < view.getLeft() || x > view.getRight() || y < view.getTop() || y > view.getBottom())
                ((InputMethodManager)this.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow((this.getWindow().getDecorView().getApplicationWindowToken()), 0);
        }
        return super.dispatchTouchEvent(ev);
    }
 }


