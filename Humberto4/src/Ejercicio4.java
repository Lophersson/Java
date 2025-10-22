public class Ejercicio4 {
    public static void main(String[] args) {
        int year = java.time.Year.now().getValue();
        for (int i = 0; i < 10; i++) {
            int A = year % 19;
            int B = year % 4;
            int C = year % 7;
            int D = (19 * A + 24) % 30;
            int E = (2 * B + 4 * C + 6 * D + 5) % 7;
            int N = 22 + D + E;
            if (N > 31) {
                System.out.println("Domingo de Pascua " + year + ": " + (N - 31) + " de abril");
            } else {
                System.out.println("Domingo de Pascua " + year + ": " + N + " de marzo");
            }
            year++;
        }
    }
}