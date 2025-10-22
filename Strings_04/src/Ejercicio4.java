import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        System.out.print("Introduce cuántas veces repetirla (N): ");
        int N = scanner.nextInt();
        
        String resultado = repetirCadena(cadena, N);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Número de repeticiones: " + N);
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }

    static String repetirCadena(String cadena, int N) {
        String resultado = "";
        
        for (int i = 0; i < N; i++) {
            resultado += cadena;
        }
        
        return resultado;
    }
}