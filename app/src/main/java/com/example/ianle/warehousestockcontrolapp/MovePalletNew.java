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
import java.util.Date;
import java.util.TimeZone;

public class MovePalletNew extends AppCompatActivity {
    // Declare button and spinner variables
    Button enterButton, cancelButton, logOutButton;
    Spinner aisleSpinnerNew, levelSpinnerNew, locationSpinnerNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_pallet_new);
        // Find buttons from screen layout xml
        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        logOutButton = (Button)findViewById(R.id.logOutButton);
        // Find spinners from screen layout xml
        aisleSpinnerNew = (Spinner)findViewById(R.id.aisleSpinnerNew);
        levelSpinnerNew = (Spinner)findViewById(R.id.levelSpinnerNew);
        locationSpinnerNew = (Spinner)findViewById(R.id.locationSpinnerNew);
        // Set the data to be displayed by the aisle spinner
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.aisleID);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        aisleSpinnerNew.setAdapter(adapter);
        // Set the data to be displayed by the level spinner
        final ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.levels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        levelSpinnerNew.setAdapter(adapter2);
        // Set the date to be displayed by the location spinner
        final ArrayAdapter<Integer> adapter3 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.locations);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        locationSpinnerNew.setAdapter(adapter3);
        // Add listener to the Enter button
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the data selected by the user from the spinners
                final String aisleNew = aisleSpinnerNew.getSelectedItem().toString();
                final String levelNew = levelSpinnerNew.getSelectedItem().toString();
                final Integer locationNew = (Integer)locationSpinnerNew.getSelectedItem();
                // Build a dialog box to get confirmation of the entered data from the user
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MovePalletNew.this);
                // Display the new location details to the user
                alertDialog.setMessage("Is this the location you wish to move the pallet to?" + "\n" +
                        "Aisle: " + aisleNew + "\n" +
                        "Level: " + levelNew + "\n" +
                        "Location: " + locationNew.toString());
                alertDialog.setTitle("Confirm");

                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MovePalletNew.this, "Details accepted.", Toast.LENGTH_SHORT).show();
                                // Get each Aisle ID to enable iteration of each aisle
                                for (Aisle findAisle : MainActivity.aisles){
                                    // Add the pallet to the new location
                                    if(findAisle.getID().equals(aisleNew)){
                                        if(findAisle.getLevel(levelNew)[locationNew].getName().equals("Empty")){
                                            Pallet newPallet = new Pallet(MovePallet.customer,
                                                    MovePallet.quantityNew, MovePallet.dateNew);
                                            findAisle.getLevel(levelNew)[locationNew] = newPallet;
                                            // Update activity log
                                            Date date = new Date();
                                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                                            String strDate = dateFormat.format(date);
                                            String added = "User " + MainActivity.currentUser + " added a Stock Item from "
                                                    + "customer - " + MovePallet.customer +  " to location - " +
                                                    locationNew.toString() + " in Aisle " + aisleNew + " on " + strDate;
                                            MainActivity.activityLog.add(added);
                                            Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.MovePallet");
                                            startActivity(intent);
                                        }else {
                                            Toast.makeText(MovePalletNew.this, "Location is full! Please start again."
                                            + "\n" +
                                            "Press 'No' to try a new location.", Toast.LENGTH_LONG).show();
                                        }
                                    }
                                }
                            }
                        });
                // If the details are incorrect the user is returned to enter
                // details form
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Toast.makeText(MovePalletNew.this, "Details incorrect. Please re-enter.", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });

                AlertDialog alert = alertDialog.create();
                alert.show();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(mainMenu);
            }
        });

        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
