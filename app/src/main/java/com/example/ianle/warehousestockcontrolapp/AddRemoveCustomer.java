package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddRemoveCustomer extends AppCompatActivity {

    Button addCustomerButton, removeCustomerButton, logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_remove_customer);

        addCustomerButton = (Button)findViewById(R.id.addCustomerButton);
        removeCustomerButton = (Button)findViewById(R.id.removeCustomerButton);
        logOutButton = (Button)findViewById(R.id.logOutButton);

        addCustomerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent addCustomer = new Intent("com.example.ianle.warehousestockcontrolapp.AddCustomer");
                startActivity(addCustomer);
            }
        });

        removeCustomerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent removeCustomer = new Intent("com.example.ianle.warehousestockcontrolapp.RemoveCustomer");
                startActivity(removeCustomer);
            }
        });
    }
}
