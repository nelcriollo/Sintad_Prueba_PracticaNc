import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Entidad } from '../models/entidad';

@Injectable({
  providedIn: 'root'
})
export class EntidadService {

  url: string = 'http://localhost:8080/api/entidades/';

  constructor(private httpClient: HttpClient) { }

  getObtenerListaDeEntidades() {
    return this.httpClient.get<Entidad[]>(this.url);
  }

  registrarEntidad(entidad: Entidad) {
    return this.httpClient.post<Entidad>(this.url, entidad);
  }

  obtenerEntidad(id: number) {
    return this.httpClient.get<Entidad>(this.url + id);
  }

  actualizarEntidad(entidad: Entidad) {
    return this.httpClient.put<Entidad>(this.url, entidad);
  }

  deleteEntidad(entidad: Entidad) {
    return this.httpClient.delete<Entidad>(this.url  + entidad.idEntidad);
  }

  
}
