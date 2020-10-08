class Elfo(nombre: String,var carcaj: Int) : Personaje(nombre,Estado.vivo){

    fun lanzarFlechas(){
        this.carcaj--
    }

    fun recargarFlechas(flechas:Int){
        this.carcaj = carcaj+generaAleatorio(1,Finals.FLECHASMAX)
    }
}