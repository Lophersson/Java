import java.util.Scanner;

public class Ejercicio_04 {

    // Eliminar todas las vocales de una cadena
    public static String eliminarVocales(String cadena) {
        return cadena.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase o palabra: ");
        String cadena = sc.nextLine();

        System.out.println("Original: " + cadena);
        System.out.println("Sin vocales: " + eliminarVocales(cadena));

        sc.close();
    }
}