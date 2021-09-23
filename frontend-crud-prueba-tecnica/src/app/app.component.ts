import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend-crud-prueba-tecnica';

  constructor(private router:Router){}

  Listar(){
    this.router.navigate(["list"]);
  }

  Nuevo(){
    this.router.navigate(["add"]);
  }

}
