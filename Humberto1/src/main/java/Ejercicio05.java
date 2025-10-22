/**
 * Ejercicio 5: Operadores de incremento y decremento
 * Declara una variable entera, incrementa su valor en 1 usando el operador ++ 
 * y luego decreméntalo usando el operador--. Imprime los resultados en cada paso
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        // Declaración de variable entera
        int contador = 10;
        
        // Mostrar valor inicial
        System.out.println("=== Operadores ++ y -- ===");
        System.out.println("Valor inicial: " + contador);
        
        // Incrementar usando ++
        contador++;
        System.out.println("Después de contador++: " + contador);
        
        // Decrementar usando --
        contador--;
        System.out.println("Después de contador--: " + contador);
        
        // Demostrar diferencia entre pre y post incremento
        System.out.println("\n=== Diferencia entre pre y post incremento ===");
        contador = 5;
        System.out.println("Valor inicial: " + contador);
        System.out.println("Post-incremento (contador++): " + contador++);
        System.out.println("Valor después del post-incremento: " + contador);
        
        System.out.println("Pre-incremento (++contador): " + ++contador);
        System.out.println("Valor final: " + contador);
    }
}