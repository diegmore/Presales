package com.products.products.dto;


public class PresalesDtos {
    /**
     *
     */
    private int id;
	private int Cost;
    private String Location;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return Cost;
    }
    
    public void setCost(int cost) {
        Cost = cost;
    }
    
    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

}