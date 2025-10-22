import java.util.Scanner;

public class Ejercicio11Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Introduce edad del alumno: ");
            int edad = sc.nextInt();
            if (edad >= 18) {
                System.out.println("Hay al menos un mayor de edad.");
                break;
            }
        }
    }
}