import java.util.Scanner;

public class Ejercicio7 {

    // Funci�n: devuelve el doble de un n�mero
    public static int duplicar(int n) {
        return n * 2;
    }

    // Procedimiento: muestra un saludo en pantalla
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir un n�mero al usuario
        System.out.print("Introduce un n�mero: ");
        int numero = sc.nextInt();
        int resultado = duplicar(numero);  // Llamada a la funci�n
        System.out.println("El doble es: " + resultado);

        // Pedir un nombre al usuario
        System.out.print("Introduce tu nombre: ");
        sc.nextLine(); // limpiar el buffer
        String nombre = sc.nextLine();
        saludar(nombre); // Llamada al procedimiento

        sc.close();
    }
}