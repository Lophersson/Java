/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class e07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int inverso = 0;

        while (n != 0) {
            int ult = n % 10;
            inverso = inverso * 10 + ult;
            n /= 10;
        }
        System.out.println("El número invertido es: " + inverso);
    }
}