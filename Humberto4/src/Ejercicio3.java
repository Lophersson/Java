import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número Z: ");
        int Z = sc.nextInt();
        int suma = 0;
        int N = 0;
        while (suma <= Z) {
            N++;
            suma += N;
        }
        System.out.println("El valor más pequeño N es: " + N);
    }
}