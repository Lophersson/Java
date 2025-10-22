/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000; // saldo inicial
        int opcion;

        do {
            System.out.println("\n--- Cajero Automático ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese monto a depositar: ");
                    double dep = sc.nextDouble();
                    if (dep > 0) saldo += dep;
                    System.out.println("Depósito realizado.");
                    break;
                case 3:
                    System.out.print("Ingrese monto a retirar: ");
                    double ret = sc.nextDouble();
                    if (ret <= saldo)
                        saldo -= ret;
                    else
                        System.out.println("Saldo insuficiente.");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}