import java.util.Scanner;

/**
 * Ejercicio 11: Convertir calificación numérica a letra
 */
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 11: CALIFICACIÓN EN LETRAS ===");
        System.out.print("Ingresa una calificación (0-10): ");
        double calificacion = scanner.nextDouble();
        String letra;
        
        if (calificacion < 5) {
            letra = "Suspenso";
        } else if (calificacion < 6) {
            letra = "Suficiente";
        } else if (calificacion < 7) {
            letra = "Bien";
        } else if (calificacion < 9) {
            letra = "Notable";
        } else if (calificacion <= 10) {
            letra = "Sobresaliente";
        } else {
            letra = "Calificación inválida";
        }
        
        System.out.println("Calificación: " + letra);
        
        scanner.close();
    }
}