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
import java.util.Map;
import java.util.TimeZone;

public class addOperative extends AppCompatActivity {
    // We need to be able to store the details of all operatives.
    // A Map object is perfect for this purpose as it is accessed via
    // key-value pairs
    public static Map<String, Operative> operativeMap = new HashMap<>();
    // Buttons and EditText declared here
    Button enterButton, cancelButton;
    EditText nameInputBox, idInputBox, passwordInputBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_operative);
        // Here we find the Buttons and EditText widgets from the associated
        // layout
        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        nameInputBox = (EditText)findViewById(R.id.nameInputBox);
        idInputBox = (EditText)findViewById(R.id.idInputBox);
        passwordInputBox = (EditText)findViewById(R.id.passwordInputBox);
        // Here we add functionality to the enter button
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = nameInputBox.getText().toString();
                final String id = idInputBox.getText().toString();
                final String password = passwordInputBox.getText().toString();
                // An alert dialog box is used to confirm user input
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(addOperative.this);

                alertDialog.setMessage("Are the details correct?" + "\n" +
                        name + "\n" +
                        id + "\n" +
                        password);
                alertDialog.setTitle("Confirm");

                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        Toast.makeText(addOperative.this, "Details accepted", Toast.LENGTH_SHORT).show();
                        Operative newOperative = new Operative(name, id, password);
                        // If the Operative is not already registered on the system then the
                        // new user is added. And the activity log is updated.
                        if(!operativeMap.containsKey(id)) {
                            operativeMap.put(id, newOperative);
                            operativeLogIn.operativePasswords.put(id, password);
                            // Update activity log
                            Date date = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date);
                            String added = "User " + MainActivity.currentUser + " added Operative - "
                                    + name + " from the system on " + strDate;
                            MainActivity.activityLog.add(added);
                            Toast.makeText(addOperative.this, "User added", Toast.LENGTH_SHORT).show();
                            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                            startActivity(mainMenu);
                        }else{
                            Toast.makeText(addOperative.this, "User not added", Toast.LENGTH_SHORT).show();
                            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                            startActivity(mainMenu);
                        }

                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Toast.makeText(addOperative.this, "Details incorrect", Toast.LENGTH_SHORT).show();
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
