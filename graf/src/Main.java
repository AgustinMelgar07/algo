public class Main {

    public static void main(String[] args) {
        // write your code here

            Grafo matriz = new Grafo(5);


            matriz.agregar(0, 1);
            matriz.agregar(0, 1);
            matriz.agregar(0, 2);
            matriz.agregar(0, 3);

            matriz.agregar(1, 0);
            matriz.agregar(1, 0);
            matriz.agregar(1, 4);

            matriz.agregar(2, 0);
            matriz.agregar(2, 3);
            matriz.agregar(2, 4);

            matriz.agregar(3, 0);
            matriz.agregar(3, 2);

            matriz.agregar(4, 1);
            matriz.agregar(4, 2);
            matriz.agregar(4, 4);
            matriz.agregar(4, 4);

            matriz.imprimir();
            matriz.remover(4,4);
            System.out.println("\n\n");
            matriz.imprimir();
        }
    }

