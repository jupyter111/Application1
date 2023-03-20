package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edit1;
    EditText edit2;
    TextView text1;
    TextView text2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1= findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        text1 = findViewById(R.id.text1);
        text1.setText(" ");
        text2 = findViewById(R.id.text2);
        text2.setText(" ");
        btn=findViewById(R.id.button1);
        btn.setText("计算");
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        float h = Float.parseFloat(edit1.getText().toString());
        float w = Float.parseFloat(edit2.getText().toString());

            float bmi = w / (h * h);
            String BMI = String.format("%.2f", bmi);
            text1.setText("您的BMI为" + BMI);
            if (bmi < 18.5) {
                text2.setText("您的体重轻了，建议增重");
            } else if (bmi >= 18.5 && bmi <= 24) {
                text2.setText("您的体重正常，请保持");
            } else text2.setText("您的体重偏高，建议减重");


    }
}