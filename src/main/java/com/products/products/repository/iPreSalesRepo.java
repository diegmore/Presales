package com.products.products.repository;

import java.util.List;

import com.products.products.model.Presales;

import org.springframework.data.jpa.repository.JpaRepository;

public interface iPreSalesRepo extends JpaRepository<Presales, Integer>{
    List<Presales> findAllByIdAndPresales_Id(int id, int presale_id);
    
}