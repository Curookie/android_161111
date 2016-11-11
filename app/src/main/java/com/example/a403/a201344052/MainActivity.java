package com.example.a403.a201344052;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1;
    Button b1;
    Button b2;

    CheckBox cb1;
    CheckBox cb2;

    RadioButton rb1;
    RadioButton rb2;

    RatingBar ratb1;

    CalendarView calv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButton();
        setTextView();

        cb1 = (CheckBox)findViewById(R.id.checkBox);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "";
                if(cb1.isChecked()) str+=cb1.getText()+" ";
                if(cb2.isChecked()) str+=cb2.getText()+" ";
                if(str.equals("")) Toast.makeText(getApplicationContext(),"아무 것도 선택 되지 않았습니다.",Toast.LENGTH_SHORT).show();
                else Toast.makeText(getApplicationContext(),str+"가 선택 되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "";
                if(cb1.isChecked()) str+=cb1.getText()+" ";
                if(cb2.isChecked()) str+=cb2.getText()+" ";
                if(str.equals("")) Toast.makeText(getApplicationContext(),"아무 것도 선택 되지 않았습니다.",Toast.LENGTH_SHORT).show();
                else Toast.makeText(getApplicationContext(),str+"가 선택 되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()) Toast.makeText(getApplicationContext(),rb1.getText()+"가 선택 되었습니다.",Toast.LENGTH_SHORT).show();
                else Toast.makeText(getApplicationContext(),rb2.getText()+"가 선택 되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()) Toast.makeText(getApplicationContext(),rb1.getText()+"가 선택 되었습니다.",Toast.LENGTH_SHORT).show();
                else Toast.makeText(getApplicationContext(),rb2.getText()+"가 선택 되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        ratb1 = (RatingBar) findViewById(R.id.ratingBar);
        ratb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(),ratb1.getRating()+"점을 주셨습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        calv1 = (CalendarView)findViewById(R.id.calendarView);
        calv1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(),Integer.toString(year)+"년 "+Integer.toString(month)+"월 "+Integer.toString(dayOfMonth)+"일을 선택하셨습니다.",Toast.LENGTH_LONG).show();
            }
        });
    }


    void setButton(){
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"안녕하세요",Toast.LENGTH_SHORT).show();
            }
        });
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);

    }

    void setTextView(){
        tv1 = (TextView) findViewById(R.id.textview1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hello World!!",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button2)
            Toast.makeText(getApplicationContext(),"My Name is Curookie",Toast.LENGTH_LONG).show();
    }
}
