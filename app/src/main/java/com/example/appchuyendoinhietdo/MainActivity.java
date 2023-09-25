package com.example.appchuyendoinhietdo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText edtF,edtC;
    Button btFC,btCF,btgoo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtF = findViewById(R.id.edtF);

        edtC=findViewById(R.id.edtC);
        edtF=findViewById(R.id.edtF);
        btFC=findViewById(R.id.btFC);
        btCF=findViewById(R.id.btCF);
        btgoo=findViewById(R.id.btgo);

        btCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                int c= Integer.parseInt(edtC.getText().toString());
                Double F = c*1.8+32;
                edtF.setText(F+"");
            }
        });
        btFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int F= Integer.parseInt(edtF.getText().toString());
                double c=(F-32)/1.8;
                edtC.setText(c+"");

            }
        });
        btgoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainActivity.this,ChildActivity.class);
                startActivity(myintent);
            }
        });


    }
}