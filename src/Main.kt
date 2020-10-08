fun main() {

    var hob = Hobbit("Frodo");
    var elf = Elfo("legolas",generaAleatorio(1,Finals.FLECHASMAX));
    var mag = Mago("Gandalf",generaAleatorio(1,Finals.ENERGIAMAX));


    var derrota: Int
    var victorias: Int
    var fich = Files()


    fich.escribirFile("GANDALF: Sólo nos queda una opción ahora, enfrentarnos a la larga oscuridad de \n " +
            "Moria. Manteneos alerta, hay seres más antiguos y viles que los orcos en las profundidades \n del mundo. Silencio" +
            " ahora, son cuatro jornadas de viaje hasta el \n otro lado, confiemos en que nuestra presencia pase inadvertida\n" +
            "------------------------------------------------------------------------------------\n")
   do {
    for (num in 1..36){

        fich.escribirFile("\n -----------------" +
                "LA COMPAÑIA HA ENTRADO EN LA SALA " +num+
                "------------------------------\n")
    var pel = generaPeligro()

        when(pel){
            1-> {
                var salaA = Sala(num,pel,elf)

            }
            2-> {
                var salaH = Sala(num,pel,hob)
            }
            3-> {
                var salaM = Sala(num,pel,mag)
            }
        }

    }
   }while (hob.estado==true && elf.estado==true && mag.estado==true)


    fich.escribirFile("------------------------------------------------------------------------------------\n" +
            "La compañia ha conseguido salir de Moria, y esta vez Gandalf derroto al Balrog\n " +
            "Frodo ha conseguido " +hob.victorias+ " victorias y " +hob.derrotas+ " derrotas\n " +
            "Legolas ha conseguido " +elf.victorias+ " victorias y " +elf.derrotas+ " derrotas\n " +
            "Gandalf ha conseguido " +mag.victorias+ " victoiras y " +mag.derrotas+ " derrotas")
}