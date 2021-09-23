package com.pruebaTecnica.Prueba_1.repositories;



import com.pruebaTecnica.Prueba_1.models.ProductModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long> {
    //public abstract ArrayList<ProductModel> findByOrder(long id);
}
