import { Component, OnInit } from '@angular/core';
import { Entidad } from '../../models/entidad';
import { Router } from '@angular/router';
import { EntidadService } from '../../servicios/entidad.service';
import { TipoContribuyente } from 'src/app/tipocontribuyente/models/tipocontribuyente';
import { TipoDocumento } from 'src/app/tipodocumento/models/tipodocumento';
import { TipoContribuyenteService } from 'src/app/tipocontribuyente/servicios/tipo-contribuyente.service';
import { TipoDocumentoService } from 'src/app/tipodocumento/servicios/tipo-documento.service';

@Component({
  selector: 'app-ergistrar-entidad',
  templateUrl: './registrar-entidad.component.html',
  styleUrls: ['./registrar-entidad.component.css']
})
export class RegistrarEntidadComponent implements OnInit {

  modeloEntidad = new Entidad();

  tiposContribuyente?:TipoContribuyente[];
  tiposDocumento?:TipoDocumento[];
  
  
  constructor(private router: Router, private entidadService: EntidadService,private tipoDocumentoService:TipoDocumentoService, private tipoContribuyenteService:TipoContribuyenteService) { }

  ngOnInit(): void {
    this.getTiposDocumento();
    this.getTiposContribuyente();
  }

  guardar(entidad: Entidad) {
    this.entidadService.registrarEntidad(entidad).subscribe(data => {
      this.router.navigate(['menuPrincipal/entidades']);
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

}
