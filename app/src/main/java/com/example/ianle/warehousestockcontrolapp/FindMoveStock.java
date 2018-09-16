package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindMoveStock extends AppCompatActivity {

    Button findStockButton, moveStockButton, exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_move_stock);

        findStockButton = (Button)findViewById(R.id.findStockButton);
        moveStockButton = (Button)findViewById(R.id.moveStockButton);
        exitButton = (Button)findViewById(R.id.exitButton);

        findStockButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent removeStock = new Intent("com.example.ianle.warehousestockcontrolapp.FindStock");
                startActivity(removeStock);
            }
        });

        moveStockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movePallet = new Intent("com.example.ianle.warehousestockcontrolapp.MovePallet");
                startActivity(movePallet);
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
