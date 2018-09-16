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

public class EmptyLocations extends AppCompatActivity {

    Button exitButton;
    static TableLayout emptyLocationsTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_locations);

        exitButton = (Button)findViewById(R.id.exitButton);

        emptyLocationsTable = (TableLayout)findViewById(R.id.emptyLocationsTable);
        emptyLocationsTable.setStretchAllColumns(true);


        try{
            // Iterate over all levels of Aisle G
            // and display all the empty locations.
            for(String level : MainActivity.levels) {
                for (int i = 1; i < MainActivity.aisleG.getLevel(level).length; i++) {
                    if (MainActivity.aisleG.getLevel(level)[i].getName().equals("Empty")) {
                        final TableRow row = new TableRow(this);
                        row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));
                        TextView aisle = new TextView(this);
                        TextView tempLevel = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(0));
                        aisle.setText(MainActivity.aisleG.getID());
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
                        customer.setText(MainActivity.aisleG.getLevel(level)[i].getName());
                        customer.setGravity(Gravity.CENTER);
                        customer.setTextSize(18);
                        customer.setWidth(94);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(4));
                        boxes.setText(String.valueOf(MainActivity.aisleG.getLevel(level)[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER);
                        boxes.setTextSize(18);
                        boxes.setWidth(94);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(tempLevel);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        emptyLocationsTable.addView(row, new TableLayout.LayoutParams(
                                TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

                    }
                }
            }

            // Search Aisle H
            for(String level : MainActivity.levels) {
                for (int i = 1; i < MainActivity.aisleH.getLevel(level).length; i++) {
                    if (MainActivity.aisleH.getLevel(level)[i].getName().equals("Empty")) {
                        final TableRow row = new TableRow(this);
                        row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));
                        TextView aisle = new TextView(this);
                        TextView tempLevel = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(0));
                        aisle.setText(MainActivity.aisleH.getID());
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
                        customer.setText(MainActivity.aisleH.getLevel(level)[i].getName());
                        customer.setGravity(Gravity.CENTER);
                        customer.setTextSize(18);
                        customer.setWidth(94);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(4));
                        boxes.setText(String.valueOf(MainActivity.aisleH.getLevel(level)[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER);
                        boxes.setTextSize(18);
                        boxes.setWidth(94);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(tempLevel);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        emptyLocationsTable.addView(row, new TableLayout.LayoutParams(
                                TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

                    }
                }
            }

            // Search Aisle I
            for(String level : MainActivity.levels) {
                for (int i = 1; i < MainActivity.aisleI.getLevel(level).length; i++) {
                    if (MainActivity.aisleI.getLevel(level)[i].getName().equals("Empty")) {
                        final TableRow row = new TableRow(this);
                        row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));
                        TextView aisle = new TextView(this);
                        TextView tempLevel = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
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
                        row.addView(aisle);
                        row.addView(tempLevel);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        emptyLocationsTable.addView(row, new TableLayout.LayoutParams(
                                TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

                    }
                }
            }

            // Search Aisle J
            for(String level : MainActivity.levels) {
                for (int i = 1; i < MainActivity.aisleJ.getLevel(level).length; i++) {
                    if (MainActivity.aisleJ.getLevel(level)[i].getName().equals("Empty")) {
                        final TableRow row = new TableRow(this);
                        row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));
                        TextView aisle = new TextView(this);
                        TextView tempLevel = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(0));
                        aisle.setText(MainActivity.aisleJ.getID());
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
                        customer.setText(MainActivity.aisleJ.getLevel(level)[i].getName());
                        customer.setGravity(Gravity.CENTER);
                        customer.setTextSize(18);
                        customer.setWidth(94);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(4));
                        boxes.setText(String.valueOf(MainActivity.aisleJ.getLevel(level)[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER);
                        boxes.setTextSize(18);
                        boxes.setWidth(94);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(tempLevel);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        emptyLocationsTable.addView(row, new TableLayout.LayoutParams(
                                TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

                    }
                }
            }

            // Search Aisle K
            for(String level : MainActivity.levels) {
                for (int i = 1; i < MainActivity.aisleK.getLevel(level).length; i++) {
                    if (MainActivity.aisleK.getLevel(level)[i].getName().equals("Empty")) {
                        final TableRow row = new TableRow(this);
                        row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));
                        TextView aisle = new TextView(this);
                        TextView tempLevel = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(0));
                        aisle.setText(MainActivity.aisleK.getID());
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
                        customer.setText(MainActivity.aisleK.getLevel(level)[i].getName());
                        customer.setGravity(Gravity.CENTER);
                        customer.setTextSize(18);
                        customer.setWidth(94);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(4));
                        boxes.setText(String.valueOf(MainActivity.aisleK.getLevel(level)[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER);
                        boxes.setTextSize(18);
                        boxes.setWidth(94);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(tempLevel);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        emptyLocationsTable.addView(row, new TableLayout.LayoutParams(
                                TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

                    }
                }
            }

            //Search Aisle L
            for(String level : MainActivity.levels) {
                for (int i = 1; i < MainActivity.aisleL.getLevel(level).length; i++) {
                    if (MainActivity.aisleL.getLevel(level)[i].getName().equals("Empty")) {
                        final TableRow row = new TableRow(this);
                        row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));
                        TextView aisle = new TextView(this);
                        TextView tempLevel = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(0));
                        aisle.setText(MainActivity.aisleL.getID());
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
                        customer.setText(MainActivity.aisleL.getLevel(level)[i].getName());
                        customer.setGravity(Gravity.CENTER);
                        customer.setTextSize(18);
                        customer.setWidth(94);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(4));
                        boxes.setText(String.valueOf(MainActivity.aisleL.getLevel(level)[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER);
                        boxes.setTextSize(18);
                        boxes.setWidth(94);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(tempLevel);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        emptyLocationsTable.addView(row, new TableLayout.LayoutParams(
                                TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

                    }
                }
            }

            // Search Aisle M
            for(String level : MainActivity.levels) {
                for (int i = 1; i < MainActivity.aisleM.getLevel(level).length; i++) {
                    if (MainActivity.aisleM.getLevel(level)[i].getName().equals("Empty")) {
                        final TableRow row = new TableRow(this);
                        row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));
                        TextView aisle = new TextView(this);
                        TextView tempLevel = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(0));
                        aisle.setText(MainActivity.aisleM.getID());
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
                        customer.setText(MainActivity.aisleM.getLevel(level)[i].getName());
                        customer.setGravity(Gravity.CENTER);
                        customer.setTextSize(18);
                        customer.setWidth(94);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(4));
                        boxes.setText(String.valueOf(MainActivity.aisleM.getLevel(level)[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER);
                        boxes.setTextSize(18);
                        boxes.setWidth(94);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(tempLevel);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        emptyLocationsTable.addView(row, new TableLayout.LayoutParams(
                                TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

                    }
                }
            }

            exitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                    startActivity(mainMenu);
                }
            });


        }catch (NullPointerException n){
            Toast.makeText(EmptyLocations.this, "System error", Toast.LENGTH_LONG).show();
        }
    }
}
