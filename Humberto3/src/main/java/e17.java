/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Z: ");
        int z = sc.nextInt();

        int suma = 0, n = 0;
        while (suma <= z) {
            n++;
            suma += n;
        }
        System.out.println("El valor más pequeño de N tal que 1+2+...+N > " + z + " es: " + n);
    }
}