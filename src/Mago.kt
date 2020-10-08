class Mago(nombre: String,var vara: Int) : Personaje(nombre){

    constructor(nombreM: String){
        this.nombre = nombreM
        this.vara = generaAleatorio(1,Finals.ENERGIAMAX)

    }

    fun recargarVara(energia: Int){
        this.vara += generaAleatorio(1,Finals.ENERGIAMAX)
    }

    fun poderVara():Int{
        return this.vara
    }
}