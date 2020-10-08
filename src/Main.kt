fun main() {

    var elf = Elfo("legolas");
    var hob = Hobbit("Frodo");
    var mag = Mago("Gandalf");
    var st = String()
    var derrota: Int
    var victorias: Int
    var fich = Files()


    for (num in 1..36){

        fich.escribirFile("\n -----------------------------------------" +
                "-----------------------------------------" +
                "LA COMPAÑIA HA ENTRADO EN LA SALA " +num+
                "----------------------------------------")
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

}