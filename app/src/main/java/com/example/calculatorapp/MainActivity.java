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

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstEnteredNum);
        EditText number2ET = findViewById(R.id.secondEnteredNum);
        TextView numberSumTV = findViewById(R.id.answerBox);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 - num2;

        numberSumTV.setText("" + sum);
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.firstEnteredNum);
        EditText number2ET = findViewById(R.id.secondEnteredNum);
        TextView numberSumTV = findViewById(R.id.answerBox);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 * num2;

        numberSumTV.setText("" + sum);
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.firstEnteredNum);
        EditText number2ET = findViewById(R.id.secondEnteredNum);
        TextView numberSumTV = findViewById(R.id.answerBox);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double sum = num1 / num2;

        numberSumTV.setText("" + sum);
    }

    public void enterNumOrValue(Button button){

    }

}