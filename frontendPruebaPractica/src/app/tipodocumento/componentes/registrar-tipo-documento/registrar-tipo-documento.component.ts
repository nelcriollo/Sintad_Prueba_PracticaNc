import { Component } from '@angular/core';
import { TipoDocumentoService } from '../../servicios/tipo-documento.service';
import { TipoDocumento } from '../../models/tipodocumento';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registrar-tipo-documento',
  templateUrl: './registrar-tipo-documento.component.html',
  styleUrls: ['./registrar-tipo-documento.component.css']
})
export class RegistrarTipoDocumentoComponent {
  modelTipoDocumento = new TipoDocumento();

  constructor(private router: Router, private tipoDocumentoService: TipoDocumentoService){}
  ngOnInit(): void {
  }

  guardarTipoDocumento( tipoDocumento: TipoDocumento) {
    this.tipoDocumentoService.registrarTipoDocumento(tipoDocumento).subscribe(data => {
      this.router.navigate(['menuPrincipal/tipoDocumentos']);
    });
  }
}
