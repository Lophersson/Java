import java.util.Scanner;

public class e01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.print("Ingrese un número niñita ñoña: ");
        int n = sc.nextInt();

        System.out.println("Tabla con FOR:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        System.out.println("Tabla con WHILE:");
        int j = 1;
        while (j <= 10) {
            System.out.println(n + " x " + j + " = " + (n * j));
            j++;
        }
    }
}
