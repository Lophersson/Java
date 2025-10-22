import java.util.Scanner;

/**
 * Ejercicio 14: Formato printf con ancho de campo
 */
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 14: PRINTF CON ANCHO DE CAMPO ===");
        System.out.print("Ingresa un número entero: ");
        int numeroEntero = scanner.nextInt();
        
        System.out.printf("Número con campo de 5 caracteres: %5d%n", numeroEntero);
        
        scanner.close();
    }
}