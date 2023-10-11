export class TipoDocumento{
    
    idTipoDocumento: number;
    codigo: string;
    nombre: string;
    descripcion: string;
    estado: number;

    constructor(){
        this.idTipoDocumento=0;
        this.codigo="";
        this.nombre="";
        this.descripcion="";
        this.estado=0;
    }


}