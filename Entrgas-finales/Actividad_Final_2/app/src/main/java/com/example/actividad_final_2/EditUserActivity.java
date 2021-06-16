package com.example.actividad_final_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class EditUserActivity extends AppCompatActivity {

    private Spinner sp1, sp2;
    private String se1, se2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);

        sp1=(Spinner)findViewById(R.id.spinner);
        sp2=(Spinner)findViewById(R.id.spinner2);

        se1 = getString(R.string.ej_country);
        se2 = getString(R.string.ej_gender);

        String[] opciones1={se1};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>( this,android.R.layout.simple_spinner_item,opciones1);
        sp1.setAdapter(adapter);

        String[] opciones2={se2};
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>( this,android.R.layout.simple_spinner_item,opciones2);
        sp2.setAdapter(adapter2);
    }

    public void button1(View view){
        Intent intent = new Intent(this,ListUsersActivity.class);
        startActivity(intent);
    }
}