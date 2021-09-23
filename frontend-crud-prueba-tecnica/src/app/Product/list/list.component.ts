import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/Modelo/Product';
import { ServiceService } from '../../Service/service.service';


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  
  products:Product[] | undefined;
  
  
  constructor(private service:ServiceService, private router:Router) { }

  
  ngOnInit() {
    this.service.getProduct()
    .subscribe(data=>{
       this.products=data;
    })
  }

  Editar(product:Product): void{
    localStorage.setItem("id",product.id.toString());
    this.router.navigate(["edit"]);
  }

  Delete(product:Product): void{
    this.service.deleteProduct(product)
    .subscribe(data=>{
      
      this.products=this.products!.filter(p=>p!==product);
       alert("Producto eliminado con exito!");
       this.router.navigate(["list"]);
    })
   
  }

}
