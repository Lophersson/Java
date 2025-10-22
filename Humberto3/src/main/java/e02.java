/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros " + n + " números es: " + suma);
    }
}
