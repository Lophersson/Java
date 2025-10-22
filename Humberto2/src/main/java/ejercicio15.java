import java.util.Scanner;

/**
 * Ejercicio 15: Número decimal con 2 decimales
 */
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 15: NÚMERO CON 2 DECIMALES ===");
        System.out.print("Ingresa un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        
        System.out.printf("Número redondeado a 2 decimales: %.2f%n", numeroDecimal);
        
        scanner.close();
    }
}