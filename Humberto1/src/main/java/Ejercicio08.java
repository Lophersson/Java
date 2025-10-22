/**
 * Ejercicio 8: Operaciones aritméticas básicas
 * Declara dos variables enteras. Realiza y muestra en consola los resultados 
 * de las siguientes operaciones: suma, resta, multiplicación, división y módulo
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        // Declaración de variables enteras
        int numero1 = 20;
        int numero2 = 6;
        
        // Realizar operaciones aritméticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2; // División entera
        int modulo = numero1 % numero2;   // Resto de la división
        
        // Mostrar resultados
        System.out.println("=== Operaciones Aritméticas ===");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println();
        
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println("División: " + numero1 + " / " + numero2 + " = " + division);
        System.out.println("Módulo (resto): " + numero1 + " % " + numero2 + " = " + modulo);
        
        // Explicación adicional
        System.out.println("\n=== Notas ===");
        System.out.println("- La división entre enteros da como resultado un entero (se trunca)");
        System.out.println("- El módulo (%) devuelve el resto de la división");
        System.out.println("- 20 / 6 = 3 (resto 2), por eso división=3 y módulo=2");
    }
}