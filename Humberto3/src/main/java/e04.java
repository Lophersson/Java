/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int digitos = 0;
        int temp = Math.abs(n);

        if (temp == 0) digitos = 1;
        else {
            while (temp > 0) {
                temp /= 10;
                digitos++;
            }
        }
        System.out.println("El número tiene " + digitos + " dígitos.");
    }
}