package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class FindStock extends AppCompatActivity {

    public static String findCustomer;

    Button exitButton, enterButton, cancelButton;
    Spinner customerSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_stock);

        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        exitButton = (Button)findViewById(R.id.exitButton);
        customerSpinner = (Spinner)findViewById(R.id.customerSpinner);

        final ArrayAdapter<Customer> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, AddCustomer.customerList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        customerSpinner.setAdapter(adapter);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findCustomer = customerSpinner.getSelectedItem().toString();
                Intent displayStock = new Intent("com.example.ianle.warehousestockcontrolapp.DisplayStock");
                startActivity(displayStock);
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(mainMenu);
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
