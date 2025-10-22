/**
 * Ejercicio 6: Operadores de asignación compuesta += y -=
 * Modifica el programa anterior para añadir dos pasos más 
 * usando los operadores += y -=
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        // Declaración de variable entera
        int contador = 10;
        
        // Mostrar valor inicial
        System.out.println("=== Operadores ++, --, += y -= ===");
        System.out.println("Valor inicial: " + contador);
        
        // Incrementar usando ++
        contador++;
        System.out.println("Después de contador++: " + contador);
        
        // Decrementar usando --
        contador--;
        System.out.println("Después de contador--: " + contador);
        
        // Usar operador +=
        contador += 5;
        System.out.println("Después de contador += 5: " + contador);
        
        // Usar operador -=
        contador -= 3;
        System.out.println("Después de contador -= 3: " + contador);
        
        // Más ejemplos con diferentes valores
        System.out.println("\n=== Más ejemplos ===");
        contador += 10;
        System.out.println("Después de contador += 10: " + contador);
        
        contador -= 8;
        System.out.println("Después de contador -= 8: " + contador);
    }
}