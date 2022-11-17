import java.util.LinkedList;

public class Cuenta {
    String nombre;
    private String tipo;
    private double monto;

    public Cuenta(String nombre, String tipo, double monto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public String MostrarDatos1() {
        return "Cuenta: {" +
                "Nombre: " + this.getNombre() +
                ", Monto: " + this.getMonto() +
                ", Tipo: " + this.getTipo() +
                '}';
    }


    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Cuenta: {" +
                "Nombre: " + this.getNombre() +
                ", Monto: " + this.getMonto() +
                ", Tipo: " + this.getTipo() +
                '}';
    }
}
