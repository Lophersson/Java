import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del articulo: ");
        String nombre = sc.nextLine();
        System.out.print("Precio base: ");
        double precio = sc.nextDouble();
        double valorTotal = precio * 1.21;
        System.out.printf("El valor total del producto %s y precio base %.2f sumandole el 21%% del IVA es de %.2f%n",
                nombre, precio, valorTotal);
    }
}