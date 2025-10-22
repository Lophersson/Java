/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int n = sc.nextInt();
        double suma = 0;

        System.out.print("Serie armonica: ");
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
            System.out.print("1/" + i + (i < n ? " + " : ""));
        }
        System.out.println("\nSuma = " + suma);
    }
}
