import java.util.Scanner;

public class ejercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        int mayus = 0, minus = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isUpperCase(c)) {
                mayus++;
            } else if (Character.isLowerCase(c)) {
                minus++;
            }
        }

        System.out.println("Mayúsculas: " + mayus);
        System.out.println("Minúsculas: " + minus);

        sc.close();
    }
}