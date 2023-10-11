import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrarUsuarioComponent } from './usuario/componentes/registrar-usuario/registrar-usuario.component';
import { LoginComponent } from './usuario/componentes/login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HTTP_INTERCEPTORS, HttpClientModule } from '@angular/common/http';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MaterialModule } from './app.material.module';
import { ToastrModule } from 'ngx-toastr';
import {  MatIconModule } from '@angular/material/icon';
import { ListarEntidadComponent } from './entidad/componentes/listar-entidad/listar-entidad.component';
import { TokenInterceptor } from './interceptor/token.interceptor';
import { MatInputModule } from '@angular/material/input';
import {  RegistrarEntidadComponent } from './entidad/componentes/registrar-entidad/registrar-entidad.component';
import { ContentLayoutComponent } from './content-layout/content-layout.component';
import { ActualizarEntidadComponent } from './entidad/componentes/actualizar-entidad/actualizar-entidad.component';
import { ListarContribuyenteComponent } from './tipocontribuyente/componentes/listar-contribuyente/listar-contribuyente.component';
import { RegistrarContribuyenteComponent } from './tipocontribuyente/componentes/registrar-contribuyente/registrar-contribuyente.component';
import { ActualizarContribuyenteComponent } from './tipocontribuyente/componentes/actualizar-contribuyente/actualizar-contribuyente.component';
import { ListarTipoDocumentoComponent } from './tipodocumento/componentes/listar-tipo-documento/listar-tipo-documento.component';
import { RegistrarTipoDocumentoComponent } from './tipodocumento/componentes/registrar-tipo-documento/registrar-tipo-documento.component';
import { ActualizarTipoDocumentoComponent } from './tipodocumento/componentes/actualizar-tipo-documento/actualizar-tipo-documento.component';





@NgModule({
  declarations: [
    AppComponent,
    RegistrarUsuarioComponent,
    LoginComponent,
    ListarEntidadComponent,
    RegistrarEntidadComponent,
    ContentLayoutComponent,
    ActualizarEntidadComponent,
    ListarContribuyenteComponent,
    RegistrarContribuyenteComponent,
    ActualizarContribuyenteComponent,
    ListarTipoDocumentoComponent,
    RegistrarTipoDocumentoComponent,
    ActualizarTipoDocumentoComponent

  ],
  imports: [
    BrowserModule,
    MatFormFieldModule,
    FormsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MaterialModule,
    MatIconModule,
    MatInputModule,
    ToastrModule.forRoot()

  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: TokenInterceptor,
      multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
