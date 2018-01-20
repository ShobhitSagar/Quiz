package com.example.shobhitsagar.iqq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    TextView textView;
    TextView totaltextView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    String string11;

    String[] strings_qsn;
    String[] btn_ans1;
    String[] btn_ans2;
    String[] btn_ans3;
    String[] btn_ans4;
    String[] crct_ans;

    int t,i=0,p=0;

    String qsn1 = "Which number logically follows this series 4, 6, 9, 6, 14, 6...";
    String qsn2 = "Choose the number that is 1/4 of 1/2 of 1/5 of 200:";
    String qsn3 = "Which one of the choices makes the best comparison?\nFinger is to Hand as Leaf is to:";
    String qsn4 = "I'm a male. If Albert's son is my son's father, what is the relationship between Albert and me?";
    String qsn5 = "Which one of the five is least like the other four?";
    String qsn6 = "Which one of the choices makes the best comparison?\nPEACH is to HCAEP as 46251 is to:";
    String qsn7 = "Ralph likes 25 but not 24; he likes 400 but not 300; he likes 144 but not 145.Which does he like:";
    String qsn8 = "There are 12 pens on the table, you took 3, how many do you have?";
    String qsn9 = "If you rearrange the letters \\\"TOOKY\\\", you would have the name of a/an:";
    String qsn10 = "Which one of the numbers does not belong in the following series?\n1 - 2 - 5 - 10 - 13 - 26 - 29 - 48";
    String qsn11 = "Please enter the missing number: 4, 8, 14, 22,";
    String qsn12 = "Which number should come next in the series?\n1 - 1 - 2 - 3 - 5 - 8 - 13";
    String gamovr = "GAME OVER!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        textView = (TextView) findViewById(R.id.questionTxt);
        totaltextView = (TextView) findViewById(R.id.totalTxtView);

        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);

        strings_qsn = new String[]{qsn1, qsn2, qsn3, qsn4, qsn5, qsn6, qsn7, qsn8, qsn9, qsn10, qsn11, qsn12, gamovr};

        btn_ans1 = new String[]{"6", "2", "Twig", "He is my brother", "Dog", "25641", "10", "6", "City", "1", "26", "8", "0"};
        btn_ans2 = new String[]{"17", "5", "Branch", "He is my uncle", "Mouse", "26451", "50", "7", "State", "5", "28", "13", "0"};
        btn_ans3 = new String[]{"19", "10", "Blossom", "He is my father", "Lion", "15264", "124", "3", "Country", "26", "32", "21", "0"};
        btn_ans4 = new String[]{"21", "25", "Bark", "She is my sister", "Snake", "51462", "1600", "5", "Ocean", "48", "36", "26", "0"};

        crct_ans = new String[]{"19", "5", "Twig", "He is my father", "Snake", "15264", "1600", "5", "State", "48", "32", "21", "0"};

        t = strings_qsn.length;

        totaltextView.setText(p + "/" + (t-1));

        textView.setText(strings_qsn[i]);
        button1.setText(btn_ans1[i]);
        button2.setText(btn_ans2[i]);
        button3.setText(btn_ans3[i]);
        button4.setText(btn_ans4[i]);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button1.getText().toString().equals(crct_ans[i])) {
                    finalScore();
                    toastCorrect();
                }
                else {
                    string11 = totaltextView.getText().toString();
                    finalScore();
                    toastIncorrect();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button2.getText().toString().equals(crct_ans[i])) {
                    finalScore();
                    toastCorrect();
                } else {
                    string11 = totaltextView.getText().toString();
                    finalScore();
                    toastIncorrect();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button3.getText().toString().equals(crct_ans[i])) {
                    finalScore();
                    toastCorrect();
                }
                else {
                    string11 = totaltextView.getText().toString();
                    finalScore();
                    toastIncorrect();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button4.getText().toString().equals(crct_ans[i])) {
                    finalScore();
                    toastCorrect();
                }
                else {
                    string11 = totaltextView.getText().toString();
                    finalScore();
                    toastIncorrect();
                }
            }
        });
    }

    public void nxtQsn() {

        textView.setText(strings_qsn[i]);
        button1.setText(btn_ans1[i]);
        button2.setText(btn_ans2[i]);
        button3.setText(btn_ans3[i]);
        button4.setText(btn_ans4[i]);
    }

    public void toastCorrect() {
        Toast.makeText(getBaseContext(), "CORRECT!", Toast.LENGTH_SHORT).show();
        i++;
        p++;

        nxtQsn();

        totaltextView.setText(p + "/" + (t-1));
    }

    public void toastIncorrect() {
        Toast.makeText(getBaseContext(), "INCORRECT!", Toast.LENGTH_SHORT).show();
        i++;

        nxtQsn();
    }

    public void finalScore() {

        string11 = totaltextView.getText().toString();
        if (i==(t-2)) {

            Intent intent = new Intent(this, FinalScoreActivity.class);
            intent.putExtra("T-S", string11);
            startActivity(intent);
        }
    }
}
