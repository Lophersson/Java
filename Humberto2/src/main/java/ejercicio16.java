import java.util.Scanner;

/**
 * Ejercicio 16: Mensaje personalizado
 */
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 16: MENSAJE PERSONALIZADO ===");
        System.out.print("Ingresa tu nombre: ");
        String nombrePersona = scanner.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edadPersona = scanner.nextInt();
        
        System.out.printf("Hola %s, tienes %d años.%n", nombrePersona, edadPersona);
        
        scanner.close();
    }
}