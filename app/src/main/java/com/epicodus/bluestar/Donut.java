package com.epicodus.bluestar;

public class Donut {
    private String mName;
    private Double mPrice;

    public Donut(String name, Double price) {
        mName = name;
        mPrice = price;
    }

    public String getName() {
        return mName;
    }

    public Double getPrice() {
        return mPrice;
    }
}
