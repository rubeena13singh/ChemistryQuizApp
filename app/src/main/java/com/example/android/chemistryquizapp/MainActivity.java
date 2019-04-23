package com.example.android.chemistryquizapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import static android.R.attr.text;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score=0;
    int wrong=0;
    String answer1="CO2";
    int answer2=R.id.ans2d;
    String answer4="Pb";
    int answer5=R.id.ans5a;

    public void submitAnswer(View view)
    {
        EditText text1 = (EditText) findViewById(R.id.ans1);
        boolean ans1submitted=text1.getText().toString().equalsIgnoreCase(answer1);
        if(ans1submitted)
        {
            score++;
        }
        else
        {
            wrong++;
        }

        RadioGroup ans2submitted = (RadioGroup) findViewById(R.id.ans2);
        if( ans2submitted.getCheckedRadioButtonId()== answer2)
        {
            score++;
        }
        else
        {
            wrong++;
        }

        CheckBox a1 = (CheckBox) findViewById(R.id.ans3a);
        CheckBox b1 = (CheckBox) findViewById(R.id.ans3b);
        CheckBox c1 = (CheckBox) findViewById(R.id.ans3c);
        CheckBox d1 = (CheckBox) findViewById(R.id.ans3d);
        if(a1.isChecked() && b1.isChecked() && !c1.isChecked() && !d1.isChecked())
        {
            score++;
        }
        else
        {
            wrong++;
        }

        EditText text2 = (EditText) findViewById(R.id.ans4);
        boolean ans4submitted=text2.getText().toString().equalsIgnoreCase(answer4);
        if(ans4submitted)
        {
            score++;
        }
        else
        {
            wrong++;
        }

        RadioGroup ans5submitted = (RadioGroup) findViewById(R.id.ans5);
        if( ans5submitted.getCheckedRadioButtonId()== answer5)
        {
            score++;
        }
        else
        {
            wrong++;
        }

        CheckBox a2 = (CheckBox) findViewById(R.id.ans6a);
        CheckBox b2 = (CheckBox) findViewById(R.id.ans6b);
        CheckBox c2 = (CheckBox) findViewById(R.id.ans6c);
        CheckBox d2 = (CheckBox) findViewById(R.id.ans6d);
        if(a2.isChecked() && b2.isChecked() && !c2.isChecked() && !d2.isChecked())
        {
            score++;
        }
        else
        {
            wrong++;
        }

        display1(score);
        display2(wrong);
        Toast.makeText(this, "Correct: " + score + "\nWrong: " + wrong, Toast.LENGTH_LONG).show();
        score=0;
        wrong=0;
    }

    public void display1(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreNum);
        quantityTextView.setText("" + number);
    }

    public void display2(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.wrongNum);
        quantityTextView.setText("" + number);
    }
}