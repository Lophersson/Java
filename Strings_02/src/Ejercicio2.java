import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EJERCICIO 2: Buscar palabra en frase ===");
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.print("Introduce una palabra a buscar: ");
        String palabra = sc.nextLine();

        if (frase.indexOf(palabra) != -1) {
            System.out.println("La palabra '" + palabra + "' SÍ aparece en la frase.");
        } else {
            System.out.println("La palabra '" + palabra + "' NO aparece en la frase.");
        }
        sc.close();
    }
}