import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        
        contarDigitosConsecutivos(cadena);
        
        scanner.close();
    }

    static void contarDigitosConsecutivos(String cadena) {
        System.out.println("Cadena: " + cadena);
        System.out.println("D�gitos consecutivos encontrados:");
        
        int contador = 0;
        int totalDigitos = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            
            if (Character.isDigit(actual)) {
                contador++;
            } else {
                if (contador > 0) {
                    System.out.println("- " + contador + " d�gito(s) consecutivo(s)");
                    totalDigitos += contador;
                    contador = 0;
                }
            }
        }
        
        // Verificar si termina con d�gitos
        if (contador > 0) {
            System.out.println("- " + contador + " d�gito(s) consecutivo(s)");
            totalDigitos += contador;
        }
        
        System.out.println("Total de d�gitos en la cadena: " + totalDigitos);
    }
}