import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        
        String resultado = ordenarCaracteres(cadena);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena ordenada: " + resultado);
        
        scanner.close();
    }

    static String ordenarCaracteres(String cadena) {
        String resultado = "";
        String temp = cadena;
        
        while (!temp.isEmpty()) {
            char menor = temp.charAt(0);
            
            // Encontrar el car�cter menor en la cadena restante
            for (int i = 1; i < temp.length(); i++) {
                if (temp.charAt(i) < menor) {
                    menor = temp.charAt(i);
                }
            }
            
            // Agregar el car�cter menor al resultado
            resultado += menor;
            
            // Eliminar la primera ocurrencia del car�cter menor de temp
            int indice = temp.indexOf(menor);
            temp = temp.substring(0, indice) + temp.substring(indice + 1);
        }
        
        return resultado;
    }
}