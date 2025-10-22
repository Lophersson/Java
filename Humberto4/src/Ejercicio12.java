import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce N: ");
        int N = sc.nextInt();
        System.out.print("Introduce M: ");
        int M = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}