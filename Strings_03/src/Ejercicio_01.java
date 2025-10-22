import java.util.Scanner;

public class Ejercicio_01 {

    // Invertir el orden de las palabras
    public static String invertirPalabras(String frase) {
        String[] palabras = frase.split(" ");
        String resultado = "";

        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado += palabras[i];
            if (i > 0) {
                resultado += " ";
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + invertirPalabras(frase));

        sc.close();
    }
}