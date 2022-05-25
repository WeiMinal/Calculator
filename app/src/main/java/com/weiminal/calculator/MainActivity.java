package com.weiminal.calculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button C0,C1,C2,C3,C4,C5,C6,C7,C8,C9;
    private Button Add,Subtract,Multiply,Divide,Equal;
    private Button Reset ,Point;
    double num1 = 0,num2 = 0;
    double result = 0;
    int Operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //状态栏透明
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_main);
        //隐藏标题栏
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        textView = findViewById(R.id.textView);

        C0 = findViewById(R.id.C0);
        C1 = findViewById(R.id.C1);
        C2 = findViewById(R.id.C2);
        C3 = findViewById(R.id.C3);
        C4 = findViewById(R.id.C4);
        C5 = findViewById(R.id.C5);
        C6 = findViewById(R.id.C6);
        C7 = findViewById(R.id.C7);
        C8 = findViewById(R.id.C8);
        C9 = findViewById(R.id.C9);

        Add = findViewById(R.id.add);
        Subtract = findViewById(R.id.Subtract);
        Multiply = findViewById(R.id.Multiply);
        Divide = findViewById(R.id.Divide);
        Equal = findViewById(R.id.Equal);

        Reset = findViewById(R.id.reset);
        Point = findViewById(R.id.Point);

        SetListen();
    }
    public void SetListen(){
        OnClick onClick = new OnClick();
        C0.setOnClickListener(onClick);
        C1.setOnClickListener(onClick);
        C2.setOnClickListener(onClick);
        C3.setOnClickListener(onClick);
        C4.setOnClickListener(onClick);
        C5.setOnClickListener(onClick);
        C6.setOnClickListener(onClick);
        C7.setOnClickListener(onClick);
        C8.setOnClickListener(onClick);
        C9.setOnClickListener(onClick);
        Point.setOnClickListener(onClick);

        Add.setOnClickListener(onClick);
        Subtract.setOnClickListener(onClick);
        Multiply.setOnClickListener(onClick);
        Divide.setOnClickListener(onClick);

        Equal.setOnClickListener(onClick);
        Reset.setOnClickListener(onClick);

    }
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.reset:
                    textView.setText(null);
                    break;
                case R.id.C0:
                    String str0 = textView.getText().toString().trim();
                    str0 += "0";
                    textView.setText(str0);
                    break;
                case R.id.C1:
                    String str1 = textView.getText().toString().trim();
                    str1 += "1";
                    textView.setText(str1);
                    break;
                case R.id.C2:
                    String str2 = textView.getText().toString().trim();
                    str2 += "2";
                    textView.setText(str2);
                    break;
                case R.id.C3:
                    String str3 = textView.getText().toString().trim();
                    str3 += "3";
                    textView.setText(str3);
                    break;
                case R.id.C4:
                    String str4 = textView.getText().toString().trim();
                    str4 += "4";
                    textView.setText(str4);
                    break;
                case R.id.C5:
                    String str5 = textView.getText().toString().trim();
                    str5 += "5";
                    textView.setText(str5);
                    break;
                case R.id.C6:
                    String str6 = textView.getText().toString().trim();
                    str6 += "6";
                    textView.setText(str6);
                    break;
                case R.id.C7:
                    String str7 = textView.getText().toString().trim();
                    str7 += "7";
                    textView.setText(str7);
                    break;
                case R.id.C8:
                    String str8 = textView.getText().toString().trim();
                    str8 += "8";
                    textView.setText(str8);
                    break;
                case R.id.C9:
                    String str9 = textView.getText().toString().trim();
                    str9 += "9";
                    textView.setText(str9);
                    break;
                case R.id.Point:
                    String point = textView.getText().toString().trim();
                    point += ".";
                    textView.setText(point);
                    break;

                case R.id.add:
                    String add = textView.getText().toString().trim();
                    if (add.equals(null)) {
                        return;
                    }
                    try {
                        num1 = Double.valueOf(add);
                    }
                    catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    add += "+";
                    textView.setText(null);
                    Operator = 1;
                    break;
                case R.id.Subtract:
                    String subtract = textView.getText().toString().trim();
                    if (subtract.equals(null)) {
                        return;
                    }
                    try {
                        num1 = Double.valueOf(subtract);
                    }
                    catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    subtract += "-";
                    textView.setText(null);
                    Operator = 2;
                    break;
                case R.id.Multiply:
                    String multiply = textView.getText().toString().trim();
                    if (multiply.equals(null)) {
                        return;
                    }
                    try {
                        num1 = Double.valueOf(multiply);
                    }
                    catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    multiply += "*";
                    textView.setText(null);
                    Operator = 3;
                    break;
                case R.id.Divide:
                    String divide = textView.getText().toString().trim();
                    if (divide.equals(null)) {
                        return;
                    }
                    try {
                        num1 = Double.valueOf(divide);
                    }
                    catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    divide += "/";
                    textView.setText(null);
                    Operator = 4;
                    break;
                case R.id.Equal:
                    String equal = textView.getText().toString().trim();
                    try {
                        num2 = Double.valueOf(equal);
                    }
                    catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    textView.setText(equal);
                    switch (Operator) {
                        case 1:
                            result = num1 + num2;
                            textView.setText(result+"");
                            break;
                        case 2:
                            result = num1 - num2;
                            textView.setText(result+"");
                            break;
                        case 3:
                            result = num1 * num2;
                            textView.setText(result+"");
                            break;
                        case 4:
                            if (num2 == 0) {
                                textView.setText("错误");
                            }
                            else {
                                result = num1 / num2;
                                textView.setText(result+"");
                            }
                            break;
                    }
                    break;
                default:
                    result = 0;
                    break;
            }
        }
    }
}