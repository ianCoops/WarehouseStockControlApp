package com.example.ianle.warehousestockcontrolapp;

/**
 * Operative class invoked
 * when adding a new Operative to the
 * system.
 * Created by Ian Cooper on 22/07/2018.
 */

public class Operative {

    // Operative class has
    // three fields.
    public String name;
    public String id;
    public String password;

    // Operative class has
    // one constructor.
    public Operative(String newName, String newId, String newPassword){
        name = newName;
        id = newId;
        password = newPassword;
    }

    // The Operative class has
    // six methods.
    public String getName(){
        return name;
    }

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
