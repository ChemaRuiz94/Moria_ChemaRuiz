import kotlin.Int as Int1

/**
 * Metodos que usaremos frecuentemente
 */
    /**
     * Funcion para generar un random entre dos valores, ambos incluidos
     */
    fun generaAleatorio(minimo: Int1, maximo: Int1): Int1 {
        return Math.floor(Math.random() * (maximo - minimo + 1) + minimo).toInt()
    }

    /**
    * Funcion para generar un random entre dos valores, ambos incluidos
    */
    fun generaPeligro(minimo: Int1=1, maximo: Int1=3): Int1 {
    return Math.floor(Math.random() * (maximo - minimo + 1) + minimo).toInt()
    }

    /**
    * Funcion para generar salas
     */
    fun generarSala(pel:Int1, n: Int1,m:Mago, e:Elfo, h:Hobbit){

    }



