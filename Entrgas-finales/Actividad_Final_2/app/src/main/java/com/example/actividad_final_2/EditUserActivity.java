package com.example.actividad_final_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class EditUserActivity extends AppCompatActivity {

    private Spinner sp1, sp2;
    private String se1, se2, co1, co2, co3, co4, g1, g2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);

        sp1=(Spinner)findViewById(R.id.spinner);
        sp2=(Spinner)findViewById(R.id.spinner2);

        se1 = getString(R.string.ej_country);
        co1 = getString(R.string.coun_col);
        co2 = getString(R.string.coun_us);
        co3 = getString(R.string.coun_es);
        co4 = getString(R.string.coun_in);
        se2 = getString(R.string.ej_gender);
        g1 = getString(R.string.gen_m);
        g2 = getString(R.string.gen_f);

        String[] opciones1={se1, co1, co2, co3, co4};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>( this,android.R.layout.simple_spinner_item,opciones1);
        sp1.setAdapter(adapter);

        String[] opciones2={se2, g1, g2};
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>( this,android.R.layout.simple_spinner_item,opciones2);
        sp2.setAdapter(adapter2);
    }

    public void button1(View view){
        Intent intent = new Intent(this,ListUsersActivity.class);
        startActivity(intent);
    }
}