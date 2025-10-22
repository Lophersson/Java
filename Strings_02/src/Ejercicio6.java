import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EJERCICIO 6: Verificar sufijo ===");
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.print("Introduce el sufijo a verificar: ");
        String sufijo = sc.nextLine();

        if (cadena.endsWith(sufijo)) {
            System.out.println("La cadena SÍ termina con el sufijo '" + sufijo + "'.");
        } else {
            System.out.println("La cadena NO termina con el sufijo '" + sufijo + "'.");
        }
        sc.close();
    }
}