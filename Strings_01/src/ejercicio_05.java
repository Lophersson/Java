// ejercicio_05.java
import java.util.Scanner;

public class ejercicio_05 {
    public static String invertirCadena(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        
        String resultado = invertirCadena(texto);
        System.out.println("Cadena invertida: " + resultado);
        
        scanner.close();
    }
}