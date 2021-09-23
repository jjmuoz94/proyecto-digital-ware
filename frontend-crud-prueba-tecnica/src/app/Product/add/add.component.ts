import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/Modelo/Product';
import { ServiceService } from 'src/app/Service/service.service';


@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private router:Router,private service:ServiceService) { }

  ngOnInit(): void {
  }
  product = new Product
  Guardar(){
    this.service.createProduct(this.product)
    .subscribe(data=>{
      alert("Se Agrego con Exito!");
      this.router.navigate(["list"]);
    })

  }

}
