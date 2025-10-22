import java.util.Scanner;

/**
 * Ejercicio 8: Calculadora básica
 */
public class ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 8: CALCULADORA BÁSICA ===");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingresa la operación (suma, resta, multiplicacion, division): ");
        String operacion = scanner.nextLine().toLowerCase();
        
        switch (operacion) {
            case "suma":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "resta":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "multiplicacion":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "division":
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("Operación no válida");
        }
        
        scanner.close();
    }
}