package com.example.ianle.warehousestockcontrolapp;

/**
 * Administrator class invoked when
 * adding a new administrator to the
 * system.
 * Created by Ian Cooper on 17/07/2018.
 */

public class Administrator {

    // the Administrator class has
    // three fields
    public String name;
    public String id;
    public String password;

    // the Administrator class has
    // one constructor
    public Administrator(String newName, String newId, String newPassword){
        name = newName;
        id = newId;
        password = newPassword;
    }

    // the Administrator class has
    // six methods
    public String getName() { return name; }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
