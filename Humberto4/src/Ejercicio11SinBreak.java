import java.util.Scanner;

public class Ejercicio11SinBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hayMayor = false;
        while (!hayMayor) {
            System.out.print("Introduce edad del alumno: ");
            int edad = sc.nextInt();
            if (edad >= 18) {
                hayMayor = true;
            }
        }
        System.out.println("Hay al menos un mayor de edad.");
    }
}