class Metodos {
    /**
     * Funcion para controlar que un número no sea menor que 0
     */
    fun positivo (numero:Int):Boolean{
        return numero >=0
    }

    /**
     * Controla que min no pueda ser superior a max
     */
    fun minMax (mini: Int, maxi: Int):Boolean{
        return mini < maxi
    }

    /**
     * Funcion para generar un random entre dos valores, ambos incluidos
     */
    fun generaAleatorio(minimo: Int, maximo: Int): Int {
        return Math.floor(Math.random() * (maximo - minimo + 1) + minimo).toInt()
    }
}