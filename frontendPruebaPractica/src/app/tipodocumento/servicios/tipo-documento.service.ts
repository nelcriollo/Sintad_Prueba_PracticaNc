import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TipoDocumento } from '../models/tipodocumento';

@Injectable({
  providedIn: 'root'
})
export class TipoDocumentoService {

  
  url: string = 'http://localhost:8080/api/tipodocumentos/';

  constructor(private httpClient: HttpClient) { }

  obtenerListaDeTiposDocumento() {
    return this.httpClient.get<TipoDocumento[]>(this.url);
  }

  registrarTipoDocumento(tipoDocumento: TipoDocumento) {
    return this.httpClient.post<TipoDocumento>(this.url, tipoDocumento);
  }

  obtenerTipoDocumento(id: number) {
    return this.httpClient.get<TipoDocumento>(this.url  + id);
  }

  actualizarTipoDocumento(tipoDocumento: TipoDocumento) {
    return this.httpClient.put<TipoDocumento>(this.url, tipoDocumento);
  }

  eliminarTipoDocumento(TipoDocumento: TipoDocumento) {
    return this.httpClient.delete(this.url + TipoDocumento.idTipoDocumento);
  }

}
