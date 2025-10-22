/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int suma = 0;
        int temp = Math.abs(n);

        while (temp > 0) {
            suma += temp % 10;
            temp /= 10;
        }
        System.out.println("La suma de los dígitos es: " + suma);
    }
}