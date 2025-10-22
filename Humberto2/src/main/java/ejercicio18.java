import java.util.Scanner;

/**
 * Ejercicio 18: Alineación en columnas
 */
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 18: ALINEACIÓN EN COLUMNAS ===");
        System.out.print("Ingresa el primer número: ");
        int col1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int col2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int col3 = scanner.nextInt();
        
        System.out.println("Números alineados:");
        System.out.printf("%5d%n%5d%n%5d%n", col1, col2, col3);
        
        scanner.close();
    }
}