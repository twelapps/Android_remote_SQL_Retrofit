package com.example.twelker.reminderdemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by twelh on 25/04/2018.
 */

//TODO to watch: Reminder helper class, used by Retrofit client
public class Reminder {
    @SerializedName("_id")
    @Expose
    int id;
    @SerializedName("name")
    @Expose
    String name;

    //Constructor
    public Reminder(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
