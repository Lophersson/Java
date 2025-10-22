import java.util.Scanner;

public class ejercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String texto = sc.nextLine();

        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            if (vocales.indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }

        System.out.println("Número de vocales: " + contador);

        sc.close();
    }
}