package com.toptenquiz.android.top10quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    /**
     *  Method to calculate final score of the quiz competition.
     */

    public void submitAnswers(View view) {

        TextView textView = findViewById(R.id.scoreDisplay);

        int scoreAnswerOne, scoreAnswerTwo, scoreAnswerThree, scoreAnswerFour, scoreAnswerFive, scoreAnswerSix,
                scoreAnswerSeven, scoreAnswerEight, scoreAnswerNine, scoreAnswerTen, finalScore;

        CharSequence result;

        RadioButton questionOneAnswerOne = findViewById(R.id.one_second);

        if(questionOneAnswerOne.isChecked()) {
            scoreAnswerOne = 1;
        } else {
            scoreAnswerOne = 0;
        }

        RadioButton questionTwoAnswer = findViewById(R.id.two_third);

        if(questionTwoAnswer.isChecked()) {
            scoreAnswerTwo = 1;
        } else {
            scoreAnswerTwo = 0;
        }

        RadioButton questionThreeAnswer = findViewById(R.id.three_first);

        if(questionThreeAnswer.isChecked()) {
            scoreAnswerThree = 1;
        } else {
            scoreAnswerThree = 0;
        }

        RadioButton questionFourAnswer = findViewById(R.id.four_third);

        if(questionFourAnswer.isChecked()) {
            scoreAnswerFour = 1;
        } else {
            scoreAnswerFour = 0;
        }

        CheckBox questionFiveAnswerOne = findViewById(R.id.five_first);
        CheckBox questionFiveAnswerTwo = findViewById(R.id.five_second);
        CheckBox questionFiveAnswerThree = findViewById(R.id.five_third);
        CheckBox questionFiveAnswerFour = findViewById(R.id.five_fourth);

        if(questionFiveAnswerOne.isChecked() && questionFiveAnswerTwo.isChecked() &&
                !questionFiveAnswerThree.isChecked() && questionFiveAnswerFour.isChecked()) {
            scoreAnswerFive = 1;
        } else {
            scoreAnswerFive = 0;
        }

        CheckBox questionSixAnswerOne = findViewById(R.id.six_first);
        CheckBox questionSixAnswerTwo = findViewById(R.id.six_second);
        CheckBox questionSixAnswerThree = findViewById(R.id.six_third);
        CheckBox questionSixAnswerFour = findViewById(R.id.six_fourth);

        if(questionSixAnswerOne.isChecked() && questionSixAnswerTwo.isChecked() &&
                !questionSixAnswerThree.isChecked() && questionSixAnswerFour.isChecked()) {
            scoreAnswerSix = 1;
        } else {
            scoreAnswerSix = 0;
        }

        CheckBox questionSevenAnswerOne = findViewById(R.id.seven_first);
        CheckBox questionSevenAnswerTwo = findViewById(R.id.seven_second);
        CheckBox questionSevenAnswerThree = findViewById(R.id.seven_third);
        CheckBox questionSevenAnswerFour = findViewById(R.id.seven_fourth);

        if(!questionSevenAnswerOne.isChecked() && questionSevenAnswerTwo.isChecked() &&
                !questionSevenAnswerThree.isChecked() && !questionSevenAnswerFour.isChecked()) {
            scoreAnswerSeven = 1;
        } else {
            scoreAnswerSeven = 0;
        }

        CheckBox questionEightAnswerOne = findViewById(R.id.eight_first);
        CheckBox questionEightAnswerTwo = findViewById(R.id.eight_second);
        CheckBox questionEightAnswerThree = findViewById(R.id.eight_third);
        CheckBox questionEightAnswerFour = findViewById(R.id.eight_fourth);

        if(questionEightAnswerOne.isChecked() && questionEightAnswerTwo.isChecked() &&
                questionEightAnswerThree.isChecked() && questionEightAnswerFour.isChecked()) {
            scoreAnswerEight = 1;
        } else {
            scoreAnswerEight = 0;
        }

        EditText questionNineAnswer = findViewById(R.id.nine);

        if (questionNineAnswer.getText().toString().toLowerCase().equals("10230")) {
            scoreAnswerNine = 1;
        } else {
            scoreAnswerNine = 0;
        }

        EditText questionTenAnswer = findViewById(R.id.ten);

        if (questionTenAnswer.getText().toString().toLowerCase().equals("comment executed")) {
            scoreAnswerTen = 1;
        } else {
            scoreAnswerTen = 0;
        }

        finalScore = scoreAnswerOne + scoreAnswerTwo + scoreAnswerThree + scoreAnswerFour +
                scoreAnswerFive + scoreAnswerSix  + scoreAnswerSeven + scoreAnswerEight +
                    scoreAnswerNine + scoreAnswerTen;

        if(finalScore == 10) {
            result = "Well done! You are genius";
        } else {
            result = "Hard Luck! Try Again! :)";
        }

        textView.setText("Score: " + finalScore + "/10");

        Toast toast = Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0 , 0);
        toast.show();
    }
}
