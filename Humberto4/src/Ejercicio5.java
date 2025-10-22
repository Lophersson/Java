import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("El MCD es: " + a);
    }
}