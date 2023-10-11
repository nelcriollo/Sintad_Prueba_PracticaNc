import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { TipoDocumentoService } from '../../servicios/tipo-documento.service';
import { TipoDocumento } from '../../models/tipodocumento';

@Component({
  selector: 'app-listar-tipo-documento',
  templateUrl: './listar-tipo-documento.component.html',
  styleUrls: ['./listar-tipo-documento.component.css']
})
export class ListarTipoDocumentoComponent {

  tiposDocumento?:TipoDocumento[];
  tipoDocumento = new TipoDocumento();


  constructor(private tipoDocumentoService:TipoDocumentoService, private router:Router){
    this.tiposDocumento=[];
  }

  ngOnInit(): void {
    this.getObtenerTiposDocumento();
  }

 private getObtenerTiposDocumento(){
    this.tipoDocumentoService.obtenerListaDeTiposDocumento().subscribe(
      data =>{ 
        this.tiposDocumento = data;
        console.log(data);
      },
      error => {
        console.log(error);
      }
    );
  }

  nuevoTipoDocumento():void {
    this.router.navigate(['menuPrincipal/registrarTipoDocumento']); 
  }

  editarTipoDocumento(tipoDocumento:TipoDocumento):void {
    localStorage.setItem('id', tipoDocumento.idTipoDocumento.toString());
    this.router.navigate(['menuPrincipal/actualizarTipoDocumento']);
  }
  
  eliminarTipoDocumento(tipoDocumento:TipoDocumento):void {
    this.tipoDocumentoService.eliminarTipoDocumento(tipoDocumento).subscribe(
      data=>{this.tiposDocumento=this.tiposDocumento!.filter(p=>p!==tipoDocumento)}
    )
  }

}
