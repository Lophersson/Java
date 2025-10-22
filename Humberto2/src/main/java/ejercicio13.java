import java.util.Scanner;

/**
 * Ejercicio 13: Determinar día de la semana
 */
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 13: DÍA DE LA SEMANA ===");
        System.out.print("Ingresa un número del 1 al 7: ");
        int numeroDia = scanner.nextInt();
        String diaSemana;
        
        switch (numeroDia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número inválido";
        }
        
        System.out.println("Día de la semana: " + diaSemana);
        
        scanner.close();
    }
}