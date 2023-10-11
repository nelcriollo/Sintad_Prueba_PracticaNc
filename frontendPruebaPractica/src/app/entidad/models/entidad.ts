export class Entidad {

    idEntidad:number ;
    nroDocumento:string;
    razonSocial:string;
    nombreComercial: string ;
    direccion:string;
    telefono:string;
    estado:number;
    tipoDocumento:any
    tipoContribuyente:any
        

   constructor(){
    this.idEntidad = 0;
    this.nroDocumento = "";
    this.razonSocial = "";
    this.nombreComercial = "";
    this.direccion = "";
    this.telefono = "";
    this.estado = 0;
    this.tipoDocumento=null;
    this.tipoContribuyente=null;
        
    }

}