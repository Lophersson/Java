import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        int mayor = Math.max(a, b);
        int menor = Math.min(a, b);

        if (mayor % menor == 0) {
            System.out.println(mayor + " es divisible entre " + menor);
        } else {
            System.out.println(mayor + " no es divisible entre " + menor);
            for (int i = menor + 1; i < mayor; i++) {
                if (i % mayor == 0) {
                    System.out.println("El primer número entre ambos que es divisible por el mayor es: " + i);
                    return;
                }
            }
            System.out.println("No hay número entre ellos divisible por el mayor.");
        }
    }
}
