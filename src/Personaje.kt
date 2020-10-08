open class Personaje (var nombre: String,var estado: Estado ) {
    var victorias: Int = 0;
    var derrotas: Int = 0;
    var fi : Files= Files()



   open fun huir (){
        derrotas++
        if (generaAleatorio(1,100)<=Finals.HUIR ){
            fi.escribirFile("\n La compañia consigue huir de la sala \n")
        }else{
            fi.escribirFile( "DERROTA->" + this.nombre+" perece y la tierra media esta condenada... \n")
            this.estado=Estado.muerto
        }
    }
}

enum class Estado {vivo, muerto}