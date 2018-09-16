package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StockReport extends AppCompatActivity {

    Button stockHoldingButton, activityButton,
    exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_report);

        stockHoldingButton = (Button)findViewById(R.id.stockHoldingButton);
        activityButton = (Button)findViewById(R.id.activityButton);
        exitButton = (Button)findViewById(R.id.exitButton);

        stockHoldingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stockHolding = new Intent("com.example.ianle.warehousestockcontrolapp.StockHolding");
                startActivity(stockHolding);
            }
        });

        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityLog = new Intent("com.example.ianle.warehousestockcontrolapp.ActivityLog");
                startActivity(activityLog);
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(mainMenu);
            }
        });
    }
}
