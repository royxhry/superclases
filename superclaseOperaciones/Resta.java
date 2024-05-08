// Subclase para restar
public class Resta extends Operaciones {
    public Resta(double a, double b) {
        super(a, b); // Llamada al constructor de la clase base
    }

    // Método que realiza la resta
    public double hacerOperacion() {
        return super.getA() - super.getB();
    }
}
