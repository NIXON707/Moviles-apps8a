package com.example.actividad_final_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String m1, m2;
    private EditText n1,n2;
    private String rf, ef, e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText)findViewById(R.id.editTextTextEmailAddress);
        n2=(EditText)findViewById(R.id.editPassword);

        rf = getString(R.string.RF);
        ef = getString(R.string.CE);
        e1 = getString(R.string.CE1);
        e2 = getString(R.string.CE2);

        m1 = getString(R.string.lbl_toast);
        m2 = getString(R.string.lbl_toast2);
    }

    public void button1(View view){

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
            Toast.makeText(this, m1, Toast.LENGTH_SHORT).show();
        }
    }

    public void button2(View view){
        Intent intent = new Intent(this,SingUpActivity.class);
        startActivity(intent);
    }

    public void socialbutton(View view){
        Toast.makeText(this, m2, Toast.LENGTH_SHORT).show();
    }
}