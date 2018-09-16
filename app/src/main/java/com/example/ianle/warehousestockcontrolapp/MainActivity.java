package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    // In order to update the activity log we need a way of keeping track of the
    // the last user to log in.
    public static String currentUser = null;

    // Create the Aisle objects that
    // represent the warehouse racking
    // system of the business
    public static Aisle aisleG = new Aisle("G");
    public static Aisle aisleH = new Aisle("H");
    public static Aisle aisleI = new Aisle("I");
    public static Aisle aisleJ = new Aisle("J");
    public static Aisle aisleK = new Aisle("K");
    public static Aisle aisleL = new Aisle("L");
    public static Aisle aisleM = new Aisle("M");

    // An array holding the id's of all of the available warehouse
    // Aisle within which stock can be stored
    public static String [] aisleID = {"G", "H", "I", "J", "K", "L", "M"};

    // An array to store the Aisle objects which allows
    // for access in other classes
    public static Aisle[] aisles = new Aisle[7];

    // An array to store the levels of each which can be
    // accessed from other Classes and in other activities
    public static String[] levels = {"level1A", "level1B", "level2A", "level2B", "level3A", "level3B",
    "level4A", "level4B"};

    // An array of the locations in each aisle which can be accessed
    // by other classes and in other activities
    public static Integer[] locations = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
    11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
    27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42,
    43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58,
    59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
    75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 89, 90, 91,
    92, 93};

    // Customer that already have accounts with the business
    // and can be added to the system
    Customer asdaB = new Customer("ASDA", "Brackmills");
    Customer tu = new Customer("TU", "Bedford");
    Customer newLook = new Customer("New Look", "Lymedale");
    Customer morrisons = new Customer("Nutmeg", "Leeds");
    Customer debenhams = new Customer("Debenhams", "Lutterworth");
    Customer hm = new Customer("H&M", "Bolton");
    Customer bonMarche = new Customer("Bon marche", "Cardiff");

    // Current date to allow the initialisation of the empty pallet
    // which is needed to avoid a Null pointer exception when searching
    // the locations which may or may not be holding stock
    static Date date = new Date();
    static Pallet emptyPallet = new Pallet("Empty", 0, date);

    // We need an ArrayList of Strings to hold the date that will represent the
    // activity log.
    public static List<String> activityLog = new ArrayList<>();

    Button adminButton, operativeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Adding customers that already have accounts with the business
        // to the Customer list. Also, helps with testing
        AddCustomer.customerList.add(asdaB);
        AddCustomer.customerList.add(tu);
        AddCustomer.customerList.add(newLook);
        AddCustomer.customerList.add(morrisons);
        AddCustomer.customerList.add(debenhams);
        AddCustomer.customerList.add(hm);
        AddCustomer.customerList.add(bonMarche);

        // Initialise all arrays with an empty Pallet object
        // This helps avoid null values
        // Aisle G
        for(String level : levels){
            for(int i = 1; i < aisleG.getLevel(level).length; i++) {
                aisleG.getLevel(level)[i] = emptyPallet;
            }
        }
        // Initialise Aisle H
        for(String level : levels){
            for(int i = 1; i < aisleH.getLevel(level).length; i++){
                aisleH.getLevel(level)[i] = emptyPallet;
            }
        }
        // Initialise Aisle I
        for(String level : levels){
            for(int i = 1; i < aisleI.getLevel(level).length; i++){
                aisleI.getLevel(level)[i] = emptyPallet;
            }
        }
        // Initialise Aisle J
        for(String level : levels){
            for(int i = 1; i < aisleJ.getLevel(level).length; i++){
                aisleJ.getLevel(level)[i] = emptyPallet;
            }
        }
        // Initialise Aisle K
        for(String level : levels){
            for(int i = 1; i < aisleK.getLevel(level).length; i++){
                aisleK.getLevel(level)[i] = emptyPallet;
            }
        }
        // Initialise Aisle L
        for(String level : levels){
            for(int i = 1; i < aisleL.getLevel(level).length; i++){
                aisleL.getLevel(level)[i] = emptyPallet;
            }
        }
        // Initialise Aisle M
        for(String level : levels){
            for(int i = 1; i < aisleM.getLevel(level).length; i++){
                aisleM.getLevel(level)[i] = emptyPallet;
            }
        }

        aisles[0] = aisleG;
        aisles[1] = aisleH;
        aisles[2] = aisleI;
        aisles[3] = aisleJ;
        aisles[4] = aisleK;
        aisles[5] = aisleL;
        aisles[6] = aisleM;

        adminButton = (Button)findViewById(R.id.adminButton);
        operativeButton = (Button)findViewById(R.id.operativeButton);

        adminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adminLogIn = new Intent("com.example.ianle.warehousestockcontrolapp.adminLogIn");
                startActivity(adminLogIn);

            }
        });

        operativeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent operativeLogIn = new Intent("com.example.ianle.warehousestockcontrolapp.operativeLogIn");
                startActivity(operativeLogIn);
            }
        });

    }
}
