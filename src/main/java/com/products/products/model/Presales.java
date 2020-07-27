package com.products.products.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Presales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private int id;
    private Boolean status;
    private int cost;
    private int bill_id;
    private String site;

    @Transient
    private String response;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false, updatable = false)
    @JsonBackReference
    private Presales presales;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getCost() {
        return cost;
    }
    
    public void setCost(int cost) {
        this.cost = cost;
    }

    public Presales getPresales() {
        return presales;
    }

    public void setPresales(Presales presales) {
        this.presales = presales;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Presale [status=" + status + ", site=" + site + ", bill_id=" + bill_id+ "]";
    }
}