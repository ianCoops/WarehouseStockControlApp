package com.example.ianle.warehousestockcontrolapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class PickList extends AppCompatActivity {

    static String customer;
    static int quantity;

    Button enterButton, cancelButton;
    EditText quantityInputBox;
    Spinner customerSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_list);

        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        quantityInputBox = (EditText)findViewById(R.id.quantityInputBox);
        customerSpinner = (Spinner)findViewById(R.id.customerSpinner);

        ArrayAdapter<Customer> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, AddCustomer.customerList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        customerSpinner.setAdapter(adapter);

        enterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                customer = customerSpinner.getSelectedItem().toString();
                quantity = Integer.parseInt(quantityInputBox.getText().toString());
                // Using and alert dialog box to get user confirmation of the details
                // entered in the EditText box and Spinner
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(PickList.this);

                alertDialog.setMessage("Are the details correct?" + "\n" +
                        customer + "\n" +
                        quantity);
                alertDialog.setTitle("Confirm");

                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(PickList.this, "Details accepted", Toast.LENGTH_SHORT).show();
                                Intent chooseAisle = new Intent("com.example.ianle.warehousestockcontrolapp.DisplayPickList");
                                startActivity(chooseAisle);
                            }
                        });
                // If the details are incorrect the user is returned to enter
                // details form
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Toast.makeText(PickList.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });

                AlertDialog alert = alertDialog.create();
                alert.show();
            }
        });
        // Adds functionality to the cancel button taking the user back to the main
        // activity
        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(intent);
            }
        });
    }
}
