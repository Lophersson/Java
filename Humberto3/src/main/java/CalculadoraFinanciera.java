import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraFinanciera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Cantidad inicial (€): ");
        double cantidad = scanner.nextDouble();

        System.out.print("Años: ");
        int anios = scanner.nextInt();

        System.out.print("Incremento anual (%): ");
        double incremento = scanner.nextDouble();

        // Cálculos principales
        double cantidadNeta = cantidad * 0.80;
        double impuesto = cantidadNeta * 0.035;
        double rentabilidadNeta = cantidadNeta * 0.06 * 0.70;
        double liquidoPercibir = rentabilidadNeta - impuesto;
        double liquidoMensual = liquidoPercibir / 14;

        // Formateo de resultados en formato español
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad neta (80%): " + formato.format(cantidadNeta));
        System.out.println("Impuesto (3,5%): " + formato.format(impuesto));
        System.out.println("Rentabilidad neta (70% de 6%): " + formato.format(rentabilidadNeta));
        System.out.println("Líquido a percibir anual: " + formato.format(liquidoPercibir));
        System.out.println("Líquido mensual (div. entre 14): " + formato.format(liquidoMensual));

        // Nota: El incremento anual y los años no afectan los cálculos actuales, igual que en tu JS.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
