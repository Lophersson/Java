import java.util.Scanner;

/**
 * Ejercicio 3: Calcular propina
 */
public class ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 3: CALCULAR PROPINA ===");
        System.out.print("Ingresa el total de la cuenta: ");
        double totalCuenta = scanner.nextDouble();
        System.out.print("Ingresa el porcentaje de propina: ");
        double porcentajePropina = scanner.nextDouble();
        
        double propina = totalCuenta * (porcentajePropina / 100);
        double totalPagar = totalCuenta + propina;
        
        System.out.println("Propina: $" + propina);
        System.out.println("Total a pagar: $" + totalPagar);
        
        scanner.close();
    }
}