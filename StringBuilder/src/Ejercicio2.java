import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número inicial del 1 al 10: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debes introducir un número entero.");
            return;
        }
        int inicio = scanner.nextInt();

        System.out.print("Introduce el número final del 1 al 10: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debes introducir un número entero.");
            return;
        }
        int fin = scanner.nextInt();

        if (inicio < 1 || inicio > 10 || fin < 1 || fin > 10) {
            System.out.println("Error: Los números deben estar entre 1 y 10.");
            return;
        }

        if (inicio > fin) {
            System.out.println("Error: El número inicial no puede ser mayor que el número final.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = inicio; i <= fin; i++) {
            sb.append(i);
            if (i < fin) {
                sb.append(", ");
            }
        }

        System.out.println("\n=== RESULTADO ===");
        System.out.println(sb.toString());
        System.out.println("==================\n");

        scanner.close();
    }
}