import java.util.Scanner;

/**
 * Ejercicio 12: Determinar signo zodiacal
 */
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 12: SIGNO ZODIACAL ===");
        System.out.print("Ingresa el día de tu cumpleaños: ");
        int dia = scanner.nextInt();
        System.out.print("Ingresa el mes de tu cumpleaños (1-12): ");
        int mes = scanner.nextInt();
        
        String signo = obtenerSignoZodiacal(dia, mes);
        System.out.println("Tu signo zodiacal es: " + signo);
        
        scanner.close();
    }
    
    /**
     * Función para obtener el signo zodiacal
     */
    public static String obtenerSignoZodiacal(int dia, int mes) {
        // Validación básica
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return "Fecha no válida";
        }
        
        // Fechas límite para cambio de signo en cada mes
        int[] limites = {20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22};
        String[] signosAntes = {
            "Capricornio", "Acuario", "Piscis", "Aries", "Tauro", "Geminis",
            "Cancer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario"
        };
        String[] signosDespues = {
            "Acuario", "Piscis", "Aries", "Tauro", "Geminis", "Cancer",
            "Leo", "Virgo", "Libra", "Escorpio", "Sagitario", "Capricornio"
        };
        
        if (dia < limites[mes - 1]) {
            return signosAntes[mes - 1];
        } else {
            return signosDespues[mes - 1];
        }
    }
}