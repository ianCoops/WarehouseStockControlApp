package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseAisle extends AppCompatActivity {

    public static String tempID;

    Button aisleGbutton, aisleHbutton, aisleIbutton, aisleJbutton,
    aisleKbutton, aisleLbutton, aisleMbutton, exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_aisle);

        aisleGbutton = (Button)findViewById(R.id.aisleGbutton);
        aisleHbutton = (Button)findViewById(R.id.aisleHbutton);
        aisleIbutton = (Button)findViewById(R.id.aisleIbutton);
        aisleJbutton = (Button)findViewById(R.id.aisleJbutton);
        aisleKbutton = (Button)findViewById(R.id.aisleKbutton);
        aisleLbutton = (Button)findViewById(R.id.aisleLbutton);
        aisleMbutton = (Button)findViewById(R.id.aisleMbutton);
        exitButton = (Button)findViewById(R.id.exitButton);

        aisleGbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tempID = "G";
                Intent locatePallet = new Intent("com.example.ianle.warehousestockcontrolapp.LocatePallet");
                startActivity(locatePallet);
            }
        });

        aisleHbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tempID = "H";
                Intent locatePallet = new Intent("com.example.ianle.warehousestockcontrolapp.LocatePallet");
                startActivity(locatePallet);
            }
        });

        aisleIbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tempID = "I";
                Intent locatePallet = new Intent("com.example.ianle.warehousestockcontrolapp.LocatePallet");
                startActivity(locatePallet);
            }
        });

        aisleJbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tempID = "J";
                Intent locatePallet = new Intent("com.example.ianle.warehousestockcontrolapp.LocatePallet");
                startActivity(locatePallet);
            }
        });

        aisleKbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tempID = "K";
                Intent locatePallet = new Intent("com.example.ianle.warehousestockcontrolapp.LocatePallet");
                startActivity(locatePallet);
            }
        });

        aisleLbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tempID = "L";
                Intent locatePallet = new Intent("com.example.ianle.warehousestockcontrolapp.LocatePallet");
                startActivity(locatePallet);
            }
        });

        aisleMbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tempID = "M";
                Intent locatePallet = new Intent("com.example.ianle.warehousestockcontrolapp.LocatePallet");
                startActivity(locatePallet);
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(mainMenu);
            }
        });
    }
}
