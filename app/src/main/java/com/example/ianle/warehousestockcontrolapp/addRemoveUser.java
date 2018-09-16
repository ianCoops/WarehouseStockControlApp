package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addRemoveUser extends AppCompatActivity {

    Button adminTypeButton, operativeTypeButton, logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_remove_user);

        adminTypeButton = (Button)findViewById(R.id.adminTypeButton);
        operativeTypeButton = (Button)findViewById(R.id.operativeTypeButton);
        logOutButton = (Button)findViewById(R.id.logOutButton);

        adminTypeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent addAdmin = new Intent("com.example.ianle.warehousestockcontrolapp.addRemoveChoose");
                startActivity(addAdmin);
            }
        });

        operativeTypeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent addOperative = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveChooseOperative");
                startActivity(addOperative);
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
