import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = scanner.nextLine();
        
        String resultado = intercalarCadenas(cadena1, cadena2);
        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);
        System.out.println("Resultado intercalado: " + resultado);
        
        scanner.close();
    }

    static String intercalarCadenas(String cadena1, String cadena2) {
        String resultado = "";
        int longitud = Math.max(cadena1.length(), cadena2.length());
        
        for (int i = 0; i < longitud; i++) {
            if (i < cadena1.length()) {
                resultado += cadena1.charAt(i);
            }
            if (i < cadena2.length()) {
                resultado += cadena2.charAt(i);
            }
        }
        
        return resultado;
    }
}