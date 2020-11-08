package com.example.thecalculator;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //declaring vars for widgets
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bDel;
    private Button bClr;
    private Button bPct;
    private Button bAdd;
    private Button bSubtract;
    private Button bDivide;
    private Button bMultiply;
    private Button bEquals;
    private Button bAns;
    private Button bDecimal;
    private TextView tResult;
    private TextView tProblem;


    //private Button b3;
    //private Button b4;
    //private Button b5;
    //private Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //tProblem.setText();
            }
        });

    }

    private void setupUIViews(){
        //referencing var to widget

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        b0 = findViewById(R.id.btn0);
        bDel = findViewById(R.id.btnDelete);
        bClr = findViewById(R.id.btnClear);
        bPct = findViewById(R.id.btnPercentage);
        bAdd = findViewById(R.id.btnAdd);
        bSubtract = findViewById(R.id.btnSubtract);
        bDivide = findViewById(R.id.btnDivide);
        bMultiply = findViewById(R.id.btnMultiply);
        bEquals = findViewById(R.id.btnEquals);
        bAns = findViewById(R.id.btnAns);
        bDecimal = findViewById(R.id.btnDecimal);
        tResult = findViewById(R.id.tVResult);
        tProblem = findViewById(R.id.tVProblem);

    }
}