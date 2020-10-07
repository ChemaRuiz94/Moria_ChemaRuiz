import java.io.FileWriter
import java.io.IOException

class Files(var texto: String){

    /**
     * Añadir texto a un String
     */
   fun addTexto (newText: String){
       texto += newText
   }

    /**
     * Añidr un String al fichero
     */
    fun escribirFile(){
        try {
            val fw = FileWriter("MinasDeMoria.txt", true)
            fw.write(texto)
            fw.close()
        }catch (ex: IOException){}
    }

}