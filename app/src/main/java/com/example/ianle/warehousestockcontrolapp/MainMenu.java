package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button addRemoveUser, addRemoveCustomer, addRemoveStock,
    findMoveStock, stockCheck, stockReport, pickList,
    emptyLocations, logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        addRemoveUser = (Button)findViewById(R.id.addRemoveUser);
        addRemoveCustomer = (Button)findViewById(R.id.addRemoveCustomer);
        logOutButton = (Button)findViewById(R.id.logOutButton);
        addRemoveStock = (Button)findViewById(R.id.addRemoveStock);
        findMoveStock = (Button)findViewById(R.id.findMoveStock);
        stockCheck = (Button)findViewById(R.id.stockCheck);
        stockReport = (Button)findViewById(R.id.stockReport);
        pickList = (Button)findViewById(R.id.pickList);
        emptyLocations = (Button)findViewById(R.id.emptyLocations);

        addRemoveUser.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               Intent addRemove = new Intent("com.example.ianle.warehousestockcontrolapp.addRemoveUser");
               startActivity(addRemove);
           }
        });

        addRemoveCustomer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent addRemoveCustomer = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveCustomer");
                startActivity(addRemoveCustomer);
            }
        });

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

        stockReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stockReport = new Intent("com.example.ianle.warehousestockcontrolapp.StockReport");
                startActivity(stockReport);
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
