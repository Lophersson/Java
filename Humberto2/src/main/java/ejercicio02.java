import java.util.Scanner;

/**
 * Ejercicio 2: Calcular edad
 */
public class ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 2: CALCULAR EDAD ===");
        System.out.print("Ingresa tu ano de nacimiento: ");
        int anoNacimiento = scanner.nextInt();
        System.out.print("Ingresa el ano actual: ");
        int anoActual = scanner.nextInt();
        
        int edad = anoActual - anoNacimiento;
        System.out.println("Tu edad es: " + edad + " anos");
        
        scanner.close();
    }
}