import main
class Sala (var num:Int, var peligro: Peligro, var pers : Personaje) {
     var st: String = "";

    /**
     * Metodo para las salas de habilidad
     */
    private fun habilidad(){
        var aux = generaAleatorio(1,100)//variable para saber el porcentaje de las veces que superan el peligro
        var anillo = generaAleatorio(1,100) //para saber si se pone el anillo o no

        if (anillo <= 50 ) {
            (pers as Hobbit).ponerseAnillo()

            if (aux <= 90 ){
                //println
                st += ("La compañia supera el peligro de la sala "+this.num+ " y pasa a la siguiente estancia \n")
                pers.victorias ++
            } else{
                (pers as Hobbit).huir()
            }
        }else {
            if (aux <=20){
                st += ("La compañia supera el peligro de la sala "+this.num+ " y pasa a la siguiente estancia \n")
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

        st += ("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")
        pers.victorias ++
    }

    /**
     * Metodo para las salas mágicas
     */
    private fun magicos(){

        var energiaMalig : Int = generaAleatorio(1,Finals.PODERMALIGNO)
        var prob : Int = generaAleatorio(1,100)

        if ((pers as Mago).poderVara()>energiaMalig){
            st += ("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")
            pers.victorias ++
        }else if((pers as Mago).poderVara()==energiaMalig){

            if (prob<=60){
                st += ("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")
                pers.victorias ++
            }else{
                (pers as Mago).huir()
            }
        } else {
            if (prob<=30){
                st += ("La compañia supera el peligro de la sala "+this.num+  "y pasa a la siguiente estancia \n")
                pers.victorias ++
            }else{
                (pers as Mago).huir()
            }
        }
    }



}



