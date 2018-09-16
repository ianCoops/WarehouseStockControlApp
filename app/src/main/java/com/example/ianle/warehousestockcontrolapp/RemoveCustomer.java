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
import java.util.Date;
import java.util.TimeZone;

public class RemoveCustomer extends AppCompatActivity {

    public Boolean removed = false;

    Button enterButton, cancelButton;
    EditText nameInputBox, depotInputBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_customer);

        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        nameInputBox = (EditText)findViewById(R.id.nameInputBox);
        depotInputBox = (EditText)findViewById(R.id.depotInputBox);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String name = nameInputBox.getText().toString();
                final String depot = depotInputBox.getText().toString();


                AlertDialog.Builder alertDialog = new AlertDialog.Builder(RemoveCustomer.this);

                alertDialog.setMessage("Are the details correct?" + "\n" + name + "\n" + depot);
                alertDialog.setTitle("Confirm");

                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        Toast.makeText(RemoveCustomer.this, "Details accepted", Toast.LENGTH_SHORT).show();
                        for(int counter = 0; counter < AddCustomer.customerList.size(); counter++){
                            if(AddCustomer.customerList.get(counter).getName().equals(name) &&
                                    AddCustomer.customerList.get(counter).getDepot().equals(depot)){
                                    AddCustomer.customerList.remove(AddCustomer.customerList.get(counter));
                                    removed = true;
                            }
                        }

                        if(removed){
                            Toast.makeText(RemoveCustomer.this, "Customer removed", Toast.LENGTH_SHORT).show();
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " removed Customer - "
                                    + name + " from the system on " + strDate;
                            MainActivity.activityLog.add(added);
                            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                            startActivity(mainMenu);
                        }else{
                            removed = false;
                            Toast.makeText(RemoveCustomer.this, "Customer not removed", Toast.LENGTH_LONG).show();
                            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                            startActivity(mainMenu);
                        }
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Toast.makeText(RemoveCustomer.this, "Details incorrect", Toast.LENGTH_SHORT).show();
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
