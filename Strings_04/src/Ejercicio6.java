import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        
        String resultado = resaltarPalabraMasRepetida(frase);
        System.out.println("Frase original: " + frase);
        System.out.println("Frase con resalte: " + resultado);
        
        scanner.close();
    }

    static String resaltarPalabraMasRepetida(String frase) {
        String[] palabras = frase.toLowerCase().split("\\s+");
        String palabraMasRepetida = "";
        int maxRepeticiones = 0;
        
        // Contar repeticiones de cada palabra
        for (int i = 0; i < palabras.length; i++) {
            int contador = 0;
            
            for (int j = 0; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    contador++;
                }
            }
            
            if (contador > maxRepeticiones) {
                maxRepeticiones = contador;
                palabraMasRepetida = palabras[i];
            }
        }
        
        // Reemplazar la palabra más repetida con resalte
        String resultado = frase.toLowerCase();
        resultado = resultado.replaceAll("\\b" + palabraMasRepetida + "\\b", 
                                         "***" + palabraMasRepetida + "***");
        
        System.out.println("Palabra más repetida: '" + palabraMasRepetida + 
                          "' (" + maxRepeticiones + " veces)");
        
        return resultado;
    }
}