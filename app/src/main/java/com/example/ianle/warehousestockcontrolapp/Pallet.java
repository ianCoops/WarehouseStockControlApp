package com.example.ianle.warehousestockcontrolapp;

import java.util.Date;

/**
 * Class instantiated to represent a physical
 * pallet that contains a customer's boxes.
 * Created by Ian Cooper on 02/08/2018.
 */

public class Pallet {
    // The Pallet class has
    // three fields
    public String customer;
    public int quantity;
    public Date date;

    // The Pallet class has
    // one constructor
    public Pallet(String newCustomer, int newQuantity, Date newDate){
        customer = newCustomer;
        quantity = newQuantity;
        date = newDate;
    }

    // The Pallet class has
    // three methods
    public String getName(){
        return customer;
    }

    public int getQuantity(){
        return quantity;
    }

    public Date getDate(){
        return date;
    }
}
