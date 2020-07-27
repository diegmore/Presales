package com.products.products.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.products.products.dto.ProductsDto;
import com.products.products.model.Presales;
import com.products.products.model.Products;
import com.products.products.repository.ProductsRepo;
import com.products.products.repository.iPreSalesRepo;


@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductRestController{

    @Autowired
    private iPreSalesRepo presal;

    @Autowired
    private ProductsRepo produc;

    @GetMapping
    public List<Presales> listar(){
        return presal.findAll();
    }
    
    @PostMapping
    public List<Presales> insertar(@RequestBody ProductsDto product) {
        int product_id = product.getProduct_id();
        int presales_id = product.getPresales_id();
        List<Presales> presale = presal.findAllByIdAndPresales_Id(presales_id, product_id);
        presale.forEach(element -> {
            if(element.getStatus()==true){
                element.setResponse("The presale has been realized");
            }else{
                element.setResponse("The presale has not been realized");
            }
        });
        return presale;
    }

}