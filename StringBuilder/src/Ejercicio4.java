import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cadena: ");
        String cadena = scanner.nextLine();
        System.out.print("Introduce el texto a insertar: ");
        String insertar = scanner.nextLine();
        System.out.print("Introduce la posici�n donde insertar: ");
        int posicion = scanner.nextInt();
        
        StringBuilder sb = new StringBuilder(cadena);
        System.out.println("StringBuilder original: " + sb.toString());
        
        sb.insert(posicion, insertar);
        System.out.println("Despu�s de insertar '" + insertar + "' en posici�n " + posicion + ": " + sb.toString());
        
        System.out.println("Resultado final: " + sb.toString());
        
        scanner.close();
    }
}