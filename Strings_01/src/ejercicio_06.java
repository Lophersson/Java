// ejercicio_06.java
import java.util.Scanner;

public class ejercicio_06 {

    public static int contarPalabrasUnaLetra(String texto) {
        int contador = 0;
        int i = 0;
        while (i < texto.length()) {
            while (i < texto.length() && texto.charAt(i) == ' ') i++;
            int inicio = i;
            while (i < texto.length() && texto.charAt(i) != ' ') i++;
            if (i - inicio == 1) contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        System.out.println("Palabras de una letra: " + contarPalabrasUnaLetra(texto));
        sc.close();
    }
}