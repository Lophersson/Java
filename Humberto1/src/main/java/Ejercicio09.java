/**
 * Ejercicio 9: Casteo de tipos (double a int)
 * Declara una variable double con un valor decimal y conviértela a int usando casteo.
 * Muestra los valores antes y después del casteo
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        // Declaración de variable double con valor decimal
        double numeroDecimal = 15.789;
        
        // Conversión (casteo) de double a int
        int numeroEntero = (int) numeroDecimal;
        
        // Mostrar resultados
        System.out.println("=== Casteo de double a int ===");
        System.out.println("Valor original (double): " + numeroDecimal);
        System.out.println("Valor después del casteo (int): " + numeroEntero);
        
        // Más ejemplos para demostrar el comportamiento
        System.out.println("\n=== Más ejemplos de casteo ===");
        
        double valor1 = 9.99;
        double valor2 = -3.75;
        double valor3 = 0.123;
        
        System.out.println(valor1 + " → " + (int) valor1);
        System.out.println(valor2 + " → " + (int) valor2);
        System.out.println(valor3 + " → " + (int) valor3);
        
        System.out.println("\n=== Observación ===");
        System.out.println("El casteo de double a int TRUNCA la parte decimal");
        System.out.println("No redondea, simplemente elimina los decimales");
        System.out.println("Los números negativos también se truncan hacia cero");
    }
}