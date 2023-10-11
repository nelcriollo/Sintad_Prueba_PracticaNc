import { Component, OnInit } from '@angular/core';
import { Entidad } from '../../models/entidad';
import { Router } from '@angular/router';
import { EntidadService } from '../../servicios/entidad.service';
import { ToastrService } from 'ngx-toastr';
import { TipoContribuyente } from 'src/app/tipocontribuyente/models/tipocontribuyente';
import { TipoDocumento } from 'src/app/tipodocumento/models/tipodocumento';
import { TipoDocumentoService } from 'src/app/tipodocumento/servicios/tipo-documento.service';
import { TipoContribuyenteService } from 'src/app/tipocontribuyente/servicios/tipo-contribuyente.service';

@Component({
  selector: 'app-actualizar-entidad',
  templateUrl: './actualizar-entidad.component.html',
  styleUrls: ['./actualizar-entidad.component.css']
})
export class ActualizarEntidadComponent implements OnInit {
  
  modeloEntidad = new Entidad();
  entidad = new Entidad();
  
  
  tiposContribuyente?:TipoContribuyente[];
  tiposDocumento?:TipoDocumento[];
  
  
  constructor(private toastr: ToastrService, private router: Router, private entidadService: EntidadService,private tipoDocumentoService:TipoDocumentoService, private tipoContribuyenteService:TipoContribuyenteService) { }

  ngOnInit(): void {
    this.editar();
    this.getTiposDocumento();
    this.getTiposContribuyente();
  }

  

  editar() {
    let id = JSON.parse(localStorage.getItem('id') as string);
    this.entidadService.obtenerEntidad(id).subscribe(
      data => {
        this.entidad = data;
      });
  }

  actualizarEntidad(entidad: Entidad) {
    this.entidadService.actualizarEntidad(entidad).subscribe(dato => {
      this.entidad = dato;
      this.mostrarMensaje("La entidad se actualizo correctamente", "success");
      this.router.navigate(['menuPrincipal/entidades']);
    },
      error => {
        this.mostrarMensaje("No se pudo actualizar la entidad. Inténtalo nuevamente.", "error");
      });
  }

  
  getTiposDocumento() {
    this.tipoDocumentoService.obtenerListaDeTiposDocumento().subscribe(
      data => {
        this.tiposDocumento = data;
        console.log(data);
      },
      error => {
        console.log(error);
      }
    );
  }

  getTiposContribuyente() {
    this.tipoContribuyenteService.obtenerListaDeTiposContribuyente().subscribe(
      data => {
        this.tiposContribuyente = data;
        console.log(data);
      },
      error => {
        console.log(error);
      }
    );
  }


  mostrarMensaje(mensaje: string, tipo: string): void {
    switch (tipo) {
      case 'success':
        this.toastr.success(mensaje, 'Éxito');
        break;
      case 'error':
        this.toastr.error(mensaje, 'Error');
        break;
      default:
        this.toastr.show(mensaje);
        break;
    }
  }

}
