// ejercicio_11.java
import java.util.Scanner;

public class ejercicio_11 {

    public static String reemplazarVocal(String frase, char vocal1, char vocal2) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == vocal1) resultado.append(vocal2);
            else resultado.append(c);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.print("Vocal a reemplazar: ");
        char v1 = sc.nextLine().charAt(0);
        System.out.print("Nueva vocal: ");
        char v2 = sc.nextLine().charAt(0);
        System.out.println("Resultado: " + reemplazarVocal(frase, v1, v2));
        sc.close();
    }
}