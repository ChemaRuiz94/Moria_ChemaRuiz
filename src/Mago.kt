class Mago(nombre: String,var vara: Int) : Personaje(nombre,Estado.vivo){

    fun recargarVara(energia: Int){
        this.vara += generaAleatorio(1,Finals.ENERGIAMAX)
    }

    fun poderVara():Int{
        return this.vara
    }
}