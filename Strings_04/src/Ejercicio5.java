import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        System.out.print("Introduce el desplazamiento (N): ");
        int desplazamiento = scanner.nextInt();
        
        String resultado = cifradoCesar(cadena, desplazamiento);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Desplazamiento: " + desplazamiento);
        System.out.println("Cadena cifrada: " + resultado);
        
        scanner.close();
    }

    static String cifradoCesar(String cadena, int desplazamiento) {
        String abecedario = "abcdefghijklmnopqrstuvwxyzáéíóúñ";
        String resultado = "";
        
        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            char minuscula = Character.toLowerCase(actual);
            
            int indice = abecedario.indexOf(minuscula);
            
            if (indice != -1) {
                // Es una letra, aplicar desplazamiento
                int nuevoIndice = (indice + desplazamiento) % abecedario.length();
                char nuevaLetra = abecedario.charAt(nuevoIndice);
                
                // Mantener mayúscula si la original era mayúscula
                if (Character.isUpperCase(actual)) {
                    nuevaLetra = Character.toUpperCase(nuevaLetra);
                }
                
                resultado += nuevaLetra;
            } else {
                // No es letra, mantenerla igual (espacio, números, etc.)
                resultado += actual;
            }
        }
        
        return resultado;
    }
}