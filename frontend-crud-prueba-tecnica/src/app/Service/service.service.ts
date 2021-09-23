import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Product } from '../Modelo/Product';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  

  constructor(private http:HttpClient) {}

  Url='http://localhost:8080/producto';

  getProduct(){
    return this.http.get<Product[]>(this.Url);
  }
  createProduct(product:Product){
    return this.http.post<Product>(this.Url,product);
  }

  getProductId(id:number){
    return this.http.get<Product>(this.Url+"/"+id);
  }

  updateProduct(product:Product){
    return this.http.post<Product>(this.Url,product);
  }

  deleteProduct(product:Product){
    return this.http.delete<Product>(this.Url+"/"+product.id);
  }


}
