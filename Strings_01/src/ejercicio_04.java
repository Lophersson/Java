import java.util.Scanner;

public class ejercicio_04 {

    public static boolean esPalindromo(String texto) {
        // Eliminamos espacios y pasamos a minúsculas para una mejor comparación
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < texto.length() / 2; i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra o frase: ");
        String texto = sc.nextLine();

        if (esPalindromo(texto)) {
            System.out.println("Siii, es un palíndromo!! enhorabuena!!");
        } else {
            System.out.println("Vaya! esta frase no es un palíndromo, lo siento!");
        }

        sc.close();
    }
}