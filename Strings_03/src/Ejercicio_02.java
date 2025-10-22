import java.util.Scanner;

public class Ejercicio_02 {

    // Determinar si dos palabras son anagramas
    public static boolean esAnagrama(String palabra1, String palabra2) {
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] letras1 = ordenarLetras(palabra1);
        char[] letras2 = ordenarLetras(palabra2);

        for (int i = 0; i < letras1.length; i++) {
            if (letras1[i] != letras2[i]) {
                return false;
            }
        }

        return true;
    }

    private static char[] ordenarLetras(String palabra) {
        char[] letras = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }

        for (int i = 0; i < letras.length - 1; i++) {
            for (int j = 0; j < letras.length - 1 - i; j++) {
                if (letras[j] > letras[j + 1]) {
                    char temp = letras[j];
                    letras[j] = letras[j + 1];
                    letras[j + 1] = temp;
                }
            }
        }

        return letras;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();

        if (esAnagrama(palabra1, palabra2)) {
            System.out.println("? '" + palabra1 + "' y '" + palabra2 + "' son anagramas.");
        } else {
            System.out.println("? '" + palabra1 + "' y '" + palabra2 + "' no son anagramas.");
        }

        sc.close();
    }
}