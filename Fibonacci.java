public class Fibonacci {

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 15; // cantidad de términos de Fibonacci
        int a = 0, b = 1; // primeros valores de Fibonacci
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        System.out.println("Números primos en los primeros " + n + " términos de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            int fib = a; // término actual de Fibonacci

            // verificar si es primo
            if (esPrimo(fib)) {
                System.out.print(fib + " ");
                contadorPrimos++;
            } else {
                contadorNoPrimos++;
            }

            // generar el siguiente número de Fibonacci
            int temp = a + b;
            a = b;
            b = temp;
        }

        // resultados finales
        System.out.println("\n\nCantidad de números primos: " + contadorPrimos);
        System.out.println("Cantidad de números no primos: " + contadorNoPrimos);
    }
}
