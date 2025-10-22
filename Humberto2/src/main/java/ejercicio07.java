import java.util.Scanner;

/**
 * Ejercicio 7: Determinar si un número es positivo, negativo o cero
 */
public class ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 7: POSITIVO, NEGATIVO O CERO ===");
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();
        
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
        
        scanner.close();
    }
}