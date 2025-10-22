/**
 * Ejercicio 12: Área de un triángulo
 * Declara dos variables double para la base y la altura de un triángulo.
 * Usa la fórmula para calcular el área área = (base*altura)/2 e imprime el resultado
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        // Declaración de variables para base y altura
        double base = 8.5;
        double altura = 6.2;
        
        // Cálculo del área usando la fórmula: área = (base * altura) / 2
        double area = (base * altura) / 2;
        
        // Mostrar resultados
        System.out.println("=== Cálculo del área de un triángulo ===");
        System.out.println("Base del triángulo: " + base);
        System.out.println("Altura del triángulo: " + altura);
        System.out.println("Área = (base × altura) / 2");
        System.out.println("Área = (" + base + " × " + altura + ") / 2");
        System.out.println("Área = " + (base * altura) + " / 2");
        System.out.println("Área = " + area);
        
        // Formatear con 2 decimales
        System.out.printf("Área (2 decimales): %.2f unidades²%n", area);
        
        // Ejemplo adicional con diferentes valores
        System.out.println("\n=== Ejemplo adicional ===");
        double base2 = 12.0;
        double altura2 = 9.5;
        double area2 = (base2 * altura2) / 2;
        
        System.out.println("Base: " + base2 + ", Altura: " + altura2);
        System.out.printf("Área: %.2f unidades²%n", area2);
    }
}