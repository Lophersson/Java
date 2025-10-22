import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EJERCICIO 1: Extraer primera palabra ===");
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        int posicionEspacio = frase.indexOf(' ');

        if (posicionEspacio == -1) {
            System.out.println("Primera palabra: " + frase);
        } else {
            String primeraPalabra = frase.substring(0, posicionEspacio);
            System.out.println("Primera palabra: " + primeraPalabra);
        }
        sc.close();
    }
}