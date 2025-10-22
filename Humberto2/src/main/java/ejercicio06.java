import java.util.Scanner;

/**
 * Ejercicio 6: Determinar si un número es par o impar
 */
public class ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 6: PAR O IMPAR ===");
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }
        
        scanner.close();
    }
}