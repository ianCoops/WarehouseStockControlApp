package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
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

public class DisplayPickList extends AppCompatActivity {

    // Declare the Class variables
    Button exitButton, finishButton;
    static TableLayout pickListTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pick_list);
        // Find the buttons via their id tags
        exitButton = (Button)findViewById(R.id.exitButton);
        finishButton = (Button)findViewById(R.id.finishButton);
        // Find the TableLayout
        pickListTable = (TableLayout)findViewById(R.id.pickListTable);
        pickListTable.setStretchAllColumns(true);

        // Catch the possible null pointer exception
        try{
            // Here we need the Pick List to be the desired size as
            // stipulated by the user.
            // The size of the Picklist is determined by the Child count of the
            // Table Layout. Which has 2 to begin with before any more rows are
            // added.
            while(pickListTable.getChildCount() != PickList.quantity + 2){
                // Now we iterate over each aisle in turn until the PickList is
                // of the desired length.
                // We iterate over aisle G first
                for(String level : MainActivity.levels) {
                    for (int i = 1; i < MainActivity.aisleG.getLevel(level).length; i++) {
                        if (PickList.customer.equals(MainActivity.aisleG.getLevel(level)[i].getName())) {
                            final int j = i;
                            final String levelA = level;
                            // Here we create the TableRow to be added to the Table Layout if the
                            // desired customer is found.
                            final TableRow row = new TableRow(this);
                            row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                    ViewGroup.LayoutParams.MATCH_PARENT));
                            // We declare the type of view to be added with each new row.
                            TextView aisle = new TextView(this);
                            TextView tempLevel = new TextView(this);
                            final TextView location = new TextView(this);
                            TextView customer = new TextView(this);
                            TextView boxes = new TextView(this);
                            final Button picked = new Button(this);
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
                            picked.setLayoutParams(new TableRow.LayoutParams(5));
                            picked.setText("Yes");
                            picked.setGravity(Gravity.CENTER);
                            picked.setTextSize(18);
                            picked.setTextColor(Color.parseColor("#000000"));
                            picked.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    MainActivity.aisleG.getLevel(levelA)[j] = MainActivity.emptyPallet;
                                    Toast.makeText(getApplicationContext(), "Pallet picked and removed from Stock file",
                                            Toast.LENGTH_SHORT).show();
                                    pickListTable.removeView(row);
                                }
                            });
                            // Here we add the various views to the TableRow
                            row.addView(aisle);
                            row.addView(tempLevel);
                            row.addView(location);
                            row.addView(customer);
                            row.addView(boxes);
                            row.addView(picked);
                            // And then we add the row to the Table Layout.
                            pickListTable.addView(row, new TableLayout.LayoutParams(
                                    TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));


                        }
                    }
                }
                // If the PickList is still not long enough then we move onto
                // aisle H.
                for(final String level : MainActivity.levels) {
                    for (int i = 1; i < MainActivity.aisleH.getLevel(level).length; i++) {
                        if (PickList.customer.equals(MainActivity.aisleH.getLevel(level)[i].getName())) {
                            final int j = i;
                            final TableRow row = new TableRow(this);
                            row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                    ViewGroup.LayoutParams.MATCH_PARENT));
                            TextView aisle = new TextView(this);
                            TextView tempLevel = new TextView(this);
                            final TextView location = new TextView(this);
                            TextView customer = new TextView(this);
                            TextView boxes = new TextView(this);
                            final Button picked = new Button(this);
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
                            picked.setLayoutParams(new TableRow.LayoutParams(5));
                            picked.setText("Yes");
                            picked.setGravity(Gravity.CENTER);
                            picked.setTextSize(18);
                            picked.setTextColor(Color.parseColor("#000000"));
                            picked.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    MainActivity.aisleH.getLevel(level)[j] = MainActivity.emptyPallet;
                                    Toast.makeText(getApplicationContext(), "Pallet picked and removed from Stock file",
                                            Toast.LENGTH_SHORT).show();
                                    pickListTable.removeView(row);
                                }
                            });
                            row.addView(aisle);
                            row.addView(tempLevel);
                            row.addView(location);
                            row.addView(customer);
                            row.addView(boxes);
                            row.addView(picked);
                            pickListTable.addView(row, new TableLayout.LayoutParams(
                                    TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));


                        }
                    }
                }
                // Aisle I
                for(final String level : MainActivity.levels) {
                    for (int i = 1; i < MainActivity.aisleI.getLevel(level).length; i++) {
                        if (PickList.customer.equals(MainActivity.aisleI.getLevel(level)[i].getName())) {
                            final int j = i;
                            final TableRow row = new TableRow(this);
                            row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                    ViewGroup.LayoutParams.MATCH_PARENT));
                            TextView aisle = new TextView(this);
                            TextView tempLevel = new TextView(this);
                            final TextView location = new TextView(this);
                            TextView customer = new TextView(this);
                            TextView boxes = new TextView(this);
                            final Button picked = new Button(this);
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
                            picked.setLayoutParams(new TableRow.LayoutParams(5));
                            picked.setText("Yes");
                            picked.setGravity(Gravity.CENTER);
                            picked.setTextSize(18);
                            picked.setTextColor(Color.parseColor("#000000"));
                            picked.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    MainActivity.aisleI.getLevel(level)[j] = MainActivity.emptyPallet;
                                    Toast.makeText(getApplicationContext(), "Pallet picked and removed from Stock file",
                                            Toast.LENGTH_SHORT).show();
                                    pickListTable.removeView(row);
                                }
                            });
                            row.addView(aisle);
                            row.addView(tempLevel);
                            row.addView(location);
                            row.addView(customer);
                            row.addView(boxes);
                            row.addView(picked);
                            pickListTable.addView(row, new TableLayout.LayoutParams(
                                    TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));


                        }
                    }
                }
                // Aisle J
                for(final String level : MainActivity.levels) {
                    for (int i = 1; i < MainActivity.aisleJ.getLevel(level).length; i++) {
                        if (PickList.customer.equals(MainActivity.aisleJ.getLevel(level)[i].getName())) {
                            final int j = i;
                            final TableRow row = new TableRow(this);
                            row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                    ViewGroup.LayoutParams.MATCH_PARENT));
                            TextView aisle = new TextView(this);
                            TextView tempLevel = new TextView(this);
                            final TextView location = new TextView(this);
                            TextView customer = new TextView(this);
                            TextView boxes = new TextView(this);
                            final Button picked = new Button(this);
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
                            picked.setLayoutParams(new TableRow.LayoutParams(5));
                            picked.setText("Yes");
                            picked.setGravity(Gravity.CENTER);
                            picked.setTextSize(18);
                            picked.setTextColor(Color.parseColor("#000000"));
                            picked.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    MainActivity.aisleJ.getLevel(level)[j] = MainActivity.emptyPallet;
                                    Toast.makeText(getApplicationContext(), "Pallet picked and removed from Stock file",
                                            Toast.LENGTH_SHORT).show();
                                    pickListTable.removeView(row);
                                }
                            });
                            row.addView(aisle);
                            row.addView(tempLevel);
                            row.addView(location);
                            row.addView(customer);
                            row.addView(boxes);
                            row.addView(picked);
                            pickListTable.addView(row, new TableLayout.LayoutParams(
                                    TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));


                        }
                    }
                }
                // Aisle K
                for(final String level : MainActivity.levels) {
                    for (int i = 1; i < MainActivity.aisleK.getLevel(level).length; i++) {
                        if (PickList.customer.equals(MainActivity.aisleK.getLevel(level)[i].getName())) {
                            final int j = i;
                            final TableRow row = new TableRow(this);
                            row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                    ViewGroup.LayoutParams.MATCH_PARENT));
                            TextView aisle = new TextView(this);
                            TextView tempLevel = new TextView(this);
                            final TextView location = new TextView(this);
                            TextView customer = new TextView(this);
                            TextView boxes = new TextView(this);
                            final Button picked = new Button(this);
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
                            picked.setLayoutParams(new TableRow.LayoutParams(5));
                            picked.setText("Yes");
                            picked.setGravity(Gravity.CENTER);
                            picked.setTextSize(18);
                            picked.setTextColor(Color.parseColor("#000000"));
                            picked.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    MainActivity.aisleK.getLevel(level)[j] = MainActivity.emptyPallet;
                                    Toast.makeText(getApplicationContext(), "Pallet picked and removed from Stock file",
                                            Toast.LENGTH_SHORT).show();
                                    pickListTable.removeView(row);
                                }
                            });
                            row.addView(aisle);
                            row.addView(tempLevel);
                            row.addView(location);
                            row.addView(customer);
                            row.addView(boxes);
                            row.addView(picked);
                            pickListTable.addView(row, new TableLayout.LayoutParams(
                                    TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));


                        }
                    }
                }
                // Aisle L
                for(final String level : MainActivity.levels) {
                    for (int i = 1; i < MainActivity.aisleL.getLevel(level).length; i++) {
                        if (PickList.customer.equals(MainActivity.aisleL.getLevel(level)[i].getName())) {
                            final int j = i;
                            final TableRow row = new TableRow(this);
                            row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                    ViewGroup.LayoutParams.MATCH_PARENT));
                            TextView aisle = new TextView(this);
                            TextView tempLevel = new TextView(this);
                            final TextView location = new TextView(this);
                            TextView customer = new TextView(this);
                            TextView boxes = new TextView(this);
                            final Button picked = new Button(this);
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
                            picked.setLayoutParams(new TableRow.LayoutParams(5));
                            picked.setText("Yes");
                            picked.setGravity(Gravity.CENTER);
                            picked.setTextSize(18);
                            picked.setTextColor(Color.parseColor("#000000"));
                            picked.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    MainActivity.aisleL.getLevel(level)[j] = MainActivity.emptyPallet;
                                    Toast.makeText(getApplicationContext(), "Pallet picked and removed from Stock file",
                                            Toast.LENGTH_SHORT).show();
                                    pickListTable.removeView(row);
                                }
                            });
                            row.addView(aisle);
                            row.addView(tempLevel);
                            row.addView(location);
                            row.addView(customer);
                            row.addView(boxes);
                            row.addView(picked);
                            pickListTable.addView(row, new TableLayout.LayoutParams(
                                    TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));


                        }
                    }
                }
                // Aisle M
                for(final String level : MainActivity.levels) {
                    for (int i = 1; i < MainActivity.aisleM.getLevel(level).length; i++) {
                        if (PickList.customer.equals(MainActivity.aisleM.getLevel(level)[i].getName())) {
                            final int j = i;
                            final TableRow row = new TableRow(this);
                            row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                    ViewGroup.LayoutParams.MATCH_PARENT));
                            TextView aisle = new TextView(this);
                            TextView tempLevel = new TextView(this);
                            final TextView location = new TextView(this);
                            TextView customer = new TextView(this);
                            TextView boxes = new TextView(this);
                            final Button picked = new Button(this);
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
                            picked.setLayoutParams(new TableRow.LayoutParams(5));
                            picked.setText("Yes");
                            picked.setGravity(Gravity.CENTER);
                            picked.setTextSize(18);
                            picked.setTextColor(Color.parseColor("#000000"));
                            picked.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    MainActivity.aisleM.getLevel(level)[j] = MainActivity.emptyPallet;
                                    Toast.makeText(getApplicationContext(), "Pallet picked and removed from Stock file",
                                            Toast.LENGTH_SHORT).show();
                                    pickListTable.removeView(row);
                                }
                            });
                            row.addView(aisle);
                            row.addView(tempLevel);
                            row.addView(location);
                            row.addView(customer);
                            row.addView(boxes);
                            row.addView(picked);
                            pickListTable.addView(row, new TableLayout.LayoutParams(
                                    TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));


                        }
                    }
                }

            }

        // Add functionality the finsh button
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(mainMenu);
            }
        });
        // Add functionality to the exit button.
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(mainMenu);
            }
        });
        // Here we catch the Null Pointer Exception if it is thrown.
        }catch (NullPointerException n){
            Toast.makeText(getApplicationContext(), "Location(s) may be empty. System error", Toast.LENGTH_SHORT).show();
            Intent error = new Intent("com.example.ianle.warehousestockcontrolapp.StockRepor");
            startActivity(error);
        }
    }
}
