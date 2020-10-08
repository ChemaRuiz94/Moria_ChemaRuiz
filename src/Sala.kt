/**
 * Clase sala compuesta de un número de sala
 * y tres personajes
 */

class Sala (var num:Int, var peligro: Int, var pers : Personaje) {

    var fi : Files= Files()

    init {

        when(peligro){
            1-> accion()
            2-> habilidad()
            3-> magicos()
        }
    }

    /**
     * Metodo para las salas de habilidad
     */
    private fun habilidad(){
        (pers as Hobbit).quitarseAnillo()//deducimos que entra en la sala con el anillo quitado
        var aux = generaAleatorio(1,100)//variable para saber el porcentaje de las veces que superan el peligro
        var anillo = generaAleatorio(1,100) //para saber si se pone el anillo o no en esta sala

        if (anillo <= 50 ) {
            (pers as Hobbit).ponerseAnillo()

            if (aux <= 90 ){

                fi.escribirFile("\n Frodo se pone el anillo y supera el peligro de la sala  " + this.num+  " , de habilidad, y pasa a la siguiente estancia \n")

                pers.victorias ++
            } else{
                (pers as Hobbit).huir()
            }
        }else {
            if (aux <=20){
                fi.escribirFile("\n Frodo no se pone el anillo pero supera el peligro de la sala  "+ this.num+  ", de habilidad, y pasa a la siguiente estancia \n")
                pers.victorias ++
            }else{
                (pers as Hobbit).huir()
            }
        }
    }

    /**
     * Método para las salas de acción
     */
    private fun accion(){
        var enemigos : Int = generaAleatorio(1,Finals.ENEMIGOSMAX)
        var aux : Int = generaAleatorio(1,Finals.FLECHASMAX)

        do {
            (pers as Elfo).lanzarFlechas()
            enemigos--

            if ((pers as Elfo).carcaj==0){
                (pers as Elfo).huir()
            }

        }while (enemigos>0)

        (pers as Elfo).recargarFlechas(aux)

        fi.escribirFile("\n Legolas derrota a todos los enemigos de la sala  " + this.num+  ", de acción, y pasa a la siguiente estancia \n")
        pers.victorias ++
    }

    /**
     * Metodo para las salas mágicas
     */
    private fun magicos(){

        var energiaMalig : Int = generaAleatorio(1,Finals.PODERMALIGNO)
        var prob : Int = generaAleatorio(1,100)

        if ((pers as Mago).poderVara()>energiaMalig){
            fi.escribirFile("\n Gandalf tiene mas poder y supera el peligro de la sala" + this.num+  ", de mágia, y pasa a la siguiente estancia \n")
            pers.victorias ++
        }else if((pers as Mago).poderVara()==energiaMalig){

            if (prob<=60){
                fi.escribirFile("\n Gandalf está a la mitad de poder pero supera de la sala  "+ this.num+  ", de mágia, y pasa a la siguiente estancia \n")
                pers.victorias ++
            }else{
                (pers as Mago).huir()
            }
        } else {
            if (prob<=30){
                fi.escribirFile("\n Gandal sin fuerzas consigue superar el peligro de la sala  "+ this.num+  ", de mágia, y pasa a la siguiente estancia \n")
                pers.victorias ++
            }else{
                (pers as Mago).huir()
            }
        }
    }
}



