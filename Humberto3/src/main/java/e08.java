/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int sumaDiv = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) sumaDiv += i;
        }
        System.out.println(n + (sumaDiv == n ? " es perfecto." : " no es perfecto."));
    }
}