public class cola {
    nodocola inicio,fin;
    int tamaño;
    public cola(){
        inicio=fin=null;
        tamaño=0;
    }

    public  boolean estavacia(){
        return inicio ==null;
    }
    public void insertar(int ele){
        nodocola nuevo=new nodocola(ele);
        if (estavacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamaño++;
    }
    public int quitar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tamaño--;
        return aux;
    }
    public int iniciocola(){
        return inicio.dato;
    }
    public int tamaño(){
        return tamaño;
    }
}
