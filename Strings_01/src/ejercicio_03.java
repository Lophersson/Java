import java.util.Scanner;

public class ejercicio_03 {

    public static String reemplazarVocales(String texto) {
        String vocales = "aeiouAEIOU";
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            boolean esVocal = false;

            for (int j = 0; j < vocales.length(); j++) {
                if (c == vocales.charAt(j)) {
                    resultado += "*";
                    esVocal = true;
                    break;
                }
            }

            if (!esVocal) {
                resultado += c;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String texto = sc.nextLine();

        String resultado = reemplazarVocales(texto);

        System.out.println("Texto con vocales reemplazadas: " + resultado);

        sc.close();
    }
}
