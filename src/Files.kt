import java.io.FileWriter
import java.io.IOException

class Files(var texto: String){

   fun añadirTexto (newText: String){
       texto += newText
   }

    fun escribirFile(){
        try {
            val fw = FileWriter("MinasDeMoria.txt", true)
            fw.write(texto)
            fw.close()
        }catch (ex: IOException){}
    }

}