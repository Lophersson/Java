// ejercicio_12.java
import java.util.Scanner;

public class ejercicio_12 {

    public static void mostrarAscii(String texto) {
        System.out.println("Valores de caracteres en ASCII:");
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            System.out.println("Caracter '" + c + "':\t" + (int)c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        mostrarAscii(texto);
        sc.close();
    }
}