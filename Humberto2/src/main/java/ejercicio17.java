import java.util.Scanner;

/**
 * Ejercicio 17: Porcentaje de aciertos
 */
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 17: PORCENTAJE DE ACIERTOS ===");
        System.out.print("Ingresa el número de aciertos: ");
        int aciertos = scanner.nextInt();
        System.out.print("Ingresa el total de preguntas: ");
        int totalPreguntas = scanner.nextInt();
        
        double porcentaje = ((double) aciertos / totalPreguntas) * 100;
        System.out.printf("Porcentaje de aciertos: %.2f%%%n", porcentaje);
        
        scanner.close();
    }
}