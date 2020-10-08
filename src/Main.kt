/**
 * El señor de los anillo: LA MINAS DE MORIA
 * Author: Chema
 *
 *
 */
fun main() {

    var win: Boolean = true

    //declaracion de objetos de los personajes
    var hob = Hobbit("Frodo");
    var elf = Elfo("legolas",generaAleatorio(1,Finals.FLECHASMAX));
    var mag = Mago("Gandalf",generaAleatorio(1,Finals.ENERGIAMAX));


    var fich = Files() //


    fich.escribirFile("\n GANDALF: Sólo nos queda una opción ahora, enfrentarnos a la larga oscuridad de \n " +
            "Moria. Manteneos alerta, hay seres más antiguos y viles que los orcos en las profundidades \n del mundo. Silencio" +
            " ahora, son cuatro jornadas de viaje hasta el \n otro lado, confiemos en que nuestra presencia pase inadvertida\n" +
            "------------------------------------------------------------------------------------\n")


        for (num in 1..36) {

            if (hob.estado==Estado.vivo && mag.estado==Estado.vivo && elf.estado==Estado.vivo) {
                fich.escribirFile("\n -----------------" +
                        "LA COMPAÑIA HA ENTRADO EN LA SALA " + num +
                        "------------------------------\n")
                var pel = generaPeligro()

                when (pel) {
                    1 -> {
                        var salaA = Sala(num, pel, elf)

                    }
                    2 -> {
                        var salaH = Sala(num, pel, hob)
                    }
                    3 -> {
                        var salaM = Sala(num, pel, mag)
                    }
                }
            }else{
                win=false
                break;
            }

        }


    if (win){
        fich.escribirFile("------------------------------------------------------------------------------------\n" +
                "La compañia ha conseguido salir de Moria, y esta vez Gandalf derroto al Balrog\n " +
                "Frodo ha conseguido " +hob.victorias+ " victorias y " +hob.derrotas+ " retiradas\n " +
                "Legolas ha conseguido " +elf.victorias+ " victorias y " +elf.derrotas+ " retiradas\n " +
                "Gandalf ha conseguido " +mag.victorias+ " victoiras y " +mag.derrotas+ " retiradas")
    }else{
        fich.escribirFile("------Han sido derrotados y el anillo nunca llegó a Mordor\n " +
                " Frodo ha conseguido " +hob.victorias+ " victorias y " +hob.derrotas+ " retiradas \n"  +
                " Legolas ha conseguido " +elf.victorias+ " victorias y " +elf.derrotas+ " retiradas\n" +
                " Gandalf ha conseguido " +mag.victorias+ " victoiras y " +mag.derrotas+ " retiradas\")")
    }


}