public class Pila {
    int vectorpila[];
    int cima;

    public Pila(int tamaño){
        vectorpila = new int [tamaño];
        cima=-1;
    }

    //metodo push
    public  void empujar(int dato){
        cima++;
        vectorpila[cima]=dato;

    }
    //metodo pop sacar
    public int sacar(){
        int fuera = vectorpila[cima];
    cima --;
    return fuera;
    }

    //metodo para saber si la pila esta vacia

    public boolean estaVacio(){
        return cima==-1;
    }
    //metodo para saber si esta llena
    public boolean estallena() {
    return vectorpila.length-1==cima;
    }
    //metodo para saber que elemento esta en la cima
    public int cimapila(){
        return vectorpila[cima];
    }
    //metodo para saber el tamaño de la pila
    public int tamañopila(){
        return vectorpila.length;
    }
}
