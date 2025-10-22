import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena inicial: ");
        String inicial = scanner.nextLine();
        System.out.print("Introduce el texto a a�adir: ");
        String a�adir = scanner.nextLine();
        
        StringBuilder sb = new StringBuilder(inicial);
        System.out.println("StringBuilder inicial: " + sb);
        
        sb.append(a�adir);
        System.out.println("Despu�s de append: " + sb);
        
        System.out.println("Resultado final: " + sb.toString());
        
        scanner.close();
    }
}