package com.example.ianle.warehousestockcontrolapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to be instantiated to represent
 * each aisle of the racking system in
 * the warehouse of the business
 * Created by Ian Cooper on 02/08/2018.
 */

public class Aisle {
    // The Aisle class has nine
    // fields
    public String id;

    public Pallet[] level1A;
    public Pallet[] level1B;

    public Pallet[] level2A;
    public Pallet[] level2B;

    public Pallet[] level3A;
    public Pallet[] level3B;

    public Pallet[] level4A;
    public Pallet[] level4B;

    // The Aisle class has
    // one constructor
    public Aisle(String newID){
        // Sets the ID of the aisle
        id = newID;
        // Creates 8 ArrayLists
        // to store the pallet objects
        level1A = new Pallet[94];
        level1B = new Pallet[94];
        level2A = new Pallet[94];
        level2B = new Pallet[94];
        level3A = new Pallet[94];
        level3B = new Pallet[94];
        level4A = new Pallet[94];
        level4B = new Pallet[94];
    }

    public String getID(){
        return id;
    }

    public Pallet[] getLevel(String id){

        Pallet[] temp = new Pallet[94];

        if(id.equals("level1A")){
            temp = this.level1A;
        }else
            if(id.equals("level1B")){
                temp = this.level1B;
            }else
                if (id.equals("level2A")){
                    temp = this.level2A;
                }else
                    if(id.equals("level2B")){
                        temp = this.level2B;
                    }else
                        if(id.equals("level3A")){
                            temp = this.level3A;
                        }else
                            if(id.equals("level3B")){
                                temp = this.level3B;
                            }else
                                if (id.equals("level4A")){
                                    temp = this.level4A;
                                }else
                                    if(id.equals("level4B")){
                                        temp = this.level4B;
                                    }
                                    return temp;

    }
}



