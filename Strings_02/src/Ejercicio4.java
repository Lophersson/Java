import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EJERCICIO 4: Concatenar dos cadenas ===");
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        String resultado = cadena1 + cadena2;
        System.out.println("Cadenas concatenadas: " + resultado);
        sc.close();
    }
}