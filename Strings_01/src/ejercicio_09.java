// ejercicio_09.java
import java.util.Scanner;

public class ejercicio_09 {

    public static String alternarMayMin(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isUpperCase(c)) resultado.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) resultado.append(Character.toUpperCase(c));
            else resultado.append(c);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        System.out.println("Alternado: " + alternarMayMin(texto));
        sc.close();
    }
}