import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EJERCICIO 7: Reemplazar primera ocurrencia ===");
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.print("Introduce la cadena a buscar: ");
        String cadena1 = sc.nextLine();
        System.out.print("Introduce la cadena de reemplazo: ");
        String cadena2 = sc.nextLine();

        int posicion = frase.indexOf(cadena1);

        if (posicion == -1) {
            System.out.println("La cadena '" + cadena1 + "' no existe en la frase.");
        } else {
            String antes = frase.substring(0, posicion);
            String despues = frase.substring(posicion + cadena1.length());
            String resultado = antes + cadena2 + despues;
            System.out.println("Resultado: " + resultado);
        }
        sc.close();
    }
}