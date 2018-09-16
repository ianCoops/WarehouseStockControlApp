package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddRemoveStock extends AppCompatActivity {

    Button exitButton, addStockButton, removeStockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_remove_stock);

        exitButton = (Button)findViewById(R.id.exitButton);
        addStockButton = (Button)findViewById(R.id.addStockButton);
        removeStockButton = (Button)findViewById(R.id.removeStockButton);

        addStockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addStock = new Intent("com.example.ianle.warehousestockcontrolapp.PutawayStock");
                startActivity(addStock);
            }
        });

        removeStockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent remove = new Intent("com.example.ianle.warehousestockcontrolapp.RemoveStock");
                startActivity(remove);
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(main);
            }
        });

    }
}
