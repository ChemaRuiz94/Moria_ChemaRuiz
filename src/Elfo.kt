class Elfo(nombre: String,var carcaj: Int ) : Personaje(nombre){

    constructor(nombre: String){
        this.nombre = nombre
        this.carcaj = generaAleatorio(1,Finals.FLECHASMAX)
    }


    fun lanzarFlechas(){
        this.carcaj--
    }

    fun recargarFlechas(flechas:Int){
        this.carcaj = carcaj+generaAleatorio(1,Finals.FLECHASMAX)
    }
}