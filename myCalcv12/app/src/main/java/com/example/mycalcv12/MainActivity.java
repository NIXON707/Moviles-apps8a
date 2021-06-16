package com.example.mycalcv12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1,n2;
    private Spinner sp1;
    private TextView ans;
    private String os, or, om, od;
    private String rf, ef, e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1=(Spinner)findViewById(R.id.spinner);
        ans=(TextView)findViewById(R.id.textView3);
        n1=(EditText)findViewById(R.id.editTextNumber);
        n2=(EditText)findViewById(R.id.editTextNumber2);

        os = getString(R.string.opAdd);
        or = getString(R.string.opSubtract);
        om = getString(R.string.opMultiply);
        od = getString(R.string.opDivide);

        rf = getString(R.string.RF);
        ef = getString(R.string.CE);
        e1 = getString(R.string.CE1);
        e2 = getString(R.string.CE2);

        String[] opciones={os,or,om,od};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>( this,android.R.layout.simple_spinner_item,opciones);

        sp1.setAdapter(adapter);

    }

    public void Vacio(View view){
        String dato1 = n1.getText().toString().trim();
        String dato2 = n2.getText().toString().trim();
        if (TextUtils.isEmpty(dato1) & TextUtils.isEmpty(dato2)){
            n1.setError(rf);
            n1.requestFocus();
            n2.setError(rf);
            Toast.makeText(this, ef, Toast.LENGTH_SHORT).show();
        }else if(TextUtils.isEmpty(dato1)){
            n1.setError(rf);
            n1.requestFocus();
            Toast.makeText(this, e1, Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(dato2)){
            n2.setError(rf);
            n2.requestFocus();
            Toast.makeText(this, e2, Toast.LENGTH_SHORT).show();
        }else{
            op_calc();
        }
    }

    public void op_calc () {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int oper;
        String select = sp1.getSelectedItem().toString();

        if (select == os) {
            oper = num1 + num2;
            ans.setText(String.valueOf(oper));
        }else if (select == or) {
            oper = num1 - num2;
            ans.setText(String.valueOf(oper));
        }else if (select == om) {
            oper = num1 * num2;
            ans.setText(String.valueOf(oper));
        }else if (select == od) {
            Float res = (float) num1 / (float) num2;
            ans.setText(String.valueOf(res));
        }
    }
}