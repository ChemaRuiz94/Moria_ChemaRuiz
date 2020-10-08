import main
class Sala (var num:Int, var peligro: Int, var pers : Personaje) {

    var fi : Files= Files()

    init {
        fi.escribirFile("La compañia se dispone a entrar en una sala")
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
        var aux = generaAleatorio(1,100)//variable para saber el porcentaje de las veces que superan el peligro
        var anillo = generaAleatorio(1,100) //para saber si se pone el anillo o no

        if (anillo <= 50 ) {
            (pers as Hobbit).ponerseAnillo()

            if (aux <= 90 ){

                fi.escribirFile("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")

                pers.victorias ++
            } else{
                (pers as Hobbit).huir()
            }
        }else {
            if (aux <=20){
                fi.escribirFile("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")
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

        fi.escribirFile("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")
        pers.victorias ++
    }

    /**
     * Metodo para las salas mágicas
     */
    private fun magicos(){

        var energiaMalig : Int = generaAleatorio(1,Finals.PODERMALIGNO)
        var prob : Int = generaAleatorio(1,100)

        if ((pers as Mago).poderVara()>energiaMalig){
            fi.escribirFile("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")
            pers.victorias ++
        }else if((pers as Mago).poderVara()==energiaMalig){

            if (prob<=60){
                fi.escribirFile("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")
                pers.victorias ++
            }else{
                (pers as Mago).huir()
            }
        } else {
            if (prob<=30){
                fi.escribirFile("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")
                pers.victorias ++
            }else{
                (pers as Mago).huir()
            }
        }
    }
}



