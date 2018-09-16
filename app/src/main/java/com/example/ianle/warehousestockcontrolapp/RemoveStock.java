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

import java.util.Date;

public class RemoveStock extends AppCompatActivity {

    public static String[] aisles = {"G", "H", "I", "J", "K", "L", "M"};

    Button enterButton, cancelButton, exitButton;
    Spinner aisleSpinner, levelSpinner, locationSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_stock);

        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        exitButton = (Button)findViewById(R.id.exitButton);

        aisleSpinner = (Spinner)findViewById(R.id.aisleSpinner);
        levelSpinner = (Spinner)findViewById(R.id.levelSpinner);
        locationSpinner = (Spinner)findViewById(R.id.locationSpinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, aisles);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        aisleSpinner.setAdapter(adapter);

        ArrayAdapter<String> adapterA = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.levels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        levelSpinner.setAdapter(adapterA);

        ArrayAdapter<Integer> adapterB = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, MainActivity.locations);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        locationSpinner.setAdapter(adapterB);

        enterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String aisle = aisleSpinner.getSelectedItem().toString();
                final String level = levelSpinner.getSelectedItem().toString();
                final Integer location = (Integer) locationSpinner.getSelectedItem();

                //Code for if the pallet is located in aisle G
                // Firstly we check which Aisle the Pallet to be removed is located in.
                if(aisle.equals("G")) {
                    // Now we check that the location is not already empty
                    if(!MainActivity.aisleG.getLevel(level)[location].getName().equals("Empty")) {
                        // Alert dialog box to check that the details of the pallet to be
                        // removed
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(RemoveStock.this);
                        // The message presented to the user contains the details of the pallet
                        // to be removed
                        alertDialog.setMessage("Do you want to remove this pallet?" + "\n" +
                                MainActivity.aisleG.getLevel(level)[location].getName() + "\n" +
                                MainActivity.aisleG.getLevel(level)[location].getQuantity());
                        alertDialog.setTitle("Confirm");

                        alertDialog.setCancelable(false);
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            // If the user select Yes then the pallet is removed from the stock file
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(RemoveStock.this, "Pallet details confirmed.", Toast.LENGTH_SHORT).show();
                                MainActivity.aisleG.getLevel(level)[location] = MainActivity.emptyPallet;
                                // Update activity log
                                Date date = new Date();
                                String removeStockG = "User " + MainActivity.currentUser + " removed Stock item from location "
                                        + Integer.toString(location) + " on " + date.toString();
                                MainActivity.activityLog.add(removeStockG);
                                Toast.makeText(RemoveStock.this, "Pallet removed.", Toast.LENGTH_LONG).show();
                                Intent findMove = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                                startActivity(findMove);

                            }
                        });
                        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(RemoveStock.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                        AlertDialog alert = alertDialog.create();
                        alert.show();
                    }
                }else {
                    // If the location is already empty then we inform the user and return them
                    // to the Add/Remove stock page
                    if(MainActivity.aisleG.getLevel(level)[location].getName().equals("Empty")) {
                        Toast.makeText(RemoveStock.this, "Location empty.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                        startActivity(intent);
                    }
                }
                //Code for if the pallet is located in aisle H
                if(aisle.equals("H")) {
                    // Now we check that the location is not already empty
                    if(!MainActivity.aisleH.getLevel(level)[location].getName().equals("Empty")) {
                        // Alert dialog box to check that the details of the pallet to be
                        // removed
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(RemoveStock.this);

                        alertDialog.setMessage("Do you want to remove this pallet?" + "\n" +
                                MainActivity.aisleH.getLevel(level)[location].getName() + "\n" +
                                MainActivity.aisleH.getLevel(level)[location].getQuantity());
                        alertDialog.setTitle("Confirm");

                        alertDialog.setCancelable(false);
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            // If the user select Yes then the pallet is removed from the stock file
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(RemoveStock.this, "Pallet details confirmed.", Toast.LENGTH_SHORT).show();
                                MainActivity.aisleH.getLevel(level)[location] = MainActivity.emptyPallet;
                                // Update activity log
                                Date date = new Date();
                                String removeStockH = "User " + MainActivity.currentUser + " removed Stock item from location "
                                        + Integer.toString(location) + " on " + date.toString();
                                MainActivity.activityLog.add(removeStockH);
                                Toast.makeText(RemoveStock.this, "Pallet removed.", Toast.LENGTH_LONG).show();
                                Intent findMove = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                                startActivity(findMove);

                            }
                        });
                        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(RemoveStock.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                        AlertDialog alert = alertDialog.create();
                        alert.show();
                    }
                }else {
                    // If the location is already empty then we inform the user and return them
                    // to the Add/Remove stock page
                    if(MainActivity.aisleG.getLevel(level)[location].getName().equals("Empty")) {
                        Toast.makeText(RemoveStock.this, "Location empty.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                        startActivity(intent);
                    }
                }

                //Code for if the pallet is located in aisle I
                if(aisle.equals("I")) {
                    // Now we check that the location is not already empty
                    if(!MainActivity.aisleI.getLevel(level)[location].getName().equals("Empty")) {
                        // Alert dialog box to check that the details of the pallet to be
                        // removed
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(RemoveStock.this);

                        alertDialog.setMessage("Do you want to remove this pallet?" + "\n" +
                                MainActivity.aisleI.getLevel(level)[location].getName() + "\n" +
                                MainActivity.aisleI.getLevel(level)[location].getQuantity());
                        alertDialog.setTitle("Confirm");

                        alertDialog.setCancelable(false);
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            // If the user select Yes then the pallet is removed from the stock file
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(RemoveStock.this, "Pallet details confirmed.", Toast.LENGTH_SHORT).show();
                                MainActivity.aisleI.getLevel(level)[location] = MainActivity.emptyPallet;
                                // Update activity log
                                Date date = new Date();
                                String removeStockI = "User " + MainActivity.currentUser + " removed Stock item from location "
                                        + Integer.toString(location) + " on " + date.toString();
                                MainActivity.activityLog.add(removeStockI);
                                Toast.makeText(RemoveStock.this, "Pallet removed.", Toast.LENGTH_LONG).show();
                                Intent findMove = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                                startActivity(findMove);

                            }
                        });
                        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(RemoveStock.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                        AlertDialog alert = alertDialog.create();
                        alert.show();
                    }
                }else {
                    // If the location is already empty then we inform the user and return them
                    // to the Add/Remove stock page
                    if(MainActivity.aisleG.getLevel(level)[location].getName().equals("Empty")) {
                        Toast.makeText(RemoveStock.this, "Location empty.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                        startActivity(intent);
                    }
                }

                //Code for if the pallet is located in aisle J
                if(aisle.equals("J")) {
                    // Now we check that the location is not already empty
                    if(!MainActivity.aisleJ.getLevel(level)[location].getName().equals("Empty")) {
                        // Alert dialog box to check that the details of the pallet to be
                        // removed
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(RemoveStock.this);

                        alertDialog.setMessage("Do you want to remove this pallet?" + "\n" +
                                MainActivity.aisleJ.getLevel(level)[location].getName() + "\n" +
                                MainActivity.aisleJ.getLevel(level)[location].getQuantity());
                        alertDialog.setTitle("Confirm");

                        alertDialog.setCancelable(false);
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            // If the user select Yes then the pallet is removed from the stock file
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(RemoveStock.this, "Pallet details confirmed.", Toast.LENGTH_SHORT).show();
                                MainActivity.aisleJ.getLevel(level)[location] = MainActivity.emptyPallet;
                                // Update activity log
                                Date date = new Date();
                                String removeStockJ = "User " + MainActivity.currentUser + " removed Stock item from location "
                                        + Integer.toString(location) + " on " + date.toString();
                                MainActivity.activityLog.add(removeStockJ);
                                Toast.makeText(RemoveStock.this, "Pallet removed.", Toast.LENGTH_LONG).show();
                                Intent findMove = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                                startActivity(findMove);

                            }
                        });
                        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(RemoveStock.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                        AlertDialog alert = alertDialog.create();
                        alert.show();
                    }
                }else {
                    // If the location is already empty then we inform the user and return them
                    // to the Add/Remove stock page
                    if(MainActivity.aisleG.getLevel(level)[location].getName().equals("Empty")) {
                        Toast.makeText(RemoveStock.this, "Location empty.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                        startActivity(intent);
                    }
                }

                //Code for if the pallet is located in aisle K
                if(aisle.equals("K")) {
                    // Now we check that the location is not already empty
                    if(!MainActivity.aisleK.getLevel(level)[location].getName().equals("Empty")) {
                        // Alert dialog box to check that the details of the pallet to be
                        // removed
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(RemoveStock.this);

                        alertDialog.setMessage("Do you want to remove this pallet?" + "\n" +
                                MainActivity.aisleK.getLevel(level)[location].getName() + "\n" +
                                MainActivity.aisleK.getLevel(level)[location].getQuantity());
                        alertDialog.setTitle("Confirm");

                        alertDialog.setCancelable(false);
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            // If the user select Yes then the pallet is removed from the stock file
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(RemoveStock.this, "Pallet details confirmed.", Toast.LENGTH_SHORT).show();
                                MainActivity.aisleK.getLevel(level)[location] = MainActivity.emptyPallet;
                                // Update activity log
                                Date date = new Date();
                                String removeStockK = "User " + MainActivity.currentUser + " removed Stock item from location "
                                        + Integer.toString(location) + " on " + date.toString();
                                MainActivity.activityLog.add(removeStockK);
                                Toast.makeText(RemoveStock.this, "Pallet removed.", Toast.LENGTH_LONG).show();
                                Intent findMove = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                                startActivity(findMove);

                            }
                        });
                        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(RemoveStock.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                        AlertDialog alert = alertDialog.create();
                        alert.show();
                    }
                }else {
                    // If the location is already empty then we inform the user and return them
                    // to the Add/Remove stock page
                    if(MainActivity.aisleG.getLevel(level)[location].getName().equals("Empty")) {
                        Toast.makeText(RemoveStock.this, "Location empty.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                        startActivity(intent);
                    }
                }

                //Code for if the pallet is located in aisle L
                if(aisle.equals("L")) {
                    // Now we check that the location is not already empty
                    if(!MainActivity.aisleL.getLevel(level)[location].getName().equals("Empty")) {
                        // Alert dialog box to check that the details of the pallet to be
                        // removed
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(RemoveStock.this);

                        alertDialog.setMessage("Do you want to remove this pallet?" + "\n" +
                                MainActivity.aisleL.getLevel(level)[location].getName() + "\n" +
                                MainActivity.aisleL.getLevel(level)[location].getQuantity());
                        alertDialog.setTitle("Confirm");

                        alertDialog.setCancelable(false);
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            // If the user select Yes then the pallet is removed from the stock file
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(RemoveStock.this, "Pallet details confirmed.", Toast.LENGTH_SHORT).show();
                                MainActivity.aisleL.getLevel(level)[location] = MainActivity.emptyPallet;
                                // Update activity log
                                Date date = new Date();
                                String removeStockL = "User " + MainActivity.currentUser + " removed Stock item from location "
                                        + Integer.toString(location) + " on " + date.toString();
                                MainActivity.activityLog.add(removeStockL);
                                Toast.makeText(RemoveStock.this, "Pallet removed.", Toast.LENGTH_LONG).show();
                                Intent findMove = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                                startActivity(findMove);

                            }
                        });
                        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(RemoveStock.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                        AlertDialog alert = alertDialog.create();
                        alert.show();
                    }
                }else {
                    // If the location is already empty then we inform the user and return them
                    // to the Add/Remove stock page
                    if(MainActivity.aisleG.getLevel(level)[location].getName().equals("Empty")) {
                        Toast.makeText(RemoveStock.this, "Location empty.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                        startActivity(intent);
                    }
                }

                //Code for if the pallet is located in aisle M
                if(aisle.equals("M")) {
                    // Now we check that the location is not already empty
                    if(!MainActivity.aisleM.getLevel(level)[location].getName().equals("Empty")) {
                        // Alert dialog box to check that the details of the pallet to be
                        // removed
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(RemoveStock.this);

                        alertDialog.setMessage("Do you want to remove this pallet?" + "\n" +
                                MainActivity.aisleM.getLevel(level)[location].getName() + "\n" +
                                MainActivity.aisleM.getLevel(level)[location].getQuantity());
                        alertDialog.setTitle("Confirm");

                        alertDialog.setCancelable(false);
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            // If the user select Yes then the pallet is removed from the stock file
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(RemoveStock.this, "Pallet details confirmed.", Toast.LENGTH_SHORT).show();
                                MainActivity.aisleM.getLevel(level)[location] = MainActivity.emptyPallet;
                                // Update activity log
                                Date date = new Date();
                                String removeStockM = "User " + MainActivity.currentUser + " removed Stock item from location "
                                        + Integer.toString(location) + " on " + date.toString();
                                MainActivity.activityLog.add(removeStockM);
                                Toast.makeText(RemoveStock.this, "Pallet removed.", Toast.LENGTH_LONG).show();
                                Intent findMove = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                                startActivity(findMove);

                            }
                        });
                        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(RemoveStock.this, "Details incorrect", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                        AlertDialog alert = alertDialog.create();
                        alert.show();
                    }
                }else {
                    // If the location is already empty then we inform the user and return them
                    // to the Add/Remove stock page
                    if(MainActivity.aisleG.getLevel(level)[location].getName().equals("Empty")) {
                        Toast.makeText(RemoveStock.this, "Location empty.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                        startActivity(intent);
                    }
                }

            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent findMove = new Intent("com.example.ianle.warehousestockcontrolapp.AddRemoveStock");
                startActivity(findMove);
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(intent);
            }
        });
    }
}
