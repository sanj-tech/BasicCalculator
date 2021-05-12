package com.jsstech.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtnum1, edtnum2;
    TextView resulttv;
    Button btSum, btMinu, btMul, btDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resulttv = findViewById(R.id.result_tv);
        edtnum1 = findViewById(R.id.etNum1);
        edtnum2 = findViewById(R.id.etNum2);
        btSum = findViewById(R.id.bt_sum);
        btMinu = findViewById(R.id.bt_minus);
        btMul = findViewById(R.id.bt_mul);
        btDiv = findViewById(R.id.bt_div);


        btSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=edtnum1.getText().toString();
                String num2=edtnum2.getText().toString();

                int a=Integer.parseInt(num1);
                int b=Integer.parseInt(num2);
                int c=a+b;
                Toast.makeText(MainActivity.this, Integer.toString(c),Toast.LENGTH_SHORT).show();
                resulttv.setText(Integer.toString(c));
            }
        });

        btMinu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=edtnum1.getText().toString();
                String num2=edtnum2.getText().toString();

                int a=Integer.parseInt(num1);
                int b=Integer.parseInt(num2);
                int c=a-b;
                Toast.makeText(MainActivity.this, Integer.toString(c),Toast.LENGTH_SHORT).show();
                resulttv.setText(Integer.toString(c));

            }
        });

        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=edtnum1.getText().toString();
                String num2=edtnum2.getText().toString();

                int a=Integer.parseInt(num1);
                int b=Integer.parseInt(num2);
                int c=a*b;
                Toast.makeText(MainActivity.this, Integer.toString(c),Toast.LENGTH_SHORT).show();
                resulttv.setText(Integer.toString(c));

            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=edtnum1.getText().toString();
                String num2=edtnum2.getText().toString();

                int a=Integer.parseInt(num1);
                int b=Integer.parseInt(num2);
                int c=a/b;
                Toast.makeText(MainActivity.this, Integer.toString(c),Toast.LENGTH_SHORT).show();
                resulttv.setText(Integer.toString(c));

            }
        });






    }
}