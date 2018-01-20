package com.example.shobhitsagar.iqq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class FinalScoreActivity extends AppCompatActivity {

    TextView textView1;
    String string22;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.final_score_activity);

        textView1 = (TextView) findViewById(R.id.finalScore);

        Intent intent = getIntent();
        string22 = intent.getStringExtra("T-S");
        textView1.setText(string22);
        Toast.makeText(this, string22, Toast.LENGTH_SHORT).show();

    }
}
