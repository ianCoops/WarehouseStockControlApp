package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class AisleI_Check extends AppCompatActivity {

    Button exitButton, finishButton;
    static TableLayout stockCheckTableI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aisle_i__check);

        exitButton = (Button)findViewById(R.id.exitButton);
        finishButton = (Button)findViewById(R.id.finishButton);

        stockCheckTableI = (TableLayout)findViewById(R.id.stockCheckTableI);
        stockCheckTableI.setStretchAllColumns(true);


        try{
            // Iterate over all levels of Aisle I
            // and display all stock items and locations
            for(String level : MainActivity.levels){
                for(int i = 1; i < MainActivity.aisleI.getLevel(level).length; i++){
                    final TableRow row = new TableRow(this);
                    row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT));
                    TextView aisle = new TextView(this);
                    TextView tempLevel = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    final CheckBox check = new CheckBox(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(0));
                    aisle.setText(MainActivity.aisleI.getID());
                    aisle.setGravity(Gravity.CENTER);
                    aisle.setTextSize(18);
                    aisle.setWidth(94);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    tempLevel.setLayoutParams(new TableRow.LayoutParams(1));
                    tempLevel.setText(level);
                    tempLevel.setGravity(Gravity.CENTER);
                    tempLevel.setTextSize(18);
                    tempLevel.setWidth(94);
                    tempLevel.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(2));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER);
                    location.setTextSize(18);
                    location.setWidth(94);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(3));
                    customer.setText(MainActivity.aisleI.getLevel(level)[i].getName());
                    customer.setGravity(Gravity.CENTER);
                    customer.setTextSize(18);
                    customer.setWidth(94);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(4));
                    boxes.setText(String.valueOf(MainActivity.aisleI.getLevel(level)[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER);
                    boxes.setTextSize(18);
                    boxes.setWidth(94);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    check.setLayoutParams(new TableRow.LayoutParams(5));
                    check.setText("Yes");
                    check.setGravity(Gravity.CENTER);
                    check.setTextSize(18);
                    check.setTextColor(Color.parseColor("#000000"));
                    check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                            if(check.isChecked()){
                                Toast.makeText(getApplicationContext(), "Location checked. Stock Item correct.",
                                        Toast.LENGTH_SHORT).show();
                                stockCheckTableI.removeView(row);
                            }
                        }
                    });
                    row.addView(aisle);
                    row.addView(tempLevel);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    row.addView(check);
                    stockCheckTableI.addView(row, new TableLayout.LayoutParams(
                            TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

                }
            }

            finishButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(stockCheckTableI.getChildCount() != 0){
                        Toast.makeText(getApplicationContext(), "Stock check finished. Loading finds page.", Toast.LENGTH_LONG).show();
                        Intent finds = new Intent("com.example.ianle.warehousestockcontrolapp.EditStock_I");
                        startActivity(finds);
                    }else{
                        // Update activity log
                        Date date = new Date();
                        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
                        String strDate = dateFormat.format(date);
                        String added = "User " + MainActivity.currentUser + " Stock checked aisle - "
                                + "I" + " on " + strDate;
                        MainActivity.activityLog.add(added);
                        Toast.makeText(getApplicationContext(), "Stock check complete.", Toast.LENGTH_LONG).show();
                        Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                        startActivity(mainMenu);
                    }
                }
            });

            exitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                    startActivity(mainMenu);
                }
            });


        }catch (NullPointerException n){
            Toast.makeText(AisleI_Check.this, "System error", Toast.LENGTH_LONG).show();
        }
    }
}
