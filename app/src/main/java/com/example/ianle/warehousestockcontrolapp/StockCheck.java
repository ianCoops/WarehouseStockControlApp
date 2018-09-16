package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StockCheck extends AppCompatActivity {

    Button aisleGbutton, aisleHbutton, aisleIbutton, aisleJbutton,
            aisleKbutton, aisleLbutton, aisleMbutton, exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_check);

        aisleGbutton = (Button)findViewById(R.id.aisleGbutton);
        aisleHbutton = (Button)findViewById(R.id.aisleHbutton);
        aisleIbutton = (Button)findViewById(R.id.aisleIbutton);
        aisleJbutton = (Button)findViewById(R.id.aisleJbutton);
        aisleKbutton = (Button)findViewById(R.id.aisleKbutton);
        aisleLbutton = (Button)findViewById(R.id.aisleLbutton);
        aisleMbutton = (Button)findViewById(R.id.aisleMbutton);
        exitButton = (Button)findViewById(R.id.exitButton);

        aisleGbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
                Intent aisleG = new Intent("com.example.ianle.warehousestockcontrolapp.AisleG_Check");
                startActivity(aisleG);
            }
        });

        aisleHbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
                Intent aisleH = new Intent("com.example.ianle.warehousestockcontrolapp.AisleH_Check");
                startActivity(aisleH);
            }
        });

        aisleIbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
                Intent aisleI = new Intent("com.example.ianle.warehousestockcontrolapp.AisleI_Check");
                startActivity(aisleI);
            }
        });

        aisleJbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
                Intent aisleJ = new Intent("com.example.ianle.warehousestockcontrolapp.AisleJ_Check");
                startActivity(aisleJ);
            }
        });

        aisleKbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
                Intent aisleK = new Intent("com.example.ianle.warehousestockcontrolapp.AisleK_Check");
                startActivity(aisleK);
            }
        });

        aisleLbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
                Intent aisleL = new Intent("com.example.ianle.warehousestockcontrolapp.AisleL_Check");
                startActivity(aisleL);
            }
        });

        aisleMbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
                Intent aisleM = new Intent("com.example.ianle.warehousestockcontrolapp.AisleM_Check");
                startActivity(aisleM);
            }
        });
    }
}
