/**
 * Ejercicio 4: Promedio de tres calificaciones
 * Declara tres variables double que representen tres calificaciones. 
 * Calcula el promedio de estas calificaciones y muéstralo en la consola
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        // Declaración de las tres calificaciones
        double calificacion1 = 8.5;
        double calificacion2 = 7.2;
        double calificacion3 = 9.1;
        
        // Cálculo del promedio
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        
        // Mostrar resultados
        System.out.println("=== Cálculo del promedio de calificaciones ===");
        System.out.println("Primera calificación: " + calificacion1);
        System.out.println("Segunda calificación: " + calificacion2);
        System.out.println("Tercera calificación: " + calificacion3);
        System.out.println("Promedio: " + promedio);
        System.out.printf("Promedio (con 2 decimales): %.2f%n", promedio);
    }
}