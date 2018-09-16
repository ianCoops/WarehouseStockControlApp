package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class EditStock_J extends AppCompatActivity {

    Button helpButton;
    TableLayout editStockTableJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_stock__j);

        helpButton = (Button)findViewById(R.id.helpButton);
        editStockTableJ = (TableLayout)findViewById(R.id.editStockTableJ);

        try{
            for(int i = 2, j = AisleJ_Check.stockCheckTableJ.getChildCount(); i < j; i++){
                TableRow tempRow = (TableRow)AisleJ_Check.stockCheckTableJ.getChildAt(i);
                final TableRow row = new TableRow(this);
                row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
                final EditText aisle = new EditText(this);
                final EditText level = new EditText(this);
                final EditText location = new EditText(this);
                final EditText customer = new EditText(this);
                final EditText boxes = new EditText(this);
                final Button okButton = new Button(this);
                // Get aisle data from stockCheckTable and add to the new
                // table.
                aisle.setLayoutParams(new TableRow.LayoutParams(0));
                TextView textView = (TextView)tempRow.getChildAt(0);
                aisle.setText(textView.getText().toString());
                aisle.setGravity(Gravity.CENTER);
                aisle.setTextSize(18);
                aisle.setWidth(94);
                aisle.setTextColor(Color.parseColor("#000000"));
                // Get level data
                level.setLayoutParams(new TableRow.LayoutParams(1));
                TextView textView2 = (TextView)tempRow.getChildAt(1);
                level.setText(textView2.getText().toString());
                level.setGravity(Gravity.CENTER);
                level.setTextSize(18);
                level.setWidth(94);
                level.setTextColor(Color.parseColor("#000000"));
                // Get location data
                location.setLayoutParams(new TableRow.LayoutParams(2));
                TextView textView3 = (TextView)tempRow.getChildAt(2);
                location.setText(textView3.getText().toString());
                location.setGravity(Gravity.CENTER);
                location.setTextSize(18);
                location.setWidth(94);
                location.setTextColor(Color.parseColor("#000000"));
                // Get customer data
                customer.setLayoutParams(new TableRow.LayoutParams(3));
                TextView textView4 = (TextView)tempRow.getChildAt(3);
                customer.setText(textView4.getText().toString());
                customer.setGravity(Gravity.CENTER);
                customer.setTextSize(18);
                customer.setWidth(94);
                customer.setTextColor(Color.parseColor("#000000"));
                // Get box quantity data
                boxes.setLayoutParams(new TableRow.LayoutParams(4));
                TextView textView5 = (TextView)tempRow.getChildAt(4);
                boxes.setText(textView5.getText().toString());
                boxes.setGravity(Gravity.CENTER);
                boxes.setTextSize(18);
                boxes.setWidth(94);
                boxes.setTextColor(Color.parseColor("#000000"));
                // Add a button to allow the user to confirm the new pallet and
                // location details and then removing the row from the list
                okButton.setLayoutParams(new TableRow.LayoutParams(5));
                okButton.setText("OK");
                okButton.setGravity(Gravity.CENTER);
                okButton.setTextSize(18);
                // Add functionality to the button
                // When clicked the new details will be added to the
                // stock file
                okButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // If new stock details need to be located in aisle J
                        if(aisle.getText().toString().equals("J")){
                            int box = Integer.parseInt(boxes.getText().toString());
                            int loc = Integer.parseInt(location.getText().toString());
                            Date date = new Date();
                            Pallet tempPallet = new Pallet(customer.getText().toString(), box, date);
                            MainActivity.aisleJ.getLevel(level.toString())[loc] = tempPallet;
                            // Update activity log
                            Date date2 = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                            String strDate = dateFormat.format(date2);
                            String added = "User " + MainActivity.currentUser + " updated the Stock File - "
                                    + " for Aisle " + "J" + " on " + strDate;
                            MainActivity.activityLog.add(added);
                            Toast.makeText(getApplicationContext(), "Stock item corrected", Toast.LENGTH_SHORT).show();
                            editStockTableJ.removeView(row);
                        }


                    }
                });

                // Add data to new table layout
                row.addView(aisle);
                row.addView(level);
                row.addView(location);
                row.addView(customer);
                row.addView(boxes);
                row.addView(okButton);
                editStockTableJ.addView(row);
            }

            helpButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(EditStock_J.this);
                    builder.setTitle("Information");
                    builder.setMessage("Please edit the information in the table" + "\n"
                            + "to reflect the stock in the location." + "\n"
                            + "Click on data that is incorrect and enter" + "\n"
                            + "the correct data." + "\n"
                            + "When you are happy that the stock file is correct" + "\n"
                            + "please press OK.");
                    builder.setPositiveButton("OK", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            });

        }catch (NullPointerException n){
            Toast.makeText(EditStock_J.this, "System error", Toast.LENGTH_LONG).show();
            Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
            startActivity(mainMenu);
        }
    }
}
