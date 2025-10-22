// ejercicio_10.java
import java.util.Scanner;

public class ejercicio_10 {

    public static int palabrasEmpiezanVocal(String texto) {
        String vocales = "AEIOUaeiou";
        int contador = 0;
        boolean inicioPalabra = true;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') {
                inicioPalabra = true;
            } else if (inicioPalabra) {
                for (int j = 0; j < vocales.length(); j++) {
                    if (c == vocales.charAt(j)) {
                        contador++;
                        break;
                    }
                }
                inicioPalabra = false;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        System.out.println("Palabras que empiezan por vocal: " + palabrasEmpiezanVocal(texto));
        sc.close();
    }
}