import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce inicio del intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Introduce fin del intervalo: ");
        int fin = sc.nextInt();
        System.out.print("Introduce el primer divisor: ");
        int d1 = sc.nextInt();
        System.out.print("Introduce el segundo divisor: ");
        int d2 = sc.nextInt();

        System.out.println("Numeros en el intervalo divisibles por ambos:");
        for (int i = inicio; i <= fin; i++) {
            if (i % d1 == 0 && i % d2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}