public class Ejercicio2 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 2; i < 100; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los pares menores de 100 es: " + suma);
    }
}
