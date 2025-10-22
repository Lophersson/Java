/**
 * Ejercicio 7: Análisis de operadores pre y post
 * Imprime el valor de la variable en el momento de la asignación 
 * y justo después de la asignación. ¿Qué observas?
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        int contador = 5;
        
        System.out.println("=== Análisis de operadores pre y post ===");
        System.out.println("Valor inicial: " + contador);
        
        // Post-incremento: devuelve el valor actual, luego incrementa
        System.out.println("\n--- POST-INCREMENTO (contador++) ---");
        System.out.println("Variable al usar ++: ");
        System.out.println(contador++); // Muestra 5, luego incrementa a 6
        System.out.println("Después de usar ++: ");
        System.out.println(contador); // Muestra 6
        
        contador = 5; // Resetear valor
        
        // Pre-incremento: incrementa primero, luego devuelve el nuevo valor
        System.out.println("\n--- PRE-INCREMENTO (++contador) ---");
        System.out.println("Variable al usar ++: ");
        System.out.println(++contador); // Incrementa a 6, luego muestra 6
        System.out.println("Después de usar ++: ");
        System.out.println(contador); // Muestra 6
        
        // Mismo análisis con decremento
        contador = 5;
        System.out.println("\n--- POST-DECREMENTO (contador--) ---");
        System.out.println("Variable al usar --: ");
        System.out.println(contador--); // Muestra 5, luego decrementa a 4
        System.out.println("Después de usar --: ");
        System.out.println(contador); // Muestra 4
        
        contador = 5;
        System.out.println("\n--- PRE-DECREMENTO (--contador) ---");
        System.out.println("Variable al usar --: ");
        System.out.println(--contador); // Decrementa a 4, luego muestra 4
        System.out.println("Después de usar --: ");
        System.out.println(contador); // Muestra 4
        
        System.out.println("\n=== OBSERVACIÓN ===");
        System.out.println("POST: Usa el valor actual, luego modifica");
        System.out.println("PRE: Modifica primero, luego usa el nuevo valor");
    }
}