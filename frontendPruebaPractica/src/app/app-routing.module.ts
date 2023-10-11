import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './usuario/componentes/login/login.component';
import { ListarEntidadComponent } from './entidad/componentes/listar-entidad/listar-entidad.component';
import { RegistrarEntidadComponent } from './entidad/componentes/registrar-entidad/registrar-entidad.component';
import { ContentLayoutComponent } from './content-layout/content-layout.component';
import { ActualizarEntidadComponent } from './entidad/componentes/actualizar-entidad/actualizar-entidad.component';
import { ListarContribuyenteComponent } from './tipocontribuyente/componentes/listar-contribuyente/listar-contribuyente.component';
import { RegistrarContribuyenteComponent } from './tipocontribuyente/componentes/registrar-contribuyente/registrar-contribuyente.component';
import { ActualizarContribuyenteComponent } from './tipocontribuyente/componentes/actualizar-contribuyente/actualizar-contribuyente.component';
import { ListarTipoDocumentoComponent } from './tipodocumento/componentes/listar-tipo-documento/listar-tipo-documento.component';
import { RegistrarTipoDocumentoComponent } from './tipodocumento/componentes/registrar-tipo-documento/registrar-tipo-documento.component';
import { ActualizarTipoDocumentoComponent } from './tipodocumento/componentes/actualizar-tipo-documento/actualizar-tipo-documento.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'login',
    pathMatch: 'full'
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'menuPrincipal',
    component: ContentLayoutComponent,
    children: [
      { path: 'entidades', component: ListarEntidadComponent },
      { path: 'registrarEntidad', component: RegistrarEntidadComponent },
      { path: 'actulizarEntidad', component: ActualizarEntidadComponent },
      { path: 'contribuyentes', component: ListarContribuyenteComponent },
      { path: 'registrarContribuyente', component: RegistrarContribuyenteComponent },
      { path: 'actualizarContribuyente', component: ActualizarContribuyenteComponent },
      { path: 'tipoDocumentos', component: ListarTipoDocumentoComponent },
      { path: 'registrarTipoDocumento', component: RegistrarTipoDocumentoComponent },
      { path: 'actualizarTipoDocumento', component: ActualizarTipoDocumentoComponent },
      
    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
