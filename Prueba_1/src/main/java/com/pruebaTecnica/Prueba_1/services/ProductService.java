package com.pruebaTecnica.Prueba_1.services;


import java.util.ArrayList;
import java.util.Optional;

import com.pruebaTecnica.Prueba_1.models.ProductModel;
import com.pruebaTecnica.Prueba_1.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ProductService {
 @Autowired
 ProductRepository productRepository;
 
 public ArrayList<ProductModel> getProducts(){ 
     return (ArrayList<ProductModel>) productRepository.findAll();
 }

 public ProductModel saveProduct(ProductModel product){
         return productRepository.save(product);
 }

 public Optional<ProductModel> getById(long id){
     return productRepository.findById(id);
 }

 public boolean deleteProduct(long id){
     try {  
         productRepository.deleteById(id);
         return true;
     } catch (Exception e) {
         return false;
     }
 }


}
