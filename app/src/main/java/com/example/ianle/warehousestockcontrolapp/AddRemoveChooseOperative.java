package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddRemoveChooseOperative extends AppCompatActivity {

    Button addButton, removeButton, logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_remove_choose_operative);

        addButton = (Button)findViewById(R.id.addUserButton);
        removeButton = (Button)findViewById(R.id.removeUserButton);
        logOutButton = (Button)findViewById(R.id.logOutButton);

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent addOperative = new Intent("com.example.ianle.warehousestockcontrolapp.addOperative");
                startActivity(addOperative);
            }
        });

        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent removeOperative = new Intent("com.example.ianle.warehousestockcontrolapp.RemoveOperative");
                startActivity(removeOperative);
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
