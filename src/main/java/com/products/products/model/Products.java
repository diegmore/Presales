package com.products.products.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int quantity;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "presales", fetch = FetchType.LAZY)
    private List<Presales> presales;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Presales> getPresales() {
        return presales;
    }

    public void setPresales(List<Presales> presales) {
        this.presales = presales;
    }
}
