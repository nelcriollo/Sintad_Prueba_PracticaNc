import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { TipoContribuyenteService } from '../../servicios/tipo-contribuyente.service';
import { TipoContribuyente } from '../../models/tipocontribuyente';

@Component({
  selector: 'app-registrar-contribuyente',
  templateUrl: './registrar-contribuyente.component.html',
  styleUrls: ['./registrar-contribuyente.component.css']
})
export class RegistrarContribuyenteComponent {

  
  modelTipoContribuyente = new TipoContribuyente();

  constructor(private router: Router, private tipoContribuyenteService: TipoContribuyenteService){}
  ngOnInit(): void {
  }

  guardarTipoContribuyente( tipoContribuyente: TipoContribuyente) {
    this.tipoContribuyenteService.registrarTipoContribuyente(tipoContribuyente).subscribe(data => {
      this.router.navigate(['menuPrincipal/contribuyentes']);
    });
  }


}
