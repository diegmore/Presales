package com.products.products.repository;

import com.products.products.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepo extends JpaRepository<Products, Integer>{

}