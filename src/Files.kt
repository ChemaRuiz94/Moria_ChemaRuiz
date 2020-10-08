import java.io.FileWriter
import java.io.IOException

class Files(){

    /**
     * Añidr un String al fichero
     */
    fun escribirFile(text:String){
        try {
            val fw = FileWriter("MinasDeMoria.txt", true)
            fw.write(text)
            fw.close()
        }catch (ex: IOException){}
    }

}