import java.util.Scanner;

/**
 * Ejercicio 4: Operaciones con cinco números
 */
public class ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 4: OPERACIONES CON NÚMEROS ===");
        System.out.print("Ingresa el primer número (a): ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número (b): ");
        int b = scanner.nextInt();
        System.out.print("Ingresa el tercer número (c): ");
        int c = scanner.nextInt();
        System.out.print("Ingresa el cuarto número (d): ");
        int d = scanner.nextInt();
        System.out.print("Ingresa el quinto número (e): ");
        int e = scanner.nextInt();
        
        int resultado1 = (a + b) * c;
        int resultado2 = a + b * c;
        double resultado3 = a + b * c - (double)d / e;
        
        System.out.println("(a+b)*c = " + resultado1);
        System.out.println("a+b*c = " + resultado2);
        System.out.println("a+b*c-d/e = " + resultado3);
        
        scanner.close();
    }
}