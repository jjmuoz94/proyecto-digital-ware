package com.pruebaTecnica.Prueba_1.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.pruebaTecnica.Prueba_1.models.ProductModel;
import com.pruebaTecnica.Prueba_1.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/producto")
public class ProductController {
    @Autowired
    ProductService productService; 

    @GetMapping()
    public ArrayList<ProductModel> getProducts(){
        return productService.getProducts();
    }

    @PostMapping()
    public ProductModel saveProduct(@RequestBody ProductModel product){
        return this.productService.saveProduct(product);
    }

    @GetMapping( path = "/{id}")
    public Optional<ProductModel> getById(@PathVariable("id") Long id){
        return this.productService.getById(id);
    }
    
    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.productService.deleteProduct(id);
        if(ok){
            return "Sele elimino el producto con id: " + id;
        }else{
            return "Ocurrio un error al eliminar el producto con id: " + id;
            
        }
    }
    
}
