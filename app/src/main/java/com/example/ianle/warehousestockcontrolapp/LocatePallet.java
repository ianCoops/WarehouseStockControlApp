package com.example.ianle.warehousestockcontrolapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

public class LocatePallet extends AppCompatActivity {

    Button enterButton, finishButton;
    Spinner levelSpinner, locationSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate_pallet);

        enterButton = (Button)findViewById(R.id.enterButton);
        finishButton = (Button)findViewById(R.id.finishButton);
        levelSpinner = (Spinner)findViewById(R.id.levelSpinner);
        locationSpinner = (Spinner)findViewById(R.id.locationSpinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.levels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        levelSpinner.setAdapter(adapter);

        ArrayAdapter<Integer> adapterLoc = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.locations);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        locationSpinner.setAdapter(adapterLoc);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Here we get the data we need from the user input and assign them
                // to suitable data types so that we can use them later
                final String tempLevel = levelSpinner.getSelectedItem().toString();
                final int tempLocation = (Integer) locationSpinner.getSelectedItem();
                final String customer = PutawayStock.tempArray.get(0).getName();
                String quantity = Integer.toString(PutawayStock.tempArray.get(0).getQuantity());
                // Alert dialog to get confirmation from the user that the details entered
                // are correct and they wish to proceeed with the put away process
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(LocatePallet.this);
                // These are the details that will be presented to the user
                alertDialog.setMessage("Are the details correct?" + "\n"
                + "Aisle:" + " " + ChooseAisle.tempID + "\n"
                + "Customer:" + " " + customer + "\n"
                + "Quantity:" + " " + quantity + "\n"
                + "Level:" + " " + tempLevel + "\n"
                + "Location:" + " " + tempLocation);
                alertDialog.setTitle("Confirm");

                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        if(ChooseAisle.tempID.equals("G")) {
                            // If the user confirms the details the Pallet is added to the appropriate
                            // level and location of aisle G.
                            MainActivity.aisleG.getLevel(tempLevel)[tempLocation] = PutawayStock.tempArray.get(0);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " added a Stock Item from "
                                   + "customer - " + customer +  " to location " + Integer.toString(tempLocation)
                                   + " in Aisle G " + " on " + strDate;
                            MainActivity.activityLog.add(added);
                            // Toast to confirm the process has been completed
                            Toast.makeText(LocatePallet.this, "Pallet added to location", Toast.LENGTH_LONG).show();
                            // Intent to take the user back to the begining of the put away process
                            Intent putawayStock = new Intent("com.example.ianle.warehousestockcontrolapp.PutawayStock");
                            startActivity(putawayStock);
                        }else
                        // If the user has selected aisle H then the following code is executed
                        if(ChooseAisle.tempID.equals("H")){
                            MainActivity.aisleH.getLevel(tempLevel)[tempLocation] = PutawayStock.tempArray.get(0);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " added a Stock Item from "
                                    + "customer - " + customer +  " to location " + Integer.toString(tempLocation)
                                    + " in Aisle H " + " on " + strDate;
                            MainActivity.activityLog.add(added);
                            Toast.makeText(LocatePallet.this, "Pallet added to location", Toast.LENGTH_LONG).show();
                            Intent putawayStock = new Intent("com.example.ianle.warehousestockcontrolapp.PutawayStock");
                            startActivity(putawayStock);
                        }else
                        if(ChooseAisle.tempID.equals("I")){
                            MainActivity.aisleI.getLevel(tempLevel)[tempLocation] = PutawayStock.tempArray.get(0);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " added a Stock Item from "
                                    + "customer - " + customer +  " to location " + Integer.toString(tempLocation)
                                    + " in Aisle I " + " on " + strDate;
                            MainActivity.activityLog.add(added);
                            Toast.makeText(LocatePallet.this, "Pallet added to location", Toast.LENGTH_LONG).show();
                            Intent putawayStock = new Intent("com.example.ianle.warehousestockcontrolapp.PutawayStock");
                            startActivity(putawayStock);
                        }else
                        if(ChooseAisle.tempID.equals("J")){
                            MainActivity.aisleJ.getLevel(tempLevel)[tempLocation] = PutawayStock.tempArray.get(0);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " added a Stock Item from "
                                    + "customer - " + customer +  " to location " + Integer.toString(tempLocation)
                                    + " in Aisle J " + " on " + strDate;
                            MainActivity.activityLog.add(added);
                            Toast.makeText(LocatePallet.this, "Pallet added to location", Toast.LENGTH_LONG).show();
                            Intent putawayStock = new Intent("com.example.ianle.warehousestockcontrolapp.PutawayStock");
                            startActivity(putawayStock);
                        }else
                        if(ChooseAisle.tempID.equals("K")){
                            MainActivity.aisleK.getLevel(tempLevel)[tempLocation] = PutawayStock.tempArray.get(0);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " added a Stock Item from "
                                    + "customer - " + customer +  " to location " + Integer.toString(tempLocation)
                                    + " in Aisle K " + " on " + strDate;
                            MainActivity.activityLog.add(added);
                            Toast.makeText(LocatePallet.this, "Pallet added to location", Toast.LENGTH_LONG).show();
                            Intent putawayStock = new Intent("com.example.ianle.warehousestockcontrolapp.PutawayStock");
                            startActivity(putawayStock);
                        }else
                        if(ChooseAisle.tempID.equals("L")){
                            MainActivity.aisleL.getLevel(tempLevel)[tempLocation] = PutawayStock.tempArray.get(0);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " added a Stock Item from "
                                    + "customer - " + customer +  " to location " + Integer.toString(tempLocation)
                                    + " in Aisle L " + " on " + strDate;
                            MainActivity.activityLog.add(added);
                            Toast.makeText(LocatePallet.this, "Pallet added to location", Toast.LENGTH_LONG).show();
                            Intent putawayStock = new Intent("com.example.ianle.warehousestockcontrolapp.PutawayStock");
                            startActivity(putawayStock);
                        }else
                        if(ChooseAisle.tempID.equals("M")){
                            MainActivity.aisleM.getLevel(tempLevel)[tempLocation] = PutawayStock.tempArray.get(0);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " added a Stock Item from "
                                    + "customer - " + customer +  " to location " + Integer.toString(tempLocation)
                                    + " in Aisle M " + " on " + strDate;
                            MainActivity.activityLog.add(added);
                            Toast.makeText(LocatePallet.this, "Pallet added to location", Toast.LENGTH_LONG).show();
                            Intent putawayStock = new Intent("com.example.ianle.warehousestockcontrolapp.PutawayStock");
                            startActivity(putawayStock);
                        }
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Toast.makeText(LocatePallet.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                AlertDialog alert = alertDialog.create();
                alert.show();

            }
        });
        finishButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
