package com.example.json;

import androidx.annotation.NonNull;

public class mountains {
    private String name;
    private String location;
    private int size;

    /* @SerializedName("cost")
    @SerializedName("size") */

    public mountains(String name, String location, int size) {
        this.name = name;
        this.location = location;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @NonNull
    @Override
    public String toString() {
        return name + " has an altitude of " + size + "a above sea level and is located in" + location;
    }
}
