import { Component } from '@angular/core';
import { TipoContribuyenteService } from '../../servicios/tipo-contribuyente.service';
import { Router } from '@angular/router';
import { TipoContribuyente } from '../../models/tipocontribuyente';

@Component({
  selector: 'app-actualizar-contribuyente',
  templateUrl: './actualizar-contribuyente.component.html',
  styleUrls: ['./actualizar-contribuyente.component.css']
})
export class ActualizarContribuyenteComponent {

  tipoContribuyente = new TipoContribuyente();
   
  constructor(private router: Router, private tipoContribuyenteService: TipoContribuyenteService){}
  ngOnInit(): void {
    this.editar();
  }

  editar(){
    let id = JSON.parse(localStorage.getItem('id') as string);
    this.tipoContribuyenteService.obtenerTipoContribuyente(id).subscribe(
      data=>{this.tipoContribuyente = data;
      });
  }

  actualizarTipoContribuyente(tipoContribuyente:TipoContribuyente){
    this.tipoContribuyenteService.actualizarTipoContribuyente(tipoContribuyente).subscribe(dato=>{
      this.tipoContribuyente = dato;
      this.router.navigate(['menuPrincipal/contribuyentes']);
    });
  }

}
