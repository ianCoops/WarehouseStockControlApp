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

public class RemoveOperative extends AppCompatActivity {
    // Declare Button and EditText variables
    Button enterButton, cancelButton;
    EditText idInputBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_operative);
        // Access Button and EditText widgets to get input from the user
        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.cancelButton);
        idInputBox = (EditText)findViewById(R.id.idInputBox);
        // And action to enter button
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered data from the input box
                final String id = idInputBox.getText().toString();
                // Create the dialog box for entered details confirmation
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(RemoveOperative.this);

                alertDialog.setMessage("Are the details correct?" + "\n" + id);
                alertDialog.setTitle("Confirm");

                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        Toast.makeText(RemoveOperative.this, "Details accepted", Toast.LENGTH_SHORT).show();
                        // Remove the user from the system
                        addOperative.operativeMap.remove(id);
                        // Update Activity log
                        Date date = new Date();
                        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                        String strDate = dateFormat.format(date);
                        String added = "User " + MainActivity.currentUser + " removed Operative "
                                + id + " from the system on " + strDate;
                        MainActivity.activityLog.add(added);
                        // Check that the user has been removed
                        if(!addOperative.operativeMap.containsKey(id)){
                            Toast.makeText(RemoveOperative.this, "User removed", Toast.LENGTH_SHORT).show();
                            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                            startActivity(mainMenu);
                        }
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Toast.makeText(RemoveOperative.this, "Details incorrect", Toast.LENGTH_SHORT).show();
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
