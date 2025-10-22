/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase para cálculos financieros.
 * @author humbertolr
 */
public class financial {

    /**
     * Calcula el Valor Presente Neto (NPV) de una serie de flujos de caja.
     * @param rate Tasa de descuento (por ejemplo, 0.1 para 10%)
     * @param cashflows Array de flujos de caja (el primero suele ser la inversión inicial negativa)
     * @return El valor presente neto
     */
    public static double calculateNPV(double rate, double[] cashflows) {
        double npv = 0.0;
        for (int i = 0; i < cashflows.length; i++) {
            npv += cashflows[i] / Math.pow(1 + rate, i + 1);
        }
        return npv;
    }

    public static void main(String[] args) {
        double[] cashflows = {-1000, 200, 300, 400, 500}; // Inversión inicial y flujos futuros
        double discountRate = 0.1; // Tasa de descuento (10%)
        double npv = calculateNPV(discountRate, cashflows);
        System.out.printf("Net Present Value (NPV): %.2f%n", npv);
    }
}
