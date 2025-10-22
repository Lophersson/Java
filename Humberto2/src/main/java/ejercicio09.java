import java.util.Scanner;

/**
 * Ejercicio 9: Encontrar el mayor de tres números
 */
public class ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 9: MAYOR DE TRES NÚMEROS ===");
        System.out.print("Ingresa el primer número: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int n3 = scanner.nextInt();
        
        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        
        System.out.println("El mayor de los tres números es: " + mayor);
        
        scanner.close();
    }
}