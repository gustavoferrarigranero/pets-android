package com.example.gustavo.petsandroid;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class User {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("user")
    @Expose
    private String user;

    @SerializedName("pass")
    @Expose
    private String pass;

    @SerializedName("picture")
    @Expose
    private String picture;

    @SerializedName("pets")
    @Expose
    private ArrayList<Pet> pets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
