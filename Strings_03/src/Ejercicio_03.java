import java.util.Scanner;

public class Ejercicio_03 {

    // Extraer el dominio de una dirección de correo
    public static String extraerDominio(String email) {
        int indice = email.indexOf("@");

        if (indice == -1) {
            return "Email inválido";
        }

        return email.substring(indice + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una dirección de correo electrónico: ");
        String email = sc.nextLine();

        System.out.println("Email: " + email);
        System.out.println("Dominio: " + extraerDominio(email));

        sc.close();
    }
}