/**
 * Ejercicio 2: Constante Pi y cálculo del área de un círculo
 * Define una constante (final) con el valor del número Pi (3.14159) 
 * y usa esta constante para calcular el área de un círculo de radio 5.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        // Definir constante Pi
        final double PI = 3.14159;
        
        // Radio del círculo
        double radio = 5.0;
        
        // Cálculo del área: área = π * r²
        double area = PI * radio * radio;
        
        // Mostrar resultados
        System.out.println("=== Cálculo del área de un círculo ===");
        System.out.println("Valor de Pi (constante): " + PI);
        System.out.println("Radio del círculo: " + radio);
        System.out.println("Área del círculo: " + area);
        System.out.println("Fórmula utilizada: área = π * r²");
    }
}