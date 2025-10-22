// ejercicio_16.java
import java.util.Scanner;

public class ejercicio_16 {

    public static void buscarSubcadena(String texto, String sub) {
        boolean encontradoAlguno = false;
        for (int i = 0; i <= texto.length() - sub.length(); i++) {
            boolean encontrado = true;
            for (int j = 0; j < sub.length(); j++) {
                if (texto.charAt(i + j) != sub.charAt(j)) {
                    encontrado = false;
                    break;
                }
            }
            if (encontrado) {
                System.out.println("Encontrada en posición: " + i);
                encontradoAlguno = true;
            }
        }
        if (!encontradoAlguno) System.out.println("No se encontró la subcadena.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el texto: ");
        String texto = sc.nextLine();
        System.out.print("Introduce la subcadena a buscar: ");
        String sub = sc.nextLine();
        buscarSubcadena(texto, sub);
        sc.close();
    }
}