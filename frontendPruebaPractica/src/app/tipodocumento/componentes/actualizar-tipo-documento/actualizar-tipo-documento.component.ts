import { Component } from '@angular/core';
import { TipoDocumentoService } from '../../servicios/tipo-documento.service';
import { TipoDocumento } from '../../models/tipodocumento';
import { Router } from '@angular/router';

@Component({
  selector: 'app-actualizar-tipo-documento',
  templateUrl: './actualizar-tipo-documento.component.html',
  styleUrls: ['./actualizar-tipo-documento.component.css']
})
export class ActualizarTipoDocumentoComponent {
  tipoDocumento = new TipoDocumento();
   
  constructor(private router: Router, private tipoDocumentoService: TipoDocumentoService){}
  ngOnInit(): void {
    this.editar();
  }

  editar(){
    let id = JSON.parse(localStorage.getItem('id') as string);
    this.tipoDocumentoService.obtenerTipoDocumento(id).subscribe(
      data=>{this.tipoDocumento = data;
      });
  }

  actualizarTipoDocumento(tipoDocumento:TipoDocumento){
    this.tipoDocumentoService.actualizarTipoDocumento(tipoDocumento).subscribe(dato=>{
      this.tipoDocumento = dato;
      this.router.navigate(['menuPrincipal/tipoDocumentos']);
    });
  }
}
