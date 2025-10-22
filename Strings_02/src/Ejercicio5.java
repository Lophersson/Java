import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EJERCICIO 5: Contar letra en cadena ===");
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.print("Introduce una letra a buscar: ");
        char letra = sc.nextLine().charAt(0);

        int contador = 0;
        String posiciones = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
                posiciones += (posiciones.isEmpty() ? "" : ", ") + i;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
        if (contador > 0) {
            System.out.println("Posiciones: " + posiciones);
        }
        sc.close();
    }
}