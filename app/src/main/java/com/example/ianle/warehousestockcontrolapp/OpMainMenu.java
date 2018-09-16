package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpMainMenu extends AppCompatActivity {

    Button  addRemoveStock, findMoveStock, stockCheck, pickList,
            emptyLocations, logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_main_menu);

        logOutButton = (Button)findViewById(R.id.logOutButton);
        addRemoveStock = (Button)findViewById(R.id.addRemoveStock);
        findMoveStock = (Button)findViewById(R.id.findMoveStock);
        stockCheck = (Button)findViewById(R.id.stockCheck);
        pickList = (Button)findViewById(R.id.pickList);
        emptyLocations = (Button)findViewById(R.id.emptyLocations);

        addRemoveStock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent putawayStock = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                startActivity(putawayStock);
            }
        });

        findMoveStock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent removeStock = new Intent("com.example.ianle.warehousestockcontrolapp.FindMoveStock");
                startActivity(removeStock);
            }
        });

        stockCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stockCheck = new Intent("com.example.ianle.warehousestockcontrolapp.StockCheck");
                startActivity(stockCheck);
            }
        });

        pickList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pickList = new Intent("com.example.ianle.warehousestockcontrolapp.PickList");
                startActivity(pickList);
            }
        });

        emptyLocations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pickList = new Intent("com.example.ianle.warehousestockcontrolapp.EmptyLocations");
                startActivity(pickList);
            }
        });

        logOutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
