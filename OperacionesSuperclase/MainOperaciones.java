import java.util.Scanner;

public class MainOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            // Solicitar al usuario la operación que desea realizar
            System.out.println("Selecciona la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            opc = sc.nextInt();

            if (opc >= 1 && opc <= 4) {
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

                // Realizar la operación seleccionada e imprimir el resultado
                switch (opc) {
                    case 1:
                        System.out.println("Haz seleccionado suma ");
                        System.out.println("La suma es: " + suma.hacerOperacion());
                        break;
                    case 2:
                        System.out.println("Haz seleccionado resta ");
                        System.out.println("La resta es: " + resta.hacerOperacion());
                        break;
                    case 3:
                        System.out.println("Haz seleccionado multiplicación ");
                        System.out.println("La multiplicación es: " + multiplicar.hacerOperacion());
                        break;
                    case 4:
                        System.out.println("Haz seleccionado división ");
                        System.out.println("La división es: " + dividir.hacerOperacion());
                        break;
                }
            } else if (opc != 5) {
                System.out.println("Opción incorrecta");
            }

        } while (opc != 5);
        sc.close();
    }
}
