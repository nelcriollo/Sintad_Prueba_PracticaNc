import { Component, OnInit } from '@angular/core';
import { Entidad } from '../../models/entidad';
import { EntidadService } from '../../servicios/entidad.service';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { TipoContribuyente } from 'src/app/tipocontribuyente/models/tipocontribuyente';
import { TipoDocumento } from 'src/app/tipodocumento/models/tipodocumento';
import { TipoDocumentoService } from 'src/app/tipodocumento/servicios/tipo-documento.service';
import { TipoContribuyenteService } from 'src/app/tipocontribuyente/servicios/tipo-contribuyente.service';

@Component({
  selector: 'app-listar-entidad',
  templateUrl: './listar-entidad.component.html',
  styleUrls: ['./listar-entidad.component.css']
})
export class ListarEntidadComponent implements OnInit{
      
  entidades?:Entidad[];

  tiposContribuyente?:TipoContribuyente[];
  tiposDocumento?:TipoDocumento[];

  constructor(private toastr: ToastrService,private entidadService:EntidadService, private tipoDocumentoService:TipoDocumentoService, private tipoContribuyenteService:TipoContribuyenteService,private router:Router){
    this.entidades=[];
  }

  ngOnInit(): void {
    this.getObtenerEntidades();
    this.getTiposDocumento();
    this.getTiposContribuyente();
  }

 private getObtenerEntidades(){
    this.entidadService.getObtenerListaDeEntidades().subscribe(
      data =>{ 
        this.entidades = data;
        console.log(data);
      },
      error => {
        console.log(error);
      }
    );
  }

  nuevaEntidad():void {
    this.router.navigate(['menuPrincipal/registrarEntidad']);
  }

  editarEntidad(entidad:Entidad):void {
    localStorage.setItem('id', entidad.idEntidad.toString());
    this.router.navigate(['menuPrincipal/actulizarEntidad']); 
  }
  
  eliminarEntidad(entidad:Entidad):void {
    this.entidadService.deleteEntidad(entidad).subscribe(
      data=>{this.entidades=this.entidades!.filter(p=>p!==entidad)
        this.mostrarMensaje("La entidad se ha eliminado correctamente", "success");
      },
      error => {
        this.mostrarMensaje("No se pudo eliminar entidad Inténtalo nuevamente.", "error");

      }
    )
  }

  getTiposDocumento() {
    this.tipoDocumentoService.obtenerListaDeTiposDocumento().subscribe(
      data => {
        this.tiposDocumento = data;
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
