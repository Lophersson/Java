// ejercicio_08.java
import java.util.Scanner;

public class ejercicio_08 {

    public static void contarLetrasNoLetras(String texto) {
        int letras = 0, noLetras = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) letras++;
            else noLetras++;
        }
        System.out.println("Letras: " + letras);
        System.out.println("No letras: " + noLetras);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        contarLetrasNoLetras(texto);
        sc.close();
    }
}