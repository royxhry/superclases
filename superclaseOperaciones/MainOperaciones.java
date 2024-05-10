// Clase principal para realizar operaciones
import java.util.Scanner;

public class MainOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario los dos números
        System.out.println("Ingresa el primer número:");
            double a = sc.nextDouble();
        System.out.println("Ingresa el segundo número:");
            double b = sc.nextDouble();

        // Crear instancias de las subclases y realizar las operaciones
        Suma suma = new Suma(a, b);
        Resta resta = new Resta(a, b);
        Multiplicar multiplicar = new Multiplicar(a, b);
        Dividir dividir = new Dividir(a, b);

        // Imprimir los resultados
        System.out.println("La suma es: " + suma.hacerOperacion());
        System.out.println("La resta es: " + resta.hacerOperacion());
        System.out.println("La multiplicación es: " + multiplicar.hacerOperacion());
        System.out.println("La división es: " + dividir.hacerOperacion());

        sc.close();
    }
}