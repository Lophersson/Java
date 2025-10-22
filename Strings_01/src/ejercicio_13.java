// ejercicio_13.java
import java.util.Scanner;

public class ejercicio_13 {

    public static String alternarAscii(String texto) {
        StringBuilder resultado = new StringBuilder();
        boolean mayus = true;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                if (mayus && Character.isLowerCase(c)) resultado.append((char)(c - 32));
                else if (!mayus && Character.isUpperCase(c)) resultado.append((char)(c + 32));
                else resultado.append(c);
                mayus = !mayus;
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        System.out.println("Alternado ASCII: " + alternarAscii(texto));
        sc.close();
    }
}