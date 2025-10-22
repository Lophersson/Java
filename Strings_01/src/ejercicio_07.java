// ejercicio_07.java
import java.util.Scanner;

public class ejercicio_07 {

    public static String eliminarCaracter(String texto, char eliminar) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != eliminar) resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        System.out.print("Caracter a eliminar: ");
        char eliminar = sc.nextLine().charAt(0);
        System.out.println("Resultado: " + eliminarCaracter(texto, eliminar));
        sc.close();
    }
}