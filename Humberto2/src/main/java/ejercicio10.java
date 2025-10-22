import java.util.Scanner;

/**
 * Ejercicio 10: Determinar si un año es bisiesto
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 10: AÑO BISIESTO ===");
        System.out.print("Ingresa un año: ");
        int ano = scanner.nextInt();
        
        boolean esBisiesto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        if (esBisiesto) {
            System.out.println(ano + " es un año bisiesto");
        } else {
            System.out.println(ano + " no es un año bisiesto");
        }
        
        scanner.close();
    }
}