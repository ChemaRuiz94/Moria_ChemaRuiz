import kotlin.math.E
import kotlin.Int as Int1

/**
     * Funcion para controlar que un número no sea menor que 0
     */
    fun positivo (numero: Int1):Boolean{
        return numero >=0
    }

    /**
     * Controla que min no pueda ser superior a max
     */
    fun minMax (mini: Int1, maxi: Int1):Boolean{
        return mini < maxi
    }

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



