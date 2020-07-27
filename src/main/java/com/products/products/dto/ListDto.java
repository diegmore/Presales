package com.products.products.dto;

public class ListDto {
    private int product_id;
	private int cost;
    private String location;
    private int quantity;
    private int bill_id;
    private int presale_id;
    private boolean sold;

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPresale_id() {
        return presale_id;
    }

    public void setPresale_id(int presale_id) {
        this.presale_id = presale_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}