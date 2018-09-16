package com.example.ianle.warehousestockcontrolapp;

/**
 * Customer class invoked
 * when adding a new Customer
 * to the system.
 * Created by Ian Cooper on 24/07/2018.
 */

public class Customer {

    // The Customer class has
    // two fields.
    public String name;
    public String depot;

    // The Customer class has
    // one constructor.
    public Customer(String newName, String newDepot){
        name = newName;
        depot = newDepot;
    }

    //The Customer class has
    // four methods.
    public String getName() { return name; }

    public void setName(String newName){
        this.name = newName;
    }

    public String getDepot(){
        return depot;
    }

    public void setDepot(String newDepot){
        this.depot = newDepot;
    }

    @Override
    public String toString(){
        return name;
    }

}
