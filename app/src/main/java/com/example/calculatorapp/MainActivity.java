package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.firstEnteredNum);
        EditText number2ET = findViewById(R.id.secondEnteredNum);
        TextView numberSumTV = findViewById(R.id.answerBox);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstEnteredNum);
        EditText number2ET = findViewById(R.id.secondEnteredNum);
        TextView numberSumTV = findViewById(R.id.answerBox);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double difference = num1 - num2;

        numberSumTV.setText("" + difference);
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.firstEnteredNum);
        EditText number2ET = findViewById(R.id.secondEnteredNum);
        TextView numberSumTV = findViewById(R.id.answerBox);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double product = num1 * num2;

        numberSumTV.setText("" + product);
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.firstEnteredNum);
        EditText number2ET = findViewById(R.id.secondEnteredNum);
        TextView numberSumTV = findViewById(R.id.answerBox);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double quotient = num1 / num2;

        numberSumTV.setText("" + quotient);
    }

    public void findMean(View view){
        EditText number1ET = findViewById(R.id.firstEnteredNum);
        EditText number2ET = findViewById(R.id.secondEnteredNum);
        TextView numberSumTV = findViewById(R.id.answerBox);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double mean = (num1 + num2)/2;

        numberSumTV.setText("" + mean);
    }

    public void findSquareRoot(View view){
        EditText number1ET = findViewById(R.id.firstEnteredNum);
        //EditText number2ET = findViewById(R.id.secondEnteredNum);
        TextView numberSumTV = findViewById(R.id.answerBox);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        //double num2 = Double.parseDouble(number2ET.getText().toString());
        //if(number2ET == null) {
        //    num2 = 1;
        //}
        double squareRootFirst = Math.sqrt(num1);
        //double squareRootSecond = Math.sqrt(num2);

        numberSumTV.setText("" + squareRootFirst);
    }
}