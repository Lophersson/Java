import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cadena: ");
        String cadena = scanner.nextLine();
        System.out.print("Introduce la subcadena a eliminar: ");
        String eliminar = scanner.nextLine();
        
        StringBuilder sb = new StringBuilder(cadena);
        System.out.println("StringBuilder original: " + sb.toString());
        
        int indice = sb.indexOf(eliminar);
        if (indice != -1) {
            sb.delete(indice, indice + eliminar.length());
        } else {
            System.out.println("La subcadena a eliminar no fue encontrada.");
        }
        
        System.out.println("Después de eliminar '" + eliminar + "': " + sb.toString());
        
        System.out.println("Resultado final: " + sb.toString());
        
        scanner.close();
    }
}