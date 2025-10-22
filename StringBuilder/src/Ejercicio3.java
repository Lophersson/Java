import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        StringBuilder sb = new StringBuilder(cadena);
        System.out.println("Cadena original: " + sb.toString());
        
        sb.reverse();
        System.out.println("Cadena invertida: " + sb.toString());
        
        scanner.close();
    }
}