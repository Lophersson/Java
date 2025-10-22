/**
 * Ejercicio 1: Variables de diferentes tipos
 * Declara tres variables de diferentes tipos (int, double, y String).
 * Asigna valores a estas variables y luego imprímelas en la consola.
 * Prueba las diferencias al usar System.out.println y System.out.print
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // Declaración y asignación de variables
        int numeroEntero = 25;
        double numeroDecimal = 3.14159;
        String texto = "Hola Java";
        
        // Usando System.out.println (con salto de línea)
        System.out.println("=== Usando System.out.println ===");
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Texto: " + texto);
        
        // Usando System.out.print (sin salto de línea)
        System.out.println("\n=== Usando System.out.print ===");
        System.out.print("Número entero: " + numeroEntero);
        System.out.print(" | Número decimal: " + numeroDecimal);
        System.out.print(" | Texto: " + texto);
        System.out.println(); // Para añadir una línea final
        
        // Diferencia: println añade salto de línea, print no
        System.out.println("\n=== Diferencias observadas ===");
        System.out.println("println: Cada salida aparece en una línea nueva");
        System.out.println("print: Las salidas aparecen consecutivas en la misma línea");
    }
}