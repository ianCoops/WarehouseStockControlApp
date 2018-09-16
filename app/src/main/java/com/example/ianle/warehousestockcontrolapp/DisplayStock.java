package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayStock extends AppCompatActivity {
    // Declare buttons and TableLayout
    Button finishButton;
    TableLayout customerStockTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_stock);
        // Find button on layout
        finishButton = (Button)findViewById(R.id.finishButton);
        // Find TableLayout from XML layout lage
        customerStockTable = (TableLayout) findViewById(R.id.customerStockTable);
        customerStockTable.setStretchAllColumns(true);

        try {
            // Iterate over level 1A aisle G
            for (int i = 1; i < MainActivity.aisleG.getLevel("level1A").length; i++) {
                // If the Customer entered by the user is in Aisle G then those stock items
                // will be added to the Table as a Tablerow.
                if (MainActivity.aisleG.getLevel("level1A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    // Sets the layout parameters for each Table Row
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    // Declare the type of object in each row
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    // Tells each element which column to sit in
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("G");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level1A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleG.getLevel("level1A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleG.getLevel("level1A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    // Adds each element to the row object
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    // Adds the row object to the Table layout
                    customerStockTable.addView(row);
                }
            }


            // Check aisle G level 1B
            for (int i = 1; i < MainActivity.aisleG.getLevel("level1B").length; i++) {
                if (MainActivity.aisleG.getLevel("level1B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("G");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level1B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleG.getLevel("level1B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleG.getLevel("level1B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle G level 2A
                    for(int i = 1; i < MainActivity.aisleG.getLevel("level2A").length; i++) {
                    if (MainActivity.aisleG.getLevel("level2A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("G");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level2A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleG.getLevel("level2A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleG.getLevel("level2A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }
                    // Check aisle G level 2B
                for(int i = 1; i < MainActivity.aisleG.getLevel("level2B").length; i++) {
                    if (MainActivity.aisleG.getLevel("level2B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("G");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level2B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleG.getLevel("level2B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleG.getLevel("level2B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }
                // Check aisle G level 3A
                for(int i = 1; i < MainActivity.aisleG.getLevel("level3A").length; i++) {
                    if (MainActivity.aisleG.getLevel("level3A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("G");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level3A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleG.getLevel("level3A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleG.getLevel("level3A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }
                // Check aisle G level 3B
                for(int i = 1; i < MainActivity.aisleG.getLevel("level3B").length; i++) {
                    if (MainActivity.aisleG.getLevel("level3B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("G");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level3B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleG.getLevel("level3B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleG.getLevel("level3B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }
                // Check aisle G level 4A
                for(int i = 1; i < MainActivity.aisleG.getLevel("level4A").length; i++) {
                    if (MainActivity.aisleG.getLevel("level4A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("G");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level4A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleG.getLevel("level4A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleG.getLevel("level4A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle G level 4B
                for(int i = 1; i < MainActivity.aisleG.getLevel("level4B").length; i++) {
                    if (MainActivity.aisleG.getLevel("level4B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("G");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level4B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleG.getLevel("level4B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleG.getLevel("level4B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Iterate over all levels and locations of Aisle H
                for(int i = 1; i < MainActivity.aisleH.getLevel("level1A").length; i++) {
                    if (MainActivity.aisleH.getLevel("level1A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("H");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level1A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleH.getLevel("level1A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleH.getLevel("level1A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                    // Check aisle H level 1B
                for(int i = 1; i < MainActivity.aisleH.getLevel("level1B").length; i++) {
                    if (MainActivity.aisleH.getLevel("level1B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("H");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level1B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleH.getLevel("level1B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleH.getLevel("level1B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle H level 2B
                for(int i = 1; i < MainActivity.aisleH.getLevel("level2A").length; i++) {
                    if (MainActivity.aisleH.getLevel("level2A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("H");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level2A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleH.getLevel("level2A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleH.getLevel("level2A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                    // Check aisle H level 2B
                for(int i = 1; i < MainActivity.aisleH.getLevel("level2B").length; i++) {
                    if (MainActivity.aisleH.getLevel("level2B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("H");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level2B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleH.getLevel("level2B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleH.getLevel("level2B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle H level 3A
                for(int i = 1; i < MainActivity.aisleH.getLevel("level3A").length; i++) {
                    if (MainActivity.aisleH.getLevel("level3A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("H");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level3A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleH.getLevel("level3A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleH.getLevel("level3A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle H level 3B
                for(int i = 1; i < MainActivity.aisleH.getLevel("level3B").length; i++) {
                    if (MainActivity.aisleH.getLevel("level3B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("H");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level3B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleH.getLevel("level3B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleH.getLevel("level3B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                    // Check aisle H level 4A
                for(int i = 1; i < MainActivity.aisleH.getLevel("level4A").length; i++) {
                    if (MainActivity.aisleG.getLevel("level4A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("H");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level4A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleH.getLevel("level4A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleH.getLevel("level4A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                    // Check aisle H level 4B
                for(int i = 1; i < MainActivity.aisleH.getLevel("level4B").length; i++) {
                    if (MainActivity.aisleH.getLevel("level4B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("H");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level4B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleH.getLevel("level4B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleH.getLevel("level4B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Iterate over all levels of aisle I
                for(int i = 1; i < MainActivity.aisleI.getLevel("level1A").length; i++) {
                    if (MainActivity.aisleI.getLevel("level1A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("I");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level1A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleI.getLevel("level1A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleI.getLevel("level1A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle I level 1B
                for(int i = 1; i < MainActivity.aisleI.getLevel("level1B").length; i++) {
                    if (MainActivity.aisleI.getLevel("level1B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("I");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level1B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleI.getLevel("level1B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleI.getLevel("level1B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle I level 2A
                for(int i = 1; i < MainActivity.aisleI.getLevel("level2A").length; i++) {
                    if (MainActivity.aisleH.getLevel("level2A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("I");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level2A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleI.getLevel("level2A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleI.getLevel("level2A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle I level 2B
                for(int i = 1; i < MainActivity.aisleI.getLevel("level2B").length; i++) {
                    if (MainActivity.aisleI.getLevel("level2B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("I");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level2B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleI.getLevel("level2B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleI.getLevel("level2B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle I level 3A
                for(int i = 1; i < MainActivity.aisleI.getLevel("level3A").length; i++) {
                    if (MainActivity.aisleI.getLevel("level3A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("I");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level3A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleI.getLevel("level3A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleI.getLevel("level3A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle I level 3B
                for(int i = 1; i < MainActivity.aisleI.getLevel("level3B").length; i++) {
                    if (MainActivity.aisleI.getLevel("level3B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("I");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level3B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleI.getLevel("level3B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleI.getLevel("level3B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle I level 4A
                for(int i = 1; i < MainActivity.aisleI.getLevel("level4A").length; i++) {
                    if (MainActivity.aisleI.getLevel("level4A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("I");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level4A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleI.getLevel("level4A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleI.getLevel("level4A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

            // Check aisle I level 4B
            for(int i = 1; i < MainActivity.aisleI.getLevel("level4B").length; i++){
                if (MainActivity.aisleI.getLevel("level4B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("I");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level4B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleI.getLevel("level4B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleI.getLevel("level4B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Iterate over all levels of aisle J
            for(int i = 1; i < MainActivity.aisleJ.getLevel("level1A").length; i++){
                if (MainActivity.aisleJ.getLevel("level1A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("J");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level1A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleJ.getLevel("level1A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleJ.getLevel("level1A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }
                // Check aisle J level 1B
                for(int i = 1; i < MainActivity.aisleJ.getLevel("level1B").length; i++) {
                    if (MainActivity.aisleJ.getLevel("level1B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("J");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level1B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleJ.getLevel("level1B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleJ.getLevel("level1B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle J level 2A
                for(int i = 1; i < MainActivity.aisleJ.getLevel("level2A").length; i++) {
                    if (MainActivity.aisleJ.getLevel("level2A")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("J");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level2A");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleJ.getLevel("level2A")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleJ.getLevel("level2A")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                // Check aisle J level 2B
                for(int i = 1; i < MainActivity.aisleJ.getLevel("level2B").length; i++) {
                    if (MainActivity.aisleJ.getLevel("level2B")[i].getName().equals(FindStock.findCustomer)) {
                        TableRow row = new TableRow(this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);
                        TextView aisle = new TextView(this);
                        TextView level = new TextView(this);
                        TextView location = new TextView(this);
                        TextView customer = new TextView(this);
                        TextView boxes = new TextView(this);
                        aisle.setLayoutParams(new TableRow.LayoutParams(1));
                        aisle.setText("J");
                        aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                        aisle.setTextSize(18);
                        aisle.setWidth(112);
                        aisle.setTextColor(Color.parseColor("#000000"));
                        level.setLayoutParams(new TableRow.LayoutParams(2));
                        level.setText("level2B");
                        level.setGravity(Gravity.CENTER_HORIZONTAL);
                        level.setTextSize(18);
                        level.setWidth(112);
                        level.setTextColor(Color.parseColor("#000000"));
                        location.setLayoutParams(new TableRow.LayoutParams(3));
                        location.setText(String.valueOf(i));
                        location.setGravity(Gravity.CENTER_HORIZONTAL);
                        location.setTextSize(18);
                        location.setWidth(112);
                        location.setTextColor(Color.parseColor("#000000"));
                        customer.setLayoutParams(new TableRow.LayoutParams(4));
                        customer.setText(MainActivity.aisleJ.getLevel("level2B")[i].getName());
                        customer.setGravity(Gravity.CENTER_HORIZONTAL);
                        customer.setTextSize(18);
                        customer.setWidth(112);
                        customer.setTextColor(Color.parseColor("#000000"));
                        boxes.setLayoutParams(new TableRow.LayoutParams(5));
                        boxes.setText(String.valueOf(MainActivity.aisleJ.getLevel("level2B")[i].getQuantity()));
                        boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                        boxes.setTextSize(18);
                        boxes.setWidth(112);
                        boxes.setTextColor(Color.parseColor("#000000"));
                        row.addView(aisle);
                        row.addView(level);
                        row.addView(location);
                        row.addView(customer);
                        row.addView(boxes);
                        customerStockTable.addView(row);
                    }
                }

                    // Check aisle J level 3A
            for(int i = 1; i < MainActivity.aisleJ.getLevel("level3A").length; i++) {
                if (MainActivity.aisleJ.getLevel("level3A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("J");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level3A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleJ.getLevel("level3A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleJ.getLevel("level3A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

                    // Check aisle J level 3B
            for(int i = 1; i < MainActivity.aisleJ.getLevel("level3B").length; i++) {
                if (MainActivity.aisleJ.getLevel("level3B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("J");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level3B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleJ.getLevel("level3B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleJ.getLevel("level3B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

                    // Check aisle J level 4A
            for(int i = 1; i < MainActivity.aisleJ.getLevel("level4A").length; i++) {
                if (MainActivity.aisleJ.getLevel("level4A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("J");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level4A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleJ.getLevel("level4A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleJ.getLevel("level4A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

                    // Check aisle J level 4B
            for(int i = 1; i < MainActivity.aisleJ.getLevel("level4B").length; i++) {
                if (MainActivity.aisleJ.getLevel("level4B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("J");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level4B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleJ.getLevel("level4B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleJ.getLevel("level4B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            //Iterate over all levels of aisle K
            for(int i = 1; i < MainActivity.aisleK.getLevel("level1A").length; i++) {
                if (MainActivity.aisleK.getLevel("level1A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("K");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level1A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleK.getLevel("level1A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleK.getLevel("level1A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle K level 1B
            for(int i = 1; i < MainActivity.aisleK.getLevel("level1B").length; i++) {
                if (MainActivity.aisleK.getLevel("level1B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("K");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level1B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleK.getLevel("level1B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleK.getLevel("level1B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

                    // Check aisle K level 2A
            for(int i = 1; i < MainActivity.aisleK.getLevel("level2A").length; i++) {
                if (MainActivity.aisleK.getLevel("level2A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("K");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level2A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleK.getLevel("level2A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleK.getLevel("level2A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

                    // Check aisle K level 2B
            for(int i = 1; i < MainActivity.aisleK.getLevel("level2B").length; i++) {
                if (MainActivity.aisleK.getLevel("level2B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("K");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level2B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleK.getLevel("level2B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleK.getLevel("level2B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

                    // Check aisle K level 3A
            for(int i = 1; i < MainActivity.aisleK.getLevel("level3A").length; i++) {
                if (MainActivity.aisleK.getLevel("level3A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("K");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level3A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleK.getLevel("level3A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleK.getLevel("level3A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle K level 3B
            for(int i = 1; i < MainActivity.aisleK.getLevel("level3B").length; i++) {
                if (MainActivity.aisleK.getLevel("level3B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("K");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level3B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleK.getLevel("level3B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleK.getLevel("level3B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle K level 4A
            for(int i = 1; i < MainActivity.aisleK.getLevel("level4A").length; i++) {
                if (MainActivity.aisleK.getLevel("level4A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("K");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level4A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleK.getLevel("level4A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleK.getLevel("level4A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle K level 4B
            for(int i = 1; i < MainActivity.aisleK.getLevel("level4B").length; i++) {
                if (MainActivity.aisleK.getLevel("level4B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("K");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level4B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleK.getLevel("level4B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleK.getLevel("level4B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            //Iterate over all levels of aisle L
            for(int i = 1; i < MainActivity.aisleL.getLevel("level1A").length; i++) {
                if (MainActivity.aisleL.getLevel("level1A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("L");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level1A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleL.getLevel("level1A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleL.getLevel("level1A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle L level 1B
            for(int i = 1; i < MainActivity.aisleL.getLevel("level1B").length; i++) {
                if (MainActivity.aisleL.getLevel("level1B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("L");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level1B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleL.getLevel("level1B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleL.getLevel("level1B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle L level 2A
            for(int i = 1; i < MainActivity.aisleL.getLevel("level2A").length; i++) {
                if (MainActivity.aisleL.getLevel("level2A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("L");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level2A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleL.getLevel("level2A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleL.getLevel("level2A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle L level 2B
            for(int i = 1; i < MainActivity.aisleL.getLevel("level2B").length; i++) {
                if (MainActivity.aisleL.getLevel("level2B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("L");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level2B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleL.getLevel("level2B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleL.getLevel("level2B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle L level 3A
            for(int i = 1; i < MainActivity.aisleL.getLevel("level3A").length; i++) {
                if (MainActivity.aisleL.getLevel("level3A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("L");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level3A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleL.getLevel("level3A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleL.getLevel("level3A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle L level 3B
            for(int i = 1; i < MainActivity.aisleL.getLevel("level3B").length; i++) {
                if (MainActivity.aisleL.getLevel("level3B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("L");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level3B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleL.getLevel("level3B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleL.getLevel("level3B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle L level 4A
            for(int i = 1; i < MainActivity.aisleL.getLevel("level4A").length; i++) {
                if (MainActivity.aisleL.getLevel("level4A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("L");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level4A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleL.getLevel("level4A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleL.getLevel("level4A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle L level 4B
            for(int i = 1; i < MainActivity.aisleL.getLevel("level4B").length; i++) {
                if (MainActivity.aisleL.getLevel("level4B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("L");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level4B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleL.getLevel("level4B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleL.getLevel("level4B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Iterate over all levels of aisle M
            for(int i = 1; i < MainActivity.aisleM.getLevel("level1A").length; i++) {
                if (MainActivity.aisleM.getLevel("level1A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("M");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level1A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleM.getLevel("level1A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleM.getLevel("level1A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle M level 1B
            for(int i = 1; i < MainActivity.aisleM.getLevel("level1B").length; i++) {
                if (MainActivity.aisleM.getLevel("level1B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("M");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level1B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleM.getLevel("level1B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleM.getLevel("level1B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle M level 2A
            for(int i = 1; i < MainActivity.aisleM.getLevel("level2A").length; i++) {
                if (MainActivity.aisleM.getLevel("level2A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("M");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level2A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleM.getLevel("level2A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleM.getLevel("level2A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle M level 2B
            for(int i = 1; i < MainActivity.aisleM.getLevel("level2B").length; i++) {
                if (MainActivity.aisleM.getLevel("level2B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("M");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level2B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleM.getLevel("level2B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleM.getLevel("level2B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle M level 3A
            for(int i = 1; i < MainActivity.aisleM.getLevel("level3A").length; i++) {
                if (MainActivity.aisleM.getLevel("level3A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("M");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level3A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleM.getLevel("level3A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleM.getLevel("level3A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle M level 3B
            for(int i = 1; i < MainActivity.aisleM.getLevel("level3B").length; i++) {
                if (MainActivity.aisleM.getLevel("level3B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("M");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level3B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleM.getLevel("level3B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleM.getLevel("level3B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle M level 4A
            for(int i = 1; i < MainActivity.aisleM.getLevel("level4A").length; i++) {
                if (MainActivity.aisleM.getLevel("level4A")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("M");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level4A");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleM.getLevel("level4A")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleM.getLevel("level4A")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                    customerStockTable.addView(row);
                }
            }

            // Check aisle M level 4B
            for(int i = 1; i < MainActivity.aisleM.getLevel("level4B").length; i++) {
                if (MainActivity.aisleM.getLevel("level4B")[i].getName().equals(FindStock.findCustomer)) {
                    TableRow row = new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                    row.setLayoutParams(lp);
                    TextView aisle = new TextView(this);
                    TextView level = new TextView(this);
                    TextView location = new TextView(this);
                    TextView customer = new TextView(this);
                    TextView boxes = new TextView(this);
                    aisle.setLayoutParams(new TableRow.LayoutParams(1));
                    aisle.setText("M");
                    aisle.setGravity(Gravity.CENTER_HORIZONTAL);
                    aisle.setTextSize(18);
                    aisle.setWidth(112);
                    aisle.setTextColor(Color.parseColor("#000000"));
                    level.setLayoutParams(new TableRow.LayoutParams(2));
                    level.setText("level4B");
                    level.setGravity(Gravity.CENTER_HORIZONTAL);
                    level.setTextSize(18);
                    level.setWidth(112);
                    level.setTextColor(Color.parseColor("#000000"));
                    location.setLayoutParams(new TableRow.LayoutParams(3));
                    location.setText(String.valueOf(i));
                    location.setGravity(Gravity.CENTER_HORIZONTAL);
                    location.setTextSize(18);
                    location.setWidth(112);
                    location.setTextColor(Color.parseColor("#000000"));
                    customer.setLayoutParams(new TableRow.LayoutParams(4));
                    customer.setText(MainActivity.aisleM.getLevel("level4B")[i].getName());
                    customer.setGravity(Gravity.CENTER_HORIZONTAL);
                    customer.setTextSize(18);
                    customer.setWidth(112);
                    customer.setTextColor(Color.parseColor("#000000"));
                    boxes.setLayoutParams(new TableRow.LayoutParams(5));
                    boxes.setText(String.valueOf(MainActivity.aisleM.getLevel("level4B")[i].getQuantity()));
                    boxes.setGravity(Gravity.CENTER_HORIZONTAL);
                    boxes.setTextSize(18);
                    boxes.setWidth(112);
                    boxes.setTextColor(Color.parseColor("#000000"));
                    row.addView(aisle);
                    row.addView(level);
                    row.addView(location);
                    row.addView(customer);
                    row.addView(boxes);
                }
        }

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(mainMenu);
            }

        });
        }catch (NullPointerException n){
            Toast.makeText(DisplayStock.this, "System error", Toast.LENGTH_LONG).show();
        }
    }
}
