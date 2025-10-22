/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int n = sc.nextInt();
        int a = 0, b = 1, suma = 0;

        System.out.print("Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : ""));
            suma += a;
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println("\nSuma = " + suma);
    }
}