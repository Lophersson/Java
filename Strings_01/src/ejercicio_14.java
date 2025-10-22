// ejercicio_14.java
import java.util.Scanner;

public class ejercicio_14 {

    public static void mostrarPalabrasLongitud(String texto) {
        int inicio = 0;
        while (inicio < texto.length()) {
            while (inicio < texto.length() && texto.charAt(inicio) == ' ') inicio++;
            int fin = inicio;
            while (fin < texto.length() && texto.charAt(fin) != ' ') fin++;
            if (inicio < fin) {
                System.out.println(texto.substring(inicio, fin) + ": " + (fin - inicio));
            }
            inicio = fin + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        mostrarPalabrasLongitud(texto);
        sc.close();
    }
}