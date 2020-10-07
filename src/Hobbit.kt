class Hobbit(nombre: String) : Personaje(nombre){
    var anillo: Boolean = false

    fun ponerseAnillo(){
        this.anillo = true
    }

    fun quitarseAnillo(){
        this.anillo = false
    }
}