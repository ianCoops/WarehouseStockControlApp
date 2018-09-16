package com.example.ianle.warehousestockcontrolapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ActivityLog extends AppCompatActivity {

    Button exitButton;
    static TableLayout activityLogTable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        exitButton = (Button)findViewById(R.id.exitButton);

        activityLogTable = (TableLayout)findViewById(R.id.activityLogTable);
        activityLogTable.setStretchAllColumns(true);


        try{
            // Iterate over all data in the ArrayList
            // that holds the activity log data
            for(String logEntry : MainActivity.activityLog){
                    final TableRow row = new TableRow(this);
                    row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT));
                DisplayMetrics displayMetrics = getApplicationContext().getResources().getDisplayMetrics();
                    TextView entry = new TextView(this);
                    entry.setMaxWidth(displayMetrics.widthPixels);
                    entry.setText(logEntry);
                    entry.setTextSize(16);
                    entry.setTextColor(Color.parseColor("#000000"));

                    row.addView(entry);
                    activityLogTable.addView(row);

            }

            exitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                    startActivity(mainMenu);
                }
            });


        }catch (NullPointerException n){
            Toast.makeText(ActivityLog.this, "System error", Toast.LENGTH_LONG).show();
        }

    }
}


