import java.util.Scanner;

/**
 * Ejercicio 1: Pedir nombre e imprimirlo
 */
public class ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 1: NOMBRE ===");
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Tu nombre es: " + nombre);
        
        scanner.close();
    }
}