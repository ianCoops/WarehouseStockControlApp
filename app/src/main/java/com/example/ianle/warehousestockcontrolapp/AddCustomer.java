package com.example.ianle.warehousestockcontrolapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class AddCustomer extends AppCompatActivity {
    // ArrayList to store customers registered on the system
    public static List<Customer> customerList = new ArrayList<Customer>();

    // Customer that already have accounts with the business
    // and can be added to the system
    Customer asdaB = new Customer("ASDA", "Brackmills");
    Customer tu = new Customer("TU", "Bedford");
    Customer newLook = new Customer("New Look", "Lymedale");
    Customer morrisons = new Customer("Nutmeg", "Leeds");
    Customer debenhams = new Customer("Debenhams", "Lutterworth");

    Button enterButton, cancelButton;
    EditText nameInputBox, depotInputBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);


        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        nameInputBox = (EditText)findViewById(R.id.nameInputBox);
        depotInputBox = (EditText)findViewById(R.id.depotInputBox);

        enterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String name = nameInputBox.getText().toString();
                final String depot = depotInputBox.getText().toString();

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(AddCustomer.this);

                alertDialog.setMessage("Are the details correct?" + "\n" +
                        name + "\n" +
                        depot);
                alertDialog.setTitle("Confirm");

                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        Toast.makeText(AddCustomer.this, "Details accepted", Toast.LENGTH_SHORT).show();
                        Customer newCust = new Customer(name, depot);
                        if(!customerList.contains(newCust)) {
                            customerList.add(newCust);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " added Customer - "
                                    + name + " to the system on " + strDate;
                            MainActivity.activityLog.add(added);
                            Toast.makeText(AddCustomer.this, "Customer added", Toast.LENGTH_SHORT).show();
                            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                            startActivity(mainMenu);
                        }else{
                            Toast.makeText(AddCustomer.this, "Customer not added", Toast.LENGTH_SHORT).show();
                            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                            startActivity(mainMenu);
                        }
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Toast.makeText(AddCustomer.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });

                AlertDialog alert = alertDialog.create();
                alert.show();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
