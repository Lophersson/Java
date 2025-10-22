import java.util.Scanner;

/**
 * Ejercicio 19: Formato de moneda
 */
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 19: FORMATO DE MONEDA ===");
        System.out.print("Ingresa un precio: ");
        double precio = scanner.nextDouble();
        
        System.out.printf("Precio en formato de moneda: eur %.2f%n", precio);
        
        scanner.close();
    }
}