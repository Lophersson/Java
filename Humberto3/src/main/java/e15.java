/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese número B: ");
        int b = sc.nextInt();
        System.out.print("Ingrese número C: ");
        int c = sc.nextInt();

        if (a + b == c || a + c == b || b + c == a) {
            System.out.println("La suma de dos de ellos es igual al tercero.");
        } else {
            System.out.println("Ninguna suma coincide con el tercero.");
        }
    }
}
