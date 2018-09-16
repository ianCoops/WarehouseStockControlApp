package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class StockHolding extends AppCompatActivity {

    int g_total;
    int h_total;
    int i_total;
    int j_total;
    int k_total;
    int l_total;
    int m_total;


    Button exitButton;
    static TableLayout stockHoldingTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_holding);

        exitButton = (Button)findViewById(R.id.exitButton);

        stockHoldingTable = (TableLayout)findViewById(R.id.stockHoldingTable);
        stockHoldingTable.setStretchAllColumns(true);

        try{

            // We need to iterate through each aisle and level for each
            // customer
            for(Customer customer : AddCustomer.customerList){
                for(String level : MainActivity.levels) {
                    for (int i = 1; i < MainActivity.aisleG.getLevel(level).length; i++) {
                        if (customer.getName().equals(MainActivity.aisleG.getLevel(level)[i].getName())) {
                            g_total = g_total + MainActivity.aisleG.getLevel(level)[i].getQuantity();
                        }
                        if (customer.getName().equals(MainActivity.aisleH.getLevel(level)[i].getName())) {
                            h_total = h_total + MainActivity.aisleH.getLevel(level)[i].getQuantity();
                        }
                        if (customer.getName().equals(MainActivity.aisleI.getLevel(level)[i].getName())) {
                            i_total = i_total + MainActivity.aisleI.getLevel(level)[i].getQuantity();
                        }
                        if (customer.getName().equals(MainActivity.aisleJ.getLevel(level)[i].getName())) {
                            j_total = j_total + MainActivity.aisleJ.getLevel(level)[i].getQuantity();
                        }
                        if (customer.getName().equals(MainActivity.aisleK.getLevel(level)[i].getName())) {
                            k_total = k_total + MainActivity.aisleK.getLevel(level)[i].getQuantity();
                        }
                        if (customer.getName().equals(MainActivity.aisleL.getLevel(level)[i].getName())) {
                            l_total = l_total + MainActivity.aisleL.getLevel(level)[i].getQuantity();
                        }
                        if (customer.getName().equals(MainActivity.aisleM.getLevel(level)[i].getName())) {
                            m_total = m_total + MainActivity.aisleM.getLevel(level)[i].getQuantity();
                        }

                    }
                }



                // Add a row to the table for each customer containing the
                // total amount of boxes in each aisle for each customer
                final TableRow row = new TableRow(this);
                row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
                TextView cust = new TextView(this);
                TextView g_aisle = new TextView(this);
                TextView h_aisle = new TextView(this);
                TextView i_aisle = new TextView(this);
                TextView j_aisle = new TextView(this);
                TextView k_aisle = new TextView(this);
                TextView l_aisle = new TextView(this);
                TextView m_aisle = new TextView(this);
                TextView all_total =  new TextView(this);

                cust.setLayoutParams(new TableRow.LayoutParams(0));
                cust.setText(customer.getName());
                cust.setGravity(Gravity.CENTER);
                cust.setTextSize(18);
                cust.setWidth(20);
                cust.setTextColor(Color.parseColor("#000000"));

                g_aisle.setLayoutParams(new TableRow.LayoutParams(1));
                g_aisle.setText(String.valueOf(g_total));
                g_aisle.setGravity(Gravity.CENTER);
                g_aisle.setTextSize(18);
                g_aisle.setWidth(20);
                g_aisle.setTextColor(Color.parseColor("#000000"));

                h_aisle.setLayoutParams(new TableRow.LayoutParams(2));
                h_aisle.setText(String.valueOf(h_total));
                h_aisle.setGravity(Gravity.CENTER);
                h_aisle.setTextSize(18);
                h_aisle.setWidth(20);
                h_aisle.setTextColor(Color.parseColor("#000000"));

                i_aisle.setLayoutParams(new TableRow.LayoutParams(3));
                i_aisle.setText(String.valueOf(i_total));
                i_aisle.setGravity(Gravity.CENTER);
                i_aisle.setTextSize(18);
                i_aisle.setWidth(20);
                i_aisle.setTextColor(Color.parseColor("#000000"));

                j_aisle.setLayoutParams(new TableRow.LayoutParams(4));
                j_aisle.setText(String.valueOf(j_total));
                j_aisle.setGravity(Gravity.CENTER);
                j_aisle.setTextSize(18);
                j_aisle.setWidth(20);
                j_aisle.setTextColor(Color.parseColor("#000000"));

                k_aisle.setLayoutParams(new TableRow.LayoutParams(5));
                k_aisle.setText(String.valueOf(k_total));
                k_aisle.setGravity(Gravity.CENTER);
                k_aisle.setTextSize(18);
                k_aisle.setWidth(20);
                k_aisle.setTextColor(Color.parseColor("#000000"));

                l_aisle.setLayoutParams(new TableRow.LayoutParams(6));
                l_aisle.setText(String.valueOf(l_total));
                l_aisle.setGravity(Gravity.CENTER);
                l_aisle.setTextSize(18);
                l_aisle.setWidth(20);
                l_aisle.setTextColor(Color.parseColor("#000000"));

                m_aisle.setLayoutParams(new TableRow.LayoutParams(7));
                m_aisle.setText(String.valueOf(m_total));
                m_aisle.setGravity(Gravity.CENTER);
                m_aisle.setTextSize(18);
                m_aisle.setWidth(20);
                m_aisle.setTextColor(Color.parseColor("#000000"));

                all_total.setLayoutParams(new TableRow.LayoutParams(8));
                all_total.setText(String.valueOf(g_total + h_total + i_total + j_total + k_total
                + l_total + m_total));
                all_total.setGravity(Gravity.CENTER);
                all_total.setTextSize(18);
                all_total.setWidth(20);
                all_total.setTextColor(Color.parseColor("#000000"));

                row.addView(cust);
                row.addView(g_aisle);
                row.addView(h_aisle);
                row.addView(i_aisle);
                row.addView(j_aisle);
                row.addView(k_aisle);
                row.addView(l_aisle);
                row.addView(m_aisle);
                row.addView(all_total);
                stockHoldingTable.addView(row);

                g_total = 0;
                h_total = 0;
                i_total = 0;
                j_total = 0;
                k_total = 0;
                l_total = 0;
                m_total = 0;
            }


        }catch (NullPointerException n){
            Toast.makeText(getApplicationContext(), "Location(s) may be empty. System error", Toast.LENGTH_SHORT).show();
            Intent error = new Intent("com.example.ianle.warehousestockcontrolapp.StockRepor");
            startActivity(error);
        }

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                startActivity(mainMenu);
            }
        });
    }
}
