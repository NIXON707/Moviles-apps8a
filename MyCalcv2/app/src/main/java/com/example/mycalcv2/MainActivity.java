package com.example.mycalcv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button btn,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.lbl_Display);
        btn = findViewById(R.id.button); btn2 = findViewById(R.id.button2); btn3 = findViewById(R.id.button3); btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5); btn6 = findViewById(R.id.button6); btn7 = findViewById(R.id.button7); btn8 = findViewById(R.id.button8);
        //btn = findViewById(R.id.button); btn = findViewById(R.id.button); btn = findViewById(R.id.button); btn = findViewById(R.id.button);
        //btn = findViewById(R.id.button); btn = findViewById(R.id.button); btn = findViewById(R.id.button); btn = findViewById(R.id.button);
        //btn = findViewById(R.id.button); btn = findViewById(R.id.button); btn = findViewById(R.id.button);

    }

    public void  Btn1 (View view){
        //String number = display.getText().toString();
        String llama = btn.getText().toString();
        display.setText(llama);
    }

}