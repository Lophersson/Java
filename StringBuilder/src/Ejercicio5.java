import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cadena: ");
        String cadena = scanner.nextLine();
        System.out.print("Introduce el texto a buscar: ");
        String buscar = scanner.nextLine();
        System.out.print("Introduce el texto de reemplazo: ");
        String reemplazo = scanner.nextLine();
        
        StringBuilder sb = new StringBuilder(cadena);
        System.out.println("StringBuilder original: " + sb.toString());
        
        int indice = sb.indexOf(buscar);
        if (indice != -1) {
            sb.replace(indice, indice + buscar.length(), reemplazo);
        } else {
            System.out.println("La cadena a buscar no fue encontrada.");
        }
        
        System.out.println("Después de reemplazar '" + buscar + "' por '" + reemplazo + "': " + sb.toString());
        
        System.out.println("Resultado final: " + sb.toString());
        
        scanner.close();
    }
}