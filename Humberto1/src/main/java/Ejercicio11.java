/**
 * Ejercicio 11: Operadores lógicos
 * Declara tres variables booleanas. Usa operadores lógicos (&&, ||, !) 
 * para realizar combinaciones lógicas entre ellas y mostrar los resultados
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        // Declaración de variables booleanas
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        System.out.println("=== Operadores Lógicos ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();
        
        // Operador AND (&&)
        System.out.println("=== Operador AND (&&) ===");
        System.out.println("a && b = " + (a && b)); // true && false = false
        System.out.println("a && c = " + (a && c)); // true && true = true
        System.out.println("b && c = " + (b && c)); // false && true = false
        System.out.println();
        
        // Operador OR (||)
        System.out.println("=== Operador OR (||) ===");
        System.out.println("a || b = " + (a || b)); // true || false = true
        System.out.println("a || c = " + (a || c)); // true || true = true
        System.out.println("b || c = " + (b || c)); // false || true = true
        System.out.println();
        
        // Operador NOT (!)
        System.out.println("=== Operador NOT (!) ===");
        System.out.println("!a = " + (!a)); // !true = false
        System.out.println("!b = " + (!b)); // !false = true
        System.out.println("!c = " + (!c)); // !true = false
        System.out.println();
        
        // Combinaciones más complejas
        System.out.println("=== Combinaciones complejas ===");
        System.out.println("a && b || c = " + (a && b || c)); // (true && false) || true = true
        System.out.println("!a || (b && c) = " + (!a || (b && c))); // !true || (false && true) = false
        System.out.println("!(a && b) = " + (!(a && b))); // !(true && false) = true
        System.out.println("!a && !b = " + (!a && !b)); // !true && !false = false
        
        System.out.println("\n=== Tabla de verdad recordatorio ===");
        System.out.println("AND (&&): true solo si ambos son true");
        System.out.println("OR (||): false solo si ambos son false");
        System.out.println("NOT (!): invierte el valor booleano");
    }
}