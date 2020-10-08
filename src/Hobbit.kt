class Hobbit(nombre: String) : Personaje(nombre,Estado.vivo){
    var anillo: Boolean = false

    fun ponerseAnillo(){
        this.anillo = true
    }

    fun quitarseAnillo(){
        this.anillo = false
    }

}