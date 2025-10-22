/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humbertolr
 */
import java.util.Scanner;

public class z001 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Variables de entrada
        long numero = 0;

        // 1. Declaramos la plantilla con los modelos ASCII de las cifras
        String[][] plantillaNumeros = {
            {"   ###   ","    #    ","  #####  ","  #####  "," #       "," ####### ","  #####  "," ####### ","  #####  ","  #####  "},
            {"  #   #  ","   ##    "," #     # "," #     # "," #    #  "," #       "," #     # "," #    #  "," #     # "," #     # "},
            {" #     # ","  # #    ","       # ","       # "," #    #  "," #       "," #       ","     #   "," #     # "," #     # "},
            {" #     # ","    #    ","  #####  ","  #####  "," #    #  "," ######  "," ######  ","    #    ","  #####  ","  ###### "},
            {" #     # ","    #    "," #       ","       # "," ####### ","       # "," #     # ","   #     "," #     # ","       # "},
            {"  #   #  ","    #    "," #       "," #     # ","      #  "," #     # "," #     # ","   #     "," #     # "," #     # "},
            {"   ###   ","  #####  "," ####### ","  #####  ","      #  ","  #####  ","  #####  ","   #     ","  #####  ","  #####  "}
        };

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        Scanner teclado = new Scanner(System.in);

        System.out.println("CIFRAS GIGANTES");
        System.out.println("---------------");
        System.out.println("Introduce el número (0 a 9999999999):");

        // Pedimos un número válido
        while (true) {
            try {
                numero = teclado.nextLong();
                if (numero < 0 || numero > 9999999999L) {
                    System.out.println("Error: el número debe estar entre 0 y 9999999999");
                } else {
                    break;
                }
            } catch (Exception ex) {
                System.out.println("Error: introduce un número válido.");
                teclado.nextLine(); // limpiar buffer
            }
        }

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Si el número es 0, se muestra directamente
        if (numero == 0) {
            for (int fila = 0; fila < 7; fila++) {
                System.out.println(plantillaNumeros[fila][0]);
            }
        } else {
            // Guardamos las cifras en un stack para invertir el orden
            int[] stack = new int[20]; // soporta más de 10 dígitos por seguridad
            int i = 0;
            long temp = numero;
            while (temp > 0) {
                stack[i] = (int)(temp % 10);
                temp /= 10;
                i++;
            }

            // Creamos un array ajustado
            int[] cifras = new int[i];
            for (int j = 0; j < i; j++) {
                cifras[j] = stack[j];
            }

            //----------------------------------------------
            //              Salida de resultados
            //----------------------------------------------
            System.out.println();
            System.out.println("RESULTADO");
            System.out.println("---------");

            for (int fila = 0; fila < 7; fila++) {
                for (int k = cifras.length - 1; k >= 0; k--) {
                    System.out.print(plantillaNumeros[fila][cifras[k]]);
                }
                System.out.println();
            }
        }
    }
}