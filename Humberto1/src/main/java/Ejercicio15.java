/**
 * Ejercicio 15: Calculadora básica
 * Escribe un programa que pida dos números enteros por teclado y realice 
 * operaciones aritméticas básicas (suma, resta, multiplicación, división)
 */
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculadora Básica ===");
        
        // Pedir primer número
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        // Pedir segundo número
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        // Realizar operaciones aritméticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int modulo = numero1 % numero2;
        
        // Mostrar resultados
        System.out.println("\n=== Resultados ===");
        System.out.println("Primer número: " + numero1);
        System.out.println("Segundo número: " + numero2);
        System.out.println();
        
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicación: " + numero1 + " × " + numero2 + " = " + multiplicacion);
        
        // División: verificar si el divisor es cero
        if (numero2 != 0) {
            double division = (double) numero1 / numero2; // Casting para obtener decimales
            int divisionEntera = numero1 / numero2;
            
            System.out.println("División (decimal): " + numero1 + " ÷ " + numero2 + " = " + division);
            System.out.println("División (entera): " + numero1 + " ÷ " + numero2 + " = " + divisionEntera);
            System.out.println("Módulo (resto): " + numero1 + " % " + numero2 + " = " + modulo);
        } else {
            System.out.println("División: No se puede dividir por cero");
            System.out.println("Módulo: No se puede calcular módulo con divisor cero");
        }
        
        scanner.close();
        
        System.out.println("\n=== Fin del programa ===");
    }
}