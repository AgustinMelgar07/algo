public class Main {

    public static void main(String[] args) {
	// write your code here




        /**
         * @param args the command line arguments
         */
            Main m = new Main();



    }
    private final Gestion gestion;
    public Main() {
        this.gestion = new Gestion("C:\\Users\\AMD Ryzen\\seria\\miObjetoSerializado.txt");
        this.gestion.add(25, "Carlos");
        this.gestion.add(20, "Juan");
        this.gestion.add(19, "Pepe");
        this.gestion.guardar();
        this.gestion.imprimirTodo();
        this.gestion.obtener();
        this.gestion.imprimirTodo();
    }
}
//"C:\\Users\\AMD Ryzen\\untitled13\\miObjetoSerializado.txt"