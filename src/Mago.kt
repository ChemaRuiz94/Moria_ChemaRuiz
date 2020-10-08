class Mago(nombre: String,var vara: Int) : Personaje(nombre){



    fun recargarVara(energia: Int){
        this.vara += generaAleatorio(1,Finals.ENERGIAMAX)
    }

    fun poderVara():Int{
        return this.vara
    }
}