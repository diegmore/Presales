package com.products.products.dto;

import java.io.Serializable;

public class ProductsDto implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int product_id;
	private int count;
    private int presales_id;

    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }

    public int getPresales_id() {
        return presales_id;
    }

    public void setPresales_id(int presales_id) {
        this.presales_id = presales_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
}