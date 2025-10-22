import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EJERCICIO 8: Primera letra en mayúscula ===");
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String resultado = "";
        boolean nuevaPalabra = true;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == ' ') {
                resultado += c;
                nuevaPalabra = true;
            } else {
                if (nuevaPalabra && Character.isLowerCase(c)) {
                    c = Character.toUpperCase(c);
                }
                resultado += c;
                nuevaPalabra = false;
            }
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}