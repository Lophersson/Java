import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int conteo = 0, num;
        do {
            System.out.print("Introduce numero (-1 para terminar): ");
            num = sc.nextInt();
            if (num != -1) conteo++;
        } while (num != -1);
        System.out.println("Se introdujeron " + conteo + " numeros.");
    }
}
