import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EJERCICIO 3: Comparar dos cadenas ===");
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son IGUALES.");
        } else {
            System.out.println("Las cadenas son DIFERENTES.");
        }
        sc.close();
    }
}