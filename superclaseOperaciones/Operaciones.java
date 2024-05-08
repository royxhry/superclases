// Clase base para las operaciones matemáticas
public class Operaciones {
    // Atributos para almacenar los valores de la operación
    private double a;
    private double b;

    // Constructor que inicializa los valores
    public Operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Método getter para obtener el valor del primer valor
    public double getA() {
        return a;
    }

    // Método setter para establecer el valor del primer valor
    public void setA(double a) {
        this.a = a;
    }

    // Método getter para obtener el valor del segundo valor
    public double getB() {
        return b;
    }

    // Método setter para establecer el valor del segundo valor
    public void setB(double b) {
        this.b = b;
    }

    // Método que realiza la operación 
    public double hacerOperacion() {
        return 0; 
    }
}