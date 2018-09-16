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
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/**
 * Activity to add a new Administrator to the list of
 * registered Administrators.
 */

public class addAdmin extends AppCompatActivity {
    // Data store for registered administrators
    public static Map<String, Administrator> administratorMap = new HashMap<String, Administrator>();
    // Button and EditText variable declared for access within method
    Button enterButton, cancelButton;
    EditText nameInputBox, idInputBox, passwordInputBox;
    // Method for adding a new Administrator to the system
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_admin);
        // Accessing the widgets from the addAdmin page so that they
        // can accessed within the method call
        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        nameInputBox = (EditText)findViewById(R.id.nameInputBox);
        idInputBox = (EditText)findViewById(R.id.idInputBox);
        passwordInputBox = (EditText)findViewById(R.id.passwordInputBox);
        // Adding a listener to the enter button
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = nameInputBox.getText().toString();
                final String id = idInputBox.getText().toString();
                final String password = passwordInputBox.getText().toString();
                // Using and alert dialog box to get user confirmation of the details
                // entered in the EditText boxes
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(addAdmin.this);

                alertDialog.setMessage("Are the details correct?" + "\n" +
                        name + "\n" +
                        id + "\n" +
                        password);
                alertDialog.setTitle("Confirm");

                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(addAdmin.this, "Details accepted", Toast.LENGTH_SHORT).show();
                        Administrator newAdmin = new Administrator(name, id, password);
                        // Adding the new user to the list of registered user's stored in the
                        // Map of users
                        if (!administratorMap.containsKey(id)) {
                            administratorMap.put(id, newAdmin);
                            // Adding the password for the new user to the Map declared in
                            // adminLogIn class/activity
                            adminLogIn.adminPasswords.put(id, password);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String adminAdded = "User " + MainActivity.currentUser + " added administrator "
                                    + id + " to the system on " + strDate;
                            MainActivity.activityLog.add(adminAdded);
                            // Notifying the user if the task has been successful
                            Toast.makeText(addAdmin.this, "User added", Toast.LENGTH_SHORT).show();
                            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                            startActivity(mainMenu);
                        }else{
                            // Notifying the user if the task has been unsuccessful
                            Toast.makeText(addAdmin.this, "User not added", Toast.LENGTH_SHORT).show();
                            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                            startActivity(mainMenu);
                        }

                    }
                });
                // If the details are incorrect the user is returned to enter
                // details form
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                   public void onClick(DialogInterface dialog, int id){
                       Toast.makeText(addAdmin.this, "Details incorrect", Toast.LENGTH_SHORT).show();
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

