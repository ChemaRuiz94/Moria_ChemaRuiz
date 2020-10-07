fun main() {

    var elf = Elfo("legolas");
    var hob = Hobbit("Frodo");
    var mag = Mago("Gandalf");
    var st = String()
    var derrota: Int
    var fich = Files(st);

    var pelig :Int

    for (num in 1..36){

    pelig = generaPeligro();
    generarSala(pelig,num,mag,elf,hob)

    }

}