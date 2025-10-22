import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        double suma = 0.0;
        for (int i = 1;
                i <= n; i++)
        {
            suma += i / Math.pow(2, i);
        }
        System.out.println("La suma es: " + suma);
    }
}