class Mago(nombre: String,var palo: Int) : Personaje(nombre){

    constructor(nombreM: String){
        this.nombre = nombreM
        this.palo = generaAleatorio(1,Finals.ENERGIAMAX)

    }

    fun recargarVara(energia: Int){
        this.palo += generaAleatorio(1,Finals.ENERGIAMAX)
    }

    fun poderVara():Int{
        return this.palo
    }
}