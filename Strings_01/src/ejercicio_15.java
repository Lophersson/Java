// ejercicio_15.java
import java.util.Scanner;

public class ejercicio_15 {

    public static String soloNumericos(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= '0' && c <= '9') resultado.append(c);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        System.out.println("Sólo numéricos: " + soloNumericos(texto));
        sc.close();
    }
}