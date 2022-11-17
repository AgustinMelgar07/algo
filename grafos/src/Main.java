public class Main {

    public static void main(String[] args) {
	// write your code here
        /*el grafo permite modelar relaciones arbitrarias entre objetos
        * un grafo G=(V,A)es un par formado por un conjunto de vertices o nodos ,v
        *  y un conjunto de arcos o aristas, a. cada aristas, a,
        * cada aristas es el par(u,w), ismedp u,w dos vertices relacinados*/
        /*grafo no dirigido
        * el grado es no dirigido si las aristas estan formadas por pares de nodos no ordenados
        * (no apuntados), se representa con un segmento uniendo los nodos u---w
        *
        grafod dirigidos
        * el grafo es dirigido si los pares de nodso que forman las aristas son ordenados
        * se representan con una flecha que indica la direccion de la relacion u-->w*/

        /*camino
        se llama camino a una secuencia de vertices dentro de un grafo tal que exista una arista entre cada
        vertice y el siguiente. se dice que dos vertices estan conectados si existe un camino que
        vaya de un camino que vaya de uno a otro de lo contrario estan desconectados*/

        /*el peso es la distacia que hay de un vertice a otro*/
        /*matriza de ayadcencia es porque hay lugares con 0 es decir que no se apunta asi mismo*/
        /*la matriz de peso es la que esta representada
        por los pesos que hay, es la mas utilizada en programacion
        no hay n hay conexion se pone un infinito es decir que no hay una arista y donde hay 0
        es cuando no hay lazo osea de un nodo a ese mismo nodo*/

        long matrizA[][]={{0,6,4,2,1,4},{3,999999999,54,2,5,6}};
        caminos ruta = new caminos();
        System.out.println(ruta.algoritmofloyd(matrizA));
    }
}
