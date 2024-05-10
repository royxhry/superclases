// Subclase para sumar
public class Suma extends Operaciones {
    public Suma(double a, double b) {
        super(a, b); // Llamada al constructor de la clase base
    }

    // Método que realiza la suma
    public double hacerOperacion() {
        return super.getA() + super.getB();
    }
}

