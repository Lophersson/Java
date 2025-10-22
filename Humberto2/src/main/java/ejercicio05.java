import java.util.Scanner;

/**
 * Ejercicio 5: Expresión aritmética compleja
 */
public class ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 5: EXPRESIÓN ARITMÉTICA COMPLEJA ===");
        System.out.print("Ingresa x: ");
        double x = scanner.nextDouble();
        System.out.print("Ingresa y: ");
        double y = scanner.nextDouble();
        System.out.print("Ingresa z: ");
        double z = scanner.nextDouble();
        System.out.print("Ingresa w: ");
        double w = scanner.nextDouble();
        System.out.print("Ingresa v: ");
        double v = scanner.nextDouble();
        System.out.print("Ingresa u: ");
        double u = scanner.nextDouble();
        
        double resultado = ((x + y) * (z - w)) / v + u;
        System.out.println("(x+y)×(z−w)/v+u = " + resultado);
        
        scanner.close();
    }
}