open class Personaje {
    var nombre: String
    var estado: Boolean
    var victorias: Int = 0;
    var derrotas: Int = 0;

    constructor(nombre: String){
        this.nombre = nombre
        this.estado = true
    }

    fun huir (){
        derrotas++
        if (generaAleatorio(1,100)<=Finals.HUIR ){
            //println
        }else{
            //println
            this.estado=true
        }
    }
}