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

import java.util.ArrayList;
import java.util.Date;

public class MovePallet extends AppCompatActivity {

    Button enterButton, cancelButton, logOutButton;
    Spinner aisleSpinner, levelSpinner, locationSpinner;

    static String customer = null;
    static int quantityNew;
    static Date dateNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_pallet);

        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        logOutButton = (Button)findViewById(R.id.logOutButton);

        aisleSpinner = (Spinner)findViewById(R.id.aisleSpinner);
        levelSpinner = (Spinner)findViewById(R.id.levelSpinner);
        locationSpinner = (Spinner)findViewById(R.id.locationSpinner);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.aisleID);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        aisleSpinner.setAdapter(adapter);

        final ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.levels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        levelSpinner.setAdapter(adapter2);

        final ArrayAdapter<Integer> adapter3 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.locations);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        locationSpinner.setAdapter(adapter3);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String aisle = aisleSpinner.getSelectedItem().toString();
                final String level = levelSpinner.getSelectedItem().toString();
                final Integer location = (Integer)locationSpinner.getSelectedItem();

                for (Aisle findAisle : MainActivity.aisles){
                    if(findAisle.getID().equals(aisle)){
                        if(!findAisle.getLevel(level)[location].getName().equals("Empty")){
                            customer = findAisle.getLevel(level)[location].getName();
                            quantityNew = findAisle.getLevel(level)[location].getQuantity();
                            dateNew = findAisle.getLevel(level)[location].getDate();
                        }
                    }
                }

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MovePallet.this);

                alertDialog.setMessage("Is this the pallet to be moved?" + "\n" +
                        "Aisle: " + aisle + "\n" +
                        "Level: " + level + "\n" +
                        "Customer: " + customer + "\n" +
                        "Location: " + location.toString());
                alertDialog.setTitle("Confirm");

                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MovePallet.this, "Details accepted.", Toast.LENGTH_SHORT).show();
                                Intent movePalletNew = new Intent("com.example.ianle.warehousestockcontrolapp.MovePalletNew");
                                startActivity(movePalletNew);
                            }
                        });
                // If the details are incorrect the user is returned to enter
                // details form
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Toast.makeText(MovePallet.this, "Details incorrect", Toast.LENGTH_SHORT).show();
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
