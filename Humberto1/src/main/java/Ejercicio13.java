/**
 * Ejercicio 13: Operador + con diferentes tipos
 * Define dos variables enteras y una cadena. Usa el operador + para 
 * sumar enteros y concatenar con cadenas
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        // Declaración de variables
        int entero1 = 15;
        int entero2 = 25;
        String cadena1 = "El resultado es: ";
        
        // Variables de resultado
        int resultadoEntero;
        String resultadoCadena;
        
        // Operación 1: Suma de enteros
        resultadoEntero = entero1 + entero2;
        
        // Operación 2: Concatenación entero + cadena
        resultadoCadena = entero1 + cadena1;
        
        // Mostrar resultados
        System.out.println("=== Operador + con diferentes tipos ===");
        System.out.println("entero1 = " + entero1);
        System.out.println("entero2 = " + entero2);
        System.out.println("cadena1 = \"" + cadena1 + "\"");
        System.out.println();
        
        System.out.println("=== Resultados ===");
        System.out.println("Suma de enteros (entero1 + entero2): " + resultadoEntero);
        System.out.println("Concatenación (entero1 + cadena1): \"" + resultadoCadena + "\"");
        
        // Ejemplos adicionales para mostrar diferentes comportamientos
        System.out.println("\n=== Ejemplos adicionales ===");
        System.out.println("entero1 + entero2 = " + (entero1 + entero2)); // Suma: 40
        System.out.println("cadena1 + entero1 = \"" + (cadena1 + entero1) + "\""); // Concatenación
        System.out.println("entero1 + \" + \" + entero2 = \"" + (entero1 + " + " + entero2) + "\"");
        
        // Demostrar orden de operaciones
        System.out.println("\n=== Orden de operaciones ===");
        System.out.println("\"Suma: \" + entero1 + entero2 = \"" + ("Suma: " + entero1 + entero2) + "\"");
        System.out.println("\"Suma: \" + (entero1 + entero2) = \"" + ("Suma: " + (entero1 + entero2)) + "\"");
        
        System.out.println("\n=== Observación ===");
        System.out.println("+ entre números: SUMA aritmética");
        System.out.println("+ con String: CONCATENACIÓN (une textos)");
        System.out.println("Orden importante: sin paréntesis, se evalúa de izquierda a derecha");
    }
}