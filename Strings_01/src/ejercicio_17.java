// ejercicio_17.java
import java.util.Scanner;

public class ejercicio_17 {

    public static void validarContrasena() {
        String contrasena = "abc123";
        int maxIntentos = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= maxIntentos; i++) {
            System.out.print("Introduce la contrase�a: ");
            String intento = sc.nextLine();
            boolean igual = true;
            if (intento.length() != contrasena.length()) igual = false;
            else {
                for (int j = 0; j < contrasena.length(); j++) {
                    if (intento.charAt(j) != contrasena.charAt(j)) {
                        igual = false;
                        break;
                    }
                }
            }
            if (igual) {
                System.out.println("�Contrase�a correcta!");
                sc.close();
                return;
            }
            System.out.println("Contrase�a incorrecta. Intento " + i + "/" + maxIntentos);
        }
        System.out.println("Has superado el n�mero m�ximo de intentos.");
        sc.close();
    }

    public static void main(String[] args) {
        validarContrasena();
    }
}