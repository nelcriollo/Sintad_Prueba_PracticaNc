import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TipoContribuyente } from '../models/tipocontribuyente';

@Injectable({
  providedIn: 'root'
})
export class TipoContribuyenteService {

  url: string = 'http://localhost:8080/api/tipoContribuyentes/';

  constructor(private httpClient: HttpClient) { }

  obtenerListaDeTiposContribuyente() {
    return this.httpClient.get<TipoContribuyente[]>(this.url);
  }

  registrarTipoContribuyente(tipoUsuario: TipoContribuyente) {
    return this.httpClient.post<TipoContribuyente>(this.url, tipoUsuario);
  }

  obtenerTipoContribuyente(id: number) {
    return this.httpClient.get<TipoContribuyente>(this.url + id);
  }

  actualizarTipoContribuyente(tipoContribuyente: TipoContribuyente) {
    return this.httpClient.put<TipoContribuyente>(this.url, tipoContribuyente);
  }

  eliminarTipoContribuyente(TipoContribuyente: TipoContribuyente) {
    return this.httpClient.delete(this.url + TipoContribuyente.idTipoContribuyente);
  }

}
