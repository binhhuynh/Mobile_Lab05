package com.hfad.mobile_lab05;

import java.util.ArrayList;
import java.util.List;

public class Chair {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private int imageResourceId;

    public static final Chair[] chairs = {
            new Chair("Matteo Armchair", "ONE OF A KIND YACHT  INTERIOR IS MADE TO FIT YOUR BOAT TO MAKE IT AS COMFORTABLE AS YOUR HOUSE", 550, R.drawable.chair_1),
            new Chair("Modern Armchair", "ONE OF A KIND YACHT  INTERIOR IS MADE TO FIT YOUR BOAT TO MAKE IT AS COMFORTABLE AS YOUR HOUSE", 350, R.drawable.chair_2),
            new Chair("Nice Armchair", "ONE OF A KIND YACHT  INTERIOR IS MADE TO FIT YOUR BOAT TO MAKE IT AS COMFORTABLE AS YOUR HOUSE", 250, R.drawable.chair_3),
            new Chair("Circle Armchair", "ONE OF A KIND YACHT  INTERIOR IS MADE TO FIT YOUR BOAT TO MAKE IT AS COMFORTABLE AS YOUR HOUSE", 350, R.drawable.chair_4),
    };

    public static final List<Chair> listItem = new ArrayList<Chair>();

    public Chair(String name, String description, double price, int quantity, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.imageResourceId = imageResourceId;
    }

    public Chair(String name, String description, double price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public Chair(String name, double price, int quantity, int imageResourceId) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
