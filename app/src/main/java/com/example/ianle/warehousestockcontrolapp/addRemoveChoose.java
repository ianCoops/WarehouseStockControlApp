package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addRemoveChoose extends AppCompatActivity {

    Button addButton, removeButton, logOutButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_remove_choose);

        addButton = (Button)findViewById(R.id.addButton);
        removeButton = (Button)findViewById(R.id.removeButton);
        logOutButton = (Button)findViewById(R.id.logOutButton);
        
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent addAdmin = new Intent("com.example.ianle.warehousestockcontrolapp.addAdmin");
                startActivity(addAdmin);
            }
        });
        
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent removeAdmin = new Intent("com.example.ianle.warehousestockcontrolapp.removeAdmin");
                startActivity(removeAdmin);
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
