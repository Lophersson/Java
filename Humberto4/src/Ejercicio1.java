import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        if (a + b == c || a + c == b || b + c == a) {
            System.out.println("La suma de dos números es igual al tercero.");
        } else {
            System.out.println("Ninguna suma de dos números es igual al tercero.");
        }
    }
}