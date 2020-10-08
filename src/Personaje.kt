open class Personaje {
    var nombre: String
    var estado: Boolean
    var victorias: Int = 0;
    var derrotas: Int = 0;
    var fi : Files= Files()

    constructor(nombre: String){
        this.nombre = nombre
        this.estado = true
    }

    fun huir (){
        derrotas++
        if (generaAleatorio(1,100)<=Finals.HUIR ){
            fi.escribirFile("La compañia consigue huir de la sala \n")
        }else{
            fi.escribirFile("La compañia perece y la tierra media esta condenada... \n")
            this.estado=false
        }
    }
}