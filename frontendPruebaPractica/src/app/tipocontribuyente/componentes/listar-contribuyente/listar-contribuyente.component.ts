import { Component } from '@angular/core';
import { TipoContribuyente } from '../../models/tipocontribuyente';
import { TipoContribuyenteService } from '../../servicios/tipo-contribuyente.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listar-contribuyente',
  templateUrl: './listar-contribuyente.component.html',
  styleUrls: ['./listar-contribuyente.component.css']
})
export class ListarContribuyenteComponent {

  tiposContribuyente?:TipoContribuyente[];
  tipoContribuyente = new TipoContribuyente();


  constructor(private tipoContribuyenteService:TipoContribuyenteService, private router:Router){
    this.tiposContribuyente=[];
  }

  ngOnInit(): void {
    this.getObtenerTiposContribuyente();
  }

 private getObtenerTiposContribuyente(){
    this.tipoContribuyenteService.obtenerListaDeTiposContribuyente().subscribe(
      data =>{ 
        this.tiposContribuyente = data;
        console.log(data);
      },
      error => {
        console.log(error);
      }
    );
  }

  nuevoTipoContribuyente():void {
    this.router.navigate(['menuPrincipal/registrarContribuyente']);
  }

  editarTipoContribuyente(tipoContribuyente:TipoContribuyente):void {
    localStorage.setItem('id', tipoContribuyente.idTipoContribuyente.toString());
    this.router.navigate(['menuPrincipal/actualizarContribuyente']);
  }
  
  eliminarTipoContribuyente(tipoContribuyente:TipoContribuyente):void {
    this.tipoContribuyenteService.eliminarTipoContribuyente(tipoContribuyente).subscribe(
      data=>{this.tiposContribuyente=this.tiposContribuyente!.filter(p=>p!==tipoContribuyente)}
    )
  }

}
