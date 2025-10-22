/**
 * Ejercicio 14: Separar parte entera y decimal
 * Usando solo casteo y las operaciones aritméticas +-, define una variable real 
 * e imprime por pantalla su parte entera y su parte decimal
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        // Variable real con valor decimal
        double numeroReal = 2.56984;
        
        // Obtener parte entera usando casteo
        int parteEntera = (int) numeroReal;
        
        // Obtener parte decimal restando la parte entera del número original
        double parteDecimal = numeroReal - parteEntera;
        
        // Mostrar resultados
        System.out.println("=== Separación de parte entera y decimal ===");
        System.out.println("Número original: " + numeroReal);
        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
        
        // Más ejemplos para verificar el funcionamiento
        System.out.println("\n=== Más ejemplos ===");
        
        double[] numeros = {15.789, -3.456, 0.123, 100.001, 7.0};
        
        for (double num : numeros) {
            int entero = (int) num;
            double decimal = num - entero;
            
            System.out.printf("%.5f → Entero: %d, Decimal: %.5f%n", num, entero, decimal);
        }
        
        // Ejemplo paso a paso con el número del enunciado
        System.out.println("\n=== Ejemplo paso a paso (2.56984) ===");
        double ejemplo = 2.56984;
        System.out.println("1. Número original: " + ejemplo);
        System.out.println("2. Casteo a int: (int)" + ejemplo + " = " + (int)ejemplo);
        System.out.println("3. Resta: " + ejemplo + " - " + (int)ejemplo + " = " + (ejemplo - (int)ejemplo));
        
        System.out.println("\n=== Observación ===");
        System.out.println("- Casteo (int) trunca la parte decimal");
        System.out.println("- Resta del original menos la parte entera da la parte decimal");
        System.out.println("- Funciona con números positivos y negativos");
    }
}