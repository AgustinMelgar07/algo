import java.io.*;
import java.util.LinkedList;

public class Serializacion {
    public static  boolean serializacionObjeto(Serializacion objeto) {
        boolean sw = false;
        try {
            FileOutputStream file = new FileOutputStream("C:\\Users\\AMD Ryzen\\untitled13\\miObjetoSerializado.txt");
            ObjectOutputStream salida = new ObjectOutputStream(file);
            salida.writeObject(objeto);
            sw = true;
        } catch (
                IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sw;
    }
        ;
        public static <E> E Deserializacion(Class<E> claseObjeto) {
            E objeto=null;
        try

            {
                FileInputStream file = new FileInputStream("C:\\Users\\AMD Ryzen\\untitled13\\miObjetoSerializado.txt");
                ObjectInputStream entrada = new ObjectInputStream(file);
                objeto = (E) entrada.readObject();

            } catch(Exception e){
            e.printStackTrace();
            }
        return objeto;
        }

}
