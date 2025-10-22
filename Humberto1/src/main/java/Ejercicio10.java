/**
 * Ejercicio 10: Promoción automática de tipos (int a double)
 * Declara una variable int y asígnale un valor. Luego, asigna esa variable 
 * a una variable double sin hacer casteo explícito. Imprime ambos valores
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        // Declaración de variable int
        int numeroEntero = 42;
        
        // Asignación automática de int a double (promoción implícita)
        double numeroDecimal = numeroEntero;
        
        // Mostrar resultados
        System.out.println("=== Promoción automática de int a double ===");
        System.out.println("Valor original (int): " + numeroEntero);
        System.out.println("Valor asignado a double: " + numeroDecimal);
        
        // Verificar que son diferentes tipos pero mismo valor
        System.out.println("Tipo de numeroEntero: int");
        System.out.println("Tipo de numeroDecimal: double");
        
        // Más ejemplos
        System.out.println("\n=== Más ejemplos ===");
        int entero1 = 100;
        int entero2 = -25;
        int entero3 = 0;
        
        double decimal1 = entero1;
        double decimal2 = entero2;
        double decimal3 = entero3;
        
        System.out.println(entero1 + " (int) → " + decimal1 + " (double)");
        System.out.println(entero2 + " (int) → " + decimal2 + " (double)");
        System.out.println(entero3 + " (int) → " + decimal3 + " (double)");
        
        System.out.println("\n=== Observación ===");
        System.out.println("Java realiza promoción automática de tipos más pequeños a más grandes");
        System.out.println("int → double es seguro (no hay pérdida de información)");
        System.out.println("No se necesita casteo explícito para esta conversión");
    }
}